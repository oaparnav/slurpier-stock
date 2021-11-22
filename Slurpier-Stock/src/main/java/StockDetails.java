import java.util.Date;

public class StockDetails {

	private Double lastUpdatedPrice;
	private Date lastUpdated;
	private Double lastClosingPrice;

	public StockDetails(Double lastUpdatedPrice, Date lastUpdated) {
		super();
		this.lastUpdatedPrice = lastUpdatedPrice;
		this.lastUpdated = lastUpdated;
	}

	public double getPrice(StockService stockService, String ticker) {
		double currentPrice = stockService.getPrice(ticker);
		this.lastUpdatedPrice = currentPrice;
		this.lastUpdated = new Date();
		return currentPrice;
	}
	
	public double getLastClosingPrice(StockService stockService, String ticker) {
		this.lastClosingPrice =(double) stockService.lastClosingDetails(ticker).get(0);
		return lastClosingPrice;
	}
	
	public double getStockPercentChange() {
		double netChange = this.lastUpdatedPrice - this.lastClosingPrice;
		return (netChange/this.lastClosingPrice) * 100;
	}

}