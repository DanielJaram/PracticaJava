package oops;

public class MyCharRunner {
public static void main(String[] args) {
		
		MyChar myChar = new MyChar('4');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());// 'a' and 'z' or 'A' and 'Z'
		System.out.println(myChar.isConsonat());
		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabet();
		
		
	}

}
