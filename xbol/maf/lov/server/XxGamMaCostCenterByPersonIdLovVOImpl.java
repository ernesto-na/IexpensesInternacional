package xxgam.oracle.apps.xbol.maf.lov.server;

import oracle.apps.fnd.framework.server.OAViewObjectImpl;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.domain.Number;

import xxgam.oracle.apps.xbol.maf.lov.server.common.XxGamMaCostCenterByPersonIdLovVO;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamMaCostCenterByPersonIdLovVOImpl extends OAViewObjectImpl implements XxGamMaCostCenterByPersonIdLovVO {

    /**
     * Contiene el id persona del empleado
     */
    private Number employeePersonId;

    /**
     * Contiene el lookup type de tarjeta virtual
     */
    private String vcLookupType;

    /**This is the default constructor (do not remove)
     */
    public XxGamMaCostCenterByPersonIdLovVOImpl() {
    }

    /**
     * Ejecuta la consulta para buscar centro de costos por id de persona
     * @param numPersonId contiene el id de persona
     * @param vcLookupType contiene el lookup type para tarjeta virtual
     */
    public void searchCostCenterByPersonId(Number numPersonId, 
                                           String vcLookupType) {

        if (numPersonId != null && vcLookupType != null) {
            setEmployeePersonId(numPersonId);
            setVcLookupType(vcLookupType);
            executeQuery();
        }
    }

    public void executeQuery() {

        setWhereClause(null);
        if (getEmployeePersonId() != null && getVcLookupType() != null) {
            //Crea view criteria
            setCostCenterByPersonIdVC(getEmployeePersonId(), getVcLookupType(), 
                                      null);
            super.executeQuery();
            clearViewCriterias();
        }
    }

    /**
     * Crea un view criteria para buscar centro de costo por defecto por id persona del empleado
     * @param personId contiene el id persona del empleado
     * @param vcLookupType contiene el lookup type de tarjeta virtual
     */
    public void setCostCenterByPersonIdVC(Number personId, String vcLookupType, 
                                          Number costCenter) {

        if (personId != null && vcLookupType != null) {

            //Declaración de los recursos
            ViewCriteria vcLookup = null;
            ViewCriteriaRow vcLookupRow = null;

            //Crea el view criteria
            vcLookup = createViewCriteria();
            vcLookupRow = vcLookup.createViewCriteriaRow();

            //Inicializa el tipo de lookup
            vcLookupRow.setAttribute("EmployeePersonId", personId);
            vcLookupRow.setAttribute("VcLookupType", vcLookupType);

            //Inicializa el cost center
            if (costCenter != null)
                vcLookupRow.setAttribute("CodeCombinationId", costCenter);

            try {
                //Inicializa el criteria y lo aplica
                vcLookup.addElement(vcLookupRow);
                applyViewCriteria(vcLookup);
            } catch (Exception exception) {
                //Propaga la excepcion
                exception.printStackTrace();
            }
        }
    }

    public void setEmployeePersonId(Number employeePersonId) {
        this.employeePersonId = employeePersonId;
    }

    public Number getEmployeePersonId() {
        return employeePersonId;
    }

    public void setVcLookupType(String vcLookupType) {
        this.vcLookupType = vcLookupType;
    }

    public String getVcLookupType() {
        return vcLookupType;
    }

}
