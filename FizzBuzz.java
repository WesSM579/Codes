package fizzbuzz;

public class FizzBuzz {
	  //Body of FizzBuzz class

	  //will inlude methods for computing a single
	  //FizzBuzz number
	  //and a list of n FizzBuzz numbers

	  //fizzNumber(int n)
	  //Computes the proper fizzbuzz output
	  //for a number, n
	  public static String fizzNumber(int n) {
	    if (n % 3 == 0) {
	      if (n % 5 == 0) {
	        return "fizzbuzz";
	      }
	      else {
	        return "fizz";
	      }
	    }
	    else {
	      if (n % 5 == 0) {
	        return "buzz";
	      }
	      else {
	        return "" +  n;
	      }
	    }
	  }

	  //fizzList(int start, int end)
	  //Creates a string containing
	  //a list of all fizzbuzz outputs starting with
	  //start and ending witn end - 1.
	}
