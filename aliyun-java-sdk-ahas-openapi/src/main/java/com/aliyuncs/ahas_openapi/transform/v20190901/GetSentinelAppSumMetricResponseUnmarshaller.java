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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import com.aliyuncs.ahas_openapi.model.v20190901.GetSentinelAppSumMetricResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.GetSentinelAppSumMetricResponse.MetricData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSentinelAppSumMetricResponseUnmarshaller {

	public static GetSentinelAppSumMetricResponse unmarshall(GetSentinelAppSumMetricResponse getSentinelAppSumMetricResponse, UnmarshallerContext _ctx) {
		
		getSentinelAppSumMetricResponse.setRequestId(_ctx.stringValue("GetSentinelAppSumMetricResponse.RequestId"));
		getSentinelAppSumMetricResponse.setCode(_ctx.stringValue("GetSentinelAppSumMetricResponse.Code"));
		getSentinelAppSumMetricResponse.setSuccess(_ctx.booleanValue("GetSentinelAppSumMetricResponse.Success"));
		getSentinelAppSumMetricResponse.setMessage(_ctx.stringValue("GetSentinelAppSumMetricResponse.Message"));

		MetricData metricData = new MetricData();
		metricData.setUserId(_ctx.stringValue("GetSentinelAppSumMetricResponse.MetricData.UserId"));
		metricData.setNamespace(_ctx.stringValue("GetSentinelAppSumMetricResponse.MetricData.Namespace"));
		metricData.setAppName(_ctx.stringValue("GetSentinelAppSumMetricResponse.MetricData.AppName"));
		metricData.setPassCount(_ctx.floatValue("GetSentinelAppSumMetricResponse.MetricData.PassCount"));
		metricData.setBlockCount(_ctx.floatValue("GetSentinelAppSumMetricResponse.MetricData.BlockCount"));
		metricData.setTotalCount(_ctx.floatValue("GetSentinelAppSumMetricResponse.MetricData.TotalCount"));
		metricData.setAvgRt(_ctx.floatValue("GetSentinelAppSumMetricResponse.MetricData.AvgRt"));
		metricData.setMachineCount(_ctx.longValue("GetSentinelAppSumMetricResponse.MetricData.MachineCount"));
		getSentinelAppSumMetricResponse.setMetricData(metricData);
	 
	 	return getSentinelAppSumMetricResponse;
	}
}