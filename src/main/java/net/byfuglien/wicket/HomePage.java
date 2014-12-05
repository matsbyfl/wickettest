package net.byfuglien.wicket;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxCheckBox;
import org.apache.wicket.core.request.mapper.AbstractComponentMapper;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.IRequestHandler;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Url;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

import java.io.Serializable;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
        final BoolModel bool = new BoolModel();

            AjaxCheckBox checkbox = new AjaxCheckBox("squaredFour", new PropertyModel<Boolean>(bool, "bool")) {
                @Override
                protected void onUpdate(AjaxRequestTarget ajaxRequestTarget) {
                    System.out.println("triggered value is " + bool.isBool());
                }
            };
            checkbox.setMarkupId("myMarkupid");
            add(checkbox);


    }
}


 class BoolModel implements Serializable{
    private boolean bool;

     public boolean isBool() {
         return bool;
     }
 }
