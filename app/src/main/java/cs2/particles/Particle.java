package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class Particle {
  //Fields
  private Vec2 pos;
  private Vec2 vel;
  private double r = 5;
  //Constructor
  public Particle(Vec2 p, Vec2 v) {
    this.pos = p;
    this.vel = v;
  }
  /* 
  public Particle() {
    this.pos = new Vec2();
    this.vel = new Vec2();
  }*/
  //Method
  public void display(GraphicsContext g) {
    g.fillOval(this.pos.getX(), this.pos.getY(), 2*r, 2*r);
  }
  public void update() {
    this.pos.addThis(this.vel);
  }
  public void addForce(Vec2 force) {
    this.vel.addThis(force);
  }
}
