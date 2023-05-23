import java.util.Arrays;


class Solution {
    public int solution(int n, int k) {
        
		String binaryStr = Integer.toString(n,k);
		String[] binaryStrArr = binaryStr.split("0");
		Long result = Arrays.stream(binaryStrArr)
				.filter(s -> !s.equals("") )
				.mapToLong(Long::parseLong)
				.reduce( 0 , ( acc , b ) -> {
					if( isPrime(b) ) acc++;
					return acc;
				});
        return result.intValue();


    }
    
	public boolean isPrime(Long number){
		if( number <= 1 ) return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
    
}
