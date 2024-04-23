package Inherritance;


public class Practice1 {
	
	public static void tofindNumOfDigit(int num) {
		int count=0;
		while(num>0) {
			
			num= num/10;
			count++;
			
		}
		System.out.println(count);
		
	}
	
	public static void tofindEvenAndOddNUM(int num) {
		int evenCo=0;
		int oddCo=0;
		while(num>0) {
		int rem = num%10;
		if(rem%2==0) {
			evenCo++;
			System.out.println("even"+evenCo);
		}else {
			oddCo++;
			System.out.println("odd"+oddCo);
		}
		num=num/10;
	}}

	public static void main(String[] args) {
		//tofindNumOfDigit(2351);
		tofindEvenAndOddNUM(123);
		
	}
}