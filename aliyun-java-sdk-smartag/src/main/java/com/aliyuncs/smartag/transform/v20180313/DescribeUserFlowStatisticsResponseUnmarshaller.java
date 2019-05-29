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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeUserFlowStatisticsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeUserFlowStatisticsResponse.Statistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserFlowStatisticsResponseUnmarshaller {

	public static DescribeUserFlowStatisticsResponse unmarshall(DescribeUserFlowStatisticsResponse describeUserFlowStatisticsResponse, UnmarshallerContext context) {
		
		describeUserFlowStatisticsResponse.setRequestId(context.stringValue("DescribeUserFlowStatisticsResponse.RequestId"));

		List<Statistics> sagStatistics = new ArrayList<Statistics>();
		for (int i = 0; i < context.lengthValue("DescribeUserFlowStatisticsResponse.SagStatistics.Length"); i++) {
			Statistics statistics = new Statistics();
			statistics.setUserName(context.stringValue("DescribeUserFlowStatisticsResponse.SagStatistics["+ i +"].UserName"));
			statistics.setTotalBytes(context.stringValue("DescribeUserFlowStatisticsResponse.SagStatistics["+ i +"].TotalBytes"));

			sagStatistics.add(statistics);
		}
		describeUserFlowStatisticsResponse.setSagStatistics(sagStatistics);
	 
	 	return describeUserFlowStatisticsResponse;
	}
}