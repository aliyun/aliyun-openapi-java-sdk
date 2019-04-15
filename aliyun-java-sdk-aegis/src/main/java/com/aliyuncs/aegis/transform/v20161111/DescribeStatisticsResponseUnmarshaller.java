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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeStatisticsResponse.Statistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStatisticsResponseUnmarshaller {

	public static DescribeStatisticsResponse unmarshall(DescribeStatisticsResponse describeStatisticsResponse, UnmarshallerContext context) {
		
		describeStatisticsResponse.setRequestId(context.stringValue("DescribeStatisticsResponse.RequestId"));

		Statistics statistics = new Statistics();
		statistics.setVulAsapSum(context.integerValue("DescribeStatisticsResponse.Statistics.VulAsapSum"));
		statistics.setVulNntfSum(context.integerValue("DescribeStatisticsResponse.Statistics.VulNntfSum"));
		statistics.setHealthTotal(context.integerValue("DescribeStatisticsResponse.Statistics.HealthTotal"));
		statistics.setSuspiciousmediumTotal(context.integerValue("DescribeStatisticsResponse.Statistics.SuspiciousmediumTotal"));
		statistics.setHealth(context.integerValue("DescribeStatisticsResponse.Statistics.Health"));
		statistics.setHealthdealedTotal(context.integerValue("DescribeStatisticsResponse.Statistics.HealthdealedTotal"));
		statistics.setTrojan(context.integerValue("DescribeStatisticsResponse.Statistics.Trojan"));
		statistics.setVulLaterSum(context.integerValue("DescribeStatisticsResponse.Statistics.VulLaterSum"));
		statistics.setSuspicious(context.integerValue("DescribeStatisticsResponse.Statistics.Suspicious"));
		statistics.setVul(context.integerValue("DescribeStatisticsResponse.Statistics.Vul"));
		statistics.setHealthhighTotal(context.integerValue("DescribeStatisticsResponse.Statistics.HealthhighTotal"));
		statistics.setHealthlowTotal(context.integerValue("DescribeStatisticsResponse.Statistics.HealthlowTotal"));
		statistics.setHealthseriousTotal(context.integerValue("DescribeStatisticsResponse.Statistics.HealthseriousTotal"));
		statistics.setVulDealedTotal(context.integerValue("DescribeStatisticsResponse.Statistics.VulDealedTotal"));
		statistics.setPatch(context.integerValue("DescribeStatisticsResponse.Statistics.Patch"));
		statistics.setSuspicioushighTotal(context.integerValue("DescribeStatisticsResponse.Statistics.SuspicioushighTotal"));
		statistics.setSuspiciouslowTotal(context.integerValue("DescribeStatisticsResponse.Statistics.SuspiciouslowTotal"));
		statistics.setSuspiciousTotal(context.integerValue("DescribeStatisticsResponse.Statistics.SuspiciousTotal"));
		statistics.setVulTotal(context.integerValue("DescribeStatisticsResponse.Statistics.VulTotal"));
		statistics.setSuspiciousseriousTotal(context.integerValue("DescribeStatisticsResponse.Statistics.SuspiciousseriousTotal"));
		statistics.setHealthmediumTotal(context.integerValue("DescribeStatisticsResponse.Statistics.HealthmediumTotal"));
		statistics.setOnline(context.booleanValue("DescribeStatisticsResponse.Statistics.Online"));
		statistics.setSuspiciousdealedTotal(context.integerValue("DescribeStatisticsResponse.Statistics.SuspiciousdealedTotal"));
		statistics.setAccount(context.integerValue("DescribeStatisticsResponse.Statistics.Account"));
		describeStatisticsResponse.setStatistics(statistics);
	 
	 	return describeStatisticsResponse;
	}
}