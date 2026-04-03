package appli.accueil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


import java.io.IOException;

import static appli.StartApplication.changeScene;

public class InscriptionController {

    @FXML
    private TextField conf;

    @FXML
    private TextField email;
    @FXML
    private Label libelleError;
    @FXML
    private TextField mdp;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    void inscrit(ActionEvent event) {
        String emailString = email.getText();
        String mdpString = mdp.getText();
        String confString = conf.getText();
        String nomString = nom.getText();
        String prenomString = prenom.getText();
        
        System.out.println("nom: " + nomString);
        System.out.println("prenom: " + prenomString);
        System.out.println("email: " + emailString);
        System.out.println("mdp: " + mdpString);

        if (emailString.isEmpty() || mdpString.isEmpty()){
            libelleError.setText("Veuillez remplir tous les champs");
            
        }
    }


    @FXML
    void retour(ActionEvent event) throws IOException {
        changeScene("accueil/Login");
    }

}
