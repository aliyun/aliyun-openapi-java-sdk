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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.QueryInstanceMetricsResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryInstanceMetricsResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.QueryInstanceMetricsResponse.Data.MetricsItem;
import com.aliyuncs.advisor_share.model.v20180608.QueryInstanceMetricsResponse.Data.MetricsItem.MetricItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceMetricsResponseUnmarshaller {

	public static QueryInstanceMetricsResponse unmarshall(QueryInstanceMetricsResponse queryInstanceMetricsResponse, UnmarshallerContext _ctx) {
		
		queryInstanceMetricsResponse.setSuccess(_ctx.booleanValue("QueryInstanceMetricsResponse.Success"));

		Data data = new Data();

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstanceMetricsResponse.Data.Metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setMetricName(_ctx.stringValue("QueryInstanceMetricsResponse.Data.Metrics["+ i +"].MetricName"));

			List<MetricItemsItem> metricItems = new ArrayList<MetricItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryInstanceMetricsResponse.Data.Metrics["+ i +"].MetricItems.Length"); j++) {
				MetricItemsItem metricItemsItem = new MetricItemsItem();
				metricItemsItem.setData(_ctx.doubleValue("QueryInstanceMetricsResponse.Data.Metrics["+ i +"].MetricItems["+ j +"].Data"));
				metricItemsItem.setTime(_ctx.stringValue("QueryInstanceMetricsResponse.Data.Metrics["+ i +"].MetricItems["+ j +"].Time"));

				metricItems.add(metricItemsItem);
			}
			metricsItem.setMetricItems(metricItems);

			metrics.add(metricsItem);
		}
		data.setMetrics(metrics);
		queryInstanceMetricsResponse.setData(data);
	 
	 	return queryInstanceMetricsResponse;
	}
}