package com.example.demo.sharding.algorithm;


import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.Map;

public class TableRouteAlgorithm implements ComplexKeysShardingAlgorithm<Comparable<?>> {

    @Override
    public Collection<String> doSharding(Collection<String> tables, ComplexKeysShardingValue<Comparable<?>> shardingValue) {
        Map<String, Collection<Comparable<?>>> columnNameAndShardingValuesMap = shardingValue.getColumnNameAndShardingValuesMap();
        Collection<Comparable<?>> channel = columnNameAndShardingValuesMap.get("channel");
        Collection<Comparable<?>> modelId = columnNameAndShardingValuesMap.get("model_id");

        return tables;
    }

    public static void main(String[] args) {
        String channel = "MRP";
        String modelId = "1232321";
        System.out.println((channel+modelId).hashCode());
    }

}
