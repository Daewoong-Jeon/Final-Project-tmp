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
    BookRepository bookRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookRent'"
    )
    public void wheneverBookRent_UpdateRentalStatus(
        @Payload BookRent bookRent
    ) {
        BookRent event = bookRent;
        System.out.println(
            "\n\n##### listener UpdateRentalStatus : " + bookRent + "\n\n"
        );

        // Sample Logic //
        Book.updateRentalStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookReturned'"
    )
    public void wheneverBookReturned_UpdateAvailableStatus(
        @Payload BookReturned bookReturned
    ) {
        BookReturned event = bookReturned;
        System.out.println(
            "\n\n##### listener UpdateAvailableStatus : " +
            bookReturned +
            "\n\n"
        );

        // Sample Logic //
        Book.updateAvailableStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor