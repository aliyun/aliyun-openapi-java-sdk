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
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setMaintainTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setAccountType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setDedicatedHostGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DedicatedHostGroupId"));
			dBInstanceAttribute.setInsId(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InsId"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setSuperPermissionMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SuperPermissionMode"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setMasterInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxConnections(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMaxConnections"));
			dBInstanceAttribute.setAutoUpgradeMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AutoUpgradeMinorVersion"));
			dBInstanceAttribute.setMultipleTempUpgrade(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MultipleTempUpgrade"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setAccountMaxQuantity(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setSupportCreateSuperAccount(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportCreateSuperAccount"));
			dBInstanceAttribute.setMasterZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterZone"));
			dBInstanceAttribute.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setTimeZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TimeZone"));
			dBInstanceAttribute.setCanTempUpgrade(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CanTempUpgrade"));
			dBInstanceAttribute.setLatestKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LatestKernelVersion"));
			dBInstanceAttribute.setTipsLevel(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TipsLevel"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setTempUpgradeRecoveryTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryTime"));
			dBInstanceAttribute.setDispenseMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DispenseMode"));
			dBInstanceAttribute.setTempUpgradeRecoveryMemory(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMemory"));
			dBInstanceAttribute.setReplicateId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReplicateId"));
			dBInstanceAttribute.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setSupportUpgradeAccountType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setAdvancedFeatures(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AdvancedFeatures"));
			dBInstanceAttribute.setDBInstanceStorageType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setIPType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IPType"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setConsoleVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConsoleVersion"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setGeneralGroupName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GeneralGroupName"));
			dBInstanceAttribute.setOriginConfiguration(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].OriginConfiguration"));
			dBInstanceAttribute.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcCloudInstanceId"));
			dBInstanceAttribute.setCollation(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Collation"));
			dBInstanceAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setMaxIOMBPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxIOMBPS"));
			dBInstanceAttribute.setTips(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Tips"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setSecurityIPMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPMode"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setGuardDBInstanceName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GuardDBInstanceName"));
			dBInstanceAttribute.setDBInstanceDiskUsed(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDiskUsed"));
			dBInstanceAttribute.setProxyType(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ProxyType"));
			dBInstanceAttribute.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CurrentKernelVersion"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setTempUpgradeRecoveryClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryClass"));
			dBInstanceAttribute.setTempUpgradeTimeStart(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeTimeStart"));
			dBInstanceAttribute.setDBInstanceCPU(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxIOPS(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMaxIOPS"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBMaxQuantity(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setReadonlyInstanceSQLDelayedTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadonlyInstanceSQLDelayedTime"));
			dBInstanceAttribute.setTempUpgradeTimeEnd(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeTimeEnd"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setCategory(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setTempUpgradeRecoveryCpu(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryCpu"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setDeletionProtection(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DeletionProtection"));

			Extra extra = new Extra();
			extra.setReplicaGroupStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ReplicaGroupStatus"));
			extra.setActiveReplicaDBInstanceID(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ActiveReplicaDBInstanceID"));
			extra.setReplicaGroupID(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ReplicaGroupID"));

			List<String> dBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.DBInstanceIds.Length"); j++) {
				dBInstanceIds.add(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.DBInstanceIds["+ j +"]"));
			}
			extra.setDBInstanceIds(dBInstanceIds);
			dBInstanceAttribute.setExtra(extra);

			ServerlessConfig serverlessConfig = new ServerlessConfig();
			serverlessConfig.setScaleMin(_ctx.doubleValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessConfig.ScaleMin"));
			serverlessConfig.setScaleMax(_ctx.doubleValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessConfig.ScaleMax"));
			dBInstanceAttribute.setServerlessConfig(serverlessConfig);

			BabelfishConfig babelfishConfig = new BabelfishConfig();
			babelfishConfig.setBabelfishEnabled(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].BabelfishConfig.BabelfishEnabled"));
			babelfishConfig.setMigrationMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].BabelfishConfig.MigrationMode"));
			dBInstanceAttribute.setBabelfishConfig(babelfishConfig);

			List<SlaveZone> slaveZones = new ArrayList<SlaveZone>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SlaveZones.Length"); j++) {
				SlaveZone slaveZone = new SlaveZone();
				slaveZone.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SlaveZones["+ j +"].ZoneId"));

				slaveZones.add(slaveZone);
			}
			dBInstanceAttribute.setSlaveZones(slaveZones);

			List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
				readOnlyDBInstanceId.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadOnlyDBInstanceIds["+ j +"].DBInstanceId"));

				readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
			}
			dBInstanceAttribute.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			items.add(dBInstanceAttribute);
		}
		describeDBInstanceAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}