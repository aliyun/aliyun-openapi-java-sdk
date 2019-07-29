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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.GetClusterMetricsResponse;
import com.aliyuncs.foas.model.v20181111.GetClusterMetricsResponse.Metric;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterMetricsResponseUnmarshaller {

	public static GetClusterMetricsResponse unmarshall(GetClusterMetricsResponse getClusterMetricsResponse, UnmarshallerContext _ctx) {
		
		getClusterMetricsResponse.setRequestId(_ctx.stringValue("GetClusterMetricsResponse.RequestId"));

		List<Metric> metrics = new ArrayList<Metric>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterMetricsResponse.Metrics.Length"); i++) {
			Metric metric = new Metric();
			metric.setMetricName(_ctx.stringValue("GetClusterMetricsResponse.Metrics["+ i +"].MetricName"));
			metric.setDps(_ctx.mapValue("GetClusterMetricsResponse.Metrics["+ i +"].Dps"));
			metric.setSummary(_ctx.floatValue("GetClusterMetricsResponse.Metrics["+ i +"].Summary"));
			metric.setTags(_ctx.mapValue("GetClusterMetricsResponse.Metrics["+ i +"].Tags"));

			metrics.add(metric);
		}
		getClusterMetricsResponse.setMetrics(metrics);
	 
	 	return getClusterMetricsResponse;
	}
}