package xxgam.oracle.apps.xbol.maf.server;

import oracle.apps.fnd.framework.OAException;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.domain.Number;

import xxgam.oracle.apps.xbol.maf.lov.server.XxGamMaFlightRouteLovVORowImpl;
import xxgam.oracle.apps.xbol.maf.lov.server.XxGamModAntLovAMImpl;
import xxgam.oracle.apps.xbol.maf.utils.XxGamAOLMessages;
import xxgam.oracle.apps.xbol.maf.utils.XxGamMAnticiposUtil;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamMaFlightInf0VOImpl extends OAViewObjectImpl {
    /**This is the default constructor (do not remove)
     */
    public XxGamMaFlightInf0VOImpl() {
    }

    /**
     * Crea un registro hijo del requerimiento principal.
     *
     * @param rowBase Row a copiar.
     * @return registro creado
     */
    public XxGamMaFlightInf0VORowImpl getPaymentFlight(XxGamMaFlightInf0VORowImpl rowBase, 
                                                       RowIterator iterNuevo) {

        //Verifica nulidad
        if (rowBase == null)
            return null;

        XxGamMaFlightInf0VORowImpl rowActual = null;

        try {

            rowActual = (XxGamMaFlightInf0VORowImpl)iterNuevo.createRow();


            oracle.jbo.domain.Date currentDate = 
                XxGamMAnticiposUtil.getFechaActual();

            //Inicializa los valores del registro
            rowActual.setTravelingFrom(rowBase.getTravelingFrom());
            rowActual.setTravelingTo(rowBase.getTravelingTo());
            rowActual.setReturnDate(currentDate);
            rowActual.setDepartureDate(currentDate);
            rowActual.setNewRowState(Row.STATUS_NEW);

        } catch (Exception exception) {
            exception.getMessage();
        }
        return rowActual;
    }

    /**
     * Crea una nueva fila para ingresar el vuelo en SOLICITUD DE BOLETO DE AVION
     * @param riFlightInf0 Row Iterator de XxGamMaFlightInf0
     */
    public void addFlightInf0(RowIterator riFlightInf0) {
        //Verifica nulidad
        if (riFlightInf0 == null) {
            return;
        }
        try {
            XxGamMaFlightInf0VORowImpl rowXxGamMaFlightInf = null;
            rowXxGamMaFlightInf = 
                    (XxGamMaFlightInf0VORowImpl)riFlightInf0.createRow();
            rowXxGamMaFlightInf.setNewRowState(Row.STATUS_INITIALIZED);
            riFlightInf0.insertRow(rowXxGamMaFlightInf);
        } catch (OAException e) {
            throw new OAException(e.getMessage());
        }
    }


    public void removeFlightInfor(RowIterator riFlightInf0) {
        if (riFlightInf0 == null)
            return;
        XxGamMaFlightInf0VORowImpl rowXxGamMaFlightInf = null;
        rowXxGamMaFlightInf = 
                (XxGamMaFlightInf0VORowImpl)riFlightInf0.getCurrentRow();
        rowXxGamMaFlightInf.remove();
        riFlightInf0.removeCurrentRow();
    }


    /**
     * Obtiene los Vuelos por TicketId
     * 
     * @param nTicketId Clave primaria
     */
    public void searchFlightByTicketId(Number nTicketId) {
        //Verifica nulidad
        if (nTicketId == null)
            return;
        try {
            //Declara los recursos    
            ViewCriteria vcTicket = null;
            ViewCriteriaRow rowVCTicket = null;

            //Crea el criterio de busqueda
            vcTicket = createViewCriteria();
            rowVCTicket = vcTicket.createViewCriteriaRow();
            rowVCTicket.setAttribute("TicketPId", nTicketId);

            //Aplica el criterio
            vcTicket.addElement(rowVCTicket);
            applyViewCriteria(vcTicket);
            executeQuery();

            //Inicializa el current row
            if (getEstimatedRowCount() > 0) {
                setCurrentRow(first());
            }
            clearViewCriterias();
        } catch (Exception exception) {
            clearViewCriterias();
        }
        return;
    }

    public void deleteFlightEmployee(Number flightId) {
        Row[] deleteRows = null;
        deleteRows = getFilteredRows("Id", flightId);
        if (deleteRows != null) {
            if (deleteRows.length > 0) {
                deleteRows[0].remove();
                deleteRows = null;
                deleteRows = getFilteredRows("Id", flightId);
                if (deleteRows != null) {
                    if (deleteRows.length > 0) {
                        throw new OAException(XxGamAOLMessages.GenericType.SHORT_NAME_XBOL, 
                                              XxGamAOLMessages.GenericType.XXGAM_MAF_TKT_F_DEL_ERROR, 
                                              null, OAException.ERROR, null);
                    } else {
                        throw new OAException(XxGamAOLMessages.GenericType.SHORT_NAME_XBOL, 
                                              XxGamAOLMessages.GenericType.XXGAM_MAF_TKT_F_DEL_INFO, 
                                              null, OAException.INFORMATION, 
                                              null);
                    }
                } else {
                    throw new OAException(XxGamAOLMessages.GenericType.SHORT_NAME_XBOL, 
                                          XxGamAOLMessages.GenericType.XXGAM_MAF_TKT_F_DEL_INFO, 
                                          null, OAException.INFORMATION, null);
                }
            } else {
                throw new OAException(XxGamAOLMessages.GenericType.SHORT_NAME_XBOL, 
                                      XxGamAOLMessages.GenericType.XXGAM_MAF_TKT_F_NF_ERROR, 
                                      null, OAException.WARNING, null);
            }
        } else {
            throw new OAException(XxGamAOLMessages.GenericType.SHORT_NAME_XBOL, 
                                  XxGamAOLMessages.GenericType.XXGAM_MAF_TKT_F_NF_ERROR, 
                                  null, OAException.WARNING, null);
        }
    }

    /**
     * Obtiene la oficina de boletos
     * @return Oficina de boletos
     */
    public String findRouteFlight(Number flightId) {
        String routeFlight = null;

        //Verifica nulidad
        if (flightId == null)
            return null;
        try {
            //Declara los recursos    
            ViewCriteria vcTicket = null;
            ViewCriteriaRow rowVCTicket = null;

            //Crea el criterio de busqueda
            vcTicket = createViewCriteria();
            rowVCTicket = vcTicket.createViewCriteriaRow();
            rowVCTicket.setAttribute("Id", flightId);

            //Aplica el criterio
            vcTicket.addElement(rowVCTicket);
            applyViewCriteria(vcTicket);
            executeQuery();

            //Inicializa el current row
            if (getEstimatedRowCount() > 0) {
                setCurrentRow(first());
                XxGamMaFlightInf0VORowImpl roXxGamMaFlightInf0 = 
                    (XxGamMaFlightInf0VORowImpl)getCurrentRow();
                routeFlight = 
                        roXxGamMaFlightInf0.getTravelingFrom() + " - " + roXxGamMaFlightInf0.getTravelingTo();
            }
            clearViewCriterias();
        } catch (Exception exception) {
            clearViewCriterias();
        }
        return routeFlight;
    }

    /**
     * Inicializa las descripciones de las routas de los vuelos
     * @return devuelve true si la inicializacion es correcta o false en caso contrario
     */
    public boolean setFlightRouteDescription() {
        System.out.println("Comienza Capa View Object Impl setFlightRouteDescription");
        boolean isSuccess = false;
        RowSetIterator flightIter = createRowSetIterator(null);
        flightIter.setRangeStart(0);
        XxGamModAntAMImpl am = (XxGamModAntAMImpl)getApplicationModule();
        XxGamModAntLovAMImpl amLov = null;
        if (am != null) {
            amLov = (XxGamModAntLovAMImpl)am.getXxGamModAntLovAM1();
        }

        boolean isNotFound = false;
        if (flightIter != null && amLov != null) {
            while (flightIter.hasNext()) {
                XxGamMaFlightInf0VORowImpl currentFlight = 
                    (XxGamMaFlightInf0VORowImpl)flightIter.next();
                if (currentFlight != null) {

                    if (currentFlight.getTravelingFrom() != null) {
                        System.out.println("currentFlight.getTravelingFrom()-->" + 
                                           currentFlight.getTravelingFrom());
                        XxGamMaFlightRouteLovVORowImpl routeFromRow = 
                            amLov.getFlightRouteLovRow(currentFlight.getTravelingFrom());
                        if (routeFromRow != null) {
                            currentFlight.setTravelingFromDescription(routeFromRow.getMeaning());
                        } else {
                            isNotFound = true;
                        }
                    }
                    if (currentFlight.getTravelingTo() != null) {
                        XxGamMaFlightRouteLovVORowImpl routeToRow = 
                            amLov.getFlightRouteLovRow(currentFlight.getTravelingTo());
                        if (routeToRow != null) {
                            currentFlight.setTravelingToDescription(routeToRow.getMeaning());
                        } else {
                            isNotFound = true;
                        }
                    }
                }
            }

            flightIter.closeRowSetIterator();

            if (isNotFound) {
                isSuccess = false;
            } else {
                isSuccess = true;
            }
        }
        System.out.println("Finaliza setFlightRouteDescription");
        return isSuccess;
    }
}
