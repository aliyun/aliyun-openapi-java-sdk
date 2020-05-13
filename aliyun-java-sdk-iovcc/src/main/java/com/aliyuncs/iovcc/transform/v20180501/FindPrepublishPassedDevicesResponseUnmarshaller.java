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

import com.aliyuncs.iovcc.model.v20180501.FindPrepublishPassedDevicesResponse;
import com.aliyuncs.iovcc.model.v20180501.FindPrepublishPassedDevicesResponse.DeviceList;
import com.aliyuncs.iovcc.model.v20180501.FindPrepublishPassedDevicesResponse.DeviceList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindPrepublishPassedDevicesResponseUnmarshaller {

	public static FindPrepublishPassedDevicesResponse unmarshall(FindPrepublishPassedDevicesResponse findPrepublishPassedDevicesResponse, UnmarshallerContext _ctx) {
		
		findPrepublishPassedDevicesResponse.setRequestId(_ctx.stringValue("FindPrepublishPassedDevicesResponse.RequestId"));

		DeviceList deviceList = new DeviceList();
		deviceList.setTotalCount(_ctx.integerValue("FindPrepublishPassedDevicesResponse.DeviceList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindPrepublishPassedDevicesResponse.DeviceList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDeviceId(_ctx.stringValue("FindPrepublishPassedDevicesResponse.DeviceList.Items["+ i +"].DeviceId"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindPrepublishPassedDevicesResponse.DeviceList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindPrepublishPassedDevicesResponse.DeviceList.Items["+ i +"].GmtCreateTimestamp"));

			items.add(itemsItem);
		}
		deviceList.setItems(items);
		findPrepublishPassedDevicesResponse.setDeviceList(deviceList);
	 
	 	return findPrepublishPassedDevicesResponse;
	}
}