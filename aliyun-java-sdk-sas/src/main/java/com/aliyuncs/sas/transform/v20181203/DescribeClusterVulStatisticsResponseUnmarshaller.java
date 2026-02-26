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

import com.aliyuncs.sas.model.v20181203.DescribeClusterVulStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeClusterVulStatisticsResponse.VulStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterVulStatisticsResponseUnmarshaller {

	public static DescribeClusterVulStatisticsResponse unmarshall(DescribeClusterVulStatisticsResponse describeClusterVulStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeClusterVulStatisticsResponse.setRequestId(_ctx.stringValue("DescribeClusterVulStatisticsResponse.RequestId"));

		VulStat vulStat = new VulStat();
		vulStat.setAsapCount(_ctx.stringValue("DescribeClusterVulStatisticsResponse.VulStat.AsapCount"));
		vulStat.setLaterCount(_ctx.stringValue("DescribeClusterVulStatisticsResponse.VulStat.LaterCount"));
		vulStat.setNntfCount(_ctx.stringValue("DescribeClusterVulStatisticsResponse.VulStat.NntfCount"));
		describeClusterVulStatisticsResponse.setVulStat(vulStat);
	 
	 	return describeClusterVulStatisticsResponse;
	}
}