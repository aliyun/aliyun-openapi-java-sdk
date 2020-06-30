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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.ListDashboardDetailsFlowsResponse;
import com.aliyuncs.airec.model.v20181012.ListDashboardDetailsFlowsResponse.Result;
import com.aliyuncs.airec.model.v20181012.ListDashboardDetailsFlowsResponse.Result.MetricDataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardDetailsFlowsResponseUnmarshaller {

	public static ListDashboardDetailsFlowsResponse unmarshall(ListDashboardDetailsFlowsResponse listDashboardDetailsFlowsResponse, UnmarshallerContext _ctx) {
		
		listDashboardDetailsFlowsResponse.setRequestId(_ctx.stringValue("ListDashboardDetailsFlowsResponse.RequestId"));

		Result result = new Result();
		result.setMetricType(_ctx.stringValue("ListDashboardDetailsFlowsResponse.Result.MetricType"));

		List<MetricDataItem> metricData = new ArrayList<MetricDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardDetailsFlowsResponse.Result.MetricData.Length"); i++) {
			MetricDataItem metricDataItem = new MetricDataItem();
			metricDataItem.setTraceId(_ctx.stringValue("ListDashboardDetailsFlowsResponse.Result.MetricData["+ i +"].TraceId"));
			metricDataItem.setSceneId(_ctx.stringValue("ListDashboardDetailsFlowsResponse.Result.MetricData["+ i +"].SceneId"));
			metricDataItem.setMetricRes(_ctx.mapValue("ListDashboardDetailsFlowsResponse.Result.MetricData["+ i +"].MetricRes"));

			metricData.add(metricDataItem);
		}
		result.setMetricData(metricData);
		listDashboardDetailsFlowsResponse.setResult(result);
	 
	 	return listDashboardDetailsFlowsResponse;
	}
}