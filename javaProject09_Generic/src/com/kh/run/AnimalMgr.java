package com.kh.run;

public class AnimalMgr<T> {
	private T data;
	public AnimalMgr(T data) {this.data=data;}
	public T getData() {return data;}
}
