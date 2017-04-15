package easy;
/**
 * 461 haming distance
 * @author nhluu
 *
 */

public class HamingDistance {
	public static int countDistance(int x, int y){
		int xor = x^y,distance = 0;
		for(int i =0; i<32;i++){
			if(((xor>>i)&1) == 1){
				distance++;
			}
		}
		return distance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countDistance(1,4);
	}

}
