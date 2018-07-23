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

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstancesResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext context) {
		
		describeDBInstancesResponse.setRequestId(context.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setPageNumber(context.integerValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setTotalRecordCount(context.integerValue("DescribeDBInstancesResponse.TotalRecordCount"));
		describeDBInstancesResponse.setPageRecordCount(context.integerValue("DescribeDBInstancesResponse.PageRecordCount"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setDBInstanceId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceDescription(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setPayType(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].PayType"));
			dBInstance.setInstanceNetworkType(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstance.setConnectionMode(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ConnectionMode"));
			dBInstance.setRegionId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setZoneId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setExpireTime(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setDBInstanceStatus(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setEngine(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Engine"));
			dBInstance.setEngineVersion(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setDBInstanceNetType(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstance.setLockMode(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockMode"));
			dBInstance.setLockReason(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockReason"));
			dBInstance.setCreateTime(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].CreateTime"));
			dBInstance.setVpcId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcId"));
			dBInstance.setVSwitchId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VSwitchId"));

			items.add(dBInstance);
		}
		describeDBInstancesResponse.setItems(items);
	 
	 	return describeDBInstancesResponse;
	}
}