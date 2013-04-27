package org.forworks.EasyEditor.client;

import com.google.gwt.user.client.ui.Label;

// Extend any GWT Widget
public class EasyEditorWidget extends Label {

	public EasyEditorWidget() {

		// CSS class-name should not be v- prefixed
		setStyleName("EasyEditor");
		setText("Suca");
		// State is set to widget in EasyEditorConnector		
	}

}