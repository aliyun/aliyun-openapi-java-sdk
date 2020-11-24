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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceStatisticsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceStatisticsResponse.InstanceStatistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceStatisticsResponseUnmarshaller {

	public static DescribeInstanceStatisticsResponse unmarshall(DescribeInstanceStatisticsResponse describeInstanceStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceStatisticsResponse.setRequestId(_ctx.stringValue("DescribeInstanceStatisticsResponse.RequestId"));

		List<InstanceStatistic> instanceStatistics = new ArrayList<InstanceStatistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceStatisticsResponse.InstanceStatistics.Length"); i++) {
			InstanceStatistic instanceStatistic = new InstanceStatistic();
			instanceStatistic.setInstanceId(_ctx.stringValue("DescribeInstanceStatisticsResponse.InstanceStatistics["+ i +"].InstanceId"));
			instanceStatistic.setPortUsage(_ctx.integerValue("DescribeInstanceStatisticsResponse.InstanceStatistics["+ i +"].PortUsage"));
			instanceStatistic.setDomainUsage(_ctx.integerValue("DescribeInstanceStatisticsResponse.InstanceStatistics["+ i +"].DomainUsage"));
			instanceStatistic.setSiteUsage(_ctx.integerValue("DescribeInstanceStatisticsResponse.InstanceStatistics["+ i +"].SiteUsage"));
			instanceStatistic.setDefenseCountUsage(_ctx.integerValue("DescribeInstanceStatisticsResponse.InstanceStatistics["+ i +"].DefenseCountUsage"));

			instanceStatistics.add(instanceStatistic);
		}
		describeInstanceStatisticsResponse.setInstanceStatistics(instanceStatistics);
	 
	 	return describeInstanceStatisticsResponse;
	}
}