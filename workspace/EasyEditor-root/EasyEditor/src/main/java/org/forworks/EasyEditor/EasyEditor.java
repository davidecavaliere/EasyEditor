package org.forworks.EasyEditor;

import org.forworks.EasyEditor.client.EasyEditorClientRpc;
import org.forworks.EasyEditor.client.EasyEditorServerRpc;
import org.forworks.EasyEditor.client.EasyEditorState;

import com.vaadin.shared.MouseEventDetails;

// This is the server-side UI component that provides public API 
// for EasyEditor
public class EasyEditor extends com.vaadin.ui.AbstractComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4223625475373758786L;

	private int clickCount = 0;

	// To process events from the client, we implement ServerRpc
	@SuppressWarnings("serial")
	private EasyEditorServerRpc rpc = new EasyEditorServerRpc() {

		// Event received from client - user clicked our widget
		public void clicked(MouseEventDetails mouseDetails) {
			
			// Send nag message every 5:th click with ClientRpc
			if (++clickCount % 5 == 0) {
				getRpcProxy(EasyEditorClientRpc.class)
						.alert("Ok, that's enough!");
			}
			
			// Update shared state. This state update is automatically 
			// sent to the client. 
			getState().text = "You have clicked " + clickCount + " times";
		}
	};

	public EasyEditor() {

		// To receive events from the client, we register ServerRpc
		registerRpc(rpc);
	}

	// We must override getState() to cast the state to EasyEditorState
	@Override
	public EasyEditorState getState() {
		return (EasyEditorState) super.getState();
	}
}
