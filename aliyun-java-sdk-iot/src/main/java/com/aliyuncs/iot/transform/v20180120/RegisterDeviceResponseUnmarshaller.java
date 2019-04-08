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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.RegisterDeviceResponse;
import com.aliyuncs.iot.model.v20180120.RegisterDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterDeviceResponseUnmarshaller {

	public static RegisterDeviceResponse unmarshall(RegisterDeviceResponse registerDeviceResponse, UnmarshallerContext context) {
		
		registerDeviceResponse.setRequestId(context.stringValue("RegisterDeviceResponse.RequestId"));
		registerDeviceResponse.setSuccess(context.booleanValue("RegisterDeviceResponse.Success"));
		registerDeviceResponse.setCode(context.stringValue("RegisterDeviceResponse.Code"));
		registerDeviceResponse.setErrorMessage(context.stringValue("RegisterDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setIotId(context.stringValue("RegisterDeviceResponse.Data.IotId"));
		data.setProductKey(context.stringValue("RegisterDeviceResponse.Data.ProductKey"));
		data.setDeviceName(context.stringValue("RegisterDeviceResponse.Data.DeviceName"));
		data.setDeviceSecret(context.stringValue("RegisterDeviceResponse.Data.DeviceSecret"));
		data.setDevEui(context.stringValue("RegisterDeviceResponse.Data.DevEui"));
		data.setJoinEui(context.stringValue("RegisterDeviceResponse.Data.JoinEui"));
		data.setNickname(context.stringValue("RegisterDeviceResponse.Data.Nickname"));
		registerDeviceResponse.setData(data);
	 
	 	return registerDeviceResponse;
	}
}