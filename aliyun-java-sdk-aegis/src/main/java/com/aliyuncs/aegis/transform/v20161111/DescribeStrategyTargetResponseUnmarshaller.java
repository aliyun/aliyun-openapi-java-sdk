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

import com.aliyuncs.aegis.model.v20161111.DescribeStrategyTargetResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeStrategyTargetResponse.StringItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStrategyTargetResponseUnmarshaller {

	public static DescribeStrategyTargetResponse unmarshall(DescribeStrategyTargetResponse describeStrategyTargetResponse, UnmarshallerContext context) {
		
		describeStrategyTargetResponse.setRequestId(context.stringValue("DescribeStrategyTargetResponse.RequestId"));
		describeStrategyTargetResponse.setCount(context.integerValue("DescribeStrategyTargetResponse.Count"));

		List<StringItem> strategyTargets = new ArrayList<StringItem>();
		for (int i = 0; i < context.lengthValue("DescribeStrategyTargetResponse.StrategyTargets.Length"); i++) {
			StringItem stringItem = new StringItem();
			stringItem.setFlag(context.stringValue("DescribeStrategyTargetResponse.StrategyTargets["+ i +"].Flag"));
			stringItem.setTarget(context.stringValue("DescribeStrategyTargetResponse.StrategyTargets["+ i +"].Target"));
			stringItem.setTargetType(context.stringValue("DescribeStrategyTargetResponse.StrategyTargets["+ i +"].TargetType"));

			strategyTargets.add(stringItem);
		}
		describeStrategyTargetResponse.setStrategyTargets(strategyTargets);
	 
	 	return describeStrategyTargetResponse;
	}
}