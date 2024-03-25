package leetcode;

public class Parentheses {
	public static void main(String[] args) {
		String s = "[](";
		System.out.print(isValid(s));
	}
	
	
	public static boolean isValid(String s) {
		
		String corchetes = "[]";
		String llaves = "{}";
		String parent = "()";
		int pares = s.length() / 2;
		
		if(s.length()%2 != 0) {
			return false;
		}
		
		for(int i = 0; i < s.length(); i+=2) {
			String par = s.substring(i, i+2);
			
			if(!par.equals(parent) && !par.equals(llaves) && !par.equals(corchetes)) {
				return false;
			}
			
		}
		
		
		return true;
	}
	
}
