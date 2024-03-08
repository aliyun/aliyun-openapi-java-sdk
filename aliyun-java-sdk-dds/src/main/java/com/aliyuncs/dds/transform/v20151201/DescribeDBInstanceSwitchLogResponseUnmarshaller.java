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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceSwitchLogResponse;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceSwitchLogResponse.LogItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceSwitchLogResponseUnmarshaller {

	public static DescribeDBInstanceSwitchLogResponse unmarshall(DescribeDBInstanceSwitchLogResponse describeDBInstanceSwitchLogResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceSwitchLogResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceSwitchLogResponse.RequestId"));
		describeDBInstanceSwitchLogResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceSwitchLogResponse.DBInstanceId"));
		describeDBInstanceSwitchLogResponse.setTotalCount(_ctx.longValue("DescribeDBInstanceSwitchLogResponse.TotalCount"));
		describeDBInstanceSwitchLogResponse.setPageSize(_ctx.longValue("DescribeDBInstanceSwitchLogResponse.PageSize"));
		describeDBInstanceSwitchLogResponse.setPageNumber(_ctx.longValue("DescribeDBInstanceSwitchLogResponse.PageNumber"));

		List<LogItemsItem> logItems = new ArrayList<LogItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceSwitchLogResponse.LogItems.Length"); i++) {
			LogItemsItem logItemsItem = new LogItemsItem();
			logItemsItem.setSwitchStatus(_ctx.stringValue("DescribeDBInstanceSwitchLogResponse.LogItems["+ i +"].SwitchStatus"));
			logItemsItem.setSwitchTime(_ctx.stringValue("DescribeDBInstanceSwitchLogResponse.LogItems["+ i +"].SwitchTime"));
			logItemsItem.setSwitchCode(_ctx.stringValue("DescribeDBInstanceSwitchLogResponse.LogItems["+ i +"].SwitchCode"));
			logItemsItem.setNodeId(_ctx.stringValue("DescribeDBInstanceSwitchLogResponse.LogItems["+ i +"].NodeId"));

			logItems.add(logItemsItem);
		}
		describeDBInstanceSwitchLogResponse.setLogItems(logItems);
	 
	 	return describeDBInstanceSwitchLogResponse;
	}
}