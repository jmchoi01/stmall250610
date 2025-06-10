package stmall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmall.config.kafka.KafkaProcessor;
import stmall.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StockIncreased'"
    )
    public void wheneverStockIncreased_SendAlert(
        @Payload StockIncreased stockIncreased
    ) {
        StockIncreased event = stockIncreased;
        System.out.println(
            "\n\n##### listener SendAlert : " + stockIncreased + "\n\n"
        );

        // Sample Logic //
        Order.sendAlert(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SnippingReturn'"
    )
    public void wheneverSnippingReturn_UpdateStatus(
        @Payload SnippingReturn snippingReturn
    ) {
        SnippingReturn event = snippingReturn;
        System.out.println(
            "\n\n##### listener UpdateStatus : " + snippingReturn + "\n\n"
        );

        // Sample Logic //
        Order.updateStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
