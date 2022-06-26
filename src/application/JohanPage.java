package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class JohanPage {

	@FXML
	private Button travel;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button home;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "japanPage.fxml");
	}
	
	public void travelToJohan(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "travelToJohan.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
