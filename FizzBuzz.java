package fizzbuzz;

public class FizzBuzz {
	  //Corpo da classe FizzBuzz

	  //Vai incluir metodos para calcular um simples
	  //numero FizzBuzz
	  //e uma lista de n numeros FizzBuzz

	  //fizzNumber(int n)
	  //Calcula a saída adequada fizzbuzz
	  //para um numero, n
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
	  //Cria uma string contendo
	  //uma lista de todas as saídas fizzbuzz
	  //começando com o start e terminando com end - 1.
	}
