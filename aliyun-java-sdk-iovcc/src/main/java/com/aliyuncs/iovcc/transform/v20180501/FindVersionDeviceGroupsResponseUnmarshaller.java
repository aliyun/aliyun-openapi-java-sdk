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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.FindVersionDeviceGroupsResponse;
import com.aliyuncs.iovcc.model.v20180501.FindVersionDeviceGroupsResponse.DeviceGroupList;
import com.aliyuncs.iovcc.model.v20180501.FindVersionDeviceGroupsResponse.DeviceGroupList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindVersionDeviceGroupsResponseUnmarshaller {

	public static FindVersionDeviceGroupsResponse unmarshall(FindVersionDeviceGroupsResponse findVersionDeviceGroupsResponse, UnmarshallerContext _ctx) {
		
		findVersionDeviceGroupsResponse.setRequestId(_ctx.stringValue("FindVersionDeviceGroupsResponse.RequestId"));

		DeviceGroupList deviceGroupList = new DeviceGroupList();
		deviceGroupList.setTotalCount(_ctx.integerValue("FindVersionDeviceGroupsResponse.DeviceGroupList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items["+ i +"].Name"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtModify(_ctx.stringValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items["+ i +"].GmtModify"));
			itemsItem.setDescription(_ctx.stringValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items["+ i +"].Description"));
			itemsItem.setMaxCount(_ctx.stringValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items["+ i +"].MaxCount"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items["+ i +"].GmtCreateTimestamp"));
			itemsItem.setGmtModifyTimestamp(_ctx.longValue("FindVersionDeviceGroupsResponse.DeviceGroupList.Items["+ i +"].GmtModifyTimestamp"));

			items.add(itemsItem);
		}
		deviceGroupList.setItems(items);
		findVersionDeviceGroupsResponse.setDeviceGroupList(deviceGroupList);
	 
	 	return findVersionDeviceGroupsResponse;
	}
}