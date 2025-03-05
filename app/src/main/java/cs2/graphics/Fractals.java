package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Fractals extends Application {

  public static void drawCircle(GraphicsContext g, double x, double y, double r) {
    g.strokeOval(x-r,y-r, 2*r,2*r);
    if(r > 20) {
      drawCircle(g, x-r,y, r/2);
      drawCircle(g, x+r,y, r/2);
      drawCircle(g, x,y-r, r/2);
      drawCircle(g, x,y+r, r/2);
    }
  }

  double oldX = 0;
  double oldY = 0;

  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.setTitle("Fractals!");
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();
    //drawCircle(g, 300, 300, 150);
    canvas.setOnMouseDragged((MouseEvent e) -> {
      g.strokeLine(e.getX(), e.getY(), oldX, oldY);
      oldX = e.getX();
      oldY = e.getY();
    });
    canvas.setOnMousePressed((MouseEvent e) -> {
      oldX = e.getX();
      oldY = e.getY();
    });
    canvas.setOnKeyPressed((KeyEvent e) -> {
      if(e.getCode() == KeyCode.SPACE) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, 600,600);
      }
      if(e.getCode() == KeyCode.B) {
        g.setFill(Color.BLUE);
        g.fillRect(0,0, 600,600);
      }
    });
    canvas.requestFocus();

  }
  
}
