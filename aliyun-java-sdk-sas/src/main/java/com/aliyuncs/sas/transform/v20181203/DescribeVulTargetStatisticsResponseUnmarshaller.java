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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeVulTargetStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVulTargetStatisticsResponse.TargetStat;
import com.aliyuncs.sas.model.v20181203.DescribeVulTargetStatisticsResponse.TargetStat.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulTargetStatisticsResponseUnmarshaller {

	public static DescribeVulTargetStatisticsResponse unmarshall(DescribeVulTargetStatisticsResponse describeVulTargetStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeVulTargetStatisticsResponse.setRequestId(_ctx.stringValue("DescribeVulTargetStatisticsResponse.RequestId"));
		describeVulTargetStatisticsResponse.setCurrentPage(_ctx.integerValue("DescribeVulTargetStatisticsResponse.CurrentPage"));
		describeVulTargetStatisticsResponse.setPageSize(_ctx.integerValue("DescribeVulTargetStatisticsResponse.PageSize"));
		describeVulTargetStatisticsResponse.setTotalCount(_ctx.integerValue("DescribeVulTargetStatisticsResponse.TotalCount"));

		List<TargetStat> targetStats = new ArrayList<TargetStat>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulTargetStatisticsResponse.TargetStats.Length"); i++) {
			TargetStat targetStat = new TargetStat();
			targetStat.setVulType(_ctx.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].VulType"));
			targetStat.setTotalCount(_ctx.integerValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].TotalCount"));
			targetStat.setUuidCount(_ctx.integerValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].UuidCount"));

			List<Target> targets = new ArrayList<Target>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].Targets.Length"); j++) {
				Target target = new Target();
				target.setFlag(_ctx.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].Targets["+ j +"].Flag"));
				target.setTarget(_ctx.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].Targets["+ j +"].Target"));
				target.setTargetType(_ctx.stringValue("DescribeVulTargetStatisticsResponse.TargetStats["+ i +"].Targets["+ j +"].TargetType"));

				targets.add(target);
			}
			targetStat.setTargets(targets);

			targetStats.add(targetStat);
		}
		describeVulTargetStatisticsResponse.setTargetStats(targetStats);
	 
	 	return describeVulTargetStatisticsResponse;
	}
}