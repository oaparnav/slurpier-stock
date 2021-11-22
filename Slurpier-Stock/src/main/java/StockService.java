import java.util.List;

/**
 * This interface represents external stock-exchange for our application.
 */
interface StockService {
  /**
   *  Returns current price of the stock ticker.
   */
  double getPrice(String ticker);
  
  /**
   *  For a given ticker, the API call returns three elements in a list:
   *  1. Last Closing Price is a double.
   *  2. Last Closing Date is a java.util.Date.
   *  3. Last Traded Volume is a Long.
   */
  List<?> lastClosingDetails(String ticker);
}