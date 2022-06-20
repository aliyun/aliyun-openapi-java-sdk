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

import com.aliyuncs.iot.model.v20180120.ImportDeviceResponse;
import com.aliyuncs.iot.model.v20180120.ImportDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportDeviceResponseUnmarshaller {

	public static ImportDeviceResponse unmarshall(ImportDeviceResponse importDeviceResponse, UnmarshallerContext _ctx) {
		
		importDeviceResponse.setRequestId(_ctx.stringValue("ImportDeviceResponse.RequestId"));
		importDeviceResponse.setSuccess(_ctx.booleanValue("ImportDeviceResponse.Success"));
		importDeviceResponse.setCode(_ctx.stringValue("ImportDeviceResponse.Code"));
		importDeviceResponse.setErrorMessage(_ctx.stringValue("ImportDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setIotId(_ctx.stringValue("ImportDeviceResponse.Data.IotId"));
		data.setProductKey(_ctx.stringValue("ImportDeviceResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("ImportDeviceResponse.Data.DeviceName"));
		data.setDeviceSecret(_ctx.stringValue("ImportDeviceResponse.Data.DeviceSecret"));
		data.setSn(_ctx.stringValue("ImportDeviceResponse.Data.Sn"));
		data.setNickname(_ctx.stringValue("ImportDeviceResponse.Data.Nickname"));
		importDeviceResponse.setData(data);
	 
	 	return importDeviceResponse;
	}
}