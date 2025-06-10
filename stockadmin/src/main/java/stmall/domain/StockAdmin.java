package stmall.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import stmall.StockadminApplication;
import stmall.domain.StockDecreased;
import stmall.domain.StockIncreased;

@Entity
@Table(name = "StockAdmin_table")
@Data
//<<< DDD / Aggregate Root
public class StockAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer stock;

    public static StockAdminRepository repository() {
        StockAdminRepository stockAdminRepository = StockadminApplication.applicationContext.getBean(
            StockAdminRepository.class
        );
        return stockAdminRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseStock(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        StockAdmin stockAdmin = new StockAdmin();
        repository().save(stockAdmin);

        StockDecreased stockDecreased = new StockDecreased(stockAdmin);
        stockDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(deliveryCompleted.get???()).ifPresent(stockAdmin->{
            
            stockAdmin // do something
            repository().save(stockAdmin);

            StockDecreased stockDecreased = new StockDecreased(stockAdmin);
            stockDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseStock(SnippingReturn snippingReturn) {
        //implement business logic here:

        /** Example 1:  new item 
        StockAdmin stockAdmin = new StockAdmin();
        repository().save(stockAdmin);

        StockIncreased stockIncreased = new StockIncreased(stockAdmin);
        stockIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(snippingReturn.get???()).ifPresent(stockAdmin->{
            
            stockAdmin // do something
            repository().save(stockAdmin);

            StockIncreased stockIncreased = new StockIncreased(stockAdmin);
            stockIncreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
