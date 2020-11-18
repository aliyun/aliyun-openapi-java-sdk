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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelMetricsResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcChannelMetricsResponse.Metric;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcChannelMetricsResponseUnmarshaller {

	public static DescribeRtcChannelMetricsResponse unmarshall(DescribeRtcChannelMetricsResponse describeRtcChannelMetricsResponse, UnmarshallerContext _ctx) {
		
		describeRtcChannelMetricsResponse.setRequestId(_ctx.stringValue("DescribeRtcChannelMetricsResponse.RequestId"));

		List<Metric> metrics = new ArrayList<Metric>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcChannelMetricsResponse.Metrics.Length"); i++) {
			Metric metric = new Metric();
			metric.setUid(_ctx.stringValue("DescribeRtcChannelMetricsResponse.Metrics["+ i +"].Uid"));
			metric.setMid(_ctx.stringValue("DescribeRtcChannelMetricsResponse.Metrics["+ i +"].Mid"));

			List<String> kVs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRtcChannelMetricsResponse.Metrics["+ i +"].KVs.Length"); j++) {
				kVs.add(_ctx.stringValue("DescribeRtcChannelMetricsResponse.Metrics["+ i +"].KVs["+ j +"]"));
			}
			metric.setKVs(kVs);

			metrics.add(metric);
		}
		describeRtcChannelMetricsResponse.setMetrics(metrics);
	 
	 	return describeRtcChannelMetricsResponse;
	}
}