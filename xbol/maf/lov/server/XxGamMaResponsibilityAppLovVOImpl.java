package xxgam.oracle.apps.xbol.maf.lov.server;

import oracle.apps.fnd.framework.server.OAViewObjectImpl;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;

import oracle.jbo.domain.Number;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamMaResponsibilityAppLovVOImpl extends OAViewObjectImpl {
    /**This is the default constructor (do not remove)
     */
    public XxGamMaResponsibilityAppLovVOImpl() {
    }

    /**
     * Configura la busqueda de las responsabilidades por id
     * @param responsibilityId contiene el id de la responsabilidad
     */
    public void setSearchResponsibilityApp(Number responsibilityId) {

        if (responsibilityId != null) {
            //Number resId = new Number(52575);
            
            setSearchRespAppVc(responsibilityId);
            //setSearchRespAppVc(resId);
            executeQuery();
        }
    }

    /**
     * Genera los criterios de busqueda para la consulta de responsabilidades de
     * la aplicacion
     * @param responsibilityId contiene el id de la responsabilidad
     */
    public void setSearchRespAppVc(Number responsibilityId) {

        //Declaracion de los recursos
        ViewCriteria vc = null;
        ViewCriteriaRow vcRow = null;

        //Crea el view criteria
        vc = createViewCriteria();
        vcRow = vc.createViewCriteriaRow();

        //Inicializa el id de la responsabilidad
        if (responsibilityId != null)
            vcRow.setAttribute("ResponsibilityId", responsibilityId);

        try {
            //Inicializa el criteria y lo aplica
            vc.addElement(vcRow);
            applyViewCriteria(vc);
        } catch (Exception exception) {
            //Propaga la excepcion
            exception.printStackTrace();
        }
    }
}
