import processing.core.PApplet;

public class FourBall extends PApplet {

    public static final int HEIGHT = 600;
    public static final int WIDTH = 1200;

    Ball b1 = new Ball(1, HEIGHT / 5, 20, 20 , this);
    Ball b2 = new Ball(2, 2 * HEIGHT / 5, 20, 20 , this);
    Ball b3 = new Ball(3, 3 * HEIGHT / 5, 20, 20 , this);
    Ball b4 = new Ball(4, 4 * HEIGHT / 5, 20, 20 , this);

    public static void main(String[] args) {
        PApplet.main("FourBall", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        b1.move();
        b2.move();
        b3.move();
        b4.move();
    }

}
