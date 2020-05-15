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

import com.aliyuncs.iovcc.model.v20180501.FindVersionGroupDevicesResponse;
import com.aliyuncs.iovcc.model.v20180501.FindVersionGroupDevicesResponse.GroupDeviceList;
import com.aliyuncs.iovcc.model.v20180501.FindVersionGroupDevicesResponse.GroupDeviceList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindVersionGroupDevicesResponseUnmarshaller {

	public static FindVersionGroupDevicesResponse unmarshall(FindVersionGroupDevicesResponse findVersionGroupDevicesResponse, UnmarshallerContext _ctx) {
		
		findVersionGroupDevicesResponse.setRequestId(_ctx.stringValue("FindVersionGroupDevicesResponse.RequestId"));

		GroupDeviceList groupDeviceList = new GroupDeviceList();
		groupDeviceList.setTotalCount(_ctx.integerValue("FindVersionGroupDevicesResponse.GroupDeviceList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindVersionGroupDevicesResponse.GroupDeviceList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.stringValue("FindVersionGroupDevicesResponse.GroupDeviceList.Items["+ i +"].Id"));
			itemsItem.setDeviceId(_ctx.stringValue("FindVersionGroupDevicesResponse.GroupDeviceList.Items["+ i +"].DeviceId"));
			itemsItem.setIdType(_ctx.stringValue("FindVersionGroupDevicesResponse.GroupDeviceList.Items["+ i +"].IdType"));
			itemsItem.setOriginalId(_ctx.stringValue("FindVersionGroupDevicesResponse.GroupDeviceList.Items["+ i +"].OriginalId"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindVersionGroupDevicesResponse.GroupDeviceList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindVersionGroupDevicesResponse.GroupDeviceList.Items["+ i +"].GmtCreateTimestamp"));

			items.add(itemsItem);
		}
		groupDeviceList.setItems(items);
		findVersionGroupDevicesResponse.setGroupDeviceList(groupDeviceList);
	 
	 	return findVersionGroupDevicesResponse;
	}
}