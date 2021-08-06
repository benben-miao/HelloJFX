## HelloJFX
> Java FX learning notes and projects code.

### 1. Java 1.8.0 JDK (JRE) and Demo (sample)
[Java 1.8.0 JDK (JRE) and Demo (sample): https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)

### 2. JavaFX Github and Website
[JavaFX Github: https://github.com/openjdk/jfx](https://github.com/openjdk/jfx)

[JavaFX Website: https://openjfx.io](https://openjfx.io)

### 3. API Leaning Document
[OpenJFX API Doc: https://openjfx.io/openjfx-docs](https://openjfx.io/openjfx-docs)

[Oracle JFX API Doc: https://docs.oracle.com/javase/8/javafx/api/toc.htm](https://docs.oracle.com/javase/8/javafx/api/toc.htm)

[Chinese Doc: https://www.yiibai.com/javafx](https://www.yiibai.com/javafx)

### 4. Demo and sample
[Demo download path: HelloJFX/demo/demo.jar](HelloJFX/demo/demo.jar)

```{bash}
# Java environment required

# Double click or command run
java -jar demo.jar
```

![Demo UI and Features](https://z3.ax1x.com/2021/08/07/fuHW01.png)

### 5. JavaFX Life-Cycle (init, start and stop) and Components in App.java

```{JAVA}
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
```