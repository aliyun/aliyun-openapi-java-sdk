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

package com.aliyuncs.energyexpertexternal.transform.v20220923;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.energyexpertexternal.model.v20220923.GetDeviceListResponse;
import com.aliyuncs.energyexpertexternal.model.v20220923.GetDeviceListResponse.Data;
import com.aliyuncs.energyexpertexternal.model.v20220923.GetDeviceListResponse.Data.Device;
import com.aliyuncs.energyexpertexternal.model.v20220923.GetDeviceListResponse.Data.Device.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceListResponseUnmarshaller {

	public static GetDeviceListResponse unmarshall(GetDeviceListResponse getDeviceListResponse, UnmarshallerContext _ctx) {
		
		getDeviceListResponse.setRequestId(_ctx.stringValue("GetDeviceListResponse.requestId"));

		Data data = new Data();
		data.setFactoryId(_ctx.stringValue("GetDeviceListResponse.data.factoryId"));
		data.setHttpCode(_ctx.integerValue("GetDeviceListResponse.data.httpCode"));
		data.setCode(_ctx.stringValue("GetDeviceListResponse.data.code"));
		data.setErrorMessage(_ctx.stringValue("GetDeviceListResponse.data.errorMessage"));
		data.setSuccess(_ctx.booleanValue("GetDeviceListResponse.data.success"));

		List<Device> deviceList = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceListResponse.data.deviceList.Length"); i++) {
			Device device = new Device();
			device.setDeviceId(_ctx.stringValue("GetDeviceListResponse.data.deviceList["+ i +"].deviceId"));
			device.setDeviceName(_ctx.stringValue("GetDeviceListResponse.data.deviceList["+ i +"].deviceName"));
			device.setFirstTypeName(_ctx.stringValue("GetDeviceListResponse.data.deviceList["+ i +"].firstTypeName"));
			device.setSecondTypeName(_ctx.stringValue("GetDeviceListResponse.data.deviceList["+ i +"].secondTypeName"));
			device.setParentDevice(_ctx.stringValue("GetDeviceListResponse.data.deviceList["+ i +"].parentDevice"));

			Info info = new Info();
			info.setMagnification(_ctx.integerValue("GetDeviceListResponse.data.deviceList["+ i +"].info.magnification"));
			info.setPressure(_ctx.integerValue("GetDeviceListResponse.data.deviceList["+ i +"].info.pressure"));
			info.setPt(_ctx.integerValue("GetDeviceListResponse.data.deviceList["+ i +"].info.pt"));
			info.setCt(_ctx.integerValue("GetDeviceListResponse.data.deviceList["+ i +"].info.ct"));
			info.setConstKva(_ctx.integerValue("GetDeviceListResponse.data.deviceList["+ i +"].info.constKva"));
			device.setInfo(info);

			deviceList.add(device);
		}
		data.setDeviceList(deviceList);
		getDeviceListResponse.setData(data);
	 
	 	return getDeviceListResponse;
	}
}