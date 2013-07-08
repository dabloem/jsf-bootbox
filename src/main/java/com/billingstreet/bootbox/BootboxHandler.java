package com.billingstreet.bootbox;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.BehaviorConfig;
import javax.faces.view.facelets.BehaviorHandler;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.TagAttribute;
import javax.faces.view.facelets.TagConfig;
import javax.faces.view.facelets.TagHandler;

public class BootboxHandler extends TagHandler {

    private Bootbox bootbox = new Bootbox();
    private TagAttribute title;
    private TagAttribute cancel;
    private TagAttribute confirm;
    private TagAttribute render;

    public BootboxHandler(TagConfig config) {
        super(config);
        this.title = this.getRequiredAttribute("title");
        this.cancel = this.getAttribute("cancel");
        this.confirm = this.getAttribute("confirm");
        this.render = this.getAttribute("render");
    }

    @Override
    public void apply(FaceletContext context, UIComponent parent) throws IOException {
        FacesContext ctx = context.getFacesContext();
//        Bootbox bootbox = (Bootbox) ctx.getApplication().createBehavior("bootbox");
       
        if (parent instanceof ClientBehaviorHolder) {
            bootbox.setTitle(title.getValue());
            bootbox.setCancel((cancel != null ? cancel.getValue() : "Cancel"));
            bootbox.setConfirm((confirm != null ? confirm.getValue() : "OK"));
            bootbox.setRender(render != null ? render.getValue() : "@None");
            ClientBehaviorHolder comp = (ClientBehaviorHolder) parent;
            comp.addClientBehavior("action", bootbox);
        }
    }
    
}
