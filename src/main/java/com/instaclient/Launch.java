package com.instaclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The Launch Class
 *
 * @author  <a href="mailto:bek.hocine@gmail.com">Hocine BEKKOUCHE</a>
 * @version 1.0
 * @since   24/06/2017
 */
public class Launch extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Browser.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
