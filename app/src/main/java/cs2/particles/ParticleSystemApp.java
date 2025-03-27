package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ParticleSystemApp extends Application {
  Vec2 wind = new Vec2();

  public static final Image starImg = new Image("file:star.png");

  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.setTitle("Fractals!");
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    Image img = new Image("file:star.png");
    System.out.println(img.getHeight());
    

    ArrayList<ParticleSystem> systems = new ArrayList<ParticleSystem>();

    canvas.setOnMouseClicked((MouseEvent e) -> {
      ParticleSystem ps = new ParticleSystem(new Vec2(e.getX(),e.getY()));
      systems.add(ps);
    }); 
    canvas.setOnMouseMoved((MouseEvent e) -> {
      wind = new Vec2(e.getX() / 300 - 1, 0);
    }
    );
    
    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0,600,600);

        //g.drawImage(img, 100, 200);

        g.setFill(Color.BLUE);
        for(ParticleSystem ps : systems) {
          ps.update();
          ps.display(g);
          ps.addParticle();
          ps.addForce(new Vec2(0,0.05));
          ps.addForce(wind);
        }
      }
    };
    timer.start();

  }
}
