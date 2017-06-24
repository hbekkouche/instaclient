package com.instaclient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


/**
 * The Controller Class
 *
 * @author  <a href="mailto:bek.hocine@gmail.com">Hocine BEKKOUCHE</a>
 * @version 1.0
 * @since   24/06/2017
 */
public class Controller implements Initializable{

    @FXML
    TextField txtURL;
    @FXML
    WebView webView;
    private WebEngine webEngine;

    @FXML
    private void goAction(ActionEvent evt) {
        webEngine.load(txtURL.getText().startsWith("http://")||txtURL.getText().startsWith("https://") ? txtURL.getText() : "http://" + txtURL.getText());
    }

    @FXML
    private void init(ActionEvent evt) {
        initialize(null,null);
    }

    public void initialize(URL url, ResourceBundle rb) {
        webEngine = webView.getEngine();
        webEngine.setUserAgent("Mozilla/5.0 (Linux; Android 8.0; Nexus 5X Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.109 Mobile Safari/537.36\n");
        webEngine.locationProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                txtURL.setText(newValue);
            }
        });
        txtURL.setText("http://www.instagram.com");
        goAction(null);
    }

}
