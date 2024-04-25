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

package com.aliyuncs.ehpcinstant.transform.v20230701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpcinstant.model.v20230701.DescribeJobMetricLastResponse;
import com.aliyuncs.ehpcinstant.model.v20230701.DescribeJobMetricLastResponse.MetricInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobMetricLastResponseUnmarshaller {

	public static DescribeJobMetricLastResponse unmarshall(DescribeJobMetricLastResponse describeJobMetricLastResponse, UnmarshallerContext _ctx) {
		
		describeJobMetricLastResponse.setRequestId(_ctx.stringValue("DescribeJobMetricLastResponse.RequestId"));

		List<MetricInfo> metrics = new ArrayList<MetricInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobMetricLastResponse.Metrics.Length"); i++) {
			MetricInfo metricInfo = new MetricInfo();
			metricInfo.setArrayIndex(_ctx.integerValue("DescribeJobMetricLastResponse.Metrics["+ i +"].ArrayIndex"));
			metricInfo.setMetric(_ctx.stringValue("DescribeJobMetricLastResponse.Metrics["+ i +"].Metric"));

			metrics.add(metricInfo);
		}
		describeJobMetricLastResponse.setMetrics(metrics);
	 
	 	return describeJobMetricLastResponse;
	}
}