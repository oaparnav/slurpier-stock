import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;

class StockDetailsTest {
	
	
	//@Mock
	private StockService stockService;

	@Test
	void shouldReturnStockPrice_whenValidTickerIsPassed() {
		
		StockDetails stokeDetails = new StockDetails(0.0d, new Date());
		stokeDetails.getPrice(stockService, "Valid ticker");
		
	}

}
