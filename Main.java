import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Navigation Example");

        // Create the main scene
        Button button = new Button("Go to Second Page");
        StackPane mainLayout = new StackPane();
        mainLayout.getChildren().add(button);
        Scene mainScene = new Scene(mainLayout, 300, 200);

        // Create the second scene
        Button backButton = new Button("Go Back to Main Page");
        StackPane secondLayout = new StackPane();
        secondLayout.getChildren().add(backButton);
        Scene secondScene = new Scene(secondLayout, 300, 200);

        // Set button action to switch to the second scene
        button.setOnAction(e -> primaryStage.setScene(secondScene));

        // Set back button action to switch to the main scene
        backButton.setOnAction(e -> primaryStage.setScene(mainScene));

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
