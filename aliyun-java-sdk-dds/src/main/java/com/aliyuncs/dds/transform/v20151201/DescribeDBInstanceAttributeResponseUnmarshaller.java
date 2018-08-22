/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.MongosAttribute;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.ShardAttribute;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext context) {
		
		describeDBInstanceAttributeResponse.setRequestId(context.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstance> dBInstances = new ArrayList<DBInstance>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setDBInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceDescription(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setRegionId(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setZoneId(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setEngine(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setEngineVersion(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setStorageEngine(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].StorageEngine"));
			dBInstance.setDBInstanceClass(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceClass"));
			dBInstance.setDBInstanceStorage(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStorage"));
			dBInstance.setReplacateId(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplacateId"));
			dBInstance.setVPCId(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCId"));
			dBInstance.setVSwitchId(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VSwitchId"));
			dBInstance.setDBInstanceStatus(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setLockMode(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setChargeType(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ChargeType"));
			dBInstance.setCreationTime(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setReplicaSetName(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSetName"));
			dBInstance.setNetworkType(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkType"));
			dBInstance.setExpireTime(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setMaintainStartTime(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainStartTime"));
			dBInstance.setMaintainEndTime(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainEndTime"));
			dBInstance.setDBInstanceType(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setLastDowngradeTime(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LastDowngradeTime"));
			dBInstance.setReplicationFactor(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicationFactor"));
			dBInstance.setMaxIOPS(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxIOPS"));
			dBInstance.setMaxConnections(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxConnections"));
			dBInstance.setCurrentKernelVersion(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CurrentKernelVersion"));

			List<MongosAttribute> mongosList = new ArrayList<MongosAttribute>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList.Length"); j++) {
				MongosAttribute mongosAttribute = new MongosAttribute();
				mongosAttribute.setNodeId(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeId"));
				mongosAttribute.setNodeDescription(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeDescription"));
				mongosAttribute.setNodeClass(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeClass"));
				mongosAttribute.setConnectSting(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].ConnectSting"));
				mongosAttribute.setMaxIOPS(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxIOPS"));
				mongosAttribute.setMaxConnections(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxConnections"));
				mongosAttribute.setPort(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].Port"));

				mongosList.add(mongosAttribute);
			}
			dBInstance.setMongosList(mongosList);

			List<ShardAttribute> shardList = new ArrayList<ShardAttribute>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList.Length"); j++) {
				ShardAttribute shardAttribute = new ShardAttribute();
				shardAttribute.setNodeId(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeId"));
				shardAttribute.setNodeDescription(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeDescription"));
				shardAttribute.setNodeClass(context.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeClass"));
				shardAttribute.setNodeStorage(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeStorage"));
				shardAttribute.setMaxIOPS(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxIOPS"));
				shardAttribute.setMaxConnections(context.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxConnections"));

				shardList.add(shardAttribute);
			}
			dBInstance.setShardList(shardList);

			dBInstances.add(dBInstance);
		}
		describeDBInstanceAttributeResponse.setDBInstances(dBInstances);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}