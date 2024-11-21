package finalproject.infra;

import finalproject.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RentalHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Rental>> {

    @Override
    public EntityModel<Rental> process(EntityModel<Rental> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "//rentbook")
                .withRel("/rentbook")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/returnbook")
                .withRel("returnbook")
        );

        return model;
    }
}
