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
	ArrayList<Ball> balls = new ArrayList<>();
	Random r = new Random();

	@Override
	public void create () {
		shape = new ShapeRenderer();
		//ball = new Ball(150,200,70,12,5);

		for (int i = 0; i < 10; i++) {
			balls.add(new Ball(r.nextInt(Gdx.graphics.getWidth()),
					r.nextInt(Gdx.graphics.getHeight()),
					r.nextInt(100), r.nextInt(15), r.nextInt(15)));
		}
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shape.begin(ShapeRenderer.ShapeType.Filled);
		for (Ball ball : balls) {
			ball.update();
			ball.draw(shape);
		}
		shape.end();
	}

}
