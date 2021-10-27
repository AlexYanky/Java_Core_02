package jc_lesson1;

public class JC_lesson1 {
	
	public static void main(String[] args) {
		
		//declare and initialize variables of primitive types
		byte b = 12;
		short s = 13014;
		int i = 1200456000;
		long l = 12400456789L;
		float f = 3.14F;
		double d = 318.2E+12;
		char c = 'z';
		boolean bl = true;	
	
		
		//display the minimum and maximum values of primitive data types
		System.out.println("Мінімальне значення змінної типу byte: " + Byte.MIN_VALUE);
		System.out.println("Максимальне значення змінної типу byte: " + Byte.MAX_VALUE);
	
		System.out.println();
		
		System.out.println("Мінімальне значення змінної типу short: " + Short.MIN_VALUE);
		System.out.println("Максимальне значення змінної типу short: " + Short.MAX_VALUE);
	
		System.out.println();
		
		System.out.println("Мінімальне значення змінної типу int: " + Integer.MIN_VALUE);
		System.out.println("Максимальне значення змінної типу int: " + Integer.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("Мінімальне значення змінної типу long: " + Long.MIN_VALUE);
		System.out.println("Максимальне значення змінної типу long: " + Long.MAX_VALUE);
		
		System.out.println();
	
		System.out.println("Мінімальне значення змінної типу float: " + Float.MIN_VALUE);
		System.out.println("Максимальне значення змінної типу float: " + Float.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("Мінімальне значення змінної типу double: " + Double.MIN_VALUE);
		System.out.println("Максимальне значення змінної типу double: " + Double.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("Мінімальне значення змінної типу char: " + (int)Character.MIN_VALUE);
		System.out.println("Максимальне значення змінної типу char: " + (int)Character.MAX_VALUE);
		
		System.out.println();
	
		System.out.println("Мінімальне значення змінної типу boolean: " + Boolean.FALSE);
		System.out.println("Максимальне значення змінної типу boolean: " + Boolean.TRUE);
		
		System.out.println();
	
	
		//fill the array with numerical data in a chaotic order, 
		//and find the largest and smallest values from the array
		double initialValue = 0;
		double finalValue = 10;
		double chaoticArray[] = new double [10];		
		
		//fill the array with random values
		for (int k = 0; k < chaoticArray.length; k++) {
			chaoticArray[k] = initialValue + (Math.random() * finalValue);
		}
			
		//display an array
		System.out.println("Масив випадкових чисел chaoticArray (від " + initialValue + " до " + finalValue + "):");
		for (int k = 0; k < chaoticArray.length; k++) {
			System.out.print(chaoticArray[k] + " ");
		}
			
		System.out.println();
		System.out.println();
			
		System.out.println("Мінімальний елемент масиву chaoticArray: " + minElement(chaoticArray));
		System.out.println("Максимальний елемент масиву chaoticArray: " + maxElement(chaoticArray));
	
			
	}

		//search function of finding the minimum element of the array
		public static double minElement (double Array[]) { 
			double min = Array[0];
				
			for (int i = 1; i < Array.length; i++) {
				if (min >= Array[i]) {
					min = Array[i];
				}
			}
				
			return min;				
		}
			
		//search function for the maximum element of the array
		public static double maxElement (double Array[]) { 
			double max = Array[0];
				
			for (int i = 1; i < Array.length; i++) {
				if (max <= Array[i]) {
					max = Array[i];
				}
			}
				
			return max;
		}
	
		//Test comment
}
