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

import com.aliyuncs.airec.model.v20201126.ListDashboardMetricsFlowsResponse;
import com.aliyuncs.airec.model.v20201126.ListDashboardMetricsFlowsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardMetricsFlowsResponseUnmarshaller {

	public static ListDashboardMetricsFlowsResponse unmarshall(ListDashboardMetricsFlowsResponse listDashboardMetricsFlowsResponse, UnmarshallerContext _ctx) {
		
		listDashboardMetricsFlowsResponse.setCode(_ctx.stringValue("ListDashboardMetricsFlowsResponse.code"));
		listDashboardMetricsFlowsResponse.setRequestId(_ctx.stringValue("ListDashboardMetricsFlowsResponse.requestId"));
		listDashboardMetricsFlowsResponse.setMessage(_ctx.stringValue("ListDashboardMetricsFlowsResponse.message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardMetricsFlowsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setMetricType(_ctx.stringValue("ListDashboardMetricsFlowsResponse.result["+ i +"].metricType"));
			resultItem.setMetricData(_ctx.mapValue("ListDashboardMetricsFlowsResponse.result["+ i +"].metricData"));

			result.add(resultItem);
		}
		listDashboardMetricsFlowsResponse.setResult(result);
	 
	 	return listDashboardMetricsFlowsResponse;
	}
}