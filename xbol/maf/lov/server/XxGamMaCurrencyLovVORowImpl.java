package xxgam.oracle.apps.xbol.maf.lov.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.server.AttributeDefImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamMaCurrencyLovVORowImpl extends OAViewRowImpl {
    public static final int CURRENCYCODE = 0;
    public static final int CURRENCYNAME = 1;
    public static final int CURRENCYDESC = 2;

    /**This is the default constructor (do not remove)
     */
    public XxGamMaCurrencyLovVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute CurrencyCode
     */
    public String getCurrencyCode() {
        return (String)getAttributeInternal(CURRENCYCODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CurrencyCode
     */
    public void setCurrencyCode(String value) {
        setAttributeInternal(CURRENCYCODE, value);
    }

    /**Gets the attribute value for the calculated attribute CurrencyName
     */
    public String getCurrencyName() {
        return (String)getAttributeInternal(CURRENCYNAME);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CurrencyName
     */
    public void setCurrencyName(String value) {
        setAttributeInternal(CURRENCYNAME, value);
    }

    /**Gets the attribute value for the calculated attribute CurrencyDesc
     */
    public String getCurrencyDesc() {
        return (String)getAttributeInternal(CURRENCYDESC);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CurrencyDesc
     */
    public void setCurrencyDesc(String value) {
        setAttributeInternal(CURRENCYDESC, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case CURRENCYCODE:
            return getCurrencyCode();
        case CURRENCYNAME:
            return getCurrencyName();
        case CURRENCYDESC:
            return getCurrencyDesc();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
