package finalproject.infra;

import finalproject.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MemberHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Member>> {

    @Override
    public EntityModel<Member> process(EntityModel<Member> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/chargerentalpoint"
                )
                .withRel("chargerentalpoint")
        );

        return model;
    }
}
