import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage stage) throws Exception {
		StackPane stackPane = new StackPane();
		Button button = new Button("Rozpocznij grê");
		stackPane.getChildren().add(button);
		Scene scene = new Scene(stackPane,400,600);
		stage.setScene(scene);
		stage.setTitle("Space Invaders");
		stage.show();
	}
}