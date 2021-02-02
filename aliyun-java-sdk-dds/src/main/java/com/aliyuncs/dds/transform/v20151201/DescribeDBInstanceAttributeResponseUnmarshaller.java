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
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.ConfigserverAttribute;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.MongosAttribute;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.ReplicaSet;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.ShardAttribute;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstance> dBInstances = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setVPCCloudInstanceIds(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCCloudInstanceIds"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ResourceGroupId"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setReplicaSetName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSetName"));
			dBInstance.setStorageEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].StorageEngine"));
			dBInstance.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainEndTime"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkType"));
			dBInstance.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStorage"));
			dBInstance.setLastDowngradeTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LastDowngradeTime"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainStartTime"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setReplacateId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplacateId"));
			dBInstance.setDBInstanceReleaseProtection(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceReleaseProtection"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setReplicationFactor(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicationFactor"));
			dBInstance.setReadonlyReplicas(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReadonlyReplicas"));
			dBInstance.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxConnections"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceClass"));
			dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCId"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VSwitchId"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxIOPS"));
			dBInstance.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CurrentKernelVersion"));
			dBInstance.setProtocolType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ProtocolType"));
			dBInstance.setVpcAuthMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VpcAuthMode"));
			dBInstance.setChargeType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ChargeType"));
			dBInstance.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setKindCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].KindCode"));

			List<MongosAttribute> mongosList = new ArrayList<MongosAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList.Length"); j++) {
				MongosAttribute mongosAttribute = new MongosAttribute();
				mongosAttribute.setConnectSting(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].ConnectSting"));
				mongosAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeClass"));
				mongosAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeDescription"));
				mongosAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxConnections"));
				mongosAttribute.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VPCId"));
				mongosAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].Port"));
				mongosAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VSwitchId"));
				mongosAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeId"));
				mongosAttribute.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VpcCloudInstanceId"));
				mongosAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxIOPS"));

				mongosList.add(mongosAttribute);
			}
			dBInstance.setMongosList(mongosList);

			List<ShardAttribute> shardList = new ArrayList<ShardAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList.Length"); j++) {
				ShardAttribute shardAttribute = new ShardAttribute();
				shardAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeClass"));
				shardAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeDescription"));
				shardAttribute.setReadonlyReplicas(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].ReadonlyReplicas"));
				shardAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxConnections"));
				shardAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].Port"));
				shardAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeStorage"));
				shardAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeId"));
				shardAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].ConnectString"));
				shardAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxIOPS"));

				shardList.add(shardAttribute);
			}
			dBInstance.setShardList(shardList);

			List<ConfigserverAttribute> configserverList = new ArrayList<ConfigserverAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList.Length"); j++) {
				ConfigserverAttribute configserverAttribute = new ConfigserverAttribute();
				configserverAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeClass"));
				configserverAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeDescription"));
				configserverAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].MaxConnections"));
				configserverAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].Port"));
				configserverAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeStorage"));
				configserverAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeId"));
				configserverAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].ConnectString"));
				configserverAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].MaxIOPS"));

				configserverList.add(configserverAttribute);
			}
			dBInstance.setConfigserverList(configserverList);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			dBInstance.setTags(tags);

			List<ReplicaSet> replicaSets = new ArrayList<ReplicaSet>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets.Length"); j++) {
				ReplicaSet replicaSet = new ReplicaSet();
				replicaSet.setConnectionDomain(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ConnectionDomain"));
				replicaSet.setReplicaSetRole(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ReplicaSetRole"));
				replicaSet.setVPCCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VPCCloudInstanceId"));
				replicaSet.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VPCId"));
				replicaSet.setConnectionPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ConnectionPort"));
				replicaSet.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].NetworkType"));
				replicaSet.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VSwitchId"));

				replicaSets.add(replicaSet);
			}
			dBInstance.setReplicaSets(replicaSets);

			dBInstances.add(dBInstance);
		}
		describeDBInstanceAttributeResponse.setDBInstances(dBInstances);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}