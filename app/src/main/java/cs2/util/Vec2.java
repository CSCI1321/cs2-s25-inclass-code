package cs2.util;

public class Vec2 {
  //Fields
  private double x, y;
  //Constructors
  public Vec2(double inX, double inY) {
    this.x = inX;
    this.y = inY;
  }
  public Vec2() {
    this.x = 0;
    this.y = 0;
  }
  //Methods
  public Vec2 clone() {
    return new Vec2(this.x, this.y);
  }
  public double getX() { return this.x; }
  public double getY() { return this.y; }
  public Vec2 add(Vec2 other) {
    return new Vec2(this.x + other.x, this.y + other.y);
  }
  public void addThis(Vec2 other) {
    this.x += other.x;
    this.y += other.y;
  }
}
