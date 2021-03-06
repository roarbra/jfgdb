/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fgdbapi.thindriver.swig;

public class SpatialReference {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SpatialReference(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SpatialReference obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FGDBJNIWrapperJNI.delete_SpatialReference(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SpatialReference() {
    this(FGDBJNIWrapperJNI.new_SpatialReference(), true);
  }

  public int SetSpatialReferenceText(String spatialReference) {
    return FGDBJNIWrapperJNI.SpatialReference_SetSpatialReferenceText(swigCPtr, this, spatialReference);
  }

  public int SetSpatialReferenceID(int srid) {
    return FGDBJNIWrapperJNI.SpatialReference_SetSpatialReferenceID(swigCPtr, this, srid);
  }

  public int SetXYFalseOrigin(double falseX, double falseY) {
    return FGDBJNIWrapperJNI.SpatialReference_SetXYFalseOrigin(swigCPtr, this, falseX, falseY);
  }

  public int SetXYResolution(double xyResolution) {
    return FGDBJNIWrapperJNI.SpatialReference_SetXYResolution(swigCPtr, this, xyResolution);
  }

  public int SetXYTolerance(double xyTolerance) {
    return FGDBJNIWrapperJNI.SpatialReference_SetXYTolerance(swigCPtr, this, xyTolerance);
  }

  public int SetZFalseOrigin(double falseZ) {
    return FGDBJNIWrapperJNI.SpatialReference_SetZFalseOrigin(swigCPtr, this, falseZ);
  }

  public int SetZResolution(double zResolution) {
    return FGDBJNIWrapperJNI.SpatialReference_SetZResolution(swigCPtr, this, zResolution);
  }

  public int SetZTolerance(double zTolerance) {
    return FGDBJNIWrapperJNI.SpatialReference_SetZTolerance(swigCPtr, this, zTolerance);
  }

  public int SetMFalseOrigin(double falseM) {
    return FGDBJNIWrapperJNI.SpatialReference_SetMFalseOrigin(swigCPtr, this, falseM);
  }

  public int SetMResolution(double mResolution) {
    return FGDBJNIWrapperJNI.SpatialReference_SetMResolution(swigCPtr, this, mResolution);
  }

  public int SetMTolerance(double mTolerance) {
    return FGDBJNIWrapperJNI.SpatialReference_SetMTolerance(swigCPtr, this, mTolerance);
  }

  public int getId() {
    return FGDBJNIWrapperJNI.SpatialReference_getId(swigCPtr, this);
  }

  public String getText() {
    return FGDBJNIWrapperJNI.SpatialReference_getText(swigCPtr, this);
  }

  public double getXFalseOrigin() {
    return FGDBJNIWrapperJNI.SpatialReference_getXFalseOrigin(swigCPtr, this);
  }

  public double getYFalseOrigin() {
    return FGDBJNIWrapperJNI.SpatialReference_getYFalseOrigin(swigCPtr, this);
  }

  public double getMFalseOrigin() {
    return FGDBJNIWrapperJNI.SpatialReference_getMFalseOrigin(swigCPtr, this);
  }

  public double getMTolerance() {
    return FGDBJNIWrapperJNI.SpatialReference_getMTolerance(swigCPtr, this);
  }

  public double getXYTolerance() {
    return FGDBJNIWrapperJNI.SpatialReference_getXYTolerance(swigCPtr, this);
  }

  public double getZTolerance() {
    return FGDBJNIWrapperJNI.SpatialReference_getZTolerance(swigCPtr, this);
  }

  public double getMResolution() {
    return FGDBJNIWrapperJNI.SpatialReference_getMResolution(swigCPtr, this);
  }

  public double getZResolution() {
    return FGDBJNIWrapperJNI.SpatialReference_getZResolution(swigCPtr, this);
  }

  public double getXYResolution() {
    return FGDBJNIWrapperJNI.SpatialReference_getXYResolution(swigCPtr, this);
  }

}
