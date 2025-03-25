package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ParticleSystem {
  //Fields
  private Vec2 origin;
  private ArrayList<Particle> parts;
  //Constructors
  public ParticleSystem() {
    origin = new Vec2();
    parts = new ArrayList<Particle>();
  }
  public ParticleSystem(Vec2 o) {
    origin = o;
    parts = new ArrayList<Particle>();
  }
  //Methods
  public void addParticle() {
    parts.add(new ImageParticle(origin.clone(), new Vec2(Math.random()*6-3, Math.random()*6-3),
      ParticleSystemApp.starImg));
    /*
    if(Math.random() < 0.5) {
      parts.add(new SquareParticle(origin.clone(), new Vec2(Math.random()*6-3, 
                                  Math.random()*6-3)));
    }  else {
      parts.add(new RoundParticle(origin.clone(), new Vec2(Math.random()*6-3, 
                                  Math.random()*6-3)));
    } */
  }
  public void display(GraphicsContext g) {
    System.out.println(parts.size());
    for(int i=0; i<parts.size(); i++) {
      parts.get(i).display(g);
    }
  }
  public void update() {
    for(Particle p : parts) {
      p.update();
    }
  }
  public void addForce(Vec2 force) {
    for(Particle p : parts) {
      p.addForce(force);
    }
  }


}
