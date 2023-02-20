package Views;

import Models.Resolution;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class SingleResolutionView {
    Scene scene;

    public SingleResolutionView(Resolution resolution){
        VBox vbox = new VBox();
        vbox.setMinSize(100,200);
        Text resTitle = new Text(resolution.getName());
        resTitle.setUnderline(true);
        vbox.getChildren().add(resTitle);
        this.scene = new Scene(vbox);
    }

    public Scene getScene() {
        return scene;
    }
}
