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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.BabelfishConfig;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.DBClusterNode;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.Extra;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.ReadOnlyDBInstanceId;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.ServerlessConfig;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.SlaveZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setAccountMaxQuantity(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setAccountType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setAdvancedFeatures(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AdvancedFeatures"));
			dBInstanceAttribute.setAutoUpgradeMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AutoUpgradeMinorVersion"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setBpeEnabled(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].BpeEnabled"));
			dBInstanceAttribute.setIsAnalyticReadOnlyIns(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IsAnalyticReadOnlyIns"));
			dBInstanceAttribute.setCanTempUpgrade(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CanTempUpgrade"));
			dBInstanceAttribute.setCategory(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setColdDataEnabled(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ColdDataEnabled"));
			dBInstanceAttribute.setCollation(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Collation"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setConsoleVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConsoleVersion"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CurrentKernelVersion"));
			dBInstanceAttribute.setDBInstanceCPU(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setDBInstanceDiskUsed(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDiskUsed"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setDBInstanceStorageType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstanceAttribute.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setDBMaxQuantity(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setDedicatedHostGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DedicatedHostGroupId"));
			dBInstanceAttribute.setDeletionProtection(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DeletionProtection"));
			dBInstanceAttribute.setDisasterRecoveryInfo(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DisasterRecoveryInfo"));
			dBInstanceAttribute.setDisasterRecoveryInstances(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DisasterRecoveryInstances"));
			dBInstanceAttribute.setDispenseMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DispenseMode"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setGeneralGroupName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GeneralGroupName"));
			dBInstanceAttribute.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setGuardDBInstanceName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GuardDBInstanceName"));
			dBInstanceAttribute.setIPType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IPType"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setInsId(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InsId"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setInstructionSetArch(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstructionSetArch"));
			dBInstanceAttribute.setIoAccelerationEnabled(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IoAccelerationEnabled"));
			dBInstanceAttribute.setLatestKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LatestKernelVersion"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setMaintainTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setMasterInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setMasterZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterZone"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMaxIOMBPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxIOMBPS"));
			dBInstanceAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setMultipleTempUpgrade(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MultipleTempUpgrade"));
			dBInstanceAttribute.setOriginConfiguration(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].OriginConfiguration"));
			dBInstanceAttribute.setPGBouncerEnabled(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PGBouncerEnabled"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setProxyType(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ProxyType"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setReadonlyInstanceSQLDelayedTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadonlyInstanceSQLDelayedTime"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setReplicateId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReplicateId"));
			dBInstanceAttribute.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setSecurityIPMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPMode"));
			dBInstanceAttribute.setSuperPermissionMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SuperPermissionMode"));
			dBInstanceAttribute.setSupportCreateSuperAccount(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportCreateSuperAccount"));
			dBInstanceAttribute.setSupportUpgradeAccountType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setTempUpgradeRecoveryClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryClass"));
			dBInstanceAttribute.setTempUpgradeRecoveryCpu(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryCpu"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxConnections(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMaxConnections"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxIOPS(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMaxIOPS"));
			dBInstanceAttribute.setTempUpgradeRecoveryMemory(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMemory"));
			dBInstanceAttribute.setTempUpgradeRecoveryTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryTime"));
			dBInstanceAttribute.setTempUpgradeTimeEnd(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeTimeEnd"));
			dBInstanceAttribute.setTempUpgradeTimeStart(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeTimeStart"));
			dBInstanceAttribute.setTimeZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TimeZone"));
			dBInstanceAttribute.setTips(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Tips"));
			dBInstanceAttribute.setTipsLevel(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TipsLevel"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcCloudInstanceId"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setKindCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].kindCode"));
			dBInstanceAttribute.setOptimizedWritesInfo(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].OptimizedWritesInfo"));
			dBInstanceAttribute.setCompressionMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CompressionMode"));
			dBInstanceAttribute.setSupportCompression(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportCompression"));
			dBInstanceAttribute.setCompressionRatio(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CompressionRatio"));
			dBInstanceAttribute.setBlueGreenDeploymentName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].BlueGreenDeploymentName"));
			dBInstanceAttribute.setGreenInstanceName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GreenInstanceName"));
			dBInstanceAttribute.setBlueInstanceName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].BlueInstanceName"));
			dBInstanceAttribute.setComputeBurstEnabled(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ComputeBurstEnabled"));
			dBInstanceAttribute.setReadOnlyStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadOnlyStatus"));
			dBInstanceAttribute.setBurstingEnabled(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].BurstingEnabled"));

			BabelfishConfig babelfishConfig = new BabelfishConfig();
			babelfishConfig.setBabelfishEnabled(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].BabelfishConfig.BabelfishEnabled"));
			babelfishConfig.setMigrationMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].BabelfishConfig.MigrationMode"));
			dBInstanceAttribute.setBabelfishConfig(babelfishConfig);

			Extra extra = new Extra();
			extra.setAccountSecurityPolicy(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.AccountSecurityPolicy"));
			extra.setActiveReplicaDBInstanceID(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ActiveReplicaDBInstanceID"));
			extra.setRecoveryModel(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.RecoveryModel"));
			extra.setReplicaGroupID(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ReplicaGroupID"));
			extra.setReplicaGroupStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ReplicaGroupStatus"));

			List<String> dBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.DBInstanceIds.Length"); j++) {
				dBInstanceIds.add(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.DBInstanceIds["+ j +"]"));
			}
			extra.setDBInstanceIds(dBInstanceIds);
			dBInstanceAttribute.setExtra(extra);

			ServerlessConfig serverlessConfig = new ServerlessConfig();
			serverlessConfig.setAutoPause(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessConfig.AutoPause"));
			serverlessConfig.setScaleMax(_ctx.doubleValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessConfig.ScaleMax"));
			serverlessConfig.setScaleMin(_ctx.doubleValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessConfig.ScaleMin"));
			serverlessConfig.setSwitchForce(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessConfig.SwitchForce"));
			dBInstanceAttribute.setServerlessConfig(serverlessConfig);

			List<DBClusterNode> dBClusterNodes = new ArrayList<DBClusterNode>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes.Length"); j++) {
				DBClusterNode dBClusterNode = new DBClusterNode();
				dBClusterNode.setClassCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].ClassCode"));
				dBClusterNode.setClassType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].ClassType"));
				dBClusterNode.setCpu(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].Cpu"));
				dBClusterNode.setMemory(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].Memory"));
				dBClusterNode.setNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].NodeId"));
				dBClusterNode.setNodeRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].NodeRegionId"));
				dBClusterNode.setNodeRole(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].NodeRole"));
				dBClusterNode.setNodeZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].NodeZoneId"));
				dBClusterNode.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterNodes["+ j +"].Status"));

				dBClusterNodes.add(dBClusterNode);
			}
			dBInstanceAttribute.setDBClusterNodes(dBClusterNodes);

			List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
				readOnlyDBInstanceId.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadOnlyDBInstanceIds["+ j +"].DBInstanceId"));

				readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
			}
			dBInstanceAttribute.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			List<SlaveZone> slaveZones = new ArrayList<SlaveZone>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SlaveZones.Length"); j++) {
				SlaveZone slaveZone = new SlaveZone();
				slaveZone.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SlaveZones["+ j +"].ZoneId"));

				slaveZones.add(slaveZone);
			}
			dBInstanceAttribute.setSlaveZones(slaveZones);

			items.add(dBInstanceAttribute);
		}
		describeDBInstanceAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}