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
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.Extra;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.ReadOnlyDBInstanceId;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.SlaveZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setIPType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IPType"));
			dBInstanceAttribute.setDBInstanceDiskUsed(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDiskUsed"));
			dBInstanceAttribute.setGuardDBInstanceName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GuardDBInstanceName"));
			dBInstanceAttribute.setCanTempUpgrade(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CanTempUpgrade"));
			dBInstanceAttribute.setTempUpgradeTimeStart(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeTimeStart"));
			dBInstanceAttribute.setTempUpgradeTimeEnd(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeTimeEnd"));
			dBInstanceAttribute.setTempUpgradeRecoveryTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryTime"));
			dBInstanceAttribute.setTempUpgradeRecoveryClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryClass"));
			dBInstanceAttribute.setTempUpgradeRecoveryCpu(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryCpu"));
			dBInstanceAttribute.setTempUpgradeRecoveryMemory(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMemory"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxIOPS(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMaxIOPS"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxConnections(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMaxConnections"));
			dBInstanceAttribute.setInsId(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InsId"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcCloudInstanceId"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setDBMaxQuantity(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setAccountMaxQuantity(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setMaintainTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMasterInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setDBInstanceCPU(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setReplicateId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReplicateId"));
			dBInstanceAttribute.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setDBInstanceStorageType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstanceAttribute.setAdvancedFeatures(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AdvancedFeatures"));
			dBInstanceAttribute.setCategory(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setAccountType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setSupportUpgradeAccountType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setSupportCreateSuperAccount(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportCreateSuperAccount"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setCurrentKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CurrentKernelVersion"));
			dBInstanceAttribute.setLatestKernelVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LatestKernelVersion"));
			dBInstanceAttribute.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setReadonlyInstanceSQLDelayedTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadonlyInstanceSQLDelayedTime"));
			dBInstanceAttribute.setSecurityIPMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPMode"));
			dBInstanceAttribute.setTimeZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TimeZone"));
			dBInstanceAttribute.setCollation(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Collation"));
			dBInstanceAttribute.setDispenseMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DispenseMode"));
			dBInstanceAttribute.setMasterZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterZone"));
			dBInstanceAttribute.setAutoUpgradeMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AutoUpgradeMinorVersion"));
			dBInstanceAttribute.setProxyType(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ProxyType"));
			dBInstanceAttribute.setConsoleVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConsoleVersion"));
			dBInstanceAttribute.setMultipleTempUpgrade(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MultipleTempUpgrade"));
			dBInstanceAttribute.setOriginConfiguration(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].OriginConfiguration"));

			Extra extra = new Extra();
			extra.setReplicaGroupID(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ReplicaGroupID"));
			extra.setReplicaGroupStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ReplicaGroupStatus"));
			extra.setActiveReplicaDBInstanceID(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ActiveReplicaDBInstanceID"));

			List<String> dBInstanceId = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.DBInstanceId.Length"); j++) {
				dBInstanceId.add(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.DBInstanceId["+ j +"]"));
			}
			extra.setDBInstanceId(dBInstanceId);
			dBInstanceAttribute.setExtra(extra);

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