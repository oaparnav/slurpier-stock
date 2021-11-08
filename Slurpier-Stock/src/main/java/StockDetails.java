import java.util.Date;

public class StockDetails {

	private Double lastUpdatedPrice;
	private Date lastUpdated;

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

}