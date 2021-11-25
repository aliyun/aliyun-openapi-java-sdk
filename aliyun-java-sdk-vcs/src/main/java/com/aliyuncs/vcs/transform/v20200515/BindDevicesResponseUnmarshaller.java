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

import com.aliyuncs.vcs.model.v20200515.BindDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.BindDevicesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.BindDevicesResponse.Data.SubDevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindDevicesResponseUnmarshaller {

	public static BindDevicesResponse unmarshall(BindDevicesResponse bindDevicesResponse, UnmarshallerContext _ctx) {
		
		bindDevicesResponse.setRequestId(_ctx.stringValue("BindDevicesResponse.RequestId"));
		bindDevicesResponse.setCode(_ctx.stringValue("BindDevicesResponse.Code"));
		bindDevicesResponse.setMessage(_ctx.stringValue("BindDevicesResponse.Message"));

		Data data = new Data();

		List<SubDevice> subDeviceList = new ArrayList<SubDevice>();
		for (int i = 0; i < _ctx.lengthValue("BindDevicesResponse.Data.SubDeviceList.Length"); i++) {
			SubDevice subDevice = new SubDevice();
			subDevice.setSubDeviceIp(_ctx.stringValue("BindDevicesResponse.Data.SubDeviceList["+ i +"].SubDeviceIp"));
			subDevice.setSubDevicePort(_ctx.stringValue("BindDevicesResponse.Data.SubDeviceList["+ i +"].SubDevicePort"));
			subDevice.setSubDeviceName(_ctx.stringValue("BindDevicesResponse.Data.SubDeviceList["+ i +"].SubDeviceName"));
			subDevice.setSubDeviceId(_ctx.stringValue("BindDevicesResponse.Data.SubDeviceList["+ i +"].SubDeviceId"));
			subDevice.setSubDeviceNum(_ctx.stringValue("BindDevicesResponse.Data.SubDeviceList["+ i +"].SubDeviceNum"));
			subDevice.setCode(_ctx.stringValue("BindDevicesResponse.Data.SubDeviceList["+ i +"].Code"));
			subDevice.setMessage(_ctx.stringValue("BindDevicesResponse.Data.SubDeviceList["+ i +"].Message"));

			subDeviceList.add(subDevice);
		}
		data.setSubDeviceList(subDeviceList);
		bindDevicesResponse.setData(data);
	 
	 	return bindDevicesResponse;
	}
}