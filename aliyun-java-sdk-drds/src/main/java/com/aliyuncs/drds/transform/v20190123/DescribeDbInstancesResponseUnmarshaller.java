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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDbInstancesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDbInstancesResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDbInstancesResponseUnmarshaller {

	public static DescribeDbInstancesResponse unmarshall(DescribeDbInstancesResponse describeDbInstancesResponse, UnmarshallerContext context) {
		
		describeDbInstancesResponse.setRequestId(context.stringValue("DescribeDbInstancesResponse.RequestId"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < context.lengthValue("DescribeDbInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setDBInstanceId(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceStatus(context.integerValue("DescribeDbInstancesResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setDBInstanceType(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].DBInstanceType"));
			dBInstance.setEngine(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].Engine"));
			dBInstance.setEngineVersion(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setRegionId(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setZoneId(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setDBInstanceDescription(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setInstanceNetworkType(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].InstanceNetworkType"));

			List<String> readOnlyDBInstanceId = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDbInstancesResponse.Items["+ i +"].ReadOnlyDBInstanceId.Length"); j++) {
				readOnlyDBInstanceId.add(context.stringValue("DescribeDbInstancesResponse.Items["+ i +"].ReadOnlyDBInstanceId["+ j +"]"));
			}
			dBInstance.setReadOnlyDBInstanceId(readOnlyDBInstanceId);

			items.add(dBInstance);
		}
		describeDbInstancesResponse.setItems(items);
	 
	 	return describeDbInstancesResponse;
	}
}