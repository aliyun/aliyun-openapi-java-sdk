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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeMaintenanceActionResponse;
import com.aliyuncs.adb.model.v20190315.DescribeMaintenanceActionResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMaintenanceActionResponseUnmarshaller {

	public static DescribeMaintenanceActionResponse unmarshall(DescribeMaintenanceActionResponse describeMaintenanceActionResponse, UnmarshallerContext _ctx) {
		
		describeMaintenanceActionResponse.setRequestId(_ctx.stringValue("DescribeMaintenanceActionResponse.RequestId"));
		describeMaintenanceActionResponse.setPageNumber(_ctx.integerValue("DescribeMaintenanceActionResponse.PageNumber"));
		describeMaintenanceActionResponse.setPageSize(_ctx.integerValue("DescribeMaintenanceActionResponse.PageSize"));
		describeMaintenanceActionResponse.setTotalRecordCount(_ctx.integerValue("DescribeMaintenanceActionResponse.TotalRecordCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMaintenanceActionResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].Status"));
			itemsItem.setDeadline(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].Deadline"));
			itemsItem.setPrepareInterval(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].PrepareInterval"));
			itemsItem.setDBType(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].DBType"));
			itemsItem.setStartTime(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].StartTime"));
			itemsItem.setTaskType(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].TaskType"));
			itemsItem.setDBVersion(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].DBVersion"));
			itemsItem.setDBClusterId(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].DBClusterId"));
			itemsItem.setModifiedTime(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].ModifiedTime"));
			itemsItem.setRegion(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].Region"));
			itemsItem.setResultInfo(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].ResultInfo"));
			itemsItem.setCreatedTime(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].CreatedTime"));
			itemsItem.setId(_ctx.integerValue("DescribeMaintenanceActionResponse.Items["+ i +"].Id"));
			itemsItem.setSwitchTime(_ctx.stringValue("DescribeMaintenanceActionResponse.Items["+ i +"].SwitchTime"));

			items.add(itemsItem);
		}
		describeMaintenanceActionResponse.setItems(items);
	 
	 	return describeMaintenanceActionResponse;
	}
}