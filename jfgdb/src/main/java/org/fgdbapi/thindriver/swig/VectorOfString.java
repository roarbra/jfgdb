/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fgdbapi.thindriver.swig;

public class VectorOfString {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected VectorOfString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VectorOfString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FGDBJNIWrapperJNI.delete_VectorOfString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VectorOfString() {
    this(FGDBJNIWrapperJNI.new_VectorOfString__SWIG_0(), true);
  }

  public VectorOfString(long n) {
    this(FGDBJNIWrapperJNI.new_VectorOfString__SWIG_1(n), true);
  }

  public long size() {
    return FGDBJNIWrapperJNI.VectorOfString_size(swigCPtr, this);
  }

  public long capacity() {
    return FGDBJNIWrapperJNI.VectorOfString_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    FGDBJNIWrapperJNI.VectorOfString_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return FGDBJNIWrapperJNI.VectorOfString_isEmpty(swigCPtr, this);
  }

  public void clear() {
    FGDBJNIWrapperJNI.VectorOfString_clear(swigCPtr, this);
  }

  public void add(String x) {
    FGDBJNIWrapperJNI.VectorOfString_add(swigCPtr, this, x);
  }

  public String get(int i) {
    return FGDBJNIWrapperJNI.VectorOfString_get(swigCPtr, this, i);
  }

  public void set(int i, String val) {
    FGDBJNIWrapperJNI.VectorOfString_set(swigCPtr, this, i, val);
  }

}
