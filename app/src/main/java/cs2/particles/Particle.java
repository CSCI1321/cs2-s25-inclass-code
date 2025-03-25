package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public abstract class Particle {
  //Fields
  protected Vec2 pos;
  protected Vec2 vel;
  protected double r = 5;
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
  public abstract void display(GraphicsContext g);

  public void update() {
    this.pos.addThis(this.vel);
  }
  public void addForce(Vec2 force) {
    this.vel.addThis(force);
  }
}
