/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class SemanticVersion {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SemanticVersion(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SemanticVersion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_SemanticVersion(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SemanticVersion(String version) {
    this(AdaptiveCardObjectModelJNI.new_SemanticVersion(version), true);
  }

  public long GetMajor() {
    return AdaptiveCardObjectModelJNI.SemanticVersion_GetMajor(swigCPtr, this);
  }

  public long GetMinor() {
    return AdaptiveCardObjectModelJNI.SemanticVersion_GetMinor(swigCPtr, this);
  }

  public long GetBuild() {
    return AdaptiveCardObjectModelJNI.SemanticVersion_GetBuild(swigCPtr, this);
  }

  public long GetRevision() {
    return AdaptiveCardObjectModelJNI.SemanticVersion_GetRevision(swigCPtr, this);
  }

}
