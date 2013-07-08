package com.billingstreet.bootbox;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.behavior.ClientBehavior;
import javax.faces.component.behavior.ClientBehaviorContext;
import javax.faces.render.ClientBehaviorRenderer;
import javax.faces.render.FacesBehaviorRenderer;

@FacesBehaviorRenderer(rendererType = "bootbox")
@ResourceDependencies({
    @ResourceDependency(name = "js/bootbox.js"),
    @ResourceDependency(name = "jsf.js", library = "javax.faces")
})
public class BootboxRenderer extends ClientBehaviorRenderer {

    @Override
    public String getScript(ClientBehaviorContext behaviorContext, ClientBehavior behavior) {
        Bootbox bootbox = (Bootbox) behavior;

        StringBuilder sb = new StringBuilder();
        String clientId = behaviorContext.getComponent().getClientId();

        return sb
                .append("bootbox.confirm('")
                .append(bootbox.getTitle()).append("','").append(bootbox.getCancel()).append("','").append(bootbox.getConfirm())
                .append("', function(result) {")
                .append("if (result) {")
                .append("jsf.ajax.request('").append(clientId)
                .append("', event, {render:'").append(bootbox.getRender()).append("', execute:'").append(bootbox.getExecute()).append("'});")
                .append("}  }); return false;")
                .toString();
    }
}
