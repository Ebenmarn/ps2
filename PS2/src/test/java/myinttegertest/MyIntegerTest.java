package myinttegertest;

import static org.junit.Assert.*;

import org.junit.Test;

import Myintteger.MyInteger;

public class MyIntegerTest {

	public void test() {
		MyInteger myint = new MyInteger(1);
		assertTrue(myint.isEven());
		assertFalse(myint.isOdd());
	}
	public void test1() {
		MyInteger myint = new MyInteger(1);
		assertFalse(myint.isOdd());
	}
	public void test2() {
		MyInteger myint = new MyInteger(13);
		assertTrue(myint.isPrime());
		MyInteger myint2 = new MyInteger(8);
		assertFalse(myint2.isPrime());
		
	}
	public void test3() {
		MyInteger myint = new MyInteger(13);
		int x = 1;
		assertTrue(myint.IsEquals(x )==true);
		MyInteger myint2 = new MyInteger(8);
		assertFalse(myint2.isPrime());
	}
}
