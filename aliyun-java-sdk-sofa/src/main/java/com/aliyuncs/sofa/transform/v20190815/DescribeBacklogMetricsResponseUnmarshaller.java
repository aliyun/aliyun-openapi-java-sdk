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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeBacklogMetricsResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeBacklogMetricsResponse.MetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBacklogMetricsResponseUnmarshaller {

	public static DescribeBacklogMetricsResponse unmarshall(DescribeBacklogMetricsResponse describeBacklogMetricsResponse, UnmarshallerContext _ctx) {
		
		describeBacklogMetricsResponse.setRequestId(_ctx.stringValue("DescribeBacklogMetricsResponse.RequestId"));
		describeBacklogMetricsResponse.setResultCode(_ctx.stringValue("DescribeBacklogMetricsResponse.ResultCode"));
		describeBacklogMetricsResponse.setResultMessage(_ctx.stringValue("DescribeBacklogMetricsResponse.ResultMessage"));
		describeBacklogMetricsResponse.setEndTime(_ctx.longValue("DescribeBacklogMetricsResponse.EndTime"));
		describeBacklogMetricsResponse.setInterval(_ctx.longValue("DescribeBacklogMetricsResponse.Interval"));
		describeBacklogMetricsResponse.setStartTime(_ctx.longValue("DescribeBacklogMetricsResponse.StartTime"));

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBacklogMetricsResponse.Metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setBacklogCnt(_ctx.longValue("DescribeBacklogMetricsResponse.Metrics["+ i +"].BacklogCnt"));
			metricsItem.setTimestamp(_ctx.longValue("DescribeBacklogMetricsResponse.Metrics["+ i +"].Timestamp"));

			metrics.add(metricsItem);
		}
		describeBacklogMetricsResponse.setMetrics(metrics);
	 
	 	return describeBacklogMetricsResponse;
	}
}