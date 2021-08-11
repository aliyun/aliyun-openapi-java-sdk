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

import com.aliyuncs.polardb.model.v20170801.DescribePendingMaintenanceActionResponse;
import com.aliyuncs.polardb.model.v20170801.DescribePendingMaintenanceActionResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePendingMaintenanceActionResponseUnmarshaller {

	public static DescribePendingMaintenanceActionResponse unmarshall(DescribePendingMaintenanceActionResponse describePendingMaintenanceActionResponse, UnmarshallerContext _ctx) {
		
		describePendingMaintenanceActionResponse.setRequestId(_ctx.stringValue("DescribePendingMaintenanceActionResponse.RequestId"));
		describePendingMaintenanceActionResponse.setTotalRecordCount(_ctx.integerValue("DescribePendingMaintenanceActionResponse.TotalRecordCount"));
		describePendingMaintenanceActionResponse.setPageSize(_ctx.integerValue("DescribePendingMaintenanceActionResponse.PageSize"));
		describePendingMaintenanceActionResponse.setPageNumber(_ctx.integerValue("DescribePendingMaintenanceActionResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePendingMaintenanceActionResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.integerValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].Status"));
			itemsItem.setPrepareInterval(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].PrepareInterval"));
			itemsItem.setDeadline(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].Deadline"));
			itemsItem.setDBType(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].DBType"));
			itemsItem.setTaskType(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].TaskType"));
			itemsItem.setStartTime(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].StartTime"));
			itemsItem.setDBVersion(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].DBVersion"));
			itemsItem.setModifiedTime(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].ModifiedTime"));
			itemsItem.setDBClusterId(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].DBClusterId"));
			itemsItem.setRegion(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].Region"));
			itemsItem.setResultInfo(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].ResultInfo"));
			itemsItem.setCreatedTime(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].CreatedTime"));
			itemsItem.setId(_ctx.integerValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].Id"));
			itemsItem.setSwitchTime(_ctx.stringValue("DescribePendingMaintenanceActionResponse.Items["+ i +"].SwitchTime"));

			items.add(itemsItem);
		}
		describePendingMaintenanceActionResponse.setItems(items);
	 
	 	return describePendingMaintenanceActionResponse;
	}
}