import java.util.Date;

class Stock {
	private String ticker;
	private String name;
	private String description;
	private StockDetails data;

	Stock(String ticker, String name, String description, Double lastUpdatedPrice, Date lastUpdated) {
		this.ticker = ticker;
		this.name = name;
		this.description = description;
		data = new StockDetails(lastUpdatedPrice, lastUpdated);
	}

	public double getPrice(StockService stockService) {
		return data.getPrice(stockService, ticker);
	}

	public boolean delete(StockRepository stockRepository) {
		stockRepository.delete(ticker);
		return false;
	}

	public double getLastClosingPrice(StockService stockService) {
		return (double) stockService.lastClosingDetails(ticker).get(0);
	}

}