package xxgam.oracle.apps.xbol.maf.poplist.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxGamMaYesNoPopListVORowImpl extends OAViewRowImpl
{
  public static final int LOOKUPCODE = 0;
  public static final int MEANING = 1;

  /**This is the default constructor (do not remove)
   */
  public XxGamMaYesNoPopListVORowImpl()
  {
  }

  /**Gets the attribute value for the calculated attribute LookupCode
   */
  public String getLookupCode()
  {
    return (String) getAttributeInternal(LOOKUPCODE);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute LookupCode
   */
  public void setLookupCode(String value)
  {
    setAttributeInternal(LOOKUPCODE, value);
  }

  /**Gets the attribute value for the calculated attribute Meaning
   */
  public String getMeaning()
  {
    return (String) getAttributeInternal(MEANING);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute Meaning
   */
  public void setMeaning(String value)
  {
    setAttributeInternal(MEANING, value);
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, 
                                         AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
    {
    case LOOKUPCODE:
      return getLookupCode();
    case MEANING:
      return getMeaning();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }

  /**setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, 
                                       AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
    {
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }
}
