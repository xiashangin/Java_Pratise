package puzzle_02 ;

import java.math.BigDecimal ;

public class puzzle0020_Change{
	

	public static void main(String[] args){
		System.out.println("We can't get the result that we expect : " + (2.00 - 1.10)) ;
		System.out.printf("Solution1,format : %.2f%n" , (2.00 - 1.10)) ;
		System.out.println(new BigDecimal(1.10)) ;
		//Use BigDecimal(String) but not BigDecimal(double)!
		System.out.print("Solution2,BigDecimal : ") ;
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10"))) ;
	}
}
