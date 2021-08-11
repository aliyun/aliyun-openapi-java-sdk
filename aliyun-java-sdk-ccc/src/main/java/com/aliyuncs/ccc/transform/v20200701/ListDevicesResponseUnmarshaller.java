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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListDevicesResponse;
import com.aliyuncs.ccc.model.v20200701.ListDevicesResponse.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicesResponseUnmarshaller {

	public static ListDevicesResponse unmarshall(ListDevicesResponse listDevicesResponse, UnmarshallerContext _ctx) {
		
		listDevicesResponse.setRequestId(_ctx.stringValue("ListDevicesResponse.RequestId"));
		listDevicesResponse.setCode(_ctx.stringValue("ListDevicesResponse.Code"));
		listDevicesResponse.setHttpStatusCode(_ctx.integerValue("ListDevicesResponse.HttpStatusCode"));
		listDevicesResponse.setMessage(_ctx.stringValue("ListDevicesResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicesResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListDevicesResponse.Params["+ i +"]"));
		}
		listDevicesResponse.setParams(params);

		List<Device> data = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicesResponse.Data.Length"); i++) {
			Device device = new Device();
			device.setCallId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].CallId"));
			device.setContact(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].Contact"));
			device.setDeviceId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].DeviceId"));
			device.setExpires(_ctx.longValue("ListDevicesResponse.Data["+ i +"].Expires"));
			device.setExtension(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].Extension"));
			device.setInstanceId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].InstanceId"));
			device.setUserId(_ctx.stringValue("ListDevicesResponse.Data["+ i +"].UserId"));

			data.add(device);
		}
		listDevicesResponse.setData(data);
	 
	 	return listDevicesResponse;
	}
}