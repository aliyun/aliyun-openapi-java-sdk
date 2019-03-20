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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeGtmAccessStrategiesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmAccessStrategiesResponse.Strategy;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmAccessStrategiesResponse.Strategy.Line;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmAccessStrategiesResponseUnmarshaller {

	public static DescribeGtmAccessStrategiesResponse unmarshall(DescribeGtmAccessStrategiesResponse describeGtmAccessStrategiesResponse, UnmarshallerContext context) {
		
		describeGtmAccessStrategiesResponse.setRequestId(context.stringValue("DescribeGtmAccessStrategiesResponse.RequestId"));
		describeGtmAccessStrategiesResponse.setTotalItems(context.integerValue("DescribeGtmAccessStrategiesResponse.TotalItems"));
		describeGtmAccessStrategiesResponse.setTotalPages(context.integerValue("DescribeGtmAccessStrategiesResponse.TotalPages"));
		describeGtmAccessStrategiesResponse.setPageNumber(context.integerValue("DescribeGtmAccessStrategiesResponse.PageNumber"));
		describeGtmAccessStrategiesResponse.setPageSize(context.integerValue("DescribeGtmAccessStrategiesResponse.PageSize"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < context.lengthValue("DescribeGtmAccessStrategiesResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setStrategyId(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].StrategyId"));
			strategy.setStrategyName(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].StrategyName"));
			strategy.setCreateTime(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].CreateTime"));
			strategy.setCreateTimestamp(context.longValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].CreateTimestamp"));
			strategy.setDefaultAddrPoolId(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].DefaultAddrPoolId"));
			strategy.setDefaultAddrPoolName(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].DefaultAddrPoolName"));
			strategy.setFailoverAddrPoolId(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].FailoverAddrPoolId"));
			strategy.setFailoverAddrPoolName(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].FailoverAddrPoolName"));
			strategy.setAccessMode(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].AccessMode"));
			strategy.setAccessStatus(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].AccessStatus"));
			strategy.setStrategyMode(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].StrategyMode"));
			strategy.setInstanceId(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].InstanceId"));

			List<Line> lines = new ArrayList<Line>();
			for (int j = 0; j < context.lengthValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines.Length"); j++) {
				Line line = new Line();
				line.setLineCode(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].LineCode"));
				line.setLineName(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].LineName"));
				line.setGroupCode(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].GroupCode"));
				line.setGroupName(context.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].GroupName"));

				lines.add(line);
			}
			strategy.setLines(lines);

			strategies.add(strategy);
		}
		describeGtmAccessStrategiesResponse.setStrategies(strategies);
	 
	 	return describeGtmAccessStrategiesResponse;
	}
}