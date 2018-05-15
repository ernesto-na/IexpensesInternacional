package xxgam.oracle.apps.xbol.maf.lov.server;

import oracle.apps.fnd.framework.server.OAViewObjectImpl;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamMaTemplatePaymentLovVOImpl extends OAViewObjectImpl
{

    /**
     * Contiene el id de la plantilla de anticipo
     */
    private Number idTemplate;

    /**
     * Contiene el id de combinacion contable del empleado para el centro de costo
     */
    private Number costCenterId;
    
    /**This is the default constructor (do not remove)
     */
    public XxGamMaTemplatePaymentLovVOImpl() {
    }

    /**
     * Busca la plantilla de anticipo por id
     * @param idTemplate contiene el id de la plantilla de anticipo
     * @param costCenterId contiene el id de combinacion contable del empleado
     */
    public void searchTemplatePaymentById(Number idTemplate, 
                                          Number costCenterId) {
      System.out.println("Comienza searchTemplatePaymentById Capa LovImpl "); 
      
        if (idTemplate != null || costCenterId != null) {
            setCostCenterId(costCenterId);
            setIdTemplate(idTemplate);
            executeQuery();
        }
      System.out.println("Finaliza searchTemplatePaymentById Capa LovImpl ");   
    }

    /**
     * Configura el criterio de busqueda para la plantilla por medio del id
     * de combinacion contable
     * @param costCenterId contiene el id de combinacion contable
     * @param templateId contiene el id de la plantilla de anticipo
     */
    public void setSearchTemplateVc(Number costCenterId, Number templateId) {

        //Declaración de los recursos
        ViewCriteria vc = null;
        ViewCriteriaRow vcRow = null;

        //Crea el view criteria
        vc = createViewCriteria();
        vcRow = vc.createViewCriteriaRow();
        
        if(costCenterId != null){
            vcRow.setAttribute("CodeCombinationId", costCenterId);    
        }
        if (templateId != null) {
            vcRow.setAttribute("TemplateId", templateId);
        }

        try {
            //Inicializa el criteria y lo aplica
            vc.addElement(vcRow);
            applyViewCriteria(vc);
        } catch (Exception exception) {
            //Propaga la excepcion
            clearViewCriterias();
        }
    }

    public void setIdTemplate(Number idTemplate) {
        this.idTemplate = idTemplate;
    }

    public Number getIdTemplate() {
        return idTemplate;
    }

    public void setCostCenterId(Number costCenterId) {
        this.costCenterId = costCenterId;
    }

    public Number getCostCenterId() {
        return costCenterId;
    }

    /******************************************
    public void executeQuery() {
    
        if(getCostCenterId() != null){
            setSearchTemplateVc(getCostCenterId(), getIdTemplate());
            super.executeQuery();
            clearViewCriterias();
        }
    }
    **********************************************/


  /*******Procedimiento que se creo para que la lista de valores de modo Normal
   *******de las plantillas esten filtradas por organizacion reutilizando Codigo
   ***************/
  public void searchTemplatePaymentById(Number idTemplate
                                       ,Number costCenterId 
                                       ,String orgShortNameEmp)
  {
    System.out.println("Comienza searchTemplatePaymentById 3 parametros Capa Lov Impl orgShortNameEmp:"+orgShortNameEmp); 
    
    /************************************************
     * Causa de Muchos errores 
    setWhereClause(null);
    setWhereClauseParams(null);
    setWhereClause(" CODE_COMBINATION_ID = :costCenterId ");
    defineNamedWhereClauseParam("costCenterId", null, null);
    defineNamedWhereClauseParam("shortOrgName", null, null);
    setshortOrgName(orgShortNameEmp); 
    setNamedWhereClauseParam("costCenterId",costCenterId);
    super.executeQuery();
    clearViewCriterias();
    **********************************************************/
    
    ViewCriteria vc = null;
     ViewCriteriaRow vcRow = null;
    // 2. Create a view criteria row set for this view object
      vc = createViewCriteria();
    // 3. Use the view criteria to create one or more view criteria rows
      vcRow = vc.createViewCriteriaRow();
    // 4. Set attribute values to filter on in appropriate view criteria rows
     if(null!=costCenterId){
       vcRow.setAttribute("CodeCombinationId",costCenterId);
     }
    if (null!=idTemplate) {
         vcRow.setAttribute("TemplateId", idTemplate);
       }
    
    if(null!=orgShortNameEmp){
      vcRow.setAttribute("UnidadOperativa", orgShortNameEmp+"%");
    } 
    
    try
       {
         // 5. Add the view criteria rows to the view critera row set
         vc.addElement(vcRow); 
         // 6. Apply the view criteria to the view object
         applyViewCriteria(vc);
       }
       catch (Exception exception) {
         clearViewCriterias();
      }
    
    // 7. Execute the query
    executeQuery();
    while (hasNext()) {
           Row curPerson = next();
           System.out.println(curPerson.getAttribute("CodeCombinationId") + " " +curPerson.getAttribute("TemplateId")+" " +curPerson.getAttribute("UnidadOperativa"));
           }
    //clearViewCriterias();  
       
    //**Example 5-23 Correct Use of setWhereClause() Method and Bind Variable
    /**Referecnias http://docs.oracle.com/cd/E17904_01/web.1111/b31974/bcquerying.htm#ADFFD305 **/
    
    System.out.println("Finaliza searchTemplatePaymentById 3 parametros Capa Lov Impl"); 
  }


}
