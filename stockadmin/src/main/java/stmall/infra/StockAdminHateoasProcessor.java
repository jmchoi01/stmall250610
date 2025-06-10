package stmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stmall.domain.*;

@Component
public class StockAdminHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<StockAdmin>> {

    @Override
    public EntityModel<StockAdmin> process(EntityModel<StockAdmin> model) {
        return model;
    }
}
