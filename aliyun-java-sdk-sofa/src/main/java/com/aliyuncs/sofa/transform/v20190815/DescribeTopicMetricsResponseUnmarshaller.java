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

import com.aliyuncs.sofa.model.v20190815.DescribeTopicMetricsResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeTopicMetricsResponse.MetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTopicMetricsResponseUnmarshaller {

	public static DescribeTopicMetricsResponse unmarshall(DescribeTopicMetricsResponse describeTopicMetricsResponse, UnmarshallerContext _ctx) {
		
		describeTopicMetricsResponse.setRequestId(_ctx.stringValue("DescribeTopicMetricsResponse.RequestId"));
		describeTopicMetricsResponse.setResultCode(_ctx.stringValue("DescribeTopicMetricsResponse.ResultCode"));
		describeTopicMetricsResponse.setResultMessage(_ctx.stringValue("DescribeTopicMetricsResponse.ResultMessage"));
		describeTopicMetricsResponse.setEndTime(_ctx.longValue("DescribeTopicMetricsResponse.EndTime"));
		describeTopicMetricsResponse.setInterval(_ctx.longValue("DescribeTopicMetricsResponse.Interval"));
		describeTopicMetricsResponse.setStartTime(_ctx.longValue("DescribeTopicMetricsResponse.StartTime"));
		describeTopicMetricsResponse.setTopic(_ctx.stringValue("DescribeTopicMetricsResponse.Topic"));

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTopicMetricsResponse.Metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setRecvCnt(_ctx.longValue("DescribeTopicMetricsResponse.Metrics["+ i +"].RecvCnt"));
			metricsItem.setRecvTraffic(_ctx.longValue("DescribeTopicMetricsResponse.Metrics["+ i +"].RecvTraffic"));
			metricsItem.setSendCnt(_ctx.longValue("DescribeTopicMetricsResponse.Metrics["+ i +"].SendCnt"));
			metricsItem.setSendTraffic(_ctx.longValue("DescribeTopicMetricsResponse.Metrics["+ i +"].SendTraffic"));
			metricsItem.setTimestamp(_ctx.longValue("DescribeTopicMetricsResponse.Metrics["+ i +"].Timestamp"));

			metrics.add(metricsItem);
		}
		describeTopicMetricsResponse.setMetrics(metrics);
	 
	 	return describeTopicMetricsResponse;
	}
}