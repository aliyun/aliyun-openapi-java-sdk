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

import com.aliyuncs.sas.model.v20181203.DescribeStrategyTargetResponse;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyTargetResponse.StrategyTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStrategyTargetResponseUnmarshaller {

	public static DescribeStrategyTargetResponse unmarshall(DescribeStrategyTargetResponse describeStrategyTargetResponse, UnmarshallerContext _ctx) {
		
		describeStrategyTargetResponse.setRequestId(_ctx.stringValue("DescribeStrategyTargetResponse.RequestId"));

		List<StrategyTarget> strategyTargets = new ArrayList<StrategyTarget>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStrategyTargetResponse.StrategyTargets.Length"); i++) {
			StrategyTarget strategyTarget = new StrategyTarget();
			strategyTarget.setFlag(_ctx.stringValue("DescribeStrategyTargetResponse.StrategyTargets["+ i +"].Flag"));
			strategyTarget.setTarget(_ctx.stringValue("DescribeStrategyTargetResponse.StrategyTargets["+ i +"].Target"));
			strategyTarget.setTargetType(_ctx.stringValue("DescribeStrategyTargetResponse.StrategyTargets["+ i +"].TargetType"));
			strategyTarget.setBindUuidCount(_ctx.integerValue("DescribeStrategyTargetResponse.StrategyTargets["+ i +"].BindUuidCount"));

			strategyTargets.add(strategyTarget);
		}
		describeStrategyTargetResponse.setStrategyTargets(strategyTargets);
	 
	 	return describeStrategyTargetResponse;
	}
}