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
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyResponse.StrategiesItem;
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyResponse.StrategiesItem.ConfigTarget;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStratetyResponseUnmarshaller {

	public static DescribeStratetyResponse unmarshall(DescribeStratetyResponse describeStratetyResponse, UnmarshallerContext context) {
		
		describeStratetyResponse.setRequestId(context.stringValue("DescribeStratetyResponse.RequestId"));

		List<StrategiesItem> strategies = new ArrayList<StrategiesItem>();
		for (int i = 0; i < context.lengthValue("DescribeStratetyResponse.Strategies.Length"); i++) {
			StrategiesItem strategiesItem = new StrategiesItem();
			strategiesItem.setCycleDays(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].CycleDays"));
			strategiesItem.setId(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].Id"));
			strategiesItem.setCycleStartTime(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].CycleStartTime"));
			strategiesItem.setType(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].Type"));
			strategiesItem.setName(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].Name"));
			strategiesItem.setRiskCount(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].RiskCount"));
			strategiesItem.setEcsCount(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].EcsCount"));
			strategiesItem.setExecStatus(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].ExecStatus"));
			strategiesItem.setProcessRate(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].ProcessRate"));

			List<ConfigTarget> configTargets = new ArrayList<ConfigTarget>();
			for (int j = 0; j < context.lengthValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets.Length"); j++) {
				ConfigTarget configTarget = new ConfigTarget();
				configTarget.setFlag(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].Flag"));
				configTarget.setTargetType(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].TargetType"));
				configTarget.setTarget(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].Target"));

				configTargets.add(configTarget);
			}
			strategiesItem.setConfigTargets(configTargets);

			strategies.add(strategiesItem);
		}
		describeStratetyResponse.setStrategies(strategies);
	 
	 	return describeStratetyResponse;
	}
}