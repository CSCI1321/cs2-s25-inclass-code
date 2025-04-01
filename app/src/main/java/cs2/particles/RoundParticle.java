package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class RoundParticle extends Particle {
  public RoundParticle(Vec2 p, Vec2 v) {
    super(p,v);
  }

  public void display(GraphicsContext g) {
    g.setFill(this.cp.getColor());
    g.fillOval(this.pos.getX(), this.pos.getY(), 2*r, 2*r);
  }
}
