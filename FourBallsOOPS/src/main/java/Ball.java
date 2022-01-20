import processing.core.PApplet;

public class Ball {

    private int speed;
    private PApplet shape;
    private int position;
    private int major;
    private int minor;
    private int distance;

    public Ball(int speed, int position, int major, int minor, FourBall shape) {
        this.speed = speed;
        this.position = position;
        this.major = major;
        this.minor = minor;
        this.shape = shape;
        this.distance = 0;
    }

    public void move() {
        this.shape.ellipse(distance, position, major, minor);
        distance += this.speed;
    }
}
