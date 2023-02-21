import Models.Resolution;
import Views.HomeScreenView;
import Views.SingleResolutionView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        HomeScreenView homeScreenView = new HomeScreenView();
        stage.setScene(homeScreenView.getScene());
        stage.setResizable(true);
        stage.show();
    }
}
