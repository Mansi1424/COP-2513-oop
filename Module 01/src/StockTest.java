
public class StockTest {

	public static void main(String[] args) {
		
		
		
		Stock stock1 = new Stock("ORCL", "Oracle Corporation");

        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
        System.out.println("current price: " + stock1.getCurrentPrice());
        System.out.printf("Percent changed: %.2f%%\n" , stock1.getChangePercent());
		 
		 
		 
		 

		// Create a Stock object with the stock
		// symbol ORCL, the name Oracle Corporation
		/*Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5; //DOES NOT WORK if previousClosingPrice is private!!
		stock.currentPrice = 34.35; //DOES NOT WORK if currentPrice is PRIVATE!

		// Display the price-change percentage
		System.out.println("\nStock name: " + stock.name);
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: %.2f%%\n", stock.getChangePercent());*/
	}

}
