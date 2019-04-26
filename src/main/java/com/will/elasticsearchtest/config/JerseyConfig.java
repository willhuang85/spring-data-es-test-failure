package com.will.elasticsearchtest.config;

import com.will.elasticsearchtest.resource.TestResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
        register(TestResource.class);
    }
}
