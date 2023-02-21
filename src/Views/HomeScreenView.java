package Views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.Date;

public class HomeScreenView extends View{
    public HomeScreenView() {
        Date todaysDate = new Date();
        Text titleText = new Text("Resolution Tracker");
        Text dateText = new Text(todaysDate.getDate() + "." + todaysDate.getMonth() + "." + (todaysDate.getYear()+1900));
        Button newFileButton = new Button("Create new file");
        Button loadFileButton = new Button("Load existing file");
        VBox vBox = new VBox(titleText, dateText, newFileButton, loadFileButton);
        initVBox(vBox);
        this.scene = new Scene(vBox);
    }

    private void initVBox(VBox vBox){
        vBox.setMinSize(200,200);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
    }
}
