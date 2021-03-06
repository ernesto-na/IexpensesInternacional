package xxgam.oracle.apps.inv.moveorder.siz.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.server.AttributeDefImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamKitItemsInfoVORowImpl extends OAViewRowImpl {
    public static final int KITCODE = 0;
    public static final int DOTAID = 1;
    public static final int UNIFORMTYPECODE = 2;
    public static final int PLANTAQTY = 3;
    public static final int EVENTQTY = 4;
    public static final int MEASUREUNITCODE = 5;
    public static final int CYCLECODE = 6;
    public static final int NOMENCLATURE = 7;
    public static final int NPCODE = 8;
    public static final int SIZECAPTURE = 9;
    public static final int SIZELOV = 10;
    public static final int TALLAID = 11;
    public static final int INVENTORYID = 12;
    public static final int OBSERVACIONES = 13;

    /**This is the default constructor (do not remove)
     */
    public XxGamKitItemsInfoVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute KitCode
     */
    public String getKitCode() {
        return (String)getAttributeInternal(KITCODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute KitCode
     */
    public void setKitCode(String value) {
        setAttributeInternal(KITCODE, value);
    }

    /**Gets the attribute value for the calculated attribute DotaId
     */
    public String getDotaId() {
        return (String)getAttributeInternal(DOTAID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute DotaId
     */
    public void setDotaId(String value) {
        setAttributeInternal(DOTAID, value);
    }

    /**Gets the attribute value for the calculated attribute UniformTypeCode
     */
    public String getUniformTypeCode() {
        return (String)getAttributeInternal(UNIFORMTYPECODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute UniformTypeCode
     */
    public void setUniformTypeCode(String value) {
        setAttributeInternal(UNIFORMTYPECODE, value);
    }

    /**Gets the attribute value for the calculated attribute PlantaQTY
     */
    public String getPlantaQTY() {
        return (String)getAttributeInternal(PLANTAQTY);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute PlantaQTY
     */
    public void setPlantaQTY(String value) {
        setAttributeInternal(PLANTAQTY, value);
    }

    /**Gets the attribute value for the calculated attribute EventQTY
     */
    public String getEventQTY() {
        return (String)getAttributeInternal(EVENTQTY);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute EventQTY
     */
    public void setEventQTY(String value) {
        setAttributeInternal(EVENTQTY, value);
    }

    /**Gets the attribute value for the calculated attribute MeasureUnitCode
     */
    public String getMeasureUnitCode() {
        return (String)getAttributeInternal(MEASUREUNITCODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute MeasureUnitCode
     */
    public void setMeasureUnitCode(String value) {
        setAttributeInternal(MEASUREUNITCODE, value);
    }

    /**Gets the attribute value for the calculated attribute CycleCode
     */
    public String getCycleCode() {
        return (String)getAttributeInternal(CYCLECODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CycleCode
     */
    public void setCycleCode(String value) {
        setAttributeInternal(CYCLECODE, value);
    }

    /**Gets the attribute value for the calculated attribute Nomenclature
     */
    public String getNomenclature() {
        return (String)getAttributeInternal(NOMENCLATURE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Nomenclature
     */
    public void setNomenclature(String value) {
        setAttributeInternal(NOMENCLATURE, value);
    }

    /**Gets the attribute value for the calculated attribute NPCode
     */
    public String getNPCode() {
        return (String)getAttributeInternal(NPCODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute NPCode
     */
    public void setNPCode(String value) {
        setAttributeInternal(NPCODE, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case KITCODE:
            return getKitCode();
        case DOTAID:
            return getDotaId();
        case UNIFORMTYPECODE:
            return getUniformTypeCode();
        case PLANTAQTY:
            return getPlantaQTY();
        case EVENTQTY:
            return getEventQTY();
        case MEASUREUNITCODE:
            return getMeasureUnitCode();
        case CYCLECODE:
            return getCycleCode();
        case NOMENCLATURE:
            return getNomenclature();
        case NPCODE:
            return getNPCode();
        case SIZECAPTURE:
            return getSizeCapture();
        case SIZELOV:
            return getSizeLOV();
        case TALLAID:
            return getTallaId();
        case INVENTORYID:
            return getInventoryId();
        case OBSERVACIONES:
            return getObservaciones();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case KITCODE:
            setKitCode((String)value);
            return;
        case DOTAID:
            setDotaId((String)value);
            return;
        case UNIFORMTYPECODE:
            setUniformTypeCode((String)value);
            return;
        case PLANTAQTY:
            setPlantaQTY((String)value);
            return;
        case EVENTQTY:
            setEventQTY((String)value);
            return;
        case MEASUREUNITCODE:
            setMeasureUnitCode((String)value);
            return;
        case CYCLECODE:
            setCycleCode((String)value);
            return;
        case NOMENCLATURE:
            setNomenclature((String)value);
            return;
        case NPCODE:
            setNPCode((String)value);
            return;
        case SIZECAPTURE:
            setSizeCapture((String)value);
            return;
        case SIZELOV:
            setSizeLOV((String)value);
            return;
        case TALLAID:
            setTallaId((String)value);
            return;
        case INVENTORYID:
            setInventoryId((String)value);
            return;
        case OBSERVACIONES:
            setObservaciones((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }

    /**Gets the attribute value for the calculated attribute SizeCapture
     */
    public String getSizeCapture() {
        return (String)getAttributeInternal(SIZECAPTURE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute SizeCapture
     */
    public void setSizeCapture(String value) {
        setAttributeInternal(SIZECAPTURE, value);
    }

    /**Gets the attribute value for the calculated attribute SizeLOV
     */
    public String getSizeLOV() {
        return (String)getAttributeInternal(SIZELOV);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute SizeLOV
     */
    public void setSizeLOV(String value) {
        setAttributeInternal(SIZELOV, value);
    }

    /**Gets the attribute value for the calculated attribute TallaId
     */
    public String getTallaId() {
        return (String)getAttributeInternal(TALLAID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute TallaId
     */
    public void setTallaId(String value) {
        setAttributeInternal(TALLAID, value);
    }

    /**Gets the attribute value for the calculated attribute InventoryId
     */
    public String getInventoryId() {
        return (String)getAttributeInternal(INVENTORYID);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute InventoryId
     */
    public void setInventoryId(String value) {
        setAttributeInternal(INVENTORYID, value);
    }

    /**Gets the attribute value for the calculated attribute Observaciones
     */
    public String getObservaciones() {
        return (String)getAttributeInternal(OBSERVACIONES);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Observaciones
     */
    public void setObservaciones(String value) {
        setAttributeInternal(OBSERVACIONES, value);
    }
}
