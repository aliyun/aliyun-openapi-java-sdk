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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.RequestDeviceInfoResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestDeviceInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestDeviceInfoResponseUnmarshaller {

	public static RequestDeviceInfoResponse unmarshall(RequestDeviceInfoResponse requestDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		requestDeviceInfoResponse.setRequestId(_ctx.stringValue("RequestDeviceInfoResponse.RequestId"));
		requestDeviceInfoResponse.setErrorMessage(_ctx.stringValue("RequestDeviceInfoResponse.ErrorMessage"));
		requestDeviceInfoResponse.setSuccess(_ctx.booleanValue("RequestDeviceInfoResponse.Success"));
		requestDeviceInfoResponse.setErrorCode(_ctx.stringValue("RequestDeviceInfoResponse.ErrorCode"));

		Data data = new Data();
		data.setPublicIp(_ctx.stringValue("RequestDeviceInfoResponse.Data.PublicIp"));
		data.setDeviceName(_ctx.stringValue("RequestDeviceInfoResponse.Data.DeviceName"));
		data.setDeviceId(_ctx.stringValue("RequestDeviceInfoResponse.Data.DeviceId"));
		requestDeviceInfoResponse.setData(data);
	 
	 	return requestDeviceInfoResponse;
	}
}