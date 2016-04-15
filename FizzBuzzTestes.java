package fizzbuzz;

public class FizzBuzzTest {
	//Teste de classe FizzBuzz
	  //Um programa para testar a funcionalidade da classe FizzBuzz
	  public static void fizzNumberTest() {
	    //n = 0
	    if (FizzBuzz.fizzNumber(0).equals("fizzbuzz")) {
	      System.out.println("Success: 0 => fizzbuzz");
	    }
	    else {
	      System.out.println("Test Failed, n=0.");
	    }
	    //n = 1
	    if (FizzBuzz.fizzNumber(1).equals("1")) {
	      System.out.println("Success: 1 => 1");
	    }
	    else {
	      System.out.println("Test Failed, n=1.");
	    }
	    //n = 3

	    //n = 5

	    //n = 15

	    //n = "string"

	    //n = "-9"

	    //n = "-15"

	    //n = "-10"

	    //n = "101"
	  }

	  public static void fizzListTest() {
	    //inicio = 1 fim = 5
	    //inicio = 12 fim = 16
	    //inicio = -2 fim = 2
	    //inicio = 10 fim = 5
	  }

	  public static void main(String[] args) {
	    //Aqui vai a logica do programa
	    fizzNumberTest();
	  }
	}
