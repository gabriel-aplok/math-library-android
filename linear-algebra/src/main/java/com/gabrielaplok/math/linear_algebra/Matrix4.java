package com.gabrielaplok.math.linear_algebra;

import android.opengl.Matrix;

public final class Matrix4 {
	public float[] m;

	private float[] TMP_MATRIX = new float[16];

	public Matrix4() {
		m = new float[16];
		Matrix.setIdentityM(m, 0);
	}

	public Matrix4 set(Matrix4 matrix) {
		System.arraycopy(matrix.m, 0, m, 0, 16);
		return this;
	}

	public Matrix4 copy() {
		Matrix4 copyMatrix = new Matrix4();
		copyMatrix.set(this);
		return copyMatrix;
	}

	public Matrix4 multiplyMM(Matrix4 matrix) {
		Matrix.multiplyMM(TMP_MATRIX, 0, m, 0, matrix.m, 0);
		System.arraycopy(TMP_MATRIX, 0, m, 0, 16);
		return this;
	}

	public Matrix4 multiplyMV(Matrix4 matrix) {
		Matrix.multiplyMV(TMP_MATRIX, 0, m, 0, matrix.m, 0);
		System.arraycopy(TMP_MATRIX, 0, m, 0, 16);
		return this;
	}

	public Matrix4 identity() {
		Matrix.setIdentityM(m, 0);
		return this;
	}

	public Matrix4 lookAt(Vector3 eye, Vector3 center, Vector3 up) {
		return lookAt(eye.getX(), eye.getY(), eye.getZ(), center.getX(), center.getY(), center.getZ(), up.getX(), up.getY(), up.getZ());
	}

	public Matrix4 lookAt(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ) {
		Matrix.setLookAtM(m, 0, eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
		return this;
	}

	public Matrix4 perspective(float fovy, float aspect, float zNear, float zFar) {
		Matrix.perspectiveM(m, 0, fovy, aspect, zNear, zFar);
		return this;
	}

	public Matrix4 frustum(float left, float right, float bottom, float top, float near, float far) {
		Matrix.frustumM(m, 0, left, right, bottom, top, near, far);
		return this;
	}

	public Matrix4 ortho(float left, float right, float bottom, float top, float near, float far) {
		Matrix.orthoM(m, 0, left, right, bottom, top, near, far);
		return this;
	}

	public Matrix4 invert(Matrix4 matrix) {
		Matrix.invertM(matrix.m, 0, m, 0);
		return this;
	}

	public Matrix4 transpose(Matrix4 matrix) {
		Matrix.transposeM(matrix.m, 0, m, 0);
		return this;
	}

	public Matrix4 translate(Vector3 vector) {
		translate(vector.getX(), vector.getY(), vector.getZ());
		return this;
	}

	public Matrix4 translate(float x, float y, float z) {
		Matrix.translateM(m, 0, x, y, z);
		return this;
	}

	public Matrix4 scale(Vector3 vector) {
		scale(vector.getX(), vector.getY(), vector.getZ());
		return this;
	}

	public Matrix4 scale(float x, float y, float z) {
		Matrix.scaleM(m, 0, x, y, z);
		return this;
	}

	public Matrix4 rotateEuler(Vector3 vector) {
		rotateEuler(vector.getX(), vector.getY(), vector.getZ());
		return this;
	}

	public Matrix4 rotateEuler(float x, float y, float z) {
		Matrix.setRotateEulerM(m, 0, x, y, z);
		return this;
	}

	public Matrix4 rotateX(float degrees) {
		Matrix.rotateM(m, 0, degrees, 1f, 0f, 0f);
		return this;
	}

	public Matrix4 rotateY(float degrees) {
		Matrix.rotateM(m, 0, degrees, 0f, 1f, 0f);
		return this;
	}

	public Matrix4 rotateZ(float degrees) {
		Matrix.rotateM(m, 0, degrees, 0f, 0f, 1f);
		return this;
	}
}
