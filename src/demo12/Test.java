package demo12;
/*
对于上一题，有如下算法可以实现，试解释该算法是如何实现题目所规定的功能的？
public static void main (String[] args){
		boolean[] isPrime = new boolean[51];
		for (int i = 3; i < 51; i += 2) isPrime[i] = true;
		for (int i = 3; i <= 7; i += 2)
		   	for (int j = i * 2; j < 51; j += i) isPrime[j] = false;
 		for (int i = 6; i < 51; i += 2) {
			 for (int j = 3; ; j += 2) {
			   if (isPrime[j] && isPrime[i - j]) {
				  	System.out.println(i + " = " + j + " + " + (i - j));
					break;				}	}	}	}

 */
public class Test {

}
