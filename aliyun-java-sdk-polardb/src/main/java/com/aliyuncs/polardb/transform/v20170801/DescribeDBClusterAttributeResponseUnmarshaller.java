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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse.DBClusterAttribute;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse.DBClusterAttribute.DbInstance;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAttributeResponseUnmarshaller {

	public static DescribeDBClusterAttributeResponse unmarshall(DescribeDBClusterAttributeResponse describeDBClusterAttributeResponse, UnmarshallerContext context) {
		
		describeDBClusterAttributeResponse.setRequestId(context.stringValue("DescribeDBClusterAttributeResponse.RequestId"));

		List<DBClusterAttribute> items = new ArrayList<DBClusterAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeDBClusterAttributeResponse.Items.Length"); i++) {
			DBClusterAttribute dBClusterAttribute = new DBClusterAttribute();
			dBClusterAttribute.setRegionId(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].RegionId"));
			dBClusterAttribute.setDBClusterNetworkType(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterNetworkType"));
			dBClusterAttribute.setVPCId(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].VPCId"));
			dBClusterAttribute.setVSwitchId(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].VSwitchId"));
			dBClusterAttribute.setPayType(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].PayType"));
			dBClusterAttribute.setDBClusterId(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterId"));
			dBClusterAttribute.setDBClusterStatus(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterStatus"));
			dBClusterAttribute.setDBClusterDescription(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterDescription"));
			dBClusterAttribute.setEngine(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Engine"));
			dBClusterAttribute.setDBType(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBType"));
			dBClusterAttribute.setDBVersion(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBVersion"));
			dBClusterAttribute.setDBClusterStorage(context.longValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterStorage"));
			dBClusterAttribute.setConnectionString(context.longValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ConnectionString"));
			dBClusterAttribute.setPort(context.longValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Port"));
			dBClusterAttribute.setDBClusterNetType(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterNetType"));
			dBClusterAttribute.setLockMode(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].LockMode"));
			dBClusterAttribute.setLockReason(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].LockReason"));
			dBClusterAttribute.setCreationTime(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].CreationTime"));
			dBClusterAttribute.setExpireTime(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ExpireTime"));

			List<DbInstance> dbInstances = new ArrayList<DbInstance>();
			for (int j = 0; j < context.lengthValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances.Length"); j++) {
				DbInstance dbInstance = new DbInstance();
				dbInstance.setDBInstanceId(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].DBInstanceId"));
				dbInstance.setDBInstanceStatus(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].DBInstanceStatus"));
				dbInstance.setDBInstanceDescription(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].DBInstanceDescription"));
				dbInstance.setEngine(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].Engine"));
				dbInstance.setDBType(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].DBType"));
				dbInstance.setDBVersion(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].DBVersion"));
				dbInstance.setDBInstanceStorage(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].DBInstanceStorage"));
				dbInstance.setLockMode(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].LockMode"));
				dbInstance.setLockReason(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].LockReason"));
				dbInstance.setMaintainStartTime(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].MaintainStartTime"));
				dbInstance.setMaintainEndTime(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].MaintainEndTime"));
				dbInstance.setCreationTime(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].CreationTime"));
				dbInstance.setDBInstanceClass(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].DBInstanceClass"));
				dbInstance.setSecurityIPList(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].SecurityIPList"));
				dbInstance.setDBInstanceType(context.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DbInstances["+ j +"].DBInstanceType"));

				dbInstances.add(dbInstance);
			}
			dBClusterAttribute.setDbInstances(dbInstances);

			items.add(dBClusterAttribute);
		}
		describeDBClusterAttributeResponse.setItems(items);
	 
	 	return describeDBClusterAttributeResponse;
	}
}