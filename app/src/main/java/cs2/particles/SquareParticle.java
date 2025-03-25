package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class SquareParticle extends Particle {
  
  public SquareParticle(Vec2 p, Vec2 v) {
    super(p, v);
  }

  @Override
  public void display(GraphicsContext g) {
    g.fillRect(pos.getX(), pos.getY(), 2*r, 2*r);
  }

}
