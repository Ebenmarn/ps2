package Myintteger;

public class MyInteger {
	int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven() {
		return (getiValue()%2==0);
	}
	public boolean isOdd() {
		return !isEven();
	}
	public boolean isPrime() {
		
		    for(int i=2;i<getiValue();i++) {
		        if(getiValue()%i==0)
		            return false;
		    }
		    return true;
		}
	public static boolean isEven(int iValue) {
		MyInteger myint = new MyInteger(iValue);
		return myint.isEven();
	}
	
	
	public static boolean isOdd(int iValue) {
		MyInteger myint = new MyInteger(iValue);
		return myint.isOdd();
	}
	public static boolean isPrime(int iValue) {
			MyInteger myint = new MyInteger(iValue);
			return myint.isPrime();
	}
	
	public boolean IsEquals(int x) {
		return (this.getiValue() == x);
		
	}
	
	public boolean equals(MyInteger x) {
		
		return (this.getiValue() == x.getiValue());
	}
	
	
	
	
	}
