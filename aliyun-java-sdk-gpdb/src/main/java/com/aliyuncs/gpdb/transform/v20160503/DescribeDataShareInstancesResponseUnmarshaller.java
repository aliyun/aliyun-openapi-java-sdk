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

import com.aliyuncs.gpdb.model.v20160503.DescribeDataShareInstancesResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDataShareInstancesResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataShareInstancesResponseUnmarshaller {

	public static DescribeDataShareInstancesResponse unmarshall(DescribeDataShareInstancesResponse describeDataShareInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDataShareInstancesResponse.setRequestId(_ctx.stringValue("DescribeDataShareInstancesResponse.RequestId"));
		describeDataShareInstancesResponse.setTotalRecordCount(_ctx.integerValue("DescribeDataShareInstancesResponse.TotalRecordCount"));
		describeDataShareInstancesResponse.setPageRecordCount(_ctx.integerValue("DescribeDataShareInstancesResponse.PageRecordCount"));
		describeDataShareInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDataShareInstancesResponse.PageNumber"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataShareInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setRegionId(_ctx.stringValue("DescribeDataShareInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDataShareInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDataShareInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceMode(_ctx.stringValue("DescribeDataShareInstancesResponse.Items["+ i +"].DBInstanceMode"));
			dBInstance.setDescription(_ctx.stringValue("DescribeDataShareInstancesResponse.Items["+ i +"].Description"));
			dBInstance.setDataShareStatus(_ctx.stringValue("DescribeDataShareInstancesResponse.Items["+ i +"].DataShareStatus"));

			items.add(dBInstance);
		}
		describeDataShareInstancesResponse.setItems(items);
	 
	 	return describeDataShareInstancesResponse;
	}
}