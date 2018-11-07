package smallOne;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.Asd;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private ImageView imageViewer;

    @FXML
    private void itWorks(){
        System.out.println("Ayy, it works!");
    }

    @FXML
    public void itWorks2(Asd asd){
        System.out.println(asd.getName());
        imageViewer.setImage(new Image(asd.getUrl()));
        imageViewer.setVisible(true);
        System.out.println("A masik gomb is mukodik");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("smallOneController is initialized");
    }
}
