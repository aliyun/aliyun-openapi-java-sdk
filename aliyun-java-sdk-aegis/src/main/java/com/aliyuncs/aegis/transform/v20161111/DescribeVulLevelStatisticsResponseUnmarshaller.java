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

import com.aliyuncs.aegis.model.v20161111.DescribeVulLevelStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeVulLevelStatisticsResponse.LevelStatistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulLevelStatisticsResponseUnmarshaller {

	public static DescribeVulLevelStatisticsResponse unmarshall(DescribeVulLevelStatisticsResponse describeVulLevelStatisticsResponse, UnmarshallerContext context) {
		
		describeVulLevelStatisticsResponse.setRequestId(context.stringValue("DescribeVulLevelStatisticsResponse.RequestId"));
		describeVulLevelStatisticsResponse.setTotalCount(context.integerValue("DescribeVulLevelStatisticsResponse.TotalCount"));

		List<LevelStatistic> levelStatistics = new ArrayList<LevelStatistic>();
		for (int i = 0; i < context.lengthValue("DescribeVulLevelStatisticsResponse.LevelStatistics.Length"); i++) {
			LevelStatistic levelStatistic = new LevelStatistic();
			levelStatistic.setLevel(context.stringValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].Level"));
			levelStatistic.setCveNum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].CveNum"));
			levelStatistic.setEmgNum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].EmgNum"));
			levelStatistic.setSysNum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].SysNum"));
			levelStatistic.setCmsNum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].CmsNum"));
			levelStatistic.setCmsDealedTotalNum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].CmsDealedTotalNum"));
			levelStatistic.setVulDealedTotalNum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].VulDealedTotalNum"));
			levelStatistic.setVulAsapSum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].VulAsapSum"));
			levelStatistic.setVulLaterSum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].VulLaterSum"));
			levelStatistic.setVulNntfSum(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].VulNntfSum"));
			levelStatistic.setVulSeriousTotal(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].VulSeriousTotal"));
			levelStatistic.setVulHighTotal(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].VulHighTotal"));
			levelStatistic.setVulMediumTotal(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].VulMediumTotal"));
			levelStatistic.setVulLowTotal(context.integerValue("DescribeVulLevelStatisticsResponse.LevelStatistics["+ i +"].VulLowTotal"));

			levelStatistics.add(levelStatistic);
		}
		describeVulLevelStatisticsResponse.setLevelStatistics(levelStatistics);
	 
	 	return describeVulLevelStatisticsResponse;
	}
}