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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceAttributeResponse.DBInstanceAttribute;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setDBInstanceCpuCores(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCpuCores"));
			dBInstanceAttribute.setSegmentCounts(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SegmentCounts"));
			dBInstanceAttribute.setStoragePerNode(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StoragePerNode"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setHostType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].HostType"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setStorageType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StorageType"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setCpuCoresPerNode(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CpuCoresPerNode"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setStorageUnit(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StorageUnit"));
			dBInstanceAttribute.setMemoryPerNode(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MemoryPerNode"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setMemoryUnit(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MemoryUnit"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setDBInstanceGroupCount(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceGroupCount"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainStartTime"));
			dBInstanceAttribute.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainEndTime"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setDBInstanceDiskMBPS(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDiskMBPS"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setDBInstanceCategory(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCategory"));
			dBInstanceAttribute.setCpuCores(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CpuCores"));
			dBInstanceAttribute.setMemorySize(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MemorySize"));
			dBInstanceAttribute.setStorageSize(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StorageSize"));
			dBInstanceAttribute.setSegNodeNum(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SegNodeNum"));
			dBInstanceAttribute.setMasterNodeNum(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterNodeNum"));
			dBInstanceAttribute.setDBInstanceMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMode"));
			dBInstanceAttribute.setMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MinorVersion"));
			dBInstanceAttribute.setSupportRestore(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportRestore"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EncryptionKey"));
			dBInstanceAttribute.setEncryptionType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EncryptionType"));
			dBInstanceAttribute.setCoreVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CoreVersion"));
			dBInstanceAttribute.setRunningTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RunningTime"));
			dBInstanceAttribute.setStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StartTime"));
			dBInstanceAttribute.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setServerlessResource(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessResource"));
			dBInstanceAttribute.setIdleTime(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IdleTime"));
			dBInstanceAttribute.setServerlessMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessMode"));
			dBInstanceAttribute.setSegDiskPerformanceLevel(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SegDiskPerformanceLevel"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBInstanceAttribute.setTags(tags);

			items.add(dBInstanceAttribute);
		}
		describeDBInstanceAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}