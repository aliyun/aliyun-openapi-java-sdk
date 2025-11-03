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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeProcessStatisticsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeProcessStatisticsResponse.Metrics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProcessStatisticsResponseUnmarshaller {

	public static DescribeProcessStatisticsResponse unmarshall(DescribeProcessStatisticsResponse describeProcessStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeProcessStatisticsResponse.setRequestId(_ctx.stringValue("DescribeProcessStatisticsResponse.RequestId"));

		Metrics metrics = new Metrics();
		metrics.setTaskNum(_ctx.integerValue("DescribeProcessStatisticsResponse.Metrics.TaskNum"));
		metrics.setBanIpNum(_ctx.integerValue("DescribeProcessStatisticsResponse.Metrics.BanIpNum"));
		metrics.setBanFileNum(_ctx.integerValue("DescribeProcessStatisticsResponse.Metrics.BanFileNum"));
		metrics.setBanProcessNum(_ctx.integerValue("DescribeProcessStatisticsResponse.Metrics.BanProcessNum"));
		describeProcessStatisticsResponse.setMetrics(metrics);
	 
	 	return describeProcessStatisticsResponse;
	}
}