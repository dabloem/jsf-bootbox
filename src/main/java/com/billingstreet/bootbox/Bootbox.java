package com.billingstreet.bootbox;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.behavior.ClientBehaviorBase;
import javax.faces.component.behavior.FacesBehavior;

@FacesBehavior(value = "bootbox")
public class Bootbox extends ClientBehaviorBase {

    private String title;
    private String cancel = "Cancel";
    private String confirm = "OK";
    private String render = "@none";
    private String execute = "@form";

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
        Logger.getLogger(Bootbox.class.getName()).log(Level.INFO, "set cancel {0}", cancel);
        this.cancel = cancel;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        Logger.getLogger(Bootbox.class.getName()).log(Level.INFO, "set confirm {0}", confirm);
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
    
}
