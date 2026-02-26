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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.GetRuleResponse;
import com.aliyuncs.eventbridge.model.v20200401.GetRuleResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.GetRuleResponse.Data.TargetsItem;
import com.aliyuncs.eventbridge.model.v20200401.GetRuleResponse.Data.TargetsItem.ConcurrentConfig;
import com.aliyuncs.eventbridge.model.v20200401.GetRuleResponse.Data.TargetsItem.DeadLetterQueue;
import com.aliyuncs.eventbridge.model.v20200401.GetRuleResponse.Data.TargetsItem.ParamListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleResponseUnmarshaller {

	public static GetRuleResponse unmarshall(GetRuleResponse getRuleResponse, UnmarshallerContext _ctx) {
		
		getRuleResponse.setRequestId(_ctx.stringValue("GetRuleResponse.RequestId"));
		getRuleResponse.setMessage(_ctx.stringValue("GetRuleResponse.Message"));
		getRuleResponse.setCode(_ctx.stringValue("GetRuleResponse.Code"));
		getRuleResponse.setSuccess(_ctx.booleanValue("GetRuleResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetRuleResponse.Data.Status"));
		data.setEventBusName(_ctx.stringValue("GetRuleResponse.Data.EventBusName"));
		data.setRuleARN(_ctx.stringValue("GetRuleResponse.Data.RuleARN"));
		data.setDescription(_ctx.stringValue("GetRuleResponse.Data.Description"));
		data.setFilterPattern(_ctx.stringValue("GetRuleResponse.Data.FilterPattern"));
		data.setCreatedTimestamp(_ctx.longValue("GetRuleResponse.Data.CreatedTimestamp"));
		data.setRuleName(_ctx.stringValue("GetRuleResponse.Data.RuleName"));

		List<TargetsItem> targets = new ArrayList<TargetsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRuleResponse.Data.Targets.Length"); i++) {
			TargetsItem targetsItem = new TargetsItem();
			targetsItem.setDetailMap(_ctx.mapValue("GetRuleResponse.Data.Targets["+ i +"].DetailMap"));
			targetsItem.setType(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].Type"));
			targetsItem.setEndpoint(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].Endpoint"));
			targetsItem.setPushSelector(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].PushSelector"));
			targetsItem.setId(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].Id"));
			targetsItem.setPushRetryStrategy(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].PushRetryStrategy"));
			targetsItem.setErrorsTolerance(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].ErrorsTolerance"));

			DeadLetterQueue deadLetterQueue = new DeadLetterQueue();
			deadLetterQueue.setArn(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].DeadLetterQueue.Arn"));
			deadLetterQueue.setNetwork(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].DeadLetterQueue.Network"));
			deadLetterQueue.setVpcId(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].DeadLetterQueue.VpcId"));
			deadLetterQueue.setVSwitchIds(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].DeadLetterQueue.VSwitchIds"));
			deadLetterQueue.setSecurityGroupId(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].DeadLetterQueue.SecurityGroupId"));
			targetsItem.setDeadLetterQueue(deadLetterQueue);

			ConcurrentConfig concurrentConfig = new ConcurrentConfig();
			concurrentConfig.setConcurrency(_ctx.longValue("GetRuleResponse.Data.Targets["+ i +"].ConcurrentConfig.Concurrency"));
			targetsItem.setConcurrentConfig(concurrentConfig);

			List<ParamListItem> paramList = new ArrayList<ParamListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetRuleResponse.Data.Targets["+ i +"].ParamList.Length"); j++) {
				ParamListItem paramListItem = new ParamListItem();
				paramListItem.setValue(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].ParamList["+ j +"].Value"));
				paramListItem.setTemplate(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].ParamList["+ j +"].Template"));
				paramListItem.setForm(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].ParamList["+ j +"].Form"));
				paramListItem.setResourceKey(_ctx.stringValue("GetRuleResponse.Data.Targets["+ i +"].ParamList["+ j +"].ResourceKey"));

				paramList.add(paramListItem);
			}
			targetsItem.setParamList(paramList);

			targets.add(targetsItem);
		}
		data.setTargets(targets);
		getRuleResponse.setData(data);
	 
	 	return getRuleResponse;
	}
}