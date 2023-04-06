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

package com.aliyuncs.dashscope.transform.v20230320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dashscope.model.v20230320.GetInvokeStatisticsResponse;
import com.aliyuncs.dashscope.model.v20230320.GetInvokeStatisticsResponse.DataItem;
import com.aliyuncs.dashscope.model.v20230320.GetInvokeStatisticsResponse.DataItem.MetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInvokeStatisticsResponseUnmarshaller {

	public static GetInvokeStatisticsResponse unmarshall(GetInvokeStatisticsResponse getInvokeStatisticsResponse, UnmarshallerContext _ctx) {
		
		getInvokeStatisticsResponse.setRequestId(_ctx.stringValue("GetInvokeStatisticsResponse.RequestId"));
		getInvokeStatisticsResponse.setSuccess(_ctx.booleanValue("GetInvokeStatisticsResponse.Success"));
		getInvokeStatisticsResponse.setHttpCode(_ctx.stringValue("GetInvokeStatisticsResponse.HttpCode"));
		getInvokeStatisticsResponse.setErrorCode(_ctx.stringValue("GetInvokeStatisticsResponse.ErrorCode"));
		getInvokeStatisticsResponse.setErrorMessage(_ctx.stringValue("GetInvokeStatisticsResponse.ErrorMessage"));
		getInvokeStatisticsResponse.setAccessDeniedDetail(_ctx.stringValue("GetInvokeStatisticsResponse.AccessDeniedDetail"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInvokeStatisticsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegion(_ctx.stringValue("GetInvokeStatisticsResponse.Data["+ i +"].Region"));
			dataItem.setApiKey(_ctx.stringValue("GetInvokeStatisticsResponse.Data["+ i +"].ApiKey"));
			dataItem.setModelName(_ctx.stringValue("GetInvokeStatisticsResponse.Data["+ i +"].ModelName"));
			dataItem.setTimeUnit(_ctx.stringValue("GetInvokeStatisticsResponse.Data["+ i +"].TimeUnit"));
			dataItem.setStatisticsUnit(_ctx.stringValue("GetInvokeStatisticsResponse.Data["+ i +"].StatisticsUnit"));

			List<MetricsItem> metrics = new ArrayList<MetricsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetInvokeStatisticsResponse.Data["+ i +"].Metrics.Length"); j++) {
				MetricsItem metricsItem = new MetricsItem();
				metricsItem.setDay(_ctx.stringValue("GetInvokeStatisticsResponse.Data["+ i +"].Metrics["+ j +"].Day"));
				metricsItem.setHour(_ctx.stringValue("GetInvokeStatisticsResponse.Data["+ i +"].Metrics["+ j +"].Hour"));
				metricsItem.setCount(_ctx.longValue("GetInvokeStatisticsResponse.Data["+ i +"].Metrics["+ j +"].Count"));

				metrics.add(metricsItem);
			}
			dataItem.setMetrics(metrics);

			data.add(dataItem);
		}
		getInvokeStatisticsResponse.setData(data);
	 
	 	return getInvokeStatisticsResponse;
	}
}