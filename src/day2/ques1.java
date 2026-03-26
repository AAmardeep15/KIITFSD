package day2;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 121, original = num, reverse = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num = num / 10;
	        }

	        if (original == reverse) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a Palindrome");
	        }

	}

}
