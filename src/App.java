import Models.Resolution;
import Views.SingleResolutionView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Resolution res1 = new Resolution("Testing main screen functionality");
        SingleResolutionView view = new SingleResolutionView(res1);
        stage.setScene(view.getScene());
        stage.setResizable(true);
        stage.show();
    }
}
