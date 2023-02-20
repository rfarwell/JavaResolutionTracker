import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello, world");
        Button b1 = new Button("Click me!");
        StackPane root = new StackPane();
        root.getChildren().add(b1);
        Scene mainScreen = new Scene(root);
        stage.setScene(mainScreen);
        stage.setResizable(false);
        b1.setOnAction(e -> System.out.println("Clicked"));
        stage.show();
    }
}
