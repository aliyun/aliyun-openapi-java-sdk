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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.PushQueryDeviceStateResponse;
import com.aliyuncs.mpaas.model.v20201028.PushQueryDeviceStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushQueryDeviceStateResponseUnmarshaller {

	public static PushQueryDeviceStateResponse unmarshall(PushQueryDeviceStateResponse pushQueryDeviceStateResponse, UnmarshallerContext _ctx) {
		
		pushQueryDeviceStateResponse.setRequestId(_ctx.stringValue("PushQueryDeviceStateResponse.RequestId"));
		pushQueryDeviceStateResponse.setSuccess(_ctx.booleanValue("PushQueryDeviceStateResponse.Success"));
		pushQueryDeviceStateResponse.setCode(_ctx.stringValue("PushQueryDeviceStateResponse.Code"));
		pushQueryDeviceStateResponse.setMessage(_ctx.stringValue("PushQueryDeviceStateResponse.Message"));

		Data data = new Data();
		data.setUserId(_ctx.stringValue("PushQueryDeviceStateResponse.Data.UserId"));
		data.setDeviceId(_ctx.stringValue("PushQueryDeviceStateResponse.Data.DeviceId"));
		data.setDeliveryToken(_ctx.stringValue("PushQueryDeviceStateResponse.Data.DeliveryToken"));
		data.setThirdToken(_ctx.stringValue("PushQueryDeviceStateResponse.Data.ThirdToken"));
		data.setPlatform(_ctx.stringValue("PushQueryDeviceStateResponse.Data.Platform"));
		data.setManufacturer(_ctx.stringValue("PushQueryDeviceStateResponse.Data.Manufacturer"));
		data.setStatue(_ctx.stringValue("PushQueryDeviceStateResponse.Data.Statue"));
		pushQueryDeviceStateResponse.setData(data);
	 
	 	return pushQueryDeviceStateResponse;
	}
}