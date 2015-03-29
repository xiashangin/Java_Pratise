package puzzle_01 ;

public class puzzle0010_Oddity{

	public static boolean isOdd(int i){
		/*
		(a / b) * b + (a % b) == a
		This identity makes perfect sense, but in combination with Java's 			truncating integer division operator [JLS 15.17.2], it implies that when 			the remainder operation returns a nonzero result, it has the same sign 			as its left operand. 	
		*/

		return i % 2 == 1 ;
	}

	public static int definition(int a ,int b){
		return (a / b) * b + (a % b) ;
	}

	public static boolean isOdd_s1(int i){
		return i % 2 != 0 ;
	}
	
	public static boolean isOdd_s2(int i){
		//It will run much faster
		return (i & 1) != 0 ;
	}
	
	public static void main(String[] args){
		System.out.println("The orginal isOdd : " + isOdd(-3)) ;
		System.out.println("The divide operation : " + 2/(-3)) ;
		System.out.println("The definition of % : " + definition(2 ,-3)) ;
		System.out.println("Solution 1,i % 2 != 0 : " + isOdd_s1(-3)) ;
		System.out.println("Solution 2,(i & 1) != 0 : " + isOdd_s2(-3)) ;
	}
}
