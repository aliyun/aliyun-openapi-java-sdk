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

import com.aliyuncs.sas.model.v20181203.DescribeStrategyResponse;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyResponse.Strategy;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyResponse.Strategy.ConfigTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStrategyResponseUnmarshaller {

	public static DescribeStrategyResponse unmarshall(DescribeStrategyResponse describeStrategyResponse, UnmarshallerContext _ctx) {
		
		describeStrategyResponse.setRequestId(_ctx.stringValue("DescribeStrategyResponse.RequestId"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStrategyResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setCycleDays(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].CycleDays"));
			strategy.setId(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].Id"));
			strategy.setCycleStartTime(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].CycleStartTime"));
			strategy.setType(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].Type"));
			strategy.setName(_ctx.stringValue("DescribeStrategyResponse.Strategies["+ i +"].Name"));
			strategy.setRiskCount(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].RiskCount"));
			strategy.setEcsCount(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].EcsCount"));
			strategy.setExecStatus(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].ExecStatus"));
			strategy.setProcessRate(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].ProcessRate"));
			strategy.setPassRate(_ctx.integerValue("DescribeStrategyResponse.Strategies["+ i +"].PassRate"));
			strategy.setAuthVersionList(_ctx.stringValue("DescribeStrategyResponse.Strategies["+ i +"].AuthVersionList"));

			List<ConfigTarget> configTargets = new ArrayList<ConfigTarget>();
			for (int j = 0; j < _ctx.lengthValue("DescribeStrategyResponse.Strategies["+ i +"].ConfigTargets.Length"); j++) {
				ConfigTarget configTarget = new ConfigTarget();
				configTarget.setFlag(_ctx.stringValue("DescribeStrategyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].Flag"));
				configTarget.setTargetType(_ctx.stringValue("DescribeStrategyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].TargetType"));
				configTarget.setTarget(_ctx.stringValue("DescribeStrategyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].Target"));

				configTargets.add(configTarget);
			}
			strategy.setConfigTargets(configTargets);

			strategies.add(strategy);
		}
		describeStrategyResponse.setStrategies(strategies);
	 
	 	return describeStrategyResponse;
	}
}