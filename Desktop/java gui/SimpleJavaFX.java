import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button button = new Button("Click Me!");

        // Set an action on the button
        button.setOnAction(e -> System.out.println("Hello, JavaFX!"));

        // Create a layout and add the button
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // Create a scene
        Scene scene = new Scene(layout, 300, 200);

        // Configure the primary stage
        primaryStage.setTitle("Simple JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the application
    }
}
