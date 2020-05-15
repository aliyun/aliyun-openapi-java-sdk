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

import com.aliyuncs.cloudwifi_pop.model.v20191118.GetNetDeviceInfoWithSizeResponse;
import com.aliyuncs.cloudwifi_pop.model.v20191118.GetNetDeviceInfoWithSizeResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNetDeviceInfoWithSizeResponseUnmarshaller {

	public static GetNetDeviceInfoWithSizeResponse unmarshall(GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSizeResponse, UnmarshallerContext _ctx) {
		
		getNetDeviceInfoWithSizeResponse.setRequestId(_ctx.stringValue("GetNetDeviceInfoWithSizeResponse.RequestId"));
		getNetDeviceInfoWithSizeResponse.setIsSuccess(_ctx.booleanValue("GetNetDeviceInfoWithSizeResponse.IsSuccess"));
		getNetDeviceInfoWithSizeResponse.setErrorCode(_ctx.integerValue("GetNetDeviceInfoWithSizeResponse.ErrorCode"));
		getNetDeviceInfoWithSizeResponse.setErrorMessage(_ctx.stringValue("GetNetDeviceInfoWithSizeResponse.ErrorMessage"));

		Data data = new Data();
		data.setCount(_ctx.longValue("GetNetDeviceInfoWithSizeResponse.Data.Count"));

		List<Map<Object, Object>> data1 = _ctx.listMapValue("GetNetDeviceInfoWithSizeResponse.Data.Data");
		data.setData1(data1);
		getNetDeviceInfoWithSizeResponse.setData(data);
	 
	 	return getNetDeviceInfoWithSizeResponse;
	}
}