package com.gabrielaplok.math.linear_algebra;

public class Quaternion {
	public float x;
	public float y;
	public float z;
	public float w;

	public Quaternion() {
		this(0f, 0f, 0f, 0f);
	}

	public Quaternion(Quaternion vector) {
		set(vector);
	}

	public Quaternion(float x, float y, float z, float w) {
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

	public Quaternion set(Quaternion vector) {
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
		this.w = vector.w;
		return this;
	}

	public Quaternion set(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
		return this;
	}

	public Quaternion add(Quaternion vector) {
		return set(
			this.x + vector.x,
			this.y + vector.y,
			this.z + vector.z,
			this.w + vector.w
		);
	}

	public Quaternion add(float x, float y, float z, float w) {
		return set(
			this.x + x,
			this.y + y,
			this.z + z,
			this.w + w
		);
	}

	public Quaternion sub(Quaternion vector) {
		return set(
			this.x - vector.x,
			this.y - vector.y,
			this.z - vector.z,
			this.w - vector.w
		);
	}

	public Quaternion sub(float x, float y, float z, float w) {
		return set(
			this.x - x,
			this.y - y,
			this.z - z,
			this.w - w
		);
	}

	public Quaternion negate() {
		return set(-x, -y, -z, -w);
	}

	public Vector3 toEulerAngles() {
		float t = 2f * (w * y - x * z);
		t = (t > 1f) ? 1f : (t < -1f) ? -1f : t;

		float rx = (float) Math.atan2(2f * (w * x + y * z), 1f - 2f * (x * x + y * y));
		float ry = (float) Math.asin(t);
		float rz = (float) Math.atan2(2f * (w * z + x * y), 1f - 2f * (y * y + z * z));

		rx = (float) Math.toDegrees(rx);
		ry = (float) Math.toDegrees(ry);
		rz = (float) Math.toDegrees(rz);

		return new Vector3(rx, ry, rz);
	}
}
