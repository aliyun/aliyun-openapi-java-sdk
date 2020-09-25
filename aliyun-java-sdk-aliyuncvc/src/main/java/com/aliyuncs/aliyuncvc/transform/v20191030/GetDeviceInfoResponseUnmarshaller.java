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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.GetDeviceInfoResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.GetDeviceInfoResponse.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceInfoResponseUnmarshaller {

	public static GetDeviceInfoResponse unmarshall(GetDeviceInfoResponse getDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		getDeviceInfoResponse.setRequestId(_ctx.stringValue("GetDeviceInfoResponse.RequestId"));
		getDeviceInfoResponse.setErrorCode(_ctx.integerValue("GetDeviceInfoResponse.ErrorCode"));
		getDeviceInfoResponse.setMessage(_ctx.stringValue("GetDeviceInfoResponse.Message"));
		getDeviceInfoResponse.setSuccess(_ctx.booleanValue("GetDeviceInfoResponse.Success"));

		Device device = new Device();
		device.setActivationCode(_ctx.stringValue("GetDeviceInfoResponse.Device.ActivationCode"));
		device.setCastScreenCode(_ctx.stringValue("GetDeviceInfoResponse.Device.CastScreenCode"));
		device.setSn(_ctx.stringValue("GetDeviceInfoResponse.Device.Sn"));
		device.setStatus(_ctx.integerValue("GetDeviceInfoResponse.Device.Status"));
		device.setIP(_ctx.stringValue("GetDeviceInfoResponse.Device.IP"));
		device.setMac(_ctx.stringValue("GetDeviceInfoResponse.Device.Mac"));
		device.setSsid(_ctx.stringValue("GetDeviceInfoResponse.Device.Ssid"));
		getDeviceInfoResponse.setDevice(device);
	 
	 	return getDeviceInfoResponse;
	}
}