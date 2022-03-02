package coreJava;

public class MinMaxNumber {


	public static void main(String[] args) {
	}
		// TODO Auto-generated method stub

		
	public static int getMaxValue(int[] numbers){
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
		      maxValue = numbers[i];
		    }
		  }
		  return maxValue;
		}
	
		public static int getMinValue(int[] numbers){
		  int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
		      minValue = numbers[i];
		    }
		  }
		  return minValue;
		}
}