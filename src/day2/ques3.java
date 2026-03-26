package day2;

public class ques3 {
	    public static void main(String[] args) {
	        int num = 12345;
	        int count = 0;

	        while (num != 0) {
	            num = num / 10;  // remove last digit
	            count++;
	        }

	        System.out.println("Number of digits = " + count);
	    }
	}
