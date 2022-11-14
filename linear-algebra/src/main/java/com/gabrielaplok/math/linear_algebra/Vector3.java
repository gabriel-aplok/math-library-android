package com.gabrielaplok.math.linear_algebra;

public final class Vector3 {
	public float x;
	public float y;
	public float z;

	public Vector3() {
		this(0f, 0f, 0f);
	}

	public Vector3(Vector3 vector) {
		set(vector);
	}

	public Vector3(float x, float y, float z) {
		set(x, y, z);
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

	public void setZ(float z) {
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public Vector3 set(Vector3 vector) {
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
		return this;
	}

	public Vector3 set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}

	public Vector3 add(Vector3 vector) {
		return set(
			this.x + vector.x,
			this.y + vector.y,
			this.z + vector.z
		);
	}

	public Vector3 add(float x, float y, float z) {
		return set(
			this.x + x,
			this.y + y,
			this.z + z
		);
	}

	public Vector3 sub(Vector3 vector) {
		return set(
			this.x - vector.x,
			this.y - vector.y,
			this.z - vector.z
		);
	}

	public Vector3 sub(float x, float y, float z) {
		return set(
			this.x - x,
			this.y - y,
			this.z - z
		);
	}

	public Vector3 negate() {
		return set(-x, -y, -z);
	}
}
