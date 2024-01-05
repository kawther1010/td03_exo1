package com.example.td03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox root = new HBox();
        Label L1= new Label("Nombre:");
        Label L2= new Label("Carre: 0");
        Button btn = new Button("Calcule");
        TextField textField= new TextField("0");

        //root.setSpacing(new Insets(10));
        HBox.setMargin(btn, new Insets(10));
        HBox.setMargin(L1, new Insets(10));
        HBox.setMargin(L2, new Insets(10));
        HBox.setMargin(textField, new Insets(10));

        root.getChildren().addAll(L1, textField, btn, L2);

        btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try{
                    L2.setText(Double.toString(Math.pow(Double.parseDouble(textField.getText()),2 )));

                } catch(Exception e){
                    textField.setText("0");
                    L2.setText("0");
                }
            }
        });


        Scene scene = new Scene(root, 1000, 600);
        stage.setTitle("Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}