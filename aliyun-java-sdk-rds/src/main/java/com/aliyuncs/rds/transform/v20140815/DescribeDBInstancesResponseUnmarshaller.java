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
		describeDBInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBInstancesResponse.TotalRecordCount"));
		describeDBInstancesResponse.setPageRecordCount(_ctx.integerValue("DescribeDBInstancesResponse.PageRecordCount"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setInsId(_ctx.integerValue("DescribeDBInstancesResponse.Items["+ i +"].InsId"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].PayType"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceType"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setDestroyTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DestroyTime"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Engine"));
			dBInstance.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstance.setConnectionMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ConnectionMode"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockMode"));
			dBInstance.setCategory(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Category"));
			dBInstance.setDBInstanceStorageType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceClass"));
			dBInstance.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstance.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcCloudInstanceId"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockReason"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setMutriORsignle(_ctx.booleanValue("DescribeDBInstancesResponse.Items["+ i +"].MutriORsignle"));
			dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].CreateTime"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstance.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstance.setMasterInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].MasterInstanceId"));
			dBInstance.setVpcId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcId"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VSwitchId"));
			dBInstance.setReplicateId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ReplicateId"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ResourceGroupId"));
			dBInstance.setAutoUpgradeMinorVersion(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].AutoUpgradeMinorVersion"));
			dBInstance.setDedicatedHostGroupId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostGroupId"));
			dBInstance.setDedicatedHostIdForMaster(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostIdForMaster"));
			dBInstance.setDedicatedHostIdForSlave(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostIdForSlave"));
			dBInstance.setDedicatedHostIdForLog(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostIdForLog"));
			dBInstance.setDedicatedHostNameForMaster(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostNameForMaster"));
			dBInstance.setDedicatedHostNameForSlave(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostNameForSlave"));
			dBInstance.setDedicatedHostNameForLog(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostNameForLog"));
			dBInstance.setDedicatedHostZoneIdForMaster(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostZoneIdForMaster"));
			dBInstance.setDedicatedHostZoneIdForSlave(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostZoneIdForSlave"));
			dBInstance.setDedicatedHostZoneIdForLog(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostZoneIdForLog"));
			dBInstance.setVpcName(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcName"));
			dBInstance.setDedicatedHostGroupName(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DedicatedHostGroupName"));

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