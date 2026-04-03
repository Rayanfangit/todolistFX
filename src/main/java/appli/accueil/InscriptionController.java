package appli.accueil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

import static appli.StartApplication.changeScene;


public class InscriptionController {
 @FXML
    void retour(ActionEvent event) throws IOException {
     changeScene("accueil/login");

 }
}

