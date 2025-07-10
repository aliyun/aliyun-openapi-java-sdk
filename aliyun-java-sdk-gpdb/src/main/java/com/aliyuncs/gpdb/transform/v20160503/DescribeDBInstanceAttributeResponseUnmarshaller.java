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
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setCoreVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CoreVersion"));
			dBInstanceAttribute.setCpuCores(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CpuCores"));
			dBInstanceAttribute.setCpuCoresPerNode(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CpuCoresPerNode"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setDBInstanceCategory(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCategory"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceCpuCores(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCpuCores"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setDBInstanceDiskMBPS(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDiskMBPS"));
			dBInstanceAttribute.setDBInstanceGroupCount(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceGroupCount"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMode"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setDeployMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DeployMode"));
			dBInstanceAttribute.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EncryptionKey"));
			dBInstanceAttribute.setEncryptionType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EncryptionType"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setHostType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].HostType"));
			dBInstanceAttribute.setIdleTime(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].IdleTime"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainEndTime"));
			dBInstanceAttribute.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainStartTime"));
			dBInstanceAttribute.setMasterCU(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterCU"));
			dBInstanceAttribute.setMasterNodeNum(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterNodeNum"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMemoryPerNode(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MemoryPerNode"));
			dBInstanceAttribute.setMemorySize(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MemorySize"));
			dBInstanceAttribute.setMemoryUnit(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MemoryUnit"));
			dBInstanceAttribute.setMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MinorVersion"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setProdType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ProdType"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ResourceGroupId"));
			dBInstanceAttribute.setRunningTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RunningTime"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setSegDiskPerformanceLevel(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SegDiskPerformanceLevel"));
			dBInstanceAttribute.setSegNodeNum(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SegNodeNum"));
			dBInstanceAttribute.setSegmentCounts(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SegmentCounts"));
			dBInstanceAttribute.setServerlessMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessMode"));
			dBInstanceAttribute.setServerlessResource(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ServerlessResource"));
			dBInstanceAttribute.setStandbyZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StandbyZoneId"));
			dBInstanceAttribute.setStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StartTime"));
			dBInstanceAttribute.setStoragePerNode(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StoragePerNode"));
			dBInstanceAttribute.setStorageSize(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StorageSize"));
			dBInstanceAttribute.setStorageType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StorageType"));
			dBInstanceAttribute.setStorageUnit(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].StorageUnit"));
			dBInstanceAttribute.setSupportRestore(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SupportRestore"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setVectorConfigurationStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VectorConfigurationStatus"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setSegmentAISpec(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SegmentAISpec"));
			dBInstanceAttribute.setMasterAISpec(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MasterAISpec"));
			dBInstanceAttribute.setCacheStorageSize(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CacheStorageSize"));
			dBInstanceAttribute.setInstanceSpec(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceSpec"));

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