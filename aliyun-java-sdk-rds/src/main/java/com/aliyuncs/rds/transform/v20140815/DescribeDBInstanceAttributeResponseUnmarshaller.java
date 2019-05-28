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

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext context) {
		
		describeDBInstanceAttributeResponse.setRequestId(context.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setIPType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IPType"));
			dBInstanceAttribute.setDBInstanceDiskUsed(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDiskUsed"));
			dBInstanceAttribute.setGuardDBInstanceName(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GuardDBInstanceName"));
			dBInstanceAttribute.setCanTempUpgrade(context.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CanTempUpgrade"));
			dBInstanceAttribute.setTempUpgradeTimeStart(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeTimeStart"));
			dBInstanceAttribute.setTempUpgradeTimeEnd(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeTimeEnd"));
			dBInstanceAttribute.setTempUpgradeRecoveryTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryTime"));
			dBInstanceAttribute.setTempUpgradeRecoveryClass(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryClass"));
			dBInstanceAttribute.setTempUpgradeRecoveryCpu(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryCpu"));
			dBInstanceAttribute.setTempUpgradeRecoveryMemory(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMemory"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxIOPS(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMaxIOPS"));
			dBInstanceAttribute.setTempUpgradeRecoveryMaxConnections(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempUpgradeRecoveryMaxConnections"));
			dBInstanceAttribute.setInsId(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InsId"));
			dBInstanceAttribute.setDBInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setPayType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setDBInstanceClassType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setRegionId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setConnectionString(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setPort(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setEngine(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setDBInstanceClass(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceMemory(context.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceStorage(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setVpcCloudInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcCloudInstanceId"));
			dBInstanceAttribute.setDBInstanceNetType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceDescription(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setLockMode(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setReadDelayTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setDBMaxQuantity(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setAccountMaxQuantity(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setCreationTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setExpireTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setMaintainTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setAvailabilityValue(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setMaxIOPS(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setMaxConnections(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMasterInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setDBInstanceCPU(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setGuardDBInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setReplicateId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReplicateId"));
			dBInstanceAttribute.setTempDBInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setSecurityIPList(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setZoneId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setInstanceNetworkType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setDBInstanceStorageType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstanceAttribute.setAdvancedFeatures(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AdvancedFeatures"));
			dBInstanceAttribute.setCategory(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setAccountType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setSupportUpgradeAccountType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setSupportCreateSuperAccount(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportCreateSuperAccount"));
			dBInstanceAttribute.setVpcId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setConnectionMode(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setCurrentKernelVersion(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CurrentKernelVersion"));
			dBInstanceAttribute.setLatestKernelVersion(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LatestKernelVersion"));
			dBInstanceAttribute.setResourceGroupId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setReadonlyInstanceSQLDelayedTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadonlyInstanceSQLDelayedTime"));
			dBInstanceAttribute.setSecurityIPMode(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPMode"));
			dBInstanceAttribute.setTimeZone(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].TimeZone"));
			dBInstanceAttribute.setCollation(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Collation"));
			dBInstanceAttribute.setDispenseMode(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DispenseMode"));
			dBInstanceAttribute.setMasterZone(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterZone"));

			Extra extra = new Extra();
			extra.setReplicaGroupID(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ReplicaGroupID"));
			extra.setReplicaGroupStatus(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ReplicaGroupStatus"));
			extra.setActiveReplicaDBInstanceID(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.ActiveReplicaDBInstanceID"));

			List<String> dBInstanceId = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.DBInstanceId.Length"); j++) {
				dBInstanceId.add(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Extra.DBInstanceId["+ j +"]"));
			}
			extra.setDBInstanceId(dBInstanceId);
			dBInstanceAttribute.setExtra(extra);

			List<SlaveZone> slaveZones = new ArrayList<SlaveZone>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SlaveZones.Length"); j++) {
				SlaveZone slaveZone = new SlaveZone();
				slaveZone.setZoneId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SlaveZones["+ j +"].ZoneId"));

				slaveZones.add(slaveZone);
			}
			dBInstanceAttribute.setSlaveZones(slaveZones);

			List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
				readOnlyDBInstanceId.setDBInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadOnlyDBInstanceIds["+ j +"].DBInstanceId"));

				readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
			}
			dBInstanceAttribute.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			items.add(dBInstanceAttribute);
		}
		describeDBInstanceAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}