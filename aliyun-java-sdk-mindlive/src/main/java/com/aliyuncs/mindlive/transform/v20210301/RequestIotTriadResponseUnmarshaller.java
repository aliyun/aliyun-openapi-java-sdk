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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.RequestIotTriadResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestIotTriadResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestIotTriadResponseUnmarshaller {

	public static RequestIotTriadResponse unmarshall(RequestIotTriadResponse requestIotTriadResponse, UnmarshallerContext _ctx) {
		
		requestIotTriadResponse.setRequestId(_ctx.stringValue("RequestIotTriadResponse.RequestId"));
		requestIotTriadResponse.setSuccess(_ctx.booleanValue("RequestIotTriadResponse.Success"));
		requestIotTriadResponse.setErrorCode(_ctx.stringValue("RequestIotTriadResponse.ErrorCode"));
		requestIotTriadResponse.setErrorMessage(_ctx.stringValue("RequestIotTriadResponse.ErrorMessage"));

		Data data = new Data();
		data.setProductKey(_ctx.stringValue("RequestIotTriadResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("RequestIotTriadResponse.Data.DeviceName"));
		data.setDeviceSecret(_ctx.stringValue("RequestIotTriadResponse.Data.DeviceSecret"));
		requestIotTriadResponse.setData(data);
	 
	 	return requestIotTriadResponse;
	}
}