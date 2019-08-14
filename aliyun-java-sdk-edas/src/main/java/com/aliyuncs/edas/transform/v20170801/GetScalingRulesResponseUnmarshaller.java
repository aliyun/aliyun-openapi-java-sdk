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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetScalingRulesResponse;
import com.aliyuncs.edas.model.v20170801.GetScalingRulesResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetScalingRulesResponse.Data.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScalingRulesResponseUnmarshaller {

	public static GetScalingRulesResponse unmarshall(GetScalingRulesResponse getScalingRulesResponse, UnmarshallerContext _ctx) {
		
		getScalingRulesResponse.setRequestId(_ctx.stringValue("GetScalingRulesResponse.RequestId"));
		getScalingRulesResponse.setCode(_ctx.integerValue("GetScalingRulesResponse.Code"));
		getScalingRulesResponse.setMessage(_ctx.stringValue("GetScalingRulesResponse.Message"));
		getScalingRulesResponse.setUpdateTime(_ctx.longValue("GetScalingRulesResponse.UpdateTime"));

		Data data = new Data();
		data.setClusterType(_ctx.integerValue("GetScalingRulesResponse.Data.ClusterType"));
		data.setOversoldFactor(_ctx.integerValue("GetScalingRulesResponse.Data.OversoldFactor"));
		data.setVpcId(_ctx.stringValue("GetScalingRulesResponse.Data.VpcId"));
		data.setUpdateTime(_ctx.longValue("GetScalingRulesResponse.Data.UpdateTime"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("GetScalingRulesResponse.Data.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setAppId(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].AppId"));
			rule.setGroupId(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].GroupId"));
			rule.setEnable(_ctx.booleanValue("GetScalingRulesResponse.Data.RuleList["+ i +"].Enable"));
			rule.setMode(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].Mode"));
			rule.setCond(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].Cond"));
			rule.setCpu(_ctx.integerValue("GetScalingRulesResponse.Data.RuleList["+ i +"].Cpu"));
			rule.setRt(_ctx.integerValue("GetScalingRulesResponse.Data.RuleList["+ i +"].Rt"));
			rule.setResourceFrom(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].ResourceFrom"));
			rule.setStep(_ctx.integerValue("GetScalingRulesResponse.Data.RuleList["+ i +"].Step"));
			rule.setInstNum(_ctx.integerValue("GetScalingRulesResponse.Data.RuleList["+ i +"].InstNum"));
			rule.setLoadNum(_ctx.integerValue("GetScalingRulesResponse.Data.RuleList["+ i +"].LoadNum"));
			rule.setTemplateId(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].TemplateId"));
			rule.setTemplateVersion(_ctx.integerValue("GetScalingRulesResponse.Data.RuleList["+ i +"].TemplateVersion"));
			rule.setVpcId(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].VpcId"));
			rule.setMetricType(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].MetricType"));
			rule.setVSwitchIds(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].VSwitchIds"));
			rule.setMultiAzPolicy(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].MultiAzPolicy"));
			rule.setSpecId(_ctx.stringValue("GetScalingRulesResponse.Data.RuleList["+ i +"].SpecId"));
			rule.setDuration(_ctx.integerValue("GetScalingRulesResponse.Data.RuleList["+ i +"].Duration"));
			rule.setCreateTime(_ctx.longValue("GetScalingRulesResponse.Data.RuleList["+ i +"].CreateTime"));
			rule.setUpdateTime(_ctx.longValue("GetScalingRulesResponse.Data.RuleList["+ i +"].UpdateTime"));

			ruleList.add(rule);
		}
		data.setRuleList(ruleList);
		getScalingRulesResponse.setData(data);
	 
	 	return getScalingRulesResponse;
	}
}