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

import com.aliyuncs.iot.model.v20180120.QueryDeviceStatisticsResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceStatisticsResponseUnmarshaller {

	public static QueryDeviceStatisticsResponse unmarshall(QueryDeviceStatisticsResponse queryDeviceStatisticsResponse, UnmarshallerContext context) {
		
		queryDeviceStatisticsResponse.setRequestId(context.stringValue("QueryDeviceStatisticsResponse.RequestId"));
		queryDeviceStatisticsResponse.setSuccess(context.booleanValue("QueryDeviceStatisticsResponse.Success"));
		queryDeviceStatisticsResponse.setErrorMessage(context.stringValue("QueryDeviceStatisticsResponse.ErrorMessage"));

		Data data = new Data();
		data.setDeviceCount(context.longValue("QueryDeviceStatisticsResponse.Data.deviceCount"));
		data.setOnlineCount(context.longValue("QueryDeviceStatisticsResponse.Data.onlineCount"));
		data.setActiveCount(context.longValue("QueryDeviceStatisticsResponse.Data.activeCount"));
		queryDeviceStatisticsResponse.setData(data);
	 
	 	return queryDeviceStatisticsResponse;
	}
}