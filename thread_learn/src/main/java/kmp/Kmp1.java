package kmp;

public class Kmp1 {
	
	public static int[] getNext(String find){
	    int[] next = new int[find.length() + 1];
	    //0 和 1 的值肯定是 0
	    next[0] = 0;
	    next[1] = 0;

	    //根据 next[i] 推算 next[i+1]
	    for(int i = 1; i < find.length(); i ++){
	        int j = next[i];
	        //比较 i 位置与 j 位置的字符
	        //如果不等，则 j 取 next[j]
	        while (j > 0 && (find.charAt(i) != find.charAt(j))){
	            j = next[j];
	        }
	        //如果相等，则 j 加一即可
	        if(find.charAt(i) == find.charAt(j)){
	            j ++;
	        }
	        next[i+1] = j;
	    }

	    return next;
	}
	
	public static void main(String[] args) {
		String str = "dadcdadae";
		int[] next = getNext(str);
		for (int i : next) {
			System.out.print(i);
		}
	}

}
