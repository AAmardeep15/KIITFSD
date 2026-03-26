package day2;

public class leetcode_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Amardeep";
	        String reversed = "";

	        // Reverse the string
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed = reversed + str.charAt(i);
	        }

	        // Check palindrome
	        if (str.equals(reversed)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a Palindrome");
	}

}
}