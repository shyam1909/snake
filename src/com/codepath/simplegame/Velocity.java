package com.codepath.simplegame;

public class Velocity {
	public static final int DIRECTION_RIGHT	= 1;
	public static final int DIRECTION_LEFT	= -1;
	public static final int DIRECTION_UP	= -1;
	public static final int DIRECTION_DOWN	= 1;

	private float xVelocity;	// velocity value on the X axis
	private float yVelocity;	// velocity value on the Y axis

	private int xDirection; // direction traveling X (i.e DIRECTION_RIGHT)
	private int yDirection; // direction traveling Y (i.e DIRECTION_UP)

	public Velocity() {
		this(5, 5);
	}

	public Velocity(float xv, float yv) {
		this.xVelocity = xv;
		this.yVelocity = yv;
		this.xDirection = DIRECTION_RIGHT;
		this.yDirection = DIRECTION_DOWN;
	}

	public float getXSpeed() {
		return xVelocity;
	}
	public Velocity setXSpeed(float xv) {
		this.xVelocity = xv;
		return this;
	}
	public float getYSpeed() {
		return yVelocity;
	}
	public Velocity setYSpeed(float yv) {
		this.yVelocity = yv;
		return this;
	}

	public int getXDirection() {
		return xDirection;
	}
	public Velocity setXDirection(int xDirection) {
		this.xDirection = xDirection;
		return this;
	}
	public int getYDirection() {
		return yDirection;
	}
	public Velocity setYDirection(int yDirection) {
		this.yDirection = yDirection;
		return this;
	}

	// changes the direction on the X axis
	public void toggleXDirection() {
		xDirection = xDirection * -1;
	}

	// changes the direction on the Y axis
	public void toggleYDirection() {
		yDirection = yDirection * -1;
	}
	
	// Sets the speed of object to 0
	public Velocity stop() {
		setXSpeed(0);
		setYSpeed(0);
		return this;
	}
}