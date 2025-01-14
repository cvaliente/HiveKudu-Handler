/*
  Copyright 2016 Bimal Tandel

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.apache.hadoop.hive.kududb.KuduHandler;

/**
 * Created by bimal on 4/11/16.
 */

public final class HiveKuduConstants {

    // Table Properties
    // comma-separated list of "host:port" pairs of the masters
    public static final String MASTER_ADDRESS_NAME = "kudu.master_addresses";
    // name of the table in kudu
    public static final String TABLE_NAME = "kudu.table_name";

    // Partition and PK properties

    // key columns
    public static final String KEY_COLUMNS = "kudu.key_columns";
    // partition columns (a partition column must be part of the PK
    public static final String PARTITION_COLUMNS = "kudu.partition_columns";

    // number of buckets for each partitioning column
    public static final String BUCKETS_PREFIX = "kudu.buckets.for.";
    public static final Integer DEFAULT_NUM_BUCKETS = 2;

    // SerDe Properties

    // MapReduce Properties
    public static final String MR_INPUT_TABLE_NAME = "kudu.mapreduce.input.table";
    public static final String MR_OUTPUT_TABLE_NAME = "kudu.mapreduce.output.table";
    public static final String MR_MASTER_ADDRESS_NAME = "kudu.mapreduce.master.addresses";
    public static final String MR_PROPERTY_PREFIX = "kudu.mapreduce.";
    //DEFAULT VALUES & Getters for Default values


    private HiveKuduConstants() {
    }
}