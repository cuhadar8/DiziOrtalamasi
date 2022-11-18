
public class Main {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		double sum = 0;
		for(Integer i : numbers) {
			sum += 1.0/i;
		}
		
		double harmonicAverage = numbers.length / sum;
		System.out.println("Dizinin harmonik ortalaması = " + harmonicAverage);
		
		
	}

}
