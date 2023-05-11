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

import com.aliyuncs.iot.model.v20180120.GetDeviceStatusResponse;
import com.aliyuncs.iot.model.v20180120.GetDeviceStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceStatusResponseUnmarshaller {

	public static GetDeviceStatusResponse unmarshall(GetDeviceStatusResponse getDeviceStatusResponse, UnmarshallerContext _ctx) {
		
		getDeviceStatusResponse.setRequestId(_ctx.stringValue("GetDeviceStatusResponse.RequestId"));
		getDeviceStatusResponse.setSuccess(_ctx.booleanValue("GetDeviceStatusResponse.Success"));
		getDeviceStatusResponse.setCode(_ctx.stringValue("GetDeviceStatusResponse.Code"));
		getDeviceStatusResponse.setErrorMessage(_ctx.stringValue("GetDeviceStatusResponse.ErrorMessage"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetDeviceStatusResponse.Data.Status"));
		data.setTimestamp(_ctx.longValue("GetDeviceStatusResponse.Data.Timestamp"));
		getDeviceStatusResponse.setData(data);
	 
	 	return getDeviceStatusResponse;
	}
}