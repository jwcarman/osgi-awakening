package osgi.demystified;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloOsgi implements BundleActivator {
//----------------------------------------------------------------------------------------------------------------------
// Fields
//----------------------------------------------------------------------------------------------------------------------

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloOsgi.class);

//----------------------------------------------------------------------------------------------------------------------
// BundleActivator Implementation
//----------------------------------------------------------------------------------------------------------------------

    @Override
    public void start(BundleContext context) throws Exception {
        LOGGER.info("Hello, OSGi!");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        LOGGER.info("Goodbye, OSGi!");
    }
}
