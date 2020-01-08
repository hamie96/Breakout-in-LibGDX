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

    public void update()
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
    }

    public void checkCollision(Paddle paddle)
    {
        if(collidesWith(paddle))
        {
            color = Color.GREEN;
        }
    }

    private boolean collidesWith(Paddle paddle)
    {
            if(x == paddle.getX()  && y == paddle.getY() )
            {
                return true;
            }
            else
                return false;
    }

    public void draw(ShapeRenderer shape)
    {
        shape.setColor(color);
        shape.circle(x,y,size);
    }
}
