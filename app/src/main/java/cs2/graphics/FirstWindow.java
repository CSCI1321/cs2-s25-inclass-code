package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class FirstWindow extends Application {
  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(600,400);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setTitle("My First Window");
    primaryStage.setScene(scene);
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    g.strokeLine(0,0, 600,400);
    g.fillRect(100,200, 200,100);
    g.setFill(Color.PEACHPUFF);
    g.fillRect(200,200, 100,200);
    g.setFill(Color.rgb(200, 50, 180));
    g.fillOval(200,200, 100,200);
    g.setFill(Color.GREEN);
    g.setLineWidth(20);
    g.strokeArc(200,200, 100,200, 0, 135, ArcType.ROUND);

    double[] xs = {0, 100, 200, 0};
    double[] ys = {0, 200, 100, 100};
    g.fillPolygon(xs, ys, 4);

    for(double x=0; x<canvas.getWidth(); x++) {
      g.setStroke(Color.rgb((int)x * 255 / 600,0,0));
      g.strokeLine(x,0, x,canvas.getHeight());
    }

    //Row of circles
    for(int y=0; y<canvas.getHeight(); y+=50) {
      for(int x=0; x<canvas.getWidth(); x+=50) {
        g.setFill(Color.rgb(x*255/600, y*255/400, 0));
        g.fillOval(x, y, 50,50);
      }
    }


  }
}
