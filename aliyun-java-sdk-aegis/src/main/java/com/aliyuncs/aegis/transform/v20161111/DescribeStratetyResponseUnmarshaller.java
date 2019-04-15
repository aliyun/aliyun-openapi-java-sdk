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

import com.aliyuncs.aegis.model.v20161111.DescribeStratetyResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyResponse.Strategy;
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyResponse.Strategy.ConfigTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStratetyResponseUnmarshaller {

	public static DescribeStratetyResponse unmarshall(DescribeStratetyResponse describeStratetyResponse, UnmarshallerContext context) {
		
		describeStratetyResponse.setRequestId(context.stringValue("DescribeStratetyResponse.RequestId"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < context.lengthValue("DescribeStratetyResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setCycleDays(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].CycleDays"));
			strategy.setId(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].Id"));
			strategy.setCycleStartTime(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].CycleStartTime"));
			strategy.setType(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].Type"));
			strategy.setName(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].Name"));
			strategy.setRiskCount(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].RiskCount"));
			strategy.setEcsCount(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].EcsCount"));
			strategy.setExecStatus(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].ExecStatus"));
			strategy.setProcessRate(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].ProcessRate"));
			strategy.setPassRate(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].PassRate"));

			List<ConfigTarget> configTargets = new ArrayList<ConfigTarget>();
			for (int j = 0; j < context.lengthValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets.Length"); j++) {
				ConfigTarget configTarget = new ConfigTarget();
				configTarget.setFlag(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].Flag"));
				configTarget.setTargetType(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].TargetType"));
				configTarget.setTarget(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].Target"));

				configTargets.add(configTarget);
			}
			strategy.setConfigTargets(configTargets);

			strategies.add(strategy);
		}
		describeStratetyResponse.setStrategies(strategies);
	 
	 	return describeStratetyResponse;
	}
}