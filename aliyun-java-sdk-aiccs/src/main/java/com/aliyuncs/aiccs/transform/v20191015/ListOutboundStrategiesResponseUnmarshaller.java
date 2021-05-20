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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListOutboundStrategiesResponse;
import com.aliyuncs.aiccs.model.v20191015.ListOutboundStrategiesResponse.OutboundStrategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundStrategiesResponseUnmarshaller {

	public static ListOutboundStrategiesResponse unmarshall(ListOutboundStrategiesResponse listOutboundStrategiesResponse, UnmarshallerContext _ctx) {
		
		listOutboundStrategiesResponse.setRequestId(_ctx.stringValue("ListOutboundStrategiesResponse.RequestId"));
		listOutboundStrategiesResponse.setMessage(_ctx.stringValue("ListOutboundStrategiesResponse.Message"));
		listOutboundStrategiesResponse.setCode(_ctx.stringValue("ListOutboundStrategiesResponse.Code"));

		List<OutboundStrategy> outboundStrategies = new ArrayList<OutboundStrategy>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundStrategiesResponse.OutboundStrategies.Length"); i++) {
			OutboundStrategy outboundStrategy = new OutboundStrategy();
			outboundStrategy.setStatus(_ctx.integerValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].Status"));
			outboundStrategy.setRobotType(_ctx.integerValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].RobotType"));
			outboundStrategy.setOutboundStrategyId(_ctx.longValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].OutboundStrategyId"));
			outboundStrategy.setCreatorId(_ctx.longValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].CreatorId"));
			outboundStrategy.setOutboundNum(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].OutboundNum"));
			outboundStrategy.setRobotId(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].RobotId"));
			outboundStrategy.setExtAttr(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].ExtAttr"));
			outboundStrategy.setModifierName(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].ModifierName"));
			outboundStrategy.setProcess(_ctx.integerValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].Process"));
			outboundStrategy.setSuccessRate(_ctx.integerValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].SuccessRate"));
			outboundStrategy.setResourceAllocation(_ctx.integerValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].ResourceAllocation"));
			outboundStrategy.setGmtCreateStr(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].GmtCreateStr"));
			outboundStrategy.setOutboundStrategyName(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].OutboundStrategyName"));
			outboundStrategy.setGmtModifiedStr(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].GmtModifiedStr"));
			outboundStrategy.setBuId(_ctx.longValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].BuId"));
			outboundStrategy.setSceneName(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].SceneName"));
			outboundStrategy.setNumType(_ctx.integerValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].NumType"));
			outboundStrategy.setRobotName(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].RobotName"));
			outboundStrategy.setDepartmentId(_ctx.longValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].DepartmentId"));
			outboundStrategy.setRuleCode(_ctx.longValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].RuleCode"));
			outboundStrategy.setCreatorName(_ctx.stringValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].CreatorName"));
			outboundStrategy.setModifierId(_ctx.longValue("ListOutboundStrategiesResponse.OutboundStrategies["+ i +"].ModifierId"));

			outboundStrategies.add(outboundStrategy);
		}
		listOutboundStrategiesResponse.setOutboundStrategies(outboundStrategies);
	 
	 	return listOutboundStrategiesResponse;
	}
}