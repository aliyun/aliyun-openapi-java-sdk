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

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.QuerySlotMetricsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.QuerySlotMetricsResponse.MetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySlotMetricsResponseUnmarshaller {

	public static QuerySlotMetricsResponse unmarshall(QuerySlotMetricsResponse querySlotMetricsResponse, UnmarshallerContext _ctx) {
		
		querySlotMetricsResponse.setRequestId(_ctx.stringValue("QuerySlotMetricsResponse.RequestId"));
		querySlotMetricsResponse.setPeriod(_ctx.stringValue("QuerySlotMetricsResponse.Period"));

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySlotMetricsResponse.Metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setTimestamp(_ctx.stringValue("QuerySlotMetricsResponse.Metrics["+ i +"].Timestamp"));
			metricsItem.setValue(_ctx.doubleValue("QuerySlotMetricsResponse.Metrics["+ i +"].Value"));

			metrics.add(metricsItem);
		}
		querySlotMetricsResponse.setMetrics(metrics);
	 
	 	return querySlotMetricsResponse;
	}
}