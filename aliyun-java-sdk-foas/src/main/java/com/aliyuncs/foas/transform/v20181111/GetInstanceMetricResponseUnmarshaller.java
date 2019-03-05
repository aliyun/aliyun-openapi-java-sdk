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

import com.aliyuncs.foas.model.v20181111.GetInstanceMetricResponse;
import com.aliyuncs.foas.model.v20181111.GetInstanceMetricResponse.Metric;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceMetricResponseUnmarshaller {

	public static GetInstanceMetricResponse unmarshall(GetInstanceMetricResponse getInstanceMetricResponse, UnmarshallerContext context) {
		
		getInstanceMetricResponse.setRequestId(context.stringValue("GetInstanceMetricResponse.RequestId"));

		List<Metric> metrics = new ArrayList<Metric>();
		for (int i = 0; i < context.lengthValue("GetInstanceMetricResponse.Metrics.Length"); i++) {
			Metric metric = new Metric();
			metric.setMetricName(context.stringValue("GetInstanceMetricResponse.Metrics["+ i +"].MetricName"));
			metric.setDps(context.mapValue("GetInstanceMetricResponse.Metrics["+ i +"].Dps"));
			metric.setSummary(context.floatValue("GetInstanceMetricResponse.Metrics["+ i +"].Summary"));
			metric.setTags(context.mapValue("GetInstanceMetricResponse.Metrics["+ i +"].Tags"));

			metrics.add(metric);
		}
		getInstanceMetricResponse.setMetrics(metrics);
	 
	 	return getInstanceMetricResponse;
	}
}