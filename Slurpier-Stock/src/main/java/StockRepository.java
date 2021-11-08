
public interface StockRepository {

	public boolean delete(String ticker);
	
	public Stock saveordelete(Stock stock);
}
