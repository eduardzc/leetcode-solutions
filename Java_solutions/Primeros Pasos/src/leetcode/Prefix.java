package leetcode;

public class Prefix {

	public static void main(String[] args) {
		//String[] input = {"flower","flow","flight"};
		String[] input2 = {"cow", "coward", "cowboy", "cowgirl"};
		System.out.println(longestCommonPrefix(input2));

	}
	
    public static String longestCommonPrefix(String[] strs) {
       String primera = strs[0];
       int longitud = primera.length();
       String empty = "";
        
        while(longitud > 0) {
        	
            String prefix = primera.substring(0, longitud);
            boolean match = true;
        	
        	for(int i = 1; i < strs.length; i++) {
        		if(!strs[i].startsWith(prefix)) {
        			match = false;
        			break;
        		}
        	}
        	
        	if(match == true) {
        		return prefix;
        	}
        	
        	longitud--;
        }
        
        return empty;
    }

}
