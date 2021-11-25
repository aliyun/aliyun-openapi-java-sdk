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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.UnbindDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.UnbindDevicesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.UnbindDevicesResponse.Data.SubDevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindDevicesResponseUnmarshaller {

	public static UnbindDevicesResponse unmarshall(UnbindDevicesResponse unbindDevicesResponse, UnmarshallerContext _ctx) {
		
		unbindDevicesResponse.setRequestId(_ctx.stringValue("UnbindDevicesResponse.RequestId"));
		unbindDevicesResponse.setCode(_ctx.stringValue("UnbindDevicesResponse.Code"));
		unbindDevicesResponse.setMessage(_ctx.stringValue("UnbindDevicesResponse.Message"));

		Data data = new Data();

		List<SubDevice> subDeviceList = new ArrayList<SubDevice>();
		for (int i = 0; i < _ctx.lengthValue("UnbindDevicesResponse.Data.SubDeviceList.Length"); i++) {
			SubDevice subDevice = new SubDevice();
			subDevice.setSubDeviceId(_ctx.stringValue("UnbindDevicesResponse.Data.SubDeviceList["+ i +"].SubDeviceId"));
			subDevice.setCode(_ctx.stringValue("UnbindDevicesResponse.Data.SubDeviceList["+ i +"].Code"));
			subDevice.setMessage(_ctx.stringValue("UnbindDevicesResponse.Data.SubDeviceList["+ i +"].Message"));

			subDeviceList.add(subDevice);
		}
		data.setSubDeviceList(subDeviceList);
		unbindDevicesResponse.setData(data);
	 
	 	return unbindDevicesResponse;
	}
}