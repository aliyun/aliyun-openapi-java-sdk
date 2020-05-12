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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudwifi_pop.model.v20191118.GetNetDeviceInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNetDeviceInfoResponseUnmarshaller {

	public static GetNetDeviceInfoResponse unmarshall(GetNetDeviceInfoResponse getNetDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		getNetDeviceInfoResponse.setRequestId(_ctx.stringValue("GetNetDeviceInfoResponse.RequestId"));
		getNetDeviceInfoResponse.setIsSuccess(_ctx.booleanValue("GetNetDeviceInfoResponse.IsSuccess"));
		getNetDeviceInfoResponse.setErrorCode(_ctx.integerValue("GetNetDeviceInfoResponse.ErrorCode"));
		getNetDeviceInfoResponse.setErrorMessage(_ctx.stringValue("GetNetDeviceInfoResponse.ErrorMessage"));

		List<Map<Object, Object>> data = _ctx.listMapValue("GetNetDeviceInfoResponse.Data");
		getNetDeviceInfoResponse.setData(data);
	 
	 	return getNetDeviceInfoResponse;
	}
}