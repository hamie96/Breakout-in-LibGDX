package com.breakout.clone;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Paddle {

    int x = 150;
    int y;
    int width;
    int height;
    int xSpeed;

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public Paddle(int width, int height, int xSpeed)
    {
        this.width = width;
        this.height = height;
        this.xSpeed = xSpeed;
    }

    public void update()
    {
        x = Gdx.input.getX();
    }

    public void draw(ShapeRenderer shape)
    {
        shape.rect(x,50,width,height);
    }
}
