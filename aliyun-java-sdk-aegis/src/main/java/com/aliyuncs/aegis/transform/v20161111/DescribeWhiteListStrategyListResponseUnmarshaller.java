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

import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListStrategyListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWhiteListStrategyListResponse.Strategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhiteListStrategyListResponseUnmarshaller {

	public static DescribeWhiteListStrategyListResponse unmarshall(DescribeWhiteListStrategyListResponse describeWhiteListStrategyListResponse, UnmarshallerContext context) {
		
		describeWhiteListStrategyListResponse.setRequestId(context.stringValue("DescribeWhiteListStrategyListResponse.RequestId"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < context.lengthValue("DescribeWhiteListStrategyListResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setStrategyId(context.longValue("DescribeWhiteListStrategyListResponse.Strategies["+ i +"].StrategyId"));
			strategy.setStrategyName(context.stringValue("DescribeWhiteListStrategyListResponse.Strategies["+ i +"].StrategyName"));
			strategy.setStudyTime(context.integerValue("DescribeWhiteListStrategyListResponse.Strategies["+ i +"].StudyTime"));
			strategy.setStatus(context.integerValue("DescribeWhiteListStrategyListResponse.Strategies["+ i +"].Status"));

			strategies.add(strategy);
		}
		describeWhiteListStrategyListResponse.setStrategies(strategies);
	 
	 	return describeWhiteListStrategyListResponse;
	}
}