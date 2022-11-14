package com.gabrielaplok.math.linear_algebra;

public final class Vector2 implements Vector<Vector2> {
	public float x;
	public float y;

	public Vector2() {
		this(0f, 0f);
	}

	public Vector2(Vector2 vector) {
		set(vector);
	}

	public Vector2(float x, float y) {
		set(x, y);
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getX() {
		return x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getY() {
		return y;
	}

	@Override
	public Vector2 set(Vector2 vector) {
		this.x = vector.x;
		this.y = vector.y;
		return this;
	}

	public Vector2 set(float x, float y) {
		this.x = x;
		this.y = y;
		return this;
	}

	@Override
	public Vector2 add(Vector2 vector) {
		return set(
			this.x + vector.x,
			this.y + vector.y
		);
	}

	public Vector2 add(float x, float y) {
		return set(
			this.x + x,
			this.y + y
		);
	}

	@Override
	public Vector2 sub(Vector2 vector) {
		return set(
			this.x - vector.x,
			this.y - vector.y
		);
	}

	public Vector2 sub(float x, float y) {
		return set(
			this.x - x,
			this.y - y
		);
	}

	@Override
	public Vector2 negate() {
		return set(-x, -y);
	}
}
