module consecionariouq {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens co.edu.uniquindio.concesionariouq.application to javafx.graphics, javafx.fxml;
}
