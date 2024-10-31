package cz.janpalma.quanta.utils;

/**
 * Vector
 */
public class Vector2f {

  private float x;
  private float y;

  Vector2f() {
    x = 0;
    y = 0;
  }

  Vector2f(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }

  public void setX(float x) {
    this.x = x;
  }

  public void setY(float y) {
    this.y = y;
  }
}
