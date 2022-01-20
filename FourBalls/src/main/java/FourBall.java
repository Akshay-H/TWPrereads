import processing.core.PApplet;

public class FourBall extends PApplet {

    public static final int HEIGHT = 600;
    public static final int WIDTH = 1200;
    float s1, s2, s3, s4 = 0;

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
        //clearBackground();
        drawCircle();
        s1 += 1;
        s2 += 2;
        s3 += 3;
        s4 += 4;
    }

    private void drawCircle() {
        ellipse(s1, HEIGHT / 5, 20, 20);
        ellipse(s2, 2 * (HEIGHT / 5), 20, 20);
        ellipse(s3, 3 * (HEIGHT / 5), 20, 20);
        ellipse(s4, 4 * (HEIGHT / 5), 20, 20);
    }

    private void clearBackground() {
        background(255);
    }
}
