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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeVulTargetStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeVulTargetStatisticsResponse.TargetStat;
import com.aliyuncs.aegis.model.v20161111.DescribeVulTargetStatisticsResponse.TargetStat.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulTargetStatisticsResponseUnmarshaller {

	public static DescribeVulTargetStatisticsResponse unmarshall(DescribeVulTargetStatisticsResponse describeVulTargetStatisticsResponse, UnmarshallerContext context) {
		
		describeVulTargetStatisticsResponse.setRequestId(context.stringValue("DescribeVulTargetStatisticsResponse.RequestId"));
		describeVulTargetStatisticsResponse.setPageSize(context.integerValue("DescribeVulTargetStatisticsResponse.PageSize"));
		describeVulTargetStatisticsResponse.setCurrentPage(context.integerValue("DescribeVulTargetStatisticsResponse.CurrentPage"));
		describeVulTargetStatisticsResponse.setTotalCount(context.integerValue("DescribeVulTargetStatisticsResponse.TotalCount"));

		List<TargetStat> targetStats = new ArrayList<TargetStat>();
		for (int i = 0; i < context.lengthValue("DescribeVulTargetStatisticsResponse.TargetStats.Length"); i++) {
			TargetStat targetStat = new TargetStat();
			targetStat.setVulType(context.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].VulType"));
			targetStat.setUuidCount(context.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].UuidCount"));
			targetStat.setTotalCount(context.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].TotalCount"));

			List<Target> targets = new ArrayList<Target>();
			for (int j = 0; j < context.lengthValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].Targets.Length"); j++) {
				Target target = new Target();
				target.setTarget(context.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].Targets["+ j +"].Target"));
				target.setTargetType(context.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].Targets["+ j +"].TargetType"));
				target.setFlag(context.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].Targets["+ j +"].Flag"));

				targets.add(target);
			}
			targetStat.setTargets(targets);

			targetStats.add(targetStat);
		}
		describeVulTargetStatisticsResponse.setTargetStats(targetStats);
	 
	 	return describeVulTargetStatisticsResponse;
	}
}