package edu.up.cannonanimationhw3a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by kurtisdavidson on 4/2/17.
 */

public class Ball{

    private int velocity;
    private double gravity;
    private double angle;
    private int radius;
    private int negOne = -1;
    private Paint ballPaint = new Paint();
    protected int x;
    protected int y;

    /**
     * Ctor for our Ball object
     * @param initX
     *          the ball's x position
     * @param initY
     *          the balls's y position
     * @param radius
     *          the ball's radius
     * @param initAngle
     *          the ball's angle
     */
    public Ball(int initX, int initY, int initVel,
                double initAngle, int radius, double initGravity)
    {
        this.x = initX;
        this.y = initY;
        this.velocity = initVel;
        this.radius = radius;
        this.angle = initAngle;
        this.gravity = initGravity;
    }

    /**
     * Gets the ball's x coordinate
     * @return x
     *          the x position
     */
    public int getX() { return this.x; }

    /**
     * Gets the ball's y coordinate
     * @return y
     *          the y position
     */
    public int getY() { return this.y; }

    /**
     * Draws the ball with at its corresponding x and y position
     *
     * @param canvas
     *          the canvas
     * @param time
     *          the time which will adjust the trajectory
     */
    public void drawMe(Canvas canvas, int time) {
        ballPaint.setColor(Color.BLACK);
        this.x = (int) (this.x + (this.velocity * Math.cos(this.angle) * (time)));
        this.y = (int) (this.y + ((this.velocity * Math.sin(this.angle) * (negOne)) * (time) +
                (0.5 * this.gravity * (time) * (time))));

        canvas.drawCircle(x, y, radius, ballPaint);
    }
}
