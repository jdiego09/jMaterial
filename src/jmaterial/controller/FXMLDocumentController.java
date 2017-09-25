/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmaterial.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author jcalvo
 */
public class FXMLDocumentController implements Initializable {

   @FXML
   private Label label;

   private FXMLLoader loader;
   private Stage stage;
   private Scene scene;

   @FXML
   private void handleButtonAction(ActionEvent event) {
      callSecond();
   }

   @Override
   public void initialize(URL url, ResourceBundle rb) {
      // TODO
   }

   private void callSecond() {
      System.out.println(getClass().getResource("view/test.fxml"));
      loader = new FXMLLoader(getClass().getResource("view/test.fxml"));

      SecondController controller = null;
      try {
         AnchorPane root = null;

         try {
            root = loader.load();
         } catch (IOException e1) {
            System.out.println(e1.getMessage());
         }

         scene = new Scene(root);

         controller = loader.getController();

         stage.setResizable(false);
         stage.setTitle("segunda");
         stage.initModality(Modality.WINDOW_MODAL);
        
         stage.setScene(scene);
         stage.showAndWait();

      } catch (Exception ex) {
         System.out.println(ex.getMessage());
         if (controller != null) {
            controller = null;
         }
      }
   }

}
