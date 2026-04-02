package appli.accueil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import static appli.StartApplication.changeScene;

public class LoginController {


        @FXML
        private TextField emailField;

        @FXML
        private Label labelError;

        @FXML
        private TextField mdpField;

        @FXML
        void connexion(ActionEvent event) {
            String email = emailField.getText();
            String mdp = mdpField.getText();

            System.out.println("email: " + email);
            System.out.println("mdp: " + mdp);

            if (email.isEmpty() || mdp.isEmpty()){
                labelError.setText("Veuillez remplir tous les champs");

            }else if (email.equals("beaugosse@gmail.com")&&mdp.equals("azerty1234")){
                labelError.setText("Vous etes connecter");
            }
            else labelError.setText("Les informations ne peuvent pas vous authentifié");

        }

    @FXML
    void inscriptionField(ActionEvent actionEvent) throws IOException {
        changeScene("accueil/inscription.fxml");
    }


    @FXML
        void mdpOublier(ActionEvent event) {


        }
}






