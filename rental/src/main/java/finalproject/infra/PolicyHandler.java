package finalproject.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import finalproject.config.kafka.KafkaProcessor;
import finalproject.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    RentalRepository rentalRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='NotAvailableBook'"
    )
    public void wheneverNotAvailableBook_UpdateNotAvailable(
        @Payload NotAvailableBook notAvailableBook
    ) {
        NotAvailableBook event = notAvailableBook;
        System.out.println(
            "\n\n##### listener UpdateNotAvailable : " +
            notAvailableBook +
            "\n\n"
        );

        // Sample Logic //
        Rental.updateNotAvailable(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookRollbacked'"
    )
    public void wheneverBookRollbacked_UpdateLackOfPoints(
        @Payload BookRollbacked bookRollbacked
    ) {
        BookRollbacked event = bookRollbacked;
        System.out.println(
            "\n\n##### listener UpdateLackOfPoints : " + bookRollbacked + "\n\n"
        );

        // Sample Logic //
        Rental.updateLackOfPoints(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
