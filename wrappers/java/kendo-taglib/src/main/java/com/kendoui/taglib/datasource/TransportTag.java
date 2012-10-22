
package com.kendoui.taglib.datasource;

import com.kendoui.taglib.BaseTag;

import com.kendoui.taglib.DataSourceTag;



import com.kendoui.taglib.json.Function;


import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class TransportTag extends BaseTag /* interfaces *//* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        DataSourceTag parent = (DataSourceTag)findParentWithClass(DataSourceTag.class);

        parent.setTransport(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "dataSource-transport";
    }

    public void setCreate(CreateTag value) {
        setProperty("create", value);
    }

    public void setDestroy(DestroyTag value) {
        setProperty("destroy", value);
    }

    public void setRead(ReadTag value) {
        setProperty("read", value);
    }

    public void setUpdate(UpdateTag value) {
        setProperty("update", value);
    }

    public void setParameterMap(ParameterMapFunctionTag value) {
        setEvent("parameterMap", value.getBody());
    }

    public String getCreate() {
        return (String)getProperty("create");
    }

    public void setCreate(String value) {
        setProperty("create", value);
    }

    public String getDestroy() {
        return (String)getProperty("destroy");
    }

    public void setDestroy(String value) {
        setProperty("destroy", value);
    }

    public String getRead() {
        return (String)getProperty("read");
    }

    public void setRead(String value) {
        setProperty("read", value);
    }

    public String getUpdate() {
        return (String)getProperty("update");
    }

    public void setUpdate(String value) {
        setProperty("update", value);
    }

    public String getParameterMap() {
        return ((Function)getProperty("parameterMap")).getBody();
    }

    public void setParameterMap(String value) {
        setProperty("parameterMap", new Function(value));
    }

//<< Attributes

}
