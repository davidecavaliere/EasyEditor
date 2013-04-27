package org.forworks.EasyEditor.demo;

import org.forworks.EasyEditor.EasyEditor;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("demo")
@Title("EasyEditor Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI
{

    @Override
    protected void init(VaadinRequest request) {
    	
    	// Initialize our new UI component
    	final EasyEditor EasyEditor = new EasyEditor();
            	
    	// Show it in the middle of the screen
    	final VerticalLayout layout = new VerticalLayout();
        layout.setStyleName("demoContentLayout");
        layout.setSizeFull();
        layout.addComponent(EasyEditor);
        layout.setComponentAlignment(EasyEditor, Alignment.MIDDLE_CENTER);
        setContent(layout);

    }

}
