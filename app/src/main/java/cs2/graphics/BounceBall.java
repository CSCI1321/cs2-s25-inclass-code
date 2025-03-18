package cs2.graphics;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BounceBall extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.setTitle("Bounce Ball!");
    stg.show();
    GraphicsContext g = canvas.getGraphicsContext2D();

    AnimationTimer timer = new AnimationTimer() {
      int x = 100;
      int y = 100;
      int velX = (int)(Math.random() * 8 - 4);
      int velY = (int)(Math.random() * 8 - 4);
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, 600,600);
        g.setFill(Color.RED);
        g.fillOval(x,y, 50,50);
        if(x > 550 || x < 0) {
          velX = -velX;
        }
        x += velX;
        if(y > 550 || y < 0) {
          velY = -velY;
        }
        y += velY;
      }
    };
    timer.start();
    
  }
}
