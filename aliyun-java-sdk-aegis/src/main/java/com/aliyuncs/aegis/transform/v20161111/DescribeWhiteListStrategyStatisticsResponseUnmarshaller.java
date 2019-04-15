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

import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListStrategyStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListStrategyStatisticsResponse.Strategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhiteListStrategyStatisticsResponseUnmarshaller {

	public static DescribeWhiteListStrategyStatisticsResponse unmarshall(DescribeWhiteListStrategyStatisticsResponse describeWhiteListStrategyStatisticsResponse, UnmarshallerContext context) {
		
		describeWhiteListStrategyStatisticsResponse.setRequestId(context.stringValue("DescribeWhiteListStrategyStatisticsResponse.RequestId"));
		describeWhiteListStrategyStatisticsResponse.setCount(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.Count"));
		describeWhiteListStrategyStatisticsResponse.setPageSize(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.PageSize"));
		describeWhiteListStrategyStatisticsResponse.setTotalCount(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.TotalCount"));
		describeWhiteListStrategyStatisticsResponse.setCurrentPage(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.CurrentPage"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < context.lengthValue("DescribeWhiteListStrategyStatisticsResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setStrategyId(context.longValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].StrategyId"));
			strategy.setStrategyName(context.stringValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].StrategyName"));
			strategy.setStudyTime(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].StudyTime"));
			strategy.setAssetCount(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].AssetCount"));
			strategy.setStatus(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].Status"));
			strategy.setTrustProcCount(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].TrustProcCount"));
			strategy.setSuspiciousProcCount(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].SuspiciousProcCount"));
			strategy.setVirusProcCount(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].VirusProcCount"));
			strategy.setProgress(context.integerValue("DescribeWhiteListStrategyStatisticsResponse.Strategies["+ i +"].Progress"));

			strategies.add(strategy);
		}
		describeWhiteListStrategyStatisticsResponse.setStrategies(strategies);
	 
	 	return describeWhiteListStrategyStatisticsResponse;
	}
}