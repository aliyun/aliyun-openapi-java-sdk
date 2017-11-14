/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesResponse;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesResponse.DBInstance.MongosAttribute;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesResponse.DBInstance.ShardAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext context) {
		
		describeDBInstancesResponse.setRequestId(context.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setPageNumber(context.integerValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setPageSize(context.integerValue("DescribeDBInstancesResponse.PageSize"));
		describeDBInstancesResponse.setTotalCount(context.integerValue("DescribeDBInstancesResponse.TotalCount"));

		List<DBInstance> dBInstances = new ArrayList<DBInstance>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesResponse.DBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setDBInstanceId(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceDescription(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setRegionId(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setZoneId(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setEngine(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setEngineVersion(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setDBInstanceClass(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceClass"));
			dBInstance.setDBInstanceStorage(context.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceStorage"));
			dBInstance.setDBInstanceStatus(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setLockMode(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setChargeType(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ChargeType"));
			dBInstance.setNetworkType(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].NetworkType"));
			dBInstance.setCreationTime(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setExpireTime(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setDBInstanceType(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setLastDowngradeTime(context.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].LastDowngradeTime"));

			List<MongosAttribute> mongosList = new ArrayList<MongosAttribute>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList.Length"); j++) {
				MongosAttribute mongosAttribute = new MongosAttribute();
				mongosAttribute.setNodeId(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeId"));
				mongosAttribute.setNodeDescription(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeDescription"));
				mongosAttribute.setNodeClass(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeClass"));
				mongosAttribute.setConnectSting(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList["+ j +"].ConnectSting"));
				mongosAttribute.setPort(context.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MongosList["+ j +"].Port"));

				mongosList.add(mongosAttribute);
			}
			dBInstance.setMongosList(mongosList);

			List<ShardAttribute> shardList = new ArrayList<ShardAttribute>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList.Length"); j++) {
				ShardAttribute shardAttribute = new ShardAttribute();
				shardAttribute.setNodeId(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeId"));
				shardAttribute.setNodeDescription(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeDescription"));
				shardAttribute.setNodeClass(context.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeClass"));
				shardAttribute.setNodeStorage(context.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeStorage"));

				shardList.add(shardAttribute);
			}
			dBInstance.setShardList(shardList);

			dBInstances.add(dBInstance);
		}
		describeDBInstancesResponse.setDBInstances(dBInstances);
	 
	 	return describeDBInstancesResponse;
	}
}