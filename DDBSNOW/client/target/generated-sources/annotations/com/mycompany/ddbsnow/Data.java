package com.mycompany.ddbsnow;
import net.java.html.json.*;
/** Generated for {@link DataModel}*/
public final class Data implements Cloneable {
  private static Class<DataModel> modelFor() { return DataModel.class; }
  private static final Html4JavaType TYPE = new Html4JavaType();
  private final DataModel instance = new DataModel();
  private final org.netbeans.html.json.spi.Proto proto;
  public java.util.List<java.lang.String> getWords() {
    java.lang.String arg1 = getMessage();
    try {
      proto.acquireLock();
      return com.mycompany.ddbsnow.DataModel.words(arg1);
    } finally {
      proto.releaseLock();
    }
  }
  private java.lang.String prop_message;
  public java.lang.String getMessage() {
    proto.accessProperty("message");
    return (java.lang.String)prop_message;
  }
  public void setMessage(java.lang.String v) {
    proto.verifyUnlocked();
    Object o = prop_message;
    if (TYPE.isSame(o , v)) return;
    prop_message = v;
    proto.valueHasMutated("message", o, v);
    proto.valueHasMutated("words", null, getWords());
    Data model = Data.this;
    model.instance.storeMessage(model);
  }
  private boolean prop_rotating;
  public boolean isRotating() {
    proto.accessProperty("rotating");
    return (boolean)prop_rotating;
  }
  public void setRotating(boolean v) {
    proto.verifyUnlocked();
    Object o = prop_rotating;
    if (TYPE.isSame(o , v)) return;
    prop_rotating = v;
    proto.valueHasMutated("rotating", o, v);
  }
  /** @see DataModel#initServices */
  public void initServices(final com.mycompany.ddbsnow.js.PlatformServices services) {
    proto.runInBrowser(4, services);
  }
  private Data(net.java.html.BrwsrCtx context) {
    this.proto = TYPE.createProto(this, context);
  };
  public Data() {
    this(net.java.html.BrwsrCtx.findDefault(Data.class));
  };
  public Data(java.lang.String aMessage, boolean aRotating) {
    this(net.java.html.BrwsrCtx.findDefault(Data.class));
    this.prop_message = aMessage;
    this.prop_rotating = aRotating;
  };
  private static class Html4JavaType extends org.netbeans.html.json.spi.Proto.Type<Data> {
    private Html4JavaType() {
      super(Data.class, DataModel.class, 3, 4);
      registerProperty("words", 0, true, false);
      registerProperty("message", 1, false, false);
      registerProperty("rotating", 2, false, false);
      registerFunction("turnAnimationOn", 0);
      registerFunction("turnAnimationOff", 1);
      registerFunction("rotate5s", 2);
      registerFunction("showScreenSize", 3);
    }
    @Override public void setValue(Data data, int type, Object value) {
      switch (type) {
        case 1: data.setMessage(TYPE.extractValue(java.lang.String.class, value)); return;
        case 2: data.setRotating(TYPE.extractValue(java.lang.Boolean.class, value)); return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public Object getValue(Data data, int type) {
      switch (type) {
        case 0: return data.getWords();
        case 1: return data.getMessage();
        case 2: return data.isRotating();
      }
      throw new UnsupportedOperationException();
    }
    @Override public void call(Data model, int type, Object data, Object ev) throws Exception {
      switch (type) {
        case 0:
          model.instance.turnAnimationOn(model);
          return;
        case 1:
          model.instance.turnAnimationOff(model);
          return;
        case 2:
          model.instance.rotate5s(model);
          return;
        case 3:
          model.instance.showScreenSize(model);
          return;
        case 4:
          { Object[] arr = (Object[])data; model.instance.initServices(model, (com.mycompany.ddbsnow.js.PlatformServices)arr[0]); }
          return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public org.netbeans.html.json.spi.Proto protoFor(Object obj) {
      return ((Data)obj).proto;    }
    @Override public void onChange(Data model, int type) {
      switch (type) {
      case 0:
        model.instance.storeMessage(model);

      return;
    }
      throw new UnsupportedOperationException();
    }
  @Override public void onMessage(Data model, int index, int type, Object data, Object[] params) {
    switch (index) {
    }
    throw new UnsupportedOperationException("index: " + index + " type: " + type);
  }
    @Override public Data read(net.java.html.BrwsrCtx c, Object json) { return new Data(c, json); }
    @Override public Data cloneTo(Data o, net.java.html.BrwsrCtx c) { return o.clone(c); }
  }
  private Data(net.java.html.BrwsrCtx c, Object json) {
    this(c);
    Object[] ret = new Object[2];
    proto.extract(json, new String[] {
      "message",
      "rotating",
    }, ret);
    this.prop_message = (java.lang.String)ret[0];
    this.prop_rotating = ret[1] == null ? false : (TYPE.boolValue(ret[1])).booleanValue();
  }
  private static Object[] useAsArray(Object o) {
    return o instanceof Object[] ? ((Object[])o) : o == null ? new Object[0] : new Object[] { o };
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('{');
    sb.append('"').append("message").append('"').append(":");
    sb.append(TYPE.toJSON(getMessage()));
    sb.append(',');
    sb.append('"').append("rotating").append('"').append(":");
    sb.append(TYPE.toJSON(isRotating()));
    sb.append('}');
    return sb.toString();
  }
  public Data clone() {
    return clone(proto.getContext());
  }
  private Data clone(net.java.html.BrwsrCtx ctx) {
    Data ret = new Data(ctx);
    ret.prop_message = getMessage();
    ret.prop_rotating = isRotating();
    return ret;
  }
  /** Activates this model instance in the current {@link 
net.java.html.json.Models#bind(java.lang.Object, net.java.html.BrwsrCtx) browser context}. 
In case of using Knockout technology, this means to 
bind JSON like data in this model instance with Knockout tags in 
the surrounding HTML page.
This method binds to element '""' on the page
@return <code>this</code> object
*/
  public Data applyBindings() {
    proto.applyBindings();
    return this;
  }
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Data)) return false;
    Data p = (Data)o;
    if (!TYPE.isSame(prop_message, p.prop_message)) return false;
    if (!TYPE.isSame(prop_rotating, p.prop_rotating)) return false;
    return true;
  }
  public int hashCode() {
    int h = Data.class.getName().hashCode();
    h = TYPE.hashPlus(prop_message, h);
    h = TYPE.hashPlus(prop_rotating, h);
    return h;
  }
}
