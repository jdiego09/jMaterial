/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmaterial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jcalvo
 */
public class JMaterial extends Application {
   
   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("view/FXMLDocument.fxml"));
      
      Scene scene = new Scene(root);
      System.out.println(getClass().getResource("view/FXMLDocument.fxml"));
      stage.setScene(scene);
      stage.show();
      //prueba de commit desde netbeans
   }

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      launch(args);
   }
   
}
