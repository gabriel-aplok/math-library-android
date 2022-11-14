package com.gabrielaplok.math.linear_algebra;

public final class Vector4 {
	public float x;
	public float y;
	public float z;
	public float w;

	public Vector4() {
		this(0f, 0f, 0f, 0f);
	}

	public Vector4(Vector4 vector) {
		set(vector);
	}

	public Vector4(float x, float y, float z, float w) {
		set(x, y, z, w);
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

	public void setW(float w) {
		this.w = w;
	}

	public float getW() {
		return w;
	}

	public Vector4 set(Vector4 vector) {
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
		this.w = vector.w;
		return this;
	}

	public Vector4 set(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		return this;
	}

	public Vector4 add(Vector4 vector) {
		return set(
			this.x + vector.x,
			this.y + vector.y,
			this.z + vector.z,
			this.w + vector.w
		);
	}

	public Vector4 add(float x, float y, float z, float w) {
		return set(
			this.x + x,
			this.y + y,
			this.z + z,
			this.w + w
		);
	}

	public Vector4 sub(Vector4 vector) {
		return set(
			this.x - vector.x,
			this.y - vector.y,
			this.z - vector.z,
			this.w - vector.w
		);
	}

	public Vector4 sub(float x, float y, float z, float w) {
		return set(
			this.x - x,
			this.y - y,
			this.z - z,
			this.w - w
		);
	}

	public Vector4 negate() {
		return set(-x, -y, -z, -w);
	}
}
