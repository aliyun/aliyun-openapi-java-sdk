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

	public static DescribeGtmAccessStrategiesResponse unmarshall(DescribeGtmAccessStrategiesResponse describeGtmAccessStrategiesResponse, UnmarshallerContext _ctx) {
		
		describeGtmAccessStrategiesResponse.setRequestId(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.RequestId"));
		describeGtmAccessStrategiesResponse.setTotalItems(_ctx.integerValue("DescribeGtmAccessStrategiesResponse.TotalItems"));
		describeGtmAccessStrategiesResponse.setTotalPages(_ctx.integerValue("DescribeGtmAccessStrategiesResponse.TotalPages"));
		describeGtmAccessStrategiesResponse.setPageNumber(_ctx.integerValue("DescribeGtmAccessStrategiesResponse.PageNumber"));
		describeGtmAccessStrategiesResponse.setPageSize(_ctx.integerValue("DescribeGtmAccessStrategiesResponse.PageSize"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmAccessStrategiesResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setStrategyId(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].StrategyId"));
			strategy.setStrategyName(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].StrategyName"));
			strategy.setCreateTime(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].CreateTime"));
			strategy.setCreateTimestamp(_ctx.longValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].CreateTimestamp"));
			strategy.setDefaultAddrPoolId(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].DefaultAddrPoolId"));
			strategy.setDefaultAddrPoolName(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].DefaultAddrPoolName"));
			strategy.setFailoverAddrPoolId(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].FailoverAddrPoolId"));
			strategy.setFailoverAddrPoolName(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].FailoverAddrPoolName"));
			strategy.setAccessMode(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].AccessMode"));
			strategy.setAccessStatus(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].AccessStatus"));
			strategy.setStrategyMode(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].StrategyMode"));
			strategy.setInstanceId(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].InstanceId"));

			List<Line> lines = new ArrayList<Line>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines.Length"); j++) {
				Line line = new Line();
				line.setLineCode(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].LineCode"));
				line.setLineName(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].LineName"));
				line.setGroupCode(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].GroupCode"));
				line.setGroupName(_ctx.stringValue("DescribeGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].GroupName"));

				lines.add(line);
			}
			strategy.setLines(lines);

			strategies.add(strategy);
		}
		describeGtmAccessStrategiesResponse.setStrategies(strategies);
	 
	 	return describeGtmAccessStrategiesResponse;
	}
}