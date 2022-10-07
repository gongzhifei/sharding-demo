package com.example.demo.sharding.algorithm;


import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class DatabaseRouteAlgorithm implements ComplexKeysShardingAlgorithm<Comparable<?>> {

    @Override
    public Collection<String> doSharding(Collection<String> databases, ComplexKeysShardingValue<Comparable<?>> complexKeysShardingValue) {
        return null;
    }
}
