package com.benbenmiao.HelloJFX;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// OpenJFX: https://openjfx.io
// API Doc: https://docs.oracle.com/javase/8/javafx/api/toc.htm
// JavaFX Doc: https://openjfx.io/openjfx-docs/#maven
// Video Courses: https://space.bilibili.com/5096022

/**
 * JavaFX App
 */
public class App extends Application {
	public static void main(String[] args) {
        launch(args);
        System.out.println("main() in " + Thread.currentThread().getName());
    }
	
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init() in " + Thread.currentThread().getName());
	}
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	// TODO
    	System.out.println("start() in " + Thread.currentThread().getName());
    	
    	// Set App icon
//    	primaryStage.getIcons().add(new Image("/icon/OmicsSphere-Logo.png"));
    	primaryStage.setTitle("JavaFX");
    	
    	Text text = new Text(0, 30, "Hello World");
    	text.setFont(new Font(30));
    	
//      var javaVersion = SystemInfo.javaVersion();
//      var javafxVersion = SystemInfo.javafxVersion();

//      var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        // Group as full white background instead of black
    	var scene = new Scene(new Group(text), 720, 540);
        
        // Listen change of window height
        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println("New window height:" + newValue);
			}
		});
        
        primaryStage.setScene(scene);
        // primaryStage.sizeToScene();
        primaryStage.show();
        
        // Obtain default width and height values.
        System.out.println("width: " + primaryStage.getWidth());
        System.out.println("height: " + primaryStage.getHeight());
    }
    
    @Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("stop() in " + Thread.currentThread().getName());
	}
}