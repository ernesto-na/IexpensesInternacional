package xxgam.oracle.apps.xbol.maf.lov.server.client;

import oracle.jbo.client.remote.ViewUsageImpl;
import oracle.jbo.domain.Number;

import xxgam.oracle.apps.xbol.maf.lov.server.common.XxGamMaApproverByEmployeeIdLovVO;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamMaApproverByEmployeeIdLovVOClient extends ViewUsageImpl implements XxGamMaApproverByEmployeeIdLovVO {
    /**This is the default constructor (do not remove)
     */
    public XxGamMaApproverByEmployeeIdLovVOClient() {
    }

    public void searchApproverByCombinationEmployee(Number numEmployeeId, 
                                                    Number codeCombinationId) {
        Object _ret = 
            getApplicationModuleProxy().riInvokeExportedMethod(this, "searchApproverByCombinationEmployee", 
                                                               new String[] { "oracle.jbo.domain.Number", 
                                                                              "oracle.jbo.domain.Number" }, 
                                                               new Object[] { numEmployeeId, 
                                                                              codeCombinationId });
        return;
    }
}
