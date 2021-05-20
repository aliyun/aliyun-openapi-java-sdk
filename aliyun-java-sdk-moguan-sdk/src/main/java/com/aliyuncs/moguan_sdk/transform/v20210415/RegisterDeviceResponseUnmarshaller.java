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

package com.aliyuncs.moguan_sdk.transform.v20210415;

import com.aliyuncs.moguan_sdk.model.v20210415.RegisterDeviceResponse;
import com.aliyuncs.moguan_sdk.model.v20210415.RegisterDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterDeviceResponseUnmarshaller {

	public static RegisterDeviceResponse unmarshall(RegisterDeviceResponse registerDeviceResponse, UnmarshallerContext _ctx) {
		
		registerDeviceResponse.setRequestId(_ctx.stringValue("RegisterDeviceResponse.RequestId"));
		registerDeviceResponse.setMessage(_ctx.stringValue("RegisterDeviceResponse.Message"));
		registerDeviceResponse.setErrorCode(_ctx.integerValue("RegisterDeviceResponse.ErrorCode"));
		registerDeviceResponse.setErrorMessage(_ctx.stringValue("RegisterDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setRid(_ctx.stringValue("RegisterDeviceResponse.Data.Rid"));
		registerDeviceResponse.setData(data);
	 
	 	return registerDeviceResponse;
	}
}