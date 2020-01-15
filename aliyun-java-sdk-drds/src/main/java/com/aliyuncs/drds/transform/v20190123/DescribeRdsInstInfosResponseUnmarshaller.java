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

import com.aliyuncs.drds.model.v20190123.DescribeRdsInstInfosResponse;
import com.aliyuncs.drds.model.v20190123.DescribeRdsInstInfosResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsInstInfosResponseUnmarshaller {

	public static DescribeRdsInstInfosResponse unmarshall(DescribeRdsInstInfosResponse describeRdsInstInfosResponse, UnmarshallerContext _ctx) {
		
		describeRdsInstInfosResponse.setRequestId(_ctx.stringValue("DescribeRdsInstInfosResponse.RequestId"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsInstInfosResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceStatus(_ctx.integerValue("DescribeRdsInstInfosResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].DBInstanceType"));
			dBInstance.setEngine(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].Engine"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].RegionId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].ZoneId"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setInstanceNetworkType(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].InstanceNetworkType"));

			List<String> readOnlyDBInstanceId = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRdsInstInfosResponse.Items["+ i +"].ReadOnlyDBInstanceId.Length"); j++) {
				readOnlyDBInstanceId.add(_ctx.stringValue("DescribeRdsInstInfosResponse.Items["+ i +"].ReadOnlyDBInstanceId["+ j +"]"));
			}
			dBInstance.setReadOnlyDBInstanceId(readOnlyDBInstanceId);

			items.add(dBInstance);
		}
		describeRdsInstInfosResponse.setItems(items);
	 
	 	return describeRdsInstInfosResponse;
	}
}