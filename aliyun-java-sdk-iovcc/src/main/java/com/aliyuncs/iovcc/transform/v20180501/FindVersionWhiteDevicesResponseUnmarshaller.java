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

import com.aliyuncs.iovcc.model.v20180501.FindVersionWhiteDevicesResponse;
import com.aliyuncs.iovcc.model.v20180501.FindVersionWhiteDevicesResponse.DeviceList;
import com.aliyuncs.iovcc.model.v20180501.FindVersionWhiteDevicesResponse.DeviceList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindVersionWhiteDevicesResponseUnmarshaller {

	public static FindVersionWhiteDevicesResponse unmarshall(FindVersionWhiteDevicesResponse findVersionWhiteDevicesResponse, UnmarshallerContext _ctx) {
		
		findVersionWhiteDevicesResponse.setRequestId(_ctx.stringValue("FindVersionWhiteDevicesResponse.RequestId"));

		DeviceList deviceList = new DeviceList();
		deviceList.setTotalCount(_ctx.integerValue("FindVersionWhiteDevicesResponse.DeviceList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindVersionWhiteDevicesResponse.DeviceList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindVersionWhiteDevicesResponse.DeviceList.Items["+ i +"].Id"));
			itemsItem.setDeviceId(_ctx.stringValue("FindVersionWhiteDevicesResponse.DeviceList.Items["+ i +"].DeviceId"));
			itemsItem.setOriginalId(_ctx.stringValue("FindVersionWhiteDevicesResponse.DeviceList.Items["+ i +"].OriginalId"));
			itemsItem.setIdType(_ctx.stringValue("FindVersionWhiteDevicesResponse.DeviceList.Items["+ i +"].IdType"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindVersionWhiteDevicesResponse.DeviceList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindVersionWhiteDevicesResponse.DeviceList.Items["+ i +"].GmtCreateTimestamp"));

			items.add(itemsItem);
		}
		deviceList.setItems(items);
		findVersionWhiteDevicesResponse.setDeviceList(deviceList);
	 
	 	return findVersionWhiteDevicesResponse;
	}
}