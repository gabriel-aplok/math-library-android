package com.gabrielaplok.math.linear_algebra;

public final interface Vector<T extends Vector> {
	public T set(T vector);
	public T add(T vector);
	public T sub(T vector);
	public T negate();
}
