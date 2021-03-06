package xxgam.oracle.apps.inv.moveorder.vta.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.server.AttributeDefImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamSalesOrderHdrInfoVORowImpl extends OAViewRowImpl {
    public static final int TRANSACTIONTYPEID = 0;
    public static final int TRANSACTIONTYPE = 1;
    public static final int LISTHDRID = 2;
    public static final int LISTHDR = 3;
    public static final int CUSTOMERID = 4;
    public static final int CUSTOMERNUM = 5;
    public static final int SHIPLOCID = 6;
    public static final int SHIPLOCNUM = 7;
    public static final int BILLLOCID = 8;
    public static final int BILLLOCNUM = 9;
    public static final int CURRENCYCODE = 10;

    /**This is the default constructor (do not remove)
     */
    public XxGamSalesOrderHdrInfoVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute TransactionTypeID
     */
    public String getTransactionTypeID() {
        return (String)getAttributeInternal(TRANSACTIONTYPEID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute TransactionTypeID
     */
    public void setTransactionTypeID(String value) {
        setAttributeInternal(TRANSACTIONTYPEID, value);
    }

    /**Gets the attribute value for the calculated attribute TransactionType
     */
    public String getTransactionType() {
        return (String)getAttributeInternal(TRANSACTIONTYPE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute TransactionType
     */
    public void setTransactionType(String value) {
        setAttributeInternal(TRANSACTIONTYPE, value);
    }

    /**Gets the attribute value for the calculated attribute ListHdrID
     */
    public String getListHdrID() {
        return (String)getAttributeInternal(LISTHDRID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ListHdrID
     */
    public void setListHdrID(String value) {
        setAttributeInternal(LISTHDRID, value);
    }

    /**Gets the attribute value for the calculated attribute ListHdr
     */
    public String getListHdr() {
        return (String)getAttributeInternal(LISTHDR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ListHdr
     */
    public void setListHdr(String value) {
        setAttributeInternal(LISTHDR, value);
    }

    /**Gets the attribute value for the calculated attribute CustomerID
     */
    public String getCustomerID() {
        return (String)getAttributeInternal(CUSTOMERID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CustomerID
     */
    public void setCustomerID(String value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**Gets the attribute value for the calculated attribute CustomerNum
     */
    public String getCustomerNum() {
        return (String)getAttributeInternal(CUSTOMERNUM);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CustomerNum
     */
    public void setCustomerNum(String value) {
        setAttributeInternal(CUSTOMERNUM, value);
    }

    /**Gets the attribute value for the calculated attribute ShipLocID
     */
    public String getShipLocID() {
        return (String)getAttributeInternal(SHIPLOCID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ShipLocID
     */
    public void setShipLocID(String value) {
        setAttributeInternal(SHIPLOCID, value);
    }

    /**Gets the attribute value for the calculated attribute ShipLocNum
     */
    public String getShipLocNum() {
        return (String)getAttributeInternal(SHIPLOCNUM);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ShipLocNum
     */
    public void setShipLocNum(String value) {
        setAttributeInternal(SHIPLOCNUM, value);
    }

    /**Gets the attribute value for the calculated attribute BillLocID
     */
    public String getBillLocID() {
        return (String)getAttributeInternal(BILLLOCID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute BillLocID
     */
    public void setBillLocID(String value) {
        setAttributeInternal(BILLLOCID, value);
    }

    /**Gets the attribute value for the calculated attribute BillLocNum
     */
    public String getBillLocNum() {
        return (String)getAttributeInternal(BILLLOCNUM);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute BillLocNum
     */
    public void setBillLocNum(String value) {
        setAttributeInternal(BILLLOCNUM, value);
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

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case TRANSACTIONTYPEID:
            return getTransactionTypeID();
        case TRANSACTIONTYPE:
            return getTransactionType();
        case LISTHDRID:
            return getListHdrID();
        case LISTHDR:
            return getListHdr();
        case CUSTOMERID:
            return getCustomerID();
        case CUSTOMERNUM:
            return getCustomerNum();
        case SHIPLOCID:
            return getShipLocID();
        case SHIPLOCNUM:
            return getShipLocNum();
        case BILLLOCID:
            return getBillLocID();
        case BILLLOCNUM:
            return getBillLocNum();
        case CURRENCYCODE:
            return getCurrencyCode();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case TRANSACTIONTYPEID:
            setTransactionTypeID((String)value);
            return;
        case TRANSACTIONTYPE:
            setTransactionType((String)value);
            return;
        case LISTHDRID:
            setListHdrID((String)value);
            return;
        case LISTHDR:
            setListHdr((String)value);
            return;
        case CUSTOMERID:
            setCustomerID((String)value);
            return;
        case CUSTOMERNUM:
            setCustomerNum((String)value);
            return;
        case SHIPLOCID:
            setShipLocID((String)value);
            return;
        case SHIPLOCNUM:
            setShipLocNum((String)value);
            return;
        case BILLLOCID:
            setBillLocID((String)value);
            return;
        case BILLLOCNUM:
            setBillLocNum((String)value);
            return;
        case CURRENCYCODE:
            setCurrencyCode((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
