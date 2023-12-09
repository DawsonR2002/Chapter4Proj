package Chapter4;

public class projectChapterFour {
	//global variables
	static int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
	static int ages2[] = {21, 28, 34, 58, 81, 62, 10, 11, 4};
	static int sumQ1 = 0;
	static int totalLettersQ2;
	static int avgAgeQ1;
	static int avgLettersPerNameQ2;
	static String concatQ2 = "";
	static String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	static int nameLengths[] = new int[names.length];
	static int sumQ6 = 0;
	static int numberOfRepetionSeven = 3;
	static String wordToConcatSeven = "Code";
	static String firstName = "Dawson";
	static String lastName = "Ring";
	static int arrayOfIntsNine[] = {9, 13, 21, 4, 2, 13, 31, 15, 10};
	static double arrayTen[] = {2.0, 4.0, 8.0, 1.6, 3.2, 6.4}; 
	static double arrayElevenOne[] = {1.7, 2.0, 3.9, 5.9, 1.2}; 
	static double arrayElevenTwo[] = {1.3, 2.9, 1.9, 9.0, 2.1};
	static boolean isItHot = false;
	static double moneyInPocketGlobal = 4.99;
	static double mealCost = 15.99;
	
	public static void main(String[] args) {
		int oneA = ages[ages.length - 1] - ages[0];
		System.out.println("1a: " + oneA);
		
		int oneB = ages2[ages2.length -1] - ages2[0];
		System.out.println("1b: " + oneB);
	
		for(int i = 0; i < ages.length; i++) {
			sumQ1 += ages[i];
			if(i == ages.length - 1) {
				avgAgeQ1 = sumQ1 / ages.length;
			}
		}
		System.out.println("1c: " + avgAgeQ1);
		
		for(int i = 0; i < names.length; i++) {
			totalLettersQ2 += names[i].length();
			if(i == names.length - 1) {
				avgLettersPerNameQ2 = totalLettersQ2 / names.length;
			}
		}
		System.out.println("2a: " + avgLettersPerNameQ2);
		
		for(int i = 0; i < names.length; i++) {
			if(i < names.length - 1 ) {
				concatQ2 += names[i] + " ";
			}
			else {
				concatQ2 += names[i];
			}
		}
		
		System.out.println("2b: " + concatQ2);
		
		System.out.println("3: You do: arrayName[arrayName.length - 1] ");
		System.out.println("4: You do: arrayName[0] ");
		
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			sumQ6 += nameLengths[i];
			if(i == 0) {
				System.out.print("5: " + nameLengths[i] + " ");
			}
			else if(i != names.length - 1) {
				System.out.print(nameLengths[i] + " ");
			}
			else {
				System.out.println(nameLengths[i]);
			}
		}
		
		System.out.println("6: " + sumQ6);
		
		System.out.println("7: " + strConcatenation(wordToConcatSeven, numberOfRepetionSeven));
		
		System.out.println("8: " + fullName(firstName, lastName));
		
		System.out.println("9: " + isGreaterHundred(arrayOfIntsNine));
		
		System.out.println("10: " + findAvg(arrayTen));
		
		System.out.println("11: " + compare(arrayElevenOne, arrayElevenTwo));
		
		System.out.println("12: " + willBuyDrink(isItHot, moneyInPocketGlobal));
		
		//This method shows people the amount they should tip a waiter based on
		//the meal cost they put in
		System.out.println("13: $" + tipToLeave(mealCost) );
	}
	
//Methods (besides main) are below here
	//#7
	public static String strConcatenation(String word, int n) {
		String strReturnableWord = "";
		for(int i = 0; i < n; i++) {
			strReturnableWord += word;
		}
		
		return strReturnableWord;
	}
	
	//#8
	public static String fullName(String first, String last) {
		String full = first + " " + last;
		return full;
	}
	
	//#9
	public static boolean isGreaterHundred(int[] arrayInUse) {
		int sumLocal = 0;
		
		for(int i = 0; i < arrayInUse.length; i++) {
			sumLocal += arrayInUse[i];
		}
		
		if(sumLocal > 100) {
			return true;
		}
		else {
			return false;
		}
	}

	//#10
	public static double findAvg(double[] array) {
		double sumLocal = 0;
		
		for(int i = 0; i < array.length; i++) {
			sumLocal += array[i];
		}
		
		return sumLocal / array.length;
	}
	
	//#11
	public static boolean compare(double[] array1, double[] array2) {
		double sumLocal1 = 0;
		double sumLocal2 = 0;
		double averageLocal1 = 0;
		double averageLocal2 = 0;
		
		for(int i = 0; i < array1.length; i++) {
			sumLocal1 += array1[i];
		}
		
		for(int j = 0; j < array2.length; j++) {
			sumLocal2 += array2[j];
		}
		averageLocal1 = sumLocal1 / array1.length;
		averageLocal2 = sumLocal2 / array2.length;
		
		if(averageLocal1 > averageLocal2) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	//#12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//#13
	public static double tipToLeave(double costOfMeal) {
		double tipUnformatted = costOfMeal *= 0.15;
		double tipFormatted = tipUnformatted - (tipUnformatted % 0.01);
		return tipFormatted;
	}
}
