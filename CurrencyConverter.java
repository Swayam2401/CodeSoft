import java.util.Scanner;
public class CurrencyConverter{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your amount: ");
		int amount = sc.nextInt();

		System.out.println();

		currencyDisplay();
		System.out.println();
		System.out.print("--> choose your currency code from[1 - 10]: ");
        int code = sc.nextInt();

        System.out.println();

	    currencyDisplay();
	    System.out.println();
	    System.out.print("--> choose your wanted currency code from[1 - 10]: ");
	    int toCode = sc.nextInt();

        System.out.println();


        double convertion = getConversionRate(code);
	    double toAmount = getAmount(toCode);

	    float ans = (float)(amount * convertion * toAmount);

	   System.out.println(amount+" "+getCode(code)+" = "+ ans +" "+getCode(toCode));
	}
	private static void currencyDisplay(){
		String[] currency ={"INR (Indian Rupees)",
		                    "USD (US Dollars)",
		                    "EUR (Euros)",
		                    "CAD (Canadian Dollars)",
		                    "GPB (British Pound)",
		                    "AUD (Australian Dollars)",
		                    "JPY (Japanese Yen)",
		                    "CNY (Chinese Yuan Renminbi)",
		                    "PKR (Pakistani Rupees)",
		                    "RUB (Russian Ruble)"};

		for(int i=0;i < currency.length;i++){
	    	System.out.println(i+1+") "+currency[i]);
	    }
	}
	private static String getCode(int c){
		String[] codes =   {"INR",
		                    "USD",
		                    "EUR",
		                    "CAD",
		                    "GPB",
		                    "AUD",
		                    "JPY",
		                    "CNY",
		                    "PKR",
		                    "RUB"};

		   return codes[c-1];
	}
	private static double getConversionRate(int code){
		double[] convertion = {0.011056148,0.91852882,1,6.8255632,1.1647824,0.60603715,0.0062024147,0.12867142,0.0032820433,0.010338161};

		return convertion[code-1];
	}
	private static double getAmount(int toCode){
		double[] converted = {90.432555,1.0885791,1,14.655091,0.858529,1.64994,161.228,7.78062,304.688,96.7290};

		return converted[toCode-1];
	}
}