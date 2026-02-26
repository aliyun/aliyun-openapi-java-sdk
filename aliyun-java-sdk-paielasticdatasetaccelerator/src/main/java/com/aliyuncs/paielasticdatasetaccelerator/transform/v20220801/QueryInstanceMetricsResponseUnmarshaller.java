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

package com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.QueryInstanceMetricsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.QueryInstanceMetricsResponse.MetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceMetricsResponseUnmarshaller {

	public static QueryInstanceMetricsResponse unmarshall(QueryInstanceMetricsResponse queryInstanceMetricsResponse, UnmarshallerContext _ctx) {
		
		queryInstanceMetricsResponse.setRequestId(_ctx.stringValue("QueryInstanceMetricsResponse.RequestId"));
		queryInstanceMetricsResponse.setPeriod(_ctx.stringValue("QueryInstanceMetricsResponse.Period"));

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstanceMetricsResponse.Metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setTimestamp(_ctx.stringValue("QueryInstanceMetricsResponse.Metrics["+ i +"].Timestamp"));
			metricsItem.setValue(_ctx.doubleValue("QueryInstanceMetricsResponse.Metrics["+ i +"].Value"));

			metrics.add(metricsItem);
		}
		queryInstanceMetricsResponse.setMetrics(metrics);
	 
	 	return queryInstanceMetricsResponse;
	}
}