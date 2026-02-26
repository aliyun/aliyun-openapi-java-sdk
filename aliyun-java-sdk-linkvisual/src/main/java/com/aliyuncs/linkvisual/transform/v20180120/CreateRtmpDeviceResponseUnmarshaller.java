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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.CreateRtmpDeviceResponse;
import com.aliyuncs.linkvisual.model.v20180120.CreateRtmpDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRtmpDeviceResponseUnmarshaller {

	public static CreateRtmpDeviceResponse unmarshall(CreateRtmpDeviceResponse createRtmpDeviceResponse, UnmarshallerContext _ctx) {
		
		createRtmpDeviceResponse.setRequestId(_ctx.stringValue("CreateRtmpDeviceResponse.RequestId"));
		createRtmpDeviceResponse.setCode(_ctx.stringValue("CreateRtmpDeviceResponse.Code"));
		createRtmpDeviceResponse.setErrorMessage(_ctx.stringValue("CreateRtmpDeviceResponse.ErrorMessage"));
		createRtmpDeviceResponse.setSuccess(_ctx.booleanValue("CreateRtmpDeviceResponse.Success"));

		Data data = new Data();
		data.setDeviceName(_ctx.stringValue("CreateRtmpDeviceResponse.Data.DeviceName"));
		data.setStreamName(_ctx.stringValue("CreateRtmpDeviceResponse.Data.StreamName"));
		data.setIotId(_ctx.stringValue("CreateRtmpDeviceResponse.Data.IotId"));
		createRtmpDeviceResponse.setData(data);
	 
	 	return createRtmpDeviceResponse;
	}
}