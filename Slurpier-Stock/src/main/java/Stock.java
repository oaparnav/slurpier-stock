import java.util.Date;

class Stock {
	private String ticker;
	private String name;
	private String description;
	private StockDetails stockDetails;

	Stock(String ticker, String name, String description, Double lastUpdatedPrice, Date lastUpdated) {
		this.ticker = ticker;
		this.name = name;
		this.description = description;
		stockDetails = new StockDetails(lastUpdatedPrice, lastUpdated);
	}

	public double getPrice(StockService stockService) {
		return stockDetails.getPrice(stockService, ticker);
	}

	public boolean delete(StockRepository stockRepository) {
		stockRepository.delete(ticker);
		return false;
	}

	public double getLastClosingPrice(StockService stockService) {
		return stockDetails.getLastClosingPrice(stockService, ticker);
	}

}