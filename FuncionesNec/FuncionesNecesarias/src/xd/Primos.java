package xd;

public class Primos {
	
		static boolean esPrimo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i < num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	}
