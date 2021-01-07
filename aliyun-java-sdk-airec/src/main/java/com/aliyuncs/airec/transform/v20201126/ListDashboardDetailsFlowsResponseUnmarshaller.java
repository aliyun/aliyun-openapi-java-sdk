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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListDashboardDetailsFlowsResponse;
import com.aliyuncs.airec.model.v20201126.ListDashboardDetailsFlowsResponse.Result;
import com.aliyuncs.airec.model.v20201126.ListDashboardDetailsFlowsResponse.Result.MetricDataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardDetailsFlowsResponseUnmarshaller {

	public static ListDashboardDetailsFlowsResponse unmarshall(ListDashboardDetailsFlowsResponse listDashboardDetailsFlowsResponse, UnmarshallerContext _ctx) {
		
		listDashboardDetailsFlowsResponse.setRequestId(_ctx.stringValue("ListDashboardDetailsFlowsResponse.requestId"));
		listDashboardDetailsFlowsResponse.setCode(_ctx.stringValue("ListDashboardDetailsFlowsResponse.code"));
		listDashboardDetailsFlowsResponse.setMessage(_ctx.stringValue("ListDashboardDetailsFlowsResponse.message"));

		Result result = new Result();
		result.setMetricType(_ctx.stringValue("ListDashboardDetailsFlowsResponse.result.metricType"));

		List<MetricDataItem> metricData = new ArrayList<MetricDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardDetailsFlowsResponse.result.metricData.Length"); i++) {
			MetricDataItem metricDataItem = new MetricDataItem();
			metricDataItem.setMetricRes(_ctx.mapValue("ListDashboardDetailsFlowsResponse.result.metricData["+ i +"].metricRes"));
			metricDataItem.setSceneId(_ctx.stringValue("ListDashboardDetailsFlowsResponse.result.metricData["+ i +"].sceneId"));
			metricDataItem.setTraceId(_ctx.stringValue("ListDashboardDetailsFlowsResponse.result.metricData["+ i +"].traceId"));

			metricData.add(metricDataItem);
		}
		result.setMetricData(metricData);
		listDashboardDetailsFlowsResponse.setResult(result);
	 
	 	return listDashboardDetailsFlowsResponse;
	}
}