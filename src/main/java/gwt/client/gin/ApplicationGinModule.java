package gwt.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import gwt.client.service.ApplicationService;
import gwt.client.text.ApplicationConstants;
import gwt.client.validation.ValidatorFactory.GwtValidator;
import gwt.client.widget.MainView.MainViewUiBinder;
import gwt.client.widget.image.ApplicationImages;

public class ApplicationGinModule extends AbstractGinModule {
    protected void configure() {
        bind(ApplicationService.class);
        bind(ApplicationConstants.class);
        bind(MainViewUiBinder.class);
        bind(GwtValidator.class);
        bind(ApplicationImages.class);
    }
}
