package xxgam.oracle.apps.xbol.maf.webui;

import com.sun.java.util.collections.HashMap;

import oracle.apps.fnd.common.MessageToken;
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.server.OADBTransaction;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;
import oracle.apps.fnd.framework.webui.beans.message.OAMessageChoiceBean;
import oracle.apps.fnd.framework.webui.beans.message.OAMessageTextInputBean;

import oracle.jbo.domain.Number;

import xxgam.oracle.apps.xbol.maf.server.XxGamModAntAMImpl;
import xxgam.oracle.apps.xbol.maf.utils.CcManagementValidation;
import xxgam.oracle.apps.xbol.maf.utils.XxGamMAnticiposUtil;
import xxgam.oracle.apps.xbol.maf.utils.XxGamMAnticiposUtil2;

public class XxGamPaymentReqDetailCO extends OAControllerImpl {

    public void processRequest(OAPageContext pageContext, OAWebBean webBean) {
        super.processRequest(pageContext, webBean);
        String msgError = null;
        String urlBase = "OA.jsp?page=/xxgam/oracle/apps/xbol/maf/webui/";
        HashMap hmap = new HashMap();
        String errorCurrency = "";

        if (pageContext != null && webBean != null) {
            pageContext.getApplicationModule(webBean).getOADBTransaction().putTransientValue("IsValidateEntityFlight", 
                                                                                             "true");
            pageContext.getApplicationModule(webBean).getOADBTransaction().putTransientValue("IsValidateEntityDetail", 
                                                                                             "false");
            if (XxGamMAnticiposUtil.validatesResponsability(pageContext, 
                                                            webBean, 
                                                            new Number(pageContext.getResponsibilityId()), 
                                                            "GAM_ANTICIPOS_EMPLEADOS")) {
                String step2Flag = 
                    (String)pageContext.getTransactionValue("Step2");
                OAMessageChoiceBean leadingList = 
                    (OAMessageChoiceBean)webBean.findChildRecursive("TypePaymentEdit");
                if (leadingList != null)
                    leadingList.setPickListCacheEnabled(false);
                OAMessageChoiceBean currencyChoiceBean = 
                    (OAMessageChoiceBean)webBean.findChildRecursive("CurrencyCodeEditAll");

                //Se agrego para filtrar el poplist de acuerdo a la nomina del empleado
                String userCurrency = 
                    XxGamMAnticiposUtil2.getDivisa(pageContext, webBean);
                if (userCurrency.length() < 4) {
                    if (userCurrency.equals("MXN")) {
                        currencyChoiceBean.setValue(pageContext, userCurrency);
                        currencyChoiceBean.setDisabled(true);
                    } else {
                        // TODO 01  Agregamos caso internacional
                        currencyChoiceBean.setDisabled(true);
                        currencyChoiceBean.setValue(pageContext, userCurrency);
                    }
                }

                else {
                    errorCurrency = userCurrency;

                }
                if (currencyChoiceBean != null)
                    currencyChoiceBean.setPickListCacheEnabled(false);
                OAWebBean trainBean = webBean.findChildRecursive("TrainNavRN");
                OAWebBean navBarBean = 
                    webBean.findChildRecursive("ButtonNavRN");
                OAWebBean saveButton = 
                    webBean.findChildRecursive("SaveButton");
                OAWebBean cancelButton = 
                    webBean.findChildRecursive("CancelButton");

                // if(step2Flag == null)
                //   currencyChoiceBean.setValue(pageContext, null); 

                if ("create".equals(pageContext.getTransactionValue("Status"))) {
                    //Validacion en caso de un error al obtener la Divisa               
                    if (errorCurrency.length() > 3)
                        throw new OAException(userCurrency, 
                                              OAException.WARNING);

                    if (step2Flag == null)
                        try {
                            XxGamMAnticiposUtil.createNewPaymentRequestDetail(pageContext, 
                                                                              webBean);
                        } catch (Exception e) {
                            XxGamMAnticiposUtil.setRollback(pageContext, 
                                                            webBean);
                            msgError = 
                                    pageContext.getMessage("XBOL", "XXGAM_MAF_REQ_DTAIL_INIT_ERROR", 
                                                           null);
                            hmap.put("LoadPageMsgError", msgError);
                            XxGamMAnticiposUtil.setForwardWhitParameters(pageContext, 
                                                                         webBean, 
                                                                         null, 
                                                                         (new StringBuilder()).append(urlBase).append("XxGamPaymentInitAdvancePG").toString());
                        }
                    boolean isSuccess = 
                        XxGamMAnticiposUtil.initTypePaymentRequestDetail(pageContext, 
                                                                         webBean);
                    if (!isSuccess)
                        throw new OAException("XBOL", 
                                              "XXGAM_MAF_REQ_TYPEPA_NF_ERROR", 
                                              null, (byte)1, null);
                    if (trainBean != null)
                        trainBean.setRendered(true);
                    if (navBarBean != null)
                        navBarBean.setRendered(true);
                    if (saveButton != null)
                        saveButton.setRendered(true);
                    if (cancelButton != null)
                        cancelButton.setRendered(true);
                } else if ("update".equals(pageContext.getTransactionValue("Status"))) {
                    if (step2Flag == null) {
                        /************* Agregado por GnosisHCM*****
                      String StrRequestIdUpdate = null;
                      StrRequestIdUpdate = (String)pageContext.getTransactionValue("StrRequestIdUpdate");
                      if (null!=StrRequestIdUpdate&&""!=StrRequestIdUpdate){
                        pageContext.putTransactionValue("StrRequestIdUpdate",StrRequestIdUpdate);
                      }
                      ************* Agregado por GnosisHCM*****/

                        boolean isEditable = false;
                        isEditable = 
                                XxGamMAnticiposUtil.isPaymentReqEditable(pageContext, 
                                                                         webBean);
                        if (isEditable) {
                            XxGamMAnticiposUtil.setIniEditDetail(pageContext, 
                                                                 webBean);
                            XxGamMAnticiposUtil.setValidatesAllDatesPaymentDetail(pageContext, 
                                                                                  webBean);
                            if (trainBean != null)
                                trainBean.setRendered(true);
                            if (navBarBean != null)
                                navBarBean.setRendered(true);
                            if (saveButton != null)
                                saveButton.setRendered(true);
                            if (cancelButton != null)
                                cancelButton.setRendered(true);
                        } else {
                            XxGamMAnticiposUtil.setRollback(pageContext, 
                                                            webBean);
                            msgError = 
                                    pageContext.getMessage("XBOL", "XXGAM_MAF_REQ_NOT_EDIT_WARN", 
                                                           null);
                            hmap.put("LoadPageMsgError", msgError);
                            XxGamMAnticiposUtil.setForwardWhitParameters(pageContext, 
                                                                         webBean, 
                                                                         hmap, 
                                                                         (new StringBuilder()).append(urlBase).append("XxGamPaymentInitAdvancePG").toString());
                        }
                    }
                    String codeMon = 
                        XxGamMAnticiposUtil.initEditPaymentRequestDetail(pageContext, 
                                                                         webBean);
                    if (codeMon != null && !"".equals(codeMon)) {
                        OAMessageChoiceBean moneda = 
                            (OAMessageChoiceBean)webBean.findChildRecursive("CurrencyCodeEditAll");
                        if (moneda != null)
                            moneda.setValue(pageContext, codeMon);
                    }
                    boolean isSuccess = 
                        XxGamMAnticiposUtil.initTypePaymentRequestDetail(pageContext, 
                                                                         webBean);
                    if (!isSuccess)
                        throw new OAException("XBOL", 
                                              "XXGAM_MAF_REQ_TYPEPA_NF_ERROR", 
                                              null, (byte)1, null);
                } else {
                    msgError = 
                            pageContext.getMessage("XBOL", "XXGAM_MAF_ACCESS_DEN_NA_ERROR", 
                                                   null);
                    hmap.put("LoadPageMsgError", msgError);
                    urlBase = 
                            (new StringBuilder()).append(urlBase).append("XxGamMaBlankPagePG").toString();
                    XxGamMAnticiposUtil.setForwardWhitParameters(pageContext, 
                                                                 webBean, hmap, 
                                                                 urlBase);
                }
            } else {
                msgError = 
                        pageContext.getMessage("XBOL", "XXGAM_MAF_ACCESS_DEN_NR_ERROR", 
                                               null);
                hmap.put("LoadPageMsgError", msgError);
                urlBase = 
                        (new StringBuilder()).append(urlBase).append("XxGamMaBlankPagePG").toString();
                XxGamMAnticiposUtil.setForwardWhitParameters(pageContext, 
                                                             webBean, hmap, 
                                                             urlBase);
            }
            String msgErrorAux = null;
            msgErrorAux = pageContext.getParameter("LoadPageMsgError");
            if (msgErrorAux != null) {
                pageContext.putParameter("LoadPageMsgError", "");
                throw new OAException(msgErrorAux, (byte)1);
            }
        }
    }

    public void processFormRequest(OAPageContext pageContext, 
                                   OAWebBean webBean) {
        super.processFormRequest(pageContext, webBean);
        if (pageContext.getTransactionValue("Step2") == null)
            pageContext.putTransactionValue("Step2", "true");
        if (pageContext != null && webBean != null) {
            if ("selectingTypePayment".equals(pageContext.getParameter("event"))) {
                setCurrencyAllRowDetail(pageContext, webBean);
                if (validateDates(pageContext, webBean))
                    setValuesTypePaymentFromPage(pageContext, webBean);
                System.out.println("paymentReqDetailCO Valor de setValuesTypePaymentFromPage: ");
            }
            if ("changeInitDate".equals(pageContext.getParameter("event"))) {
                setCurrencyAllRowDetail(pageContext, webBean);
                if (validateDates(pageContext, webBean))
                    setValuesTypePaymentFromPage(pageContext, webBean);
            }
            if ("changeFinalDate".equals(pageContext.getParameter("event"))) {
                setCurrencyAllRowDetail(pageContext, webBean);
                if (validateDates(pageContext, webBean))
                    setValuesTypePaymentFromPage(pageContext, webBean);
            }
            if ("changeAmount".equals(pageContext.getParameter("event"))) {
                setCurrencyAllRowDetail(pageContext, webBean);
                if (validateDates(pageContext, webBean))
                    setValuesTypePaymentFromPage(pageContext, webBean);

            }
            if ("changeCurrency".equals(pageContext.getParameter("event"))) {
                setCurrencyAllRowDetail(pageContext, webBean);
                if (validateDates(pageContext, webBean))
                    setValuesTypePaymentFromPage(pageContext, webBean);
            }
            if ("changeCurrencyAll".equals(pageContext.getParameter("event"))) {
                if (!setCurrencyAllRowDetail(pageContext, webBean))
                    throw new OAException("XBOL", 
                                          "XXGAM_MAF_DETAIL_CRY_ALL_ERROR", 
                                          null, (byte)1, null);
                Boolean isSuccessAll = Boolean.valueOf(false);
                isSuccessAll = 
                        Boolean.valueOf(XxGamMAnticiposUtil.refreshAllValidationRepeat(pageContext, 
                                                                                       webBean));
                if (isSuccessAll.booleanValue()) {
                    isSuccessAll = 
                            XxGamMAnticiposUtil.refreshAllValidationByLine(pageContext, 
                                                                           webBean);
                    XxGamMAnticiposUtil.calculateAmountMxAllPaymentDetail(pageContext, 
                                                                          webBean);
                    String msgError = "";
                    if (isSuccessAll == null)
                        msgError = 
                                pageContext.getMessage("XBOL", "XXGAM_MAF_DETAIL_VALLINE_ERROR", 
                                                       null);
                    if (!"".equals(msgError))
                        throw new OAException(msgError, (byte)0);
                } else {
                    throw new OAException("XBOL", 
                                          "XXGAM_MAF_DETAIL_VAL_REPEAT", null, 
                                          (byte)1, null);
                }
                pageContext.forwardImmediatelyToCurrentPage(null, true, "N");
            }
            if ("ticketDetailsAction".equals(pageContext.getParameter("event"))) {
                pageContext.putTransactionValue("calledFrom", "Step2");
                setForwardAirPlaneDetail(pageContext, webBean);
            }
            if ("updateAllValidByLine".equals(pageContext.getParameter("event"))) {
                setCurrencyAllRowDetail(pageContext, webBean);
                Boolean isSuccessAll = Boolean.valueOf(false);
                isSuccessAll = 
                        Boolean.valueOf(XxGamMAnticiposUtil.refreshAllValidationRepeat(pageContext, 
                                                                                       webBean));
                if (isSuccessAll.booleanValue()) {
                    isSuccessAll = 
                            XxGamMAnticiposUtil.refreshAllValidationByLine(pageContext, 
                                                                           webBean);
                    XxGamMAnticiposUtil.calculateAmountMxAllPaymentDetail(pageContext, 
                                                                          webBean);
                    String msgError = "";
                    if (isSuccessAll == null)
                        msgError = 
                                pageContext.getMessage("XBOL", "XXGAM_MAF_DETAIL_VALLINE_ERROR", 
                                                       null);
                    if (!"".equals(msgError))
                        throw new OAException(msgError, (byte)0);
                } else {
                    throw new OAException("XBOL", 
                                          "XXGAM_MAF_DETAIL_VAL_REPEAT", null, 
                                          (byte)1, null);
                }

                if (isSuccessAll.booleanValue()) {
                    isSuccessAll = 
                            XxGamMAnticiposUtil.refreshAllValidationByLineCategory(pageContext, 
                                                                                   webBean);
                    if (!isSuccessAll.booleanValue()) {
                        throw new OAException("XBOL", 
                                              "XXGAM_MAF_VAL_CATEGORY_MSG", 
                                              null, OAException.ERROR, null);
                    }
                }

            }
            if ("updateTotal".equals(pageContext.getParameter("event"))) {
                boolean isSuccess = false;
                isSuccess = 
                        XxGamMAnticiposUtil.calculateAmountTotalGeneralReq(pageContext, 
                                                                           webBean);
                if (!isSuccess)
                    throw new OAException("XBOL", 
                                          "XXGAM_MAF_REQ_TOTAL_CAL_ERROR", 
                                          null, (byte)0, null);
            }
            if ("duplicateAction".equals(pageContext.getParameter("event"))) {
                String keyRow = getEvent(pageContext);
                try {
                    pageContext.writeDiagnostics(this, 
                                                 (new StringBuilder()).append("Calling duplicatePayment(").append(keyRow).append(")").toString(), 
                                                 1);
                    XxGamMAnticiposUtil.getApplicationModule(pageContext, 
                                                             webBean).duplicatePayment(keyRow);
                    pageContext.writeDiagnostics(this, 
                                                 "Leaving duplicatePayment", 
                                                 1);
                } catch (OAException exception) {
                    pageContext.writeDiagnostics(this, exception.getMessage(), 
                                                 5);
                    MessageToken tokens[] = 
                    { new MessageToken("MSG_ERROR", exception.getMessage()) };
                    throw new OAException("XBOL", "XXGAM_MAF_DUP_ROW_ERROR", 
                                          tokens, (byte)0, null);
                }
            }
            XxGamMAnticiposUtil.exePaymentReqProcessFromRequest(pageContext, 
                                                                webBean, 
                                                                pageContext.getParameter("event"));
        }
    }

    private boolean setCurrencyAllRowDetail(OAPageContext pageContext, 
                                            OAWebBean webBean) {
        boolean isSuccessAll = false;
        String currencyCode = null;
        String currencyDesc = null;
        OAMessageChoiceBean currencyChoiceBean = 
            (OAMessageChoiceBean)webBean.findChildRecursive("CurrencyCodeEditAll");
        if (currencyChoiceBean != null) {
            currencyCode = currencyChoiceBean.getSelectionValue(pageContext);
            currencyDesc = currencyChoiceBean.getSelectionText(pageContext);
        }
        isSuccessAll = 
                XxGamMAnticiposUtil.setCurrencyAllRowDetail(pageContext, webBean, 
                                                            currencyCode, 
                                                            currencyDesc);
        return isSuccessAll;
    }

    private boolean validateDates(OAPageContext pageContext, 
                                  OAWebBean webBean) {
        boolean isValid = false;
        if (pageContext != null && webBean != null) {
            String rowRef = getRowRefFromTable(pageContext);
            if (rowRef != null) {
                isValid = 
                        XxGamMAnticiposUtil.validateNotLessCurrentDatesDetailFromPage(pageContext, 
                                                                                      webBean, 
                                                                                      rowRef, 
                                                                                      null);
                if (isValid) {
                    isValid = 
                            XxGamMAnticiposUtil.validateDatesDetailFromPage(pageContext, 
                                                                            webBean, 
                                                                            rowRef);
                    if (!isValid)
                        throw new OAException("XBOL", 
                                              "XXGAM_MAF_DETAIL_VAL_FH_INIFIN", 
                                              null, (byte)1, null);
                } else {
                    throw new OAException("XBOL", 
                                          "XXGAM_MAF_DETAIL_VAL_CURR_DATE", 
                                          null, (byte)1, null);
                }
            }
        }
        return isValid;
    }

    private void setValuesTypePaymentFromPage(OAPageContext pageContext, 
                                              OAWebBean webBean) {
        if (pageContext != null && webBean != null) {
            String rowRef = getRowRefFromTable(pageContext);
            XxGamMAnticiposUtil.deleteTicketPlaneDetail(pageContext, webBean, 
                                                        rowRef);
            boolean isValid = false;
            isValid = 
                    XxGamMAnticiposUtil.validatesTypePaymentRepeated(pageContext, 
                                                                     webBean, 
                                                                     rowRef, 
                                                                     null);
            if (isValid) {
                isValid = 
                        XxGamMAnticiposUtil.validatesTypePaymentCategory(pageContext, 
                                                                         webBean, 
                                                                         rowRef, 
                                                                         null);
                if (isValid) {
                    java.util.Map mapResult = null;
                    mapResult = 
                            XxGamMAnticiposUtil.setTypePaymentSelectProcess(pageContext, 
                                                                            webBean, 
                                                                            rowRef);
                    System.out.println("paymentReqDetailCO Valor de mapResult: " + 
                                       mapResult);

                    setValueAmountMXN(pageContext, webBean);
                } else {
                    throw new OAException("XBOL", "XXGAM_MAF_VAL_CATEGORY_MSG", 
                                          null, OAException.ERROR, null);
                }
            } else {
                throw new OAException("XBOL", "XXGAM_MAF_DETAIL_VAL_REPEAT", 
                                      null, (byte)1, null);
            }
        }
    }

    private boolean setValueAmountMXN(OAPageContext pageContext, 
                                      OAWebBean webBean) {
        boolean isSuccess = false;
        String rowRef = getRowRefFromTable(pageContext);
        isSuccess = 
                XxGamMAnticiposUtil.calculateAmountMxPaymentReqDetail(pageContext, 
                                                                      webBean, 
                                                                      rowRef, 
                                                                      null);
        return isSuccess;
    }

    public String getRowRefFromTable(OAPageContext pageContext) {
        String rowRef = null;
        rowRef = pageContext.getParameter("evtSrcRowRef");
        return rowRef;
    }

    private void setForwardAirPlaneDetail(OAPageContext pageContext, 
                                          OAWebBean webBean) {
        if (pageContext == null || webBean == null)
            return;
        String sURL = null;
        String sParam = null;
        Number nPaymentId = null;
        sParam = pageContext.getParameter("paymentId");
        nPaymentId = XxGamMAnticiposUtil.converteNumber(sParam);
        if (nPaymentId != null) {
            boolean isSuccess = 
                XxGamMAnticiposUtil.setCurrentRowDetailPayment(pageContext, 
                                                               webBean, 
                                                               nPaymentId);
            if (isSuccess) {
                sURL = 
"OA.jsp?page=/xxgam/oracle/apps/xbol/maf/webui/XxGamPaymentReqTicketPlanePG";
                HashMap hmap = null;
                XxGamMAnticiposUtil.setForwardWhitParameters(pageContext, 
                                                             webBean, hmap, 
                                                             sURL);
            } else {
                throw new OAException("XBOL", "XXGAM_MAF_DETAIL_IDTOTICKET_ER", 
                                      null, (byte)0, null);
            }
        } else {
            throw new OAException("XBOL", "XXGAM_MAF_DETAIL_ID_NF_ERROR", null, 
                                  (byte)0, null);
        }
    }

    protected String getEvent(OAPageContext pageContext) {
        pageContext.writeDiagnostics(this, "Entered getEvent operation", 2);
        String rowReference = null;
        rowReference = pageContext.getParameter("evtSrcRowRef");
        pageContext.writeDiagnostics(this, "Leaving getEvent operation", 2);
        return rowReference;
    }

    public XxGamPaymentReqDetailCO() {
    }

    public static final String RCS_ID = "$Header$";
    public static final boolean RCS_ID_RECORDED = 
        VersionInfo.recordClassVersion("$Header$", "%packagename%");
    public static final String PAGE_DETAIL_AIRPLANE = 
        "XxGamPaymentReqTicketPlanePG";

}
