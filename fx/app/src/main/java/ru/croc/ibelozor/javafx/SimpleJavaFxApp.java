package ru.croc.ibelozor.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class SimpleJavaFxApp extends Application {

    private static final String fxmlResPath = "/javafx/sample.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception{
        ResourceBundle bundle = ResourceBundle.getBundle("javafx/strings");
        Parent root = FXMLLoader.load(getClass().getResource(fxmlResPath), bundle);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


}
