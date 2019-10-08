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

package com.aliyuncs.push.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.QueryDeviceStatResponse;
import com.aliyuncs.push.model.v20160801.QueryDeviceStatResponse.AppDeviceStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceStatResponseUnmarshaller {

	public static QueryDeviceStatResponse unmarshall(QueryDeviceStatResponse queryDeviceStatResponse, UnmarshallerContext _ctx) {
		
		queryDeviceStatResponse.setRequestId(_ctx.stringValue("QueryDeviceStatResponse.RequestId"));

		List<AppDeviceStat> appDeviceStats = new ArrayList<AppDeviceStat>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceStatResponse.AppDeviceStats.Length"); i++) {
			AppDeviceStat appDeviceStat = new AppDeviceStat();
			appDeviceStat.setTime(_ctx.stringValue("QueryDeviceStatResponse.AppDeviceStats["+ i +"].Time"));
			appDeviceStat.setCount(_ctx.longValue("QueryDeviceStatResponse.AppDeviceStats["+ i +"].Count"));
			appDeviceStat.setDeviceType(_ctx.stringValue("QueryDeviceStatResponse.AppDeviceStats["+ i +"].DeviceType"));

			appDeviceStats.add(appDeviceStat);
		}
		queryDeviceStatResponse.setAppDeviceStats(appDeviceStats);
	 
	 	return queryDeviceStatResponse;
	}
}