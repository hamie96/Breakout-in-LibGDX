package com.breakout.clone;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class Ball {
    int x;
    int y;
    int size;
    int xSpeed;
    int ySpeed;
    Color color = Color.WHITE;

    public Ball(int x, int y, int size, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void update(Paddle paddle)
    {
        x += xSpeed;
        y += ySpeed;

        if(x < 16 ||x > Gdx.graphics.getWidth() - 20)
        {
            xSpeed = -xSpeed;
        }
        if(y < 16 || y > Gdx.graphics.getHeight() - 20)
        {
            ySpeed = -ySpeed;
        }
        checkCollision(paddle);

    }

    public void draw(ShapeRenderer shape){
        shape.setColor(color);
        shape.circle(x, y, size);
    }
    public void checkCollision(Paddle paddle) {
        if(collidesWith(paddle)){
            color = Color.GREEN;
        }
        else{
            color = Color.WHITE;
        }
    }
    private boolean collidesWith(Paddle paddle) {
        if (y == paddle.getY())
        {

            return true;
        }
        else
        {
            return false;
        }
    }
}
