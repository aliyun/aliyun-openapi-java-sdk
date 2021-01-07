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

import com.aliyuncs.airec.model.v20201126.ListDashboardDetailsResponse;
import com.aliyuncs.airec.model.v20201126.ListDashboardDetailsResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListDashboardDetailsResponse.ResultItem.MetricRes;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardDetailsResponseUnmarshaller {

	public static ListDashboardDetailsResponse unmarshall(ListDashboardDetailsResponse listDashboardDetailsResponse, UnmarshallerContext _ctx) {
		
		listDashboardDetailsResponse.setRequestId(_ctx.stringValue("ListDashboardDetailsResponse.requestId"));
		listDashboardDetailsResponse.setCode(_ctx.stringValue("ListDashboardDetailsResponse.code"));
		listDashboardDetailsResponse.setMessage(_ctx.stringValue("ListDashboardDetailsResponse.message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardDetailsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setSceneId(_ctx.stringValue("ListDashboardDetailsResponse.result["+ i +"].sceneId"));
			resultItem.setTraceId(_ctx.stringValue("ListDashboardDetailsResponse.result["+ i +"].traceId"));

			MetricRes metricRes = new MetricRes();
			metricRes.setDetail(_ctx.mapValue("ListDashboardDetailsResponse.result["+ i +"].metricRes.detail"));
			metricRes.setTotal(_ctx.mapValue("ListDashboardDetailsResponse.result["+ i +"].metricRes.total"));
			resultItem.setMetricRes(metricRes);

			result.add(resultItem);
		}
		listDashboardDetailsResponse.setResult(result);
	 
	 	return listDashboardDetailsResponse;
	}
}