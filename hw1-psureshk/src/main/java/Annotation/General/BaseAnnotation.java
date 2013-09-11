

/* First created by JCasGen Tue Sep 10 22:57:03 PDT 2013 */
package Annotation.General;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base Annotation type system extends the base class annotation and defines two features namely Source (string) and Confidence ( integer) which will be inherited by the other annotations for book keeping purpose explaining where the annotation was created and how good the annotation is.
 * Updated by JCasGen Wed Sep 11 09:56:32 PDT 2013
 * XML source: /home/psureshk/git/hw1-psureshk/hw1-psureshk/src/main/resources/hw1-psureshk-InfoProctypeSystem.xml
 * @generated */
public class BaseAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected BaseAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Source

  /** getter for Source - gets Source displays the location where an annotation was originally created by
   * @generated */
  public String getSource() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "Annotation.General.BaseAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_Source);}
    
  /** setter for Source - sets Source displays the location where an annotation was originally created by 
   * @generated */
  public void setSource(String v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "Annotation.General.BaseAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_Source, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets This feature is used to display the Confidence level of an annotation
   * @generated */
  public int getConfidence() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "Annotation.General.BaseAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets This feature is used to display the Confidence level of an annotation 
   * @generated */
  public void setConfidence(int v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "Annotation.General.BaseAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_Confidence, v);}    
  }

    