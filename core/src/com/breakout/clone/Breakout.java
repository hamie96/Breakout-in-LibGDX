package com.breakout.clone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.GL20;
import java.util.ArrayList;
import java.util.Random;

public class Breakout extends ApplicationAdapter {
	ShapeRenderer shape;
	Ball ball;
	Paddle paddle;

	@Override
	public void create () {
		shape = new ShapeRenderer();
		ball = new Ball(150,200,15,12,5);
		paddle = new Paddle(100,10, 10);
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shape.begin(ShapeRenderer.ShapeType.Filled);
		ball.checkCollision(paddle);
		ball.update(paddle);
		ball.draw(shape);
		paddle.update();
		paddle.draw(shape);
		shape.end();
	}

}
