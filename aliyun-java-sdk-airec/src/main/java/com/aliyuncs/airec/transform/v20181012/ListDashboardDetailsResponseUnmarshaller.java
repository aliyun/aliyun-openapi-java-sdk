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

import com.aliyuncs.airec.model.v20181012.ListDashboardDetailsResponse;
import com.aliyuncs.airec.model.v20181012.ListDashboardDetailsResponse.ResultItem;
import com.aliyuncs.airec.model.v20181012.ListDashboardDetailsResponse.ResultItem.MetricRes;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardDetailsResponseUnmarshaller {

	public static ListDashboardDetailsResponse unmarshall(ListDashboardDetailsResponse listDashboardDetailsResponse, UnmarshallerContext _ctx) {
		
		listDashboardDetailsResponse.setRequestId(_ctx.stringValue("ListDashboardDetailsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardDetailsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTraceId(_ctx.stringValue("ListDashboardDetailsResponse.Result["+ i +"].TraceId"));
			resultItem.setSceneId(_ctx.stringValue("ListDashboardDetailsResponse.Result["+ i +"].SceneId"));

			MetricRes metricRes = new MetricRes();
			metricRes.setTotal(_ctx.mapValue("ListDashboardDetailsResponse.Result["+ i +"].MetricRes.Total"));
			metricRes.setDetail(_ctx.mapValue("ListDashboardDetailsResponse.Result["+ i +"].MetricRes.Detail"));
			resultItem.setMetricRes(metricRes);

			result.add(resultItem);
		}
		listDashboardDetailsResponse.setResult(result);
	 
	 	return listDashboardDetailsResponse;
	}
}