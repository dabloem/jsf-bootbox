package com.billingstreet.bootbox;

import javax.faces.component.behavior.ClientBehaviorBase;
import javax.faces.component.behavior.FacesBehavior;

@FacesBehavior(value = "bootbox")
public class Bootbox extends ClientBehaviorBase {

    private String title;
    private String cancel = "Cancel";
    private String confirm = "OK";
    private String render = "@none";
    private String execute = "@form";
    
    private boolean richfaces;

    @Override
    public String getRendererType() {
        return "bootbox";
    }

    public String getTitle() {
        return title;
        }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public String getExecute() {
        return execute;
    }
    
    public void setExecute(String execute) {
        this.execute = execute;
    }

    public boolean isRichfaces() {
        return richfaces;
    }

    public void setRichfaces(boolean richfaces) {
        this.richfaces = richfaces;
    }
}
