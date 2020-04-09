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
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ResourceGroupId"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setStorageEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].StorageEngine"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceClass"));
			dBInstance.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStorage"));
			dBInstance.setReplacateId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplacateId"));
			dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCId"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VSwitchId"));
			dBInstance.setVPCCloudInstanceIds(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCCloudInstanceIds"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setChargeType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ChargeType"));
			dBInstance.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setReplicaSetName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSetName"));
			dBInstance.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkType"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainStartTime"));
			dBInstance.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainEndTime"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setLastDowngradeTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LastDowngradeTime"));
			dBInstance.setReplicationFactor(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicationFactor"));
			dBInstance.setReadonlyReplicas(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReadonlyReplicas"));
			dBInstance.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxIOPS"));
			dBInstance.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxConnections"));
			dBInstance.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CurrentKernelVersion"));
			dBInstance.setProtocolType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ProtocolType"));
			dBInstance.setVpcAuthMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VpcAuthMode"));

			List<MongosAttribute> mongosList = new ArrayList<MongosAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList.Length"); j++) {
				MongosAttribute mongosAttribute = new MongosAttribute();
				mongosAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeId"));
				mongosAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeDescription"));
				mongosAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeClass"));
				mongosAttribute.setConnectSting(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].ConnectSting"));
				mongosAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxIOPS"));
				mongosAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxConnections"));
				mongosAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].Port"));
				mongosAttribute.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VpcCloudInstanceId"));
				mongosAttribute.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VPCId"));
				mongosAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VSwitchId"));

				mongosList.add(mongosAttribute);
			}
			dBInstance.setMongosList(mongosList);

			List<ShardAttribute> shardList = new ArrayList<ShardAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList.Length"); j++) {
				ShardAttribute shardAttribute = new ShardAttribute();
				shardAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeId"));
				shardAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeDescription"));
				shardAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeClass"));
				shardAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeStorage"));
				shardAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxIOPS"));
				shardAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxConnections"));
				shardAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].ConnectString"));
				shardAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].Port"));

				shardList.add(shardAttribute);
			}
			dBInstance.setShardList(shardList);

			List<ConfigserverAttribute> configserverList = new ArrayList<ConfigserverAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList.Length"); j++) {
				ConfigserverAttribute configserverAttribute = new ConfigserverAttribute();
				configserverAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeId"));
				configserverAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeDescription"));
				configserverAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeClass"));
				configserverAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeStorage"));
				configserverAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].MaxIOPS"));
				configserverAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].MaxConnections"));
				configserverAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].ConnectString"));
				configserverAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].Port"));

				configserverList.add(configserverAttribute);
			}
			dBInstance.setConfigserverList(configserverList);

			List<ReplicaSet> replicaSets = new ArrayList<ReplicaSet>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets.Length"); j++) {
				ReplicaSet replicaSet = new ReplicaSet();
				replicaSet.setReplicaSetRole(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ReplicaSetRole"));
				replicaSet.setConnectionDomain(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ConnectionDomain"));
				replicaSet.setConnectionPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ConnectionPort"));
				replicaSet.setVPCCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VPCCloudInstanceId"));
				replicaSet.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VPCId"));
				replicaSet.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VSwitchId"));
				replicaSet.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].NetworkType"));

				replicaSets.add(replicaSet);
			}
			dBInstance.setReplicaSets(replicaSets);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBInstance.setTags(tags);

			dBInstances.add(dBInstance);
		}
		describeDBInstanceAttributeResponse.setDBInstances(dBInstances);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}