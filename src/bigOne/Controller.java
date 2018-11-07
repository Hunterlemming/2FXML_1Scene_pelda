package bigOne;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import sample.Asd;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private AnchorPane sampleHolder;

    private ArrayList<Asd> asds = new ArrayList<>();

    private smallOne.Controller cont;

    @FXML
    public void itWorks2(){
        cont.itWorks2(asds.get(0));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            loadSecond();
        } catch (IOException ex){
            System.out.println(""+ex);
        }
        asds.add(new Asd("Soldier","imageSource/captain.png"));
        asds.add(new Asd("Marksman","imageSource/marksman.png"));
    }

    @FXML
    private void loadSecond() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../smallOne/sample.fxml"));
        AnchorPane smallOne = fxmlLoader.load();
        cont = (smallOne.Controller)fxmlLoader.getController();
        sampleHolder.getChildren().setAll(smallOne);
    }
}
