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

import com.aliyuncs.iovcc.model.v20180501.ListDeviceTypesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListDeviceTypesResponse.DeviceTypesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceTypesResponseUnmarshaller {

	public static ListDeviceTypesResponse unmarshall(ListDeviceTypesResponse listDeviceTypesResponse, UnmarshallerContext _ctx) {
		
		listDeviceTypesResponse.setRequestId(_ctx.stringValue("ListDeviceTypesResponse.RequestId"));

		List<DeviceTypesItem> deviceTypes = new ArrayList<DeviceTypesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceTypesResponse.DeviceTypes.Length"); i++) {
			DeviceTypesItem deviceTypesItem = new DeviceTypesItem();
			deviceTypesItem.setDeviceType(_ctx.stringValue("ListDeviceTypesResponse.DeviceTypes["+ i +"].DeviceType"));
			deviceTypesItem.setName(_ctx.stringValue("ListDeviceTypesResponse.DeviceTypes["+ i +"].Name"));

			deviceTypes.add(deviceTypesItem);
		}
		listDeviceTypesResponse.setDeviceTypes(deviceTypes);
	 
	 	return listDeviceTypesResponse;
	}
}