package problem04;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("# > = 10\nO > = 10\n");
		
		for (int i = 0; i < 20; i++) {
			Random random  = new Random();
			if (random.nextBoolean()) {
				System.out.print("#");
			}else {
				System.out.print("O");
			}
			
		}
		
		

	}

}
