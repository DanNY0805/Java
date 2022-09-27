class SingletonClass {
  private DCL dcl = null;
  public DCL getDCL() {
    if (dcl == null) {
      synchronized {
        if (dcl == null){
          dcl = new DCL();
      }
    }
    return dcl;
  }
}