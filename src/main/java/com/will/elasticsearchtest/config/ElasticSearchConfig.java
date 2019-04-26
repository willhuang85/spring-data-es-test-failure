package com.will.elasticsearchtest.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories("com.will.elasticsearchtest.repository")
public class ElasticSearchConfig {

    @Bean
    public ElasticsearchOperations elasticsearchTemplate(RestHighLevelClient client) {
        return new ElasticsearchRestTemplate(client);
    }
}
