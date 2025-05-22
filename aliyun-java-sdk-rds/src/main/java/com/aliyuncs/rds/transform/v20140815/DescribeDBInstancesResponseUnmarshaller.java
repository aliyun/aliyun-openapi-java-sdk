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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesResponse.DBInstance.ReadOnlyDBInstanceId;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setNextToken(_ctx.stringValue("DescribeDBInstancesResponse.NextToken"));
		describeDBInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setPageRecordCount(_ctx.integerValue("DescribeDBInstancesResponse.PageRecordCount"));
		describeDBInstancesResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBInstancesResponse.TotalRecordCount"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setAutoUpgradeMinorVersion(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].AutoUpgradeMinorVersion"));
			dBInstance.setBpeEnabled(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].BpeEnabled"));
			dBInstance.setBurstingEnabled(_ctx.booleanValue("DescribeDBInstancesResponse.Items["+ i +"].BurstingEnabled"));
			dBInstance.setCategory(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Category"));
			dBInstance.setColdDataEnabled(_ctx.booleanValue("DescribeDBInstancesResponse.Items["+ i +"].ColdDataEnabled"));
			dBInstance.setConnectionMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ConnectionMode"));
			dBInstance.setConnectionString(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ConnectionString"));
			dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].CreateTime"));
			dBInstance.setDBInstanceCPU(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceClass"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceMemory(_ctx.integerValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstance.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setDBInstanceStorageType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceType"));
			dBInstance.setDedicatedHostGroupId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostGroupId"));
			dBInstance.setDedicatedHostGroupName(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostGroupName"));
			dBInstance.setDedicatedHostIdForLog(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostIdForLog"));
			dBInstance.setDedicatedHostIdForMaster(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostIdForMaster"));
			dBInstance.setDedicatedHostIdForSlave(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostIdForSlave"));
			dBInstance.setDedicatedHostNameForLog(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostNameForLog"));
			dBInstance.setDedicatedHostNameForMaster(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostNameForMaster"));
			dBInstance.setDedicatedHostNameForSlave(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostNameForSlave"));
			dBInstance.setDedicatedHostZoneIdForLog(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostZoneIdForLog"));
			dBInstance.setDedicatedHostZoneIdForMaster(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostZoneIdForMaster"));
			dBInstance.setDedicatedHostZoneIdForSlave(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostZoneIdForSlave"));
			dBInstance.setDeletionProtection(_ctx.booleanValue("DescribeDBInstancesResponse.Items["+ i +"].DeletionProtection"));
			dBInstance.setDestroyTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DestroyTime"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Engine"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setGeneralGroupName(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].GeneralGroupName"));
			dBInstance.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstance.setInsId(_ctx.integerValue("DescribeDBInstancesResponse.Items["+ i +"].InsId"));
			dBInstance.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstance.setIoAccelerationEnabled(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].IoAccelerationEnabled"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockMode"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockReason"));
			dBInstance.setMasterInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].MasterInstanceId"));
			dBInstance.setMutriORsignle(_ctx.booleanValue("DescribeDBInstancesResponse.Items["+ i +"].MutriORsignle"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].PayType"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setReplicateId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ReplicateId"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ResourceGroupId"));
			dBInstance.setSwitchWeight(_ctx.integerValue("DescribeDBInstancesResponse.Items["+ i +"].SwitchWeight"));
			dBInstance.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstance.setTips(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tips"));
			dBInstance.setTipsLevel(_ctx.integerValue("DescribeDBInstancesResponse.Items["+ i +"].TipsLevel"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VSwitchId"));
			dBInstance.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcCloudInstanceId"));
			dBInstance.setVpcId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcId"));
			dBInstance.setVpcName(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcName"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setBlueGreenDeploymentName(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].BlueGreenDeploymentName"));
			dBInstance.setBlueInstanceName(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].BlueInstanceName"));
			dBInstance.setGreenInstanceName(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].GreenInstanceName"));

			List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.Items["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
				readOnlyDBInstanceId.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ReadOnlyDBInstanceIds["+ j +"].DBInstanceId"));

				readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
			}
			dBInstance.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			items.add(dBInstance);
		}
		describeDBInstancesResponse.setItems(items);
	 
	 	return describeDBInstancesResponse;
	}
}