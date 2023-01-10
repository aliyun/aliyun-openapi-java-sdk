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

package com.aliyuncs.eais.transform.v20190624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eais.model.v20190624.GetInstanceMetricsResponse;
import com.aliyuncs.eais.model.v20190624.GetInstanceMetricsResponse.PodMetric;
import com.aliyuncs.eais.model.v20190624.GetInstanceMetricsResponse.PodMetric.Metric;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceMetricsResponseUnmarshaller {

	public static GetInstanceMetricsResponse unmarshall(GetInstanceMetricsResponse getInstanceMetricsResponse, UnmarshallerContext _ctx) {
		
		getInstanceMetricsResponse.setRequestId(_ctx.stringValue("GetInstanceMetricsResponse.RequestId"));
		getInstanceMetricsResponse.setInstanceId(_ctx.stringValue("GetInstanceMetricsResponse.InstanceId"));

		List<PodMetric> podMetrics = new ArrayList<PodMetric>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceMetricsResponse.PodMetrics.Length"); i++) {
			PodMetric podMetric = new PodMetric();
			podMetric.setPodId(_ctx.stringValue("GetInstanceMetricsResponse.PodMetrics["+ i +"].PodId"));

			List<Metric> metrics = new ArrayList<Metric>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceMetricsResponse.PodMetrics["+ i +"].Metrics.Length"); j++) {
				Metric metric = new Metric();
				metric.setTime(_ctx.stringValue("GetInstanceMetricsResponse.PodMetrics["+ i +"].Metrics["+ j +"].Time"));
				metric.setValue(_ctx.stringValue("GetInstanceMetricsResponse.PodMetrics["+ i +"].Metrics["+ j +"].Value"));

				metrics.add(metric);
			}
			podMetric.setMetrics(metrics);

			podMetrics.add(podMetric);
		}
		getInstanceMetricsResponse.setPodMetrics(podMetrics);
	 
	 	return getInstanceMetricsResponse;
	}
}