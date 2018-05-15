package xxgam.oracle.apps.xbol.maf.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamAdvanceRequestVORowImpl extends OAViewRowImpl
{
  public static final int ID = 0;
  public static final int NUMBERPAYMENT = 1;
  public static final int REQUESTPAYMENTDATE = 2;
  public static final int ESTATUSREQUEST = 3;
  public static final int TOTALPAYMENT = 4;
  public static final int PURPOSE = 5;
  public static final int PURPOSEDESC = 6;
  public static final int LOOKUPCODE = 7;
  public static final int APPROVALDATE = 8;
  public static final int ISUPGRADEABLE = 9;
  public static final int COSTCENTER = 10;
  public static final int STATUSFRANCHISE = 11;
  public static final int TIPOSOLICITUD = 12;
  public static final int STATUSNOTIFICATIONDESC = 13;
  public static final int ORIGIN = 14;
  public static final int DESCRIPTIONPURPOSE = 15;

  /**This is the default constructor (do not remove)
   */
    public XxGamAdvanceRequestVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute NumberPayment
     */
    public String getNumberPayment() {
        return (String) getAttributeInternal(NUMBERPAYMENT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute NumberPayment
     */
    public void setNumberPayment(String value) {
        setAttributeInternal(NUMBERPAYMENT, value);
    }

    /**Gets the attribute value for the calculated attribute RequestPaymentDate
     */
    public Date getRequestPaymentDate() {
        return (Date) getAttributeInternal(REQUESTPAYMENTDATE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute RequestPaymentDate
     */
    public void setRequestPaymentDate(Date value) {
        setAttributeInternal(REQUESTPAYMENTDATE, value);
    }

    /**Gets the attribute value for the calculated attribute EstatusRequest
     */
    public String getEstatusRequest() {
        return (String) getAttributeInternal(ESTATUSREQUEST);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute EstatusRequest
     */
    public void setEstatusRequest(String value) {
        setAttributeInternal(ESTATUSREQUEST, value);
    }

    /**Gets the attribute value for the calculated attribute TotalPayment
     */
    public Number getTotalPayment() {
        return (Number) getAttributeInternal(TOTALPAYMENT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute TotalPayment
     */
    public void setTotalPayment(Number value) {
        setAttributeInternal(TOTALPAYMENT, value);
    }

    /**Gets the attribute value for the calculated attribute DescriptionPurpose
     */
    public String getDescriptionPurpose() {
        return (String) getAttributeInternal(DESCRIPTIONPURPOSE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute DescriptionPurpose
     */
    public void setDescriptionPurpose(String value) {
        setAttributeInternal(DESCRIPTIONPURPOSE, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
    switch (index)
    {
    case ID:
      return getId();
    case NUMBERPAYMENT:
      return getNumberPayment();
    case REQUESTPAYMENTDATE:
      return getRequestPaymentDate();
    case ESTATUSREQUEST:
      return getEstatusRequest();
    case TOTALPAYMENT:
      return getTotalPayment();
    case PURPOSE:
      return getPurpose();
    case PURPOSEDESC:
      return getPurposeDesc();
    case LOOKUPCODE:
      return getLookupCode();
    case APPROVALDATE:
      return getApprovalDate();
    case ISUPGRADEABLE:
      return getIsUpgradeable();
    case COSTCENTER:
      return getCostCenter();
    case STATUSFRANCHISE:
      return getStatusFranchise();
    case TIPOSOLICITUD:
      return getTipoSolicitud();
    case STATUSNOTIFICATIONDESC:
      return getStatusNotificationDesc();
    case ORIGIN:
      return getOrigin();
    case DESCRIPTIONPURPOSE:
      return getDescriptionPurpose();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
    switch (index)
    {
    case ID:
      setId((Number)value);
      return;
    case PURPOSE:
      setPurpose((String)value);
      return;
    case PURPOSEDESC:
      setPurposeDesc((String)value);
      return;
    case LOOKUPCODE:
      setLookupCode((String)value);
      return;
    case APPROVALDATE:
      setApprovalDate((Date)value);
      return;
    case ISUPGRADEABLE:
      setIsUpgradeable((String)value);
      return;
    case COSTCENTER:
      setCostCenter((Number)value);
      return;
    case STATUSFRANCHISE:
      setStatusFranchise((String)value);
      return;
    case TIPOSOLICITUD:
      setTipoSolicitud((String)value);
      return;
    case STATUSNOTIFICATIONDESC:
      setStatusNotificationDesc((String)value);
      return;
    case ORIGIN:
      setOrigin((String)value);
      return;
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }

    /**Gets the attribute value for the calculated attribute Id
     */
    public Number getId() {
        return (Number) getAttributeInternal(ID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Id
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**Gets the attribute value for the calculated attribute LookupCode
     */
    public String getLookupCode() {
        return (String) getAttributeInternal(LOOKUPCODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute LookupCode
     */
    public void setLookupCode(String value) {
        setAttributeInternal(LOOKUPCODE, value);
    }

    /**Gets the attribute value for the calculated attribute ApprovalDate
     */
    public Date getApprovalDate() {
        return (Date) getAttributeInternal(APPROVALDATE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ApprovalDate
     */
    public void setApprovalDate(Date value) {
        setAttributeInternal(APPROVALDATE, value);
    }


    /**Gets the attribute value for the calculated attribute IsUpgradeable
     */
    public String getIsUpgradeable() {
        return (String) getAttributeInternal(ISUPGRADEABLE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IsUpgradeable
     */
    public void setIsUpgradeable(String value) {
        setAttributeInternal(ISUPGRADEABLE, value);
    }

    /**Gets the attribute value for the calculated attribute CostCenter
     */
    public Number getCostCenter() {
        return (Number) getAttributeInternal(COSTCENTER);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostCenter
     */
    public void setCostCenter(Number value) {
        setAttributeInternal(COSTCENTER, value);
    }

    /**Gets the attribute value for the calculated attribute StatusFranchise
     */
    public String getStatusFranchise() {
        return (String) getAttributeInternal(STATUSFRANCHISE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute StatusFranchise
     */
    public void setStatusFranchise(String value) {
        setAttributeInternal(STATUSFRANCHISE, value);
    }

    /**Gets the attribute value for the calculated attribute Purpose
     */
    public String getPurpose() {
        return (String) getAttributeInternal(PURPOSE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Purpose
     */
    public void setPurpose(String value) {
        setAttributeInternal(PURPOSE, value);
    }

    /**Gets the attribute value for the calculated attribute TipoSolicitud
     */
    public String getTipoSolicitud() {
        return (String) getAttributeInternal(TIPOSOLICITUD);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute TipoSolicitud
     */
    public void setTipoSolicitud(String value) {
        setAttributeInternal(TIPOSOLICITUD, value);
    }

    /**Gets the attribute value for the calculated attribute PurposeDesc
     */
    public String getPurposeDesc() {
        return (String) getAttributeInternal(PURPOSEDESC);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute PurposeDesc
     */
    public void setPurposeDesc(String value) {
        setAttributeInternal(PURPOSEDESC, value);
    }

    /**Gets the attribute value for the calculated attribute StatusNotificationDesc
     */
    public String getStatusNotificationDesc() {
        return (String) getAttributeInternal(STATUSNOTIFICATIONDESC);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute StatusNotificationDesc
     */
    public void setStatusNotificationDesc(String value) {
        setAttributeInternal(STATUSNOTIFICATIONDESC, value);
    }

  /**Gets the attribute value for the calculated attribute Origin
   */
  public String getOrigin()
  {
    return (String) getAttributeInternal(ORIGIN);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute Origin
   */
  public void setOrigin(String value)
  {
    setAttributeInternal(ORIGIN, value);
  }
}
