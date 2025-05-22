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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesForCloneResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesForCloneResponse.DBInstance;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesForCloneResponse.DBInstance.ReadOnlyDBInstanceId;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesForCloneResponseUnmarshaller {

	public static DescribeDBInstancesForCloneResponse unmarshall(DescribeDBInstancesForCloneResponse describeDBInstancesForCloneResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesForCloneResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.RequestId"));
		describeDBInstancesForCloneResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancesForCloneResponse.PageNumber"));
		describeDBInstancesForCloneResponse.setPageRecordCount(_ctx.integerValue("DescribeDBInstancesForCloneResponse.PageRecordCount"));
		describeDBInstancesForCloneResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBInstancesForCloneResponse.TotalRecordCount"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesForCloneResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setCategory(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].Category"));
			dBInstance.setConnectionMode(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].ConnectionMode"));
			dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].CreateTime"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].DBInstanceClass"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setDBInstanceStorageType(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].DBInstanceType"));
			dBInstance.setDestroyTime(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].DestroyTime"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].Engine"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstance.setInsId(_ctx.integerValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].InsId"));
			dBInstance.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].LockMode"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].LockReason"));
			dBInstance.setMasterInstanceId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].MasterInstanceId"));
			dBInstance.setMutriORsignle(_ctx.booleanValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].MutriORsignle"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].PayType"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].RegionId"));
			dBInstance.setReplicateId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].ReplicateId"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].ResourceGroupId"));
			dBInstance.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].VSwitchId"));
			dBInstance.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].VpcCloudInstanceId"));
			dBInstance.setVpcId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].VpcId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].ZoneId"));

			List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
				readOnlyDBInstanceId.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesForCloneResponse.Items["+ i +"].ReadOnlyDBInstanceIds["+ j +"].DBInstanceId"));

				readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
			}
			dBInstance.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			items.add(dBInstance);
		}
		describeDBInstancesForCloneResponse.setItems(items);
	 
	 	return describeDBInstancesForCloneResponse;
	}
}