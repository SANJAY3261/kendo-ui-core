
package com.kendoui.taglib.treeview;

import com.kendoui.taglib.BaseTag;




import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class CollapseTag extends BaseTag /* interfaces *//* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        AnimationTag parent = (AnimationTag)findParentWithClass(AnimationTag.class);

        parent.setCollapse(this);

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
        return "treeView-animation-collapse";
    }

    public float getDuration() {
        return (float)getProperty("duration");
    }

    public void setDuration(float value) {
        setProperty("duration", value);
    }

    public String getEffects() {
        return (String)getProperty("effects");
    }

    public void setEffects(String value) {
        setProperty("effects", value);
    }

//<< Attributes

}
