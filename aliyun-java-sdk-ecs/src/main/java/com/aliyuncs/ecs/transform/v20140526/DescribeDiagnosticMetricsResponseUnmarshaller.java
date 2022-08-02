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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticMetricsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticMetricsResponse.Metric;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosticMetricsResponseUnmarshaller {

	public static DescribeDiagnosticMetricsResponse unmarshall(DescribeDiagnosticMetricsResponse describeDiagnosticMetricsResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosticMetricsResponse.setRequestId(_ctx.stringValue("DescribeDiagnosticMetricsResponse.RequestId"));
		describeDiagnosticMetricsResponse.setNextToken(_ctx.stringValue("DescribeDiagnosticMetricsResponse.NextToken"));

		List<Metric> metrics = new ArrayList<Metric>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosticMetricsResponse.Metrics.Length"); i++) {
			Metric metric = new Metric();
			metric.setMetricId(_ctx.stringValue("DescribeDiagnosticMetricsResponse.Metrics["+ i +"].MetricId"));
			metric.setMetricName(_ctx.stringValue("DescribeDiagnosticMetricsResponse.Metrics["+ i +"].MetricName"));
			metric.setMetricCategory(_ctx.stringValue("DescribeDiagnosticMetricsResponse.Metrics["+ i +"].MetricCategory"));
			metric.setDescription(_ctx.stringValue("DescribeDiagnosticMetricsResponse.Metrics["+ i +"].Description"));
			metric.setResourceType(_ctx.stringValue("DescribeDiagnosticMetricsResponse.Metrics["+ i +"].ResourceType"));
			metric.setGuestMetric(_ctx.booleanValue("DescribeDiagnosticMetricsResponse.Metrics["+ i +"].GuestMetric"));
			metric.setSupportedOperatingSystem(_ctx.stringValue("DescribeDiagnosticMetricsResponse.Metrics["+ i +"].SupportedOperatingSystem"));

			metrics.add(metric);
		}
		describeDiagnosticMetricsResponse.setMetrics(metrics);
	 
	 	return describeDiagnosticMetricsResponse;
	}
}