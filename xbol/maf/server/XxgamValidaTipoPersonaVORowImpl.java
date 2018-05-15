package xxgam.oracle.apps.xbol.maf.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxgamValidaTipoPersonaVORowImpl extends OAViewRowImpl {
    public static final int PERSONID = 0;
    public static final int TIPOPERSONA = 1;

    /**This is the default constructor (do not remove)
     */
    public XxgamValidaTipoPersonaVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute PersonId
     */
    public Number getPersonId() {
        return (Number) getAttributeInternal(PERSONID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute PersonId
     */
    public void setPersonId(Number value) {
        setAttributeInternal(PERSONID, value);
    }

    /**Gets the attribute value for the calculated attribute Tipopersona
     */
    public String getTipopersona() {
        return (String) getAttributeInternal(TIPOPERSONA);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Tipopersona
     */
    public void setTipopersona(String value) {
        setAttributeInternal(TIPOPERSONA, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case PERSONID:
            return getPersonId();
        case TIPOPERSONA:
            return getTipopersona();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case PERSONID:
            setPersonId((Number)value);
            return;
        case TIPOPERSONA:
            setTipopersona((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
