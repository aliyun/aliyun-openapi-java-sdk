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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBInstanceAttributeResponse.DBInstanceAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext context) {
		
		describeDBInstanceAttributeResponse.setRequestId(context.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setDBInstanceId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setDBClusterDescription(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterDescription"));
			dBInstanceAttribute.setDBClusterId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBClusterId"));
			dBInstanceAttribute.setPayType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setDBInstanceType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setRegionId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setZoneId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setEngine(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setDBType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBType"));
			dBInstanceAttribute.setDBVersion(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBVersion"));
			dBInstanceAttribute.setDBInstanceClass(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceStorage(context.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setDBInstanceStatus(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceDescription(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setConnectionString(context.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setPort(context.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setDBInstanceNetType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setLockMode(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setCreationTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setExpireTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setMaintainStartTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainStartTime"));
			dBInstanceAttribute.setMaintainEndTime(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainEndTime"));
			dBInstanceAttribute.setMaxConnections(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMaxIOPS(context.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setSecurityIPList(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setInstanceNetworkType(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setVpcId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setDBInstanceType1(context.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceType"));

			items.add(dBInstanceAttribute);
		}
		describeDBInstanceAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}