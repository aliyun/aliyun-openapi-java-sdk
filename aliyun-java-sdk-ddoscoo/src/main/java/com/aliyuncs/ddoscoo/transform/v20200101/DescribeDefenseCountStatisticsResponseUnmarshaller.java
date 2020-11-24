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

package com.aliyuncs.ddoscoo.transform.v20200101;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDefenseCountStatisticsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDefenseCountStatisticsResponse.DefenseCountStatistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDefenseCountStatisticsResponseUnmarshaller {

	public static DescribeDefenseCountStatisticsResponse unmarshall(DescribeDefenseCountStatisticsResponse describeDefenseCountStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeDefenseCountStatisticsResponse.setRequestId(_ctx.stringValue("DescribeDefenseCountStatisticsResponse.RequestId"));

		DefenseCountStatistics defenseCountStatistics = new DefenseCountStatistics();
		defenseCountStatistics.setDefenseCountTotalUsageOfCurrentMonth(_ctx.integerValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.DefenseCountTotalUsageOfCurrentMonth"));
		defenseCountStatistics.setFlowPackCountRemain(_ctx.integerValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.FlowPackCountRemain"));
		defenseCountStatistics.setMaxUsableDefenseCountCurrentMonth(_ctx.integerValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.MaxUsableDefenseCountCurrentMonth"));
		describeDefenseCountStatisticsResponse.setDefenseCountStatistics(defenseCountStatistics);
	 
	 	return describeDefenseCountStatisticsResponse;
	}
}