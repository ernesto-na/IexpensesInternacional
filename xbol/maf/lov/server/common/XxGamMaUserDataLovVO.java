package xxgam.oracle.apps.xbol.maf.lov.server.common;

import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public interface XxGamMaUserDataLovVO extends ViewObject {
    void searchUser(String strUserName, String strVendorType);

    void searchUserByPersonId(Number personId, String strVendorType);
}
