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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext context) {
		
		describeDBInstanceAttributeResponse.setRequestId(context.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setDBInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setPayType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setDBInstanceClassType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setRegionId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setConnectionString(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setPort(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setEngine(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setDBInstanceClass(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceCpuCores(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCpuCores"));
			dBInstanceAttribute.setDBInstanceMemory(context.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceStorage(context.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setDBInstanceDiskMBPS(context.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDiskMBPS"));
			dBInstanceAttribute.setHostType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].HostType"));
			dBInstanceAttribute.setDBInstanceGroupCount(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceGroupCount"));
			dBInstanceAttribute.setDBInstanceNetType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceDescription(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setLockMode(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setReadDelayTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setCreationTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setExpireTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setMaintainStartTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainStartTime"));
			dBInstanceAttribute.setMaintainEndTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainEndTime"));
			dBInstanceAttribute.setAvailabilityValue(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setMaxConnections(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setSecurityIPList(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setZoneId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setInstanceNetworkType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setVpcId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setConnectionMode(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionMode"));

			items.add(dBInstanceAttribute);
		}
		describeDBInstanceAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}