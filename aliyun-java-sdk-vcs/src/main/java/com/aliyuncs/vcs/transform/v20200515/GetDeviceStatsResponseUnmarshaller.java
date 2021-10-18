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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetDeviceStatsResponse;
import com.aliyuncs.vcs.model.v20200515.GetDeviceStatsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceStatsResponseUnmarshaller {

	public static GetDeviceStatsResponse unmarshall(GetDeviceStatsResponse getDeviceStatsResponse, UnmarshallerContext _ctx) {
		
		getDeviceStatsResponse.setRequestId(_ctx.stringValue("GetDeviceStatsResponse.RequestId"));
		getDeviceStatsResponse.setCode(_ctx.stringValue("GetDeviceStatsResponse.Code"));
		getDeviceStatsResponse.setMessage(_ctx.stringValue("GetDeviceStatsResponse.Message"));

		List<Result> data = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceStatsResponse.Data.Length"); i++) {
			Result result = new Result();
			result.setDeviceType(_ctx.stringValue("GetDeviceStatsResponse.Data["+ i +"].DeviceType"));
			result.setDeviceStatus(_ctx.stringValue("GetDeviceStatsResponse.Data["+ i +"].DeviceStatus"));
			result.setCount(_ctx.longValue("GetDeviceStatsResponse.Data["+ i +"].Count"));

			data.add(result);
		}
		getDeviceStatsResponse.setData(data);
	 
	 	return getDeviceStatsResponse;
	}
}