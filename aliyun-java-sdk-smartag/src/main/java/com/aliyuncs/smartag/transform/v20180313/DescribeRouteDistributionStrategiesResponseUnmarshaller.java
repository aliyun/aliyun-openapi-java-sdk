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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeRouteDistributionStrategiesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeRouteDistributionStrategiesResponse.Strategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouteDistributionStrategiesResponseUnmarshaller {

	public static DescribeRouteDistributionStrategiesResponse unmarshall(DescribeRouteDistributionStrategiesResponse describeRouteDistributionStrategiesResponse, UnmarshallerContext _ctx) {
		
		describeRouteDistributionStrategiesResponse.setRequestId(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.RequestId"));
		describeRouteDistributionStrategiesResponse.setTotalCount(_ctx.integerValue("DescribeRouteDistributionStrategiesResponse.TotalCount"));
		describeRouteDistributionStrategiesResponse.setPageNumber(_ctx.integerValue("DescribeRouteDistributionStrategiesResponse.PageNumber"));
		describeRouteDistributionStrategiesResponse.setPageSize(_ctx.integerValue("DescribeRouteDistributionStrategiesResponse.PageSize"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouteDistributionStrategiesResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setCreateTime(_ctx.longValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].CreateTime"));
			strategy.setInstanceId(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].InstanceId"));
			strategy.setSmartAGId(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].SmartAGId"));
			strategy.setHcInstanceId(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].HcInstanceId"));
			strategy.setSourceType(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].SourceType"));
			strategy.setDestCidrBlock(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].DestCidrBlock"));
			strategy.setRouteSource(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].RouteSource"));
			strategy.setRouteDistribution(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].RouteDistribution"));
			strategy.setStatus(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].Status"));
			strategy.setIsConflict(_ctx.booleanValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].IsConflict"));
			strategy.setStrategyPublishStatus(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].StrategyPublishStatus"));
			strategy.setConflictInfo(_ctx.stringValue("DescribeRouteDistributionStrategiesResponse.Strategies["+ i +"].ConflictInfo"));

			strategies.add(strategy);
		}
		describeRouteDistributionStrategiesResponse.setStrategies(strategies);
	 
	 	return describeRouteDistributionStrategiesResponse;
	}
}