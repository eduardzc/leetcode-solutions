package leetcode;

import java.util.ArrayList;

public class Palindrome {
	public static void main(String[] args) {
		int x = -121;
		System.out.println(isPalindrome(x));
	}
	
	public static boolean isPalindrome(int x) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		
		while(x != 0) {
			Integer elemento  = x % 10;
			lista.add(elemento);
			x /= 10;
		}

		int longitud = lista.size();
		
		for(int i=0; i<longitud/2; i++) {
			if (!lista.get(i).equals(lista.get(longitud - 1 - i))) {
                return false;
            }
		}
		
		return true;
	}
}
