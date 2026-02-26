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

import com.aliyuncs.linkvisual.model.v20180120.CreateGbDeviceResponse;
import com.aliyuncs.linkvisual.model.v20180120.CreateGbDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGbDeviceResponseUnmarshaller {

	public static CreateGbDeviceResponse unmarshall(CreateGbDeviceResponse createGbDeviceResponse, UnmarshallerContext _ctx) {
		
		createGbDeviceResponse.setRequestId(_ctx.stringValue("CreateGbDeviceResponse.RequestId"));
		createGbDeviceResponse.setCode(_ctx.stringValue("CreateGbDeviceResponse.Code"));
		createGbDeviceResponse.setErrorMessage(_ctx.stringValue("CreateGbDeviceResponse.ErrorMessage"));
		createGbDeviceResponse.setSuccess(_ctx.booleanValue("CreateGbDeviceResponse.Success"));

		Data data = new Data();
		data.setDeviceName(_ctx.stringValue("CreateGbDeviceResponse.Data.DeviceName"));
		data.setIotId(_ctx.stringValue("CreateGbDeviceResponse.Data.IotId"));
		createGbDeviceResponse.setData(data);
	 
	 	return createGbDeviceResponse;
	}
}