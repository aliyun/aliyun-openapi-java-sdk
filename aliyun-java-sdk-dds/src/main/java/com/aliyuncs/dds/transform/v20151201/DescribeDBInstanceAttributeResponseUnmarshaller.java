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
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceAttributeResponse.DBInstance.NetworkAddress;
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
			dBInstance.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setReplacateId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplacateId"));
			dBInstance.setVpcAuthMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VpcAuthMode"));
			dBInstance.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkType"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxIOPS"));
			dBInstance.setMaxMBPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxMBPS"));
			dBInstance.setVPCCloudInstanceIds(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCCloudInstanceIds"));
			dBInstance.setProtocolType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ProtocolType"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CurrentKernelVersion"));
			dBInstance.setDBInstanceReleaseProtection(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceReleaseProtection"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainStartTime"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setLastDowngradeTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].LastDowngradeTime"));
			dBInstance.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaintainEndTime"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VPCId"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceStorage"));
			dBInstance.setReplicaSetName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSetName"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].VSwitchId"));
			dBInstance.setStorageEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].StorageEngine"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ResourceGroupId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MaxConnections"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceClass"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setReadonlyReplicas(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReadonlyReplicas"));
			dBInstance.setReplicationFactor(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicationFactor"));
			dBInstance.setKindCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].KindCode"));
			dBInstance.setCapacityUnit(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CapacityUnit"));
			dBInstance.setCloudType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].CloudType"));
			dBInstance.setChargeType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ChargeType"));
			dBInstance.setStorageType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].StorageType"));
			dBInstance.setSecondaryZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].SecondaryZoneId"));
			dBInstance.setHiddenZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].HiddenZoneId"));
			dBInstance.setDestroyTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DestroyTime"));
			dBInstance.setPaymentType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].PaymentType"));
			dBInstance.setDBInstanceOrderStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DBInstanceOrderStatus"));
			dBInstance.setEncrypted(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].Encrypted"));
			dBInstance.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].EncryptionKey"));
			dBInstance.setSyncPercent(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].SyncPercent"));
			dBInstance.setUseClusterBackup(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].UseClusterBackup"));
			dBInstance.setBurstingEnabled(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].BurstingEnabled"));
			dBInstance.setProvisionedIops(_ctx.longValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ProvisionedIops"));
			dBInstance.setDisasterRecoveryInfo(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].DisasterRecoveryInfo"));

			List<ReplicaSet> replicaSets = new ArrayList<ReplicaSet>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets.Length"); j++) {
				ReplicaSet replicaSet = new ReplicaSet();
				replicaSet.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VSwitchId"));
				replicaSet.setConnectionPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ConnectionPort"));
				replicaSet.setReplicaSetRole(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ReplicaSetRole"));
				replicaSet.setConnectionDomain(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].ConnectionDomain"));
				replicaSet.setVPCCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VPCCloudInstanceId"));
				replicaSet.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].NetworkType"));
				replicaSet.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ReplicaSets["+ j +"].VPCId"));

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

			List<MongosAttribute> mongosList = new ArrayList<MongosAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList.Length"); j++) {
				MongosAttribute mongosAttribute = new MongosAttribute();
				mongosAttribute.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VpcCloudInstanceId"));
				mongosAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].LockMode"));
				mongosAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxIOPS"));
				mongosAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VSwitchId"));
				mongosAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeClass"));
				mongosAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].MaxConnections"));
				mongosAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].Port"));
				mongosAttribute.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].VPCId"));
				mongosAttribute.setConnectSting(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].ConnectSting"));
				mongosAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeDescription"));
				mongosAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeId"));
				mongosAttribute.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].Status"));
				mongosAttribute.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].CurrentKernelVersion"));
				mongosAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].MongosList["+ j +"].ConnectString"));

				mongosList.add(mongosAttribute);
			}
			dBInstance.setMongosList(mongosList);

			List<ShardAttribute> shardList = new ArrayList<ShardAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList.Length"); j++) {
				ShardAttribute shardAttribute = new ShardAttribute();
				shardAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].LockMode"));
				shardAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxIOPS"));
				shardAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].ConnectString"));
				shardAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeClass"));
				shardAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxConnections"));
				shardAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].Port"));
				shardAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeDescription"));
				shardAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeId"));
				shardAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeStorage"));
				shardAttribute.setReadonlyReplicas(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].ReadonlyReplicas"));
				shardAttribute.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].Status"));
				shardAttribute.setMaxDiskMbps(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].MaxDiskMbps"));
				shardAttribute.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].CurrentKernelVersion"));
				shardAttribute.setReplicaSetName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ShardList["+ j +"].ReplicaSetName"));

				shardList.add(shardAttribute);
			}
			dBInstance.setShardList(shardList);

			List<ConfigserverAttribute> configserverList = new ArrayList<ConfigserverAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList.Length"); j++) {
				ConfigserverAttribute configserverAttribute = new ConfigserverAttribute();
				configserverAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].MaxIOPS"));
				configserverAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].LockMode"));
				configserverAttribute.setConnectString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].ConnectString"));
				configserverAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeClass"));
				configserverAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].MaxConnections"));
				configserverAttribute.setPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].Port"));
				configserverAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeDescription"));
				configserverAttribute.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeId"));
				configserverAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].NodeStorage"));
				configserverAttribute.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].Status"));
				configserverAttribute.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].ConfigserverList["+ j +"].CurrentKernelVersion"));

				configserverList.add(configserverAttribute);
			}
			dBInstance.setConfigserverList(configserverList);

			List<NetworkAddress> networkAddresses = new ArrayList<NetworkAddress>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses.Length"); j++) {
				NetworkAddress networkAddress = new NetworkAddress();
				networkAddress.setNodeType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].NodeType"));
				networkAddress.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].VSwitchId"));
				networkAddress.setExpiredTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].ExpiredTime"));
				networkAddress.setNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].NetworkType"));
				networkAddress.setRole(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].Role"));
				networkAddress.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].Port"));
				networkAddress.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].VPCId"));
				networkAddress.setNetworkAddress(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].NetworkAddress"));
				networkAddress.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].NodeId"));
				networkAddress.setIPAddress(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstances["+ i +"].NetworkAddresses["+ j +"].IPAddress"));

				networkAddresses.add(networkAddress);
			}
			dBInstance.setNetworkAddresses(networkAddresses);

			dBInstances.add(dBInstance);
		}
		describeDBInstanceAttributeResponse.setDBInstances(dBInstances);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}