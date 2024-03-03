
package isp.lab9.exercise1.services;

import lombok.Data;
import yahoofinance.Stock;

import java.math.BigDecimal;


 //Uses Lombok to get rid of boilerplate code.
 
@Data // at compile time, it creates getters, setters, equals(), hashCode() and toString()
public class StockItem {
    private String symbol;
    private BigDecimal price;
    private BigDecimal change;
    private String currency;
    private String exchange;
    private String name;

    StockItem(Stock stock) {
        price = stock.getQuote().getPrice();
        change = stock.getQuote().getChangeInPercent();
        symbol = stock.getSymbol();
        currency = stock.getCurrency();
        exchange = stock.getStockExchange();
        name = stock.getName();
    }
}
