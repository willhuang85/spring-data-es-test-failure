package com.will.elasticsearchtest.repository;

import com.will.elasticsearchtest.entity.Vehicle;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface VehicleRepository extends ElasticsearchRepository<Vehicle, String> {
}
