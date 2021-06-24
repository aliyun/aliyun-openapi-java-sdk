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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnoseRuleDefinitionResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDiagnoseRuleDefinitionResponseUnmarshaller {

	public static OpsDescribeDiagnoseRuleDefinitionResponse unmarshall(OpsDescribeDiagnoseRuleDefinitionResponse opsDescribeDiagnoseRuleDefinitionResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDiagnoseRuleDefinitionResponse.setRequestId(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.RequestId"));
		opsDescribeDiagnoseRuleDefinitionResponse.setTotalCount(_ctx.integerValue("OpsDescribeDiagnoseRuleDefinitionResponse.TotalCount"));
		opsDescribeDiagnoseRuleDefinitionResponse.setPage(_ctx.integerValue("OpsDescribeDiagnoseRuleDefinitionResponse.Page"));
		opsDescribeDiagnoseRuleDefinitionResponse.setPageSize(_ctx.integerValue("OpsDescribeDiagnoseRuleDefinitionResponse.PageSize"));
		opsDescribeDiagnoseRuleDefinitionResponse.setCount(_ctx.integerValue("OpsDescribeDiagnoseRuleDefinitionResponse.Count"));

		List<ComplexRule> complexRules = new ArrayList<ComplexRule>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules.Length"); i++) {
			ComplexRule complexRule = new ComplexRule();
			complexRule.setName(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Name"));
			complexRule.setType(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Type"));
			complexRule.setDesc(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Desc"));
			complexRule.setLevel(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Level"));
			complexRule.setSilent(_ctx.longValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Silent"));
			complexRule.setReason(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Reason"));
			complexRule.setMaxTimes(_ctx.integerValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].MaxTimes"));
			complexRule.setDelayExec(_ctx.integerValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].DelayExec"));
			complexRule.setEnable(_ctx.booleanValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Enable"));
			complexRule.setOpsType(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].OpsType"));

			List<String> actions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Actions.Length"); j++) {
				actions.add(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Actions["+ j +"]"));
			}
			complexRule.setActions(actions);

			List<String> relatedFeatureName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].RelatedFeatureName.Length"); j++) {
				relatedFeatureName.add(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].RelatedFeatureName["+ j +"]"));
			}
			complexRule.setRelatedFeatureName(relatedFeatureName);

			List<String> conditions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Conditions.Length"); j++) {
				conditions.add(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Conditions["+ j +"]"));
			}
			complexRule.setConditions(conditions);

			List<String> exclusions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Exclusions.Length"); j++) {
				exclusions.add(_ctx.stringValue("OpsDescribeDiagnoseRuleDefinitionResponse.ComplexRules["+ i +"].Exclusions["+ j +"]"));
			}
			complexRule.setExclusions(exclusions);

			complexRules.add(complexRule);
		}
		opsDescribeDiagnoseRuleDefinitionResponse.setComplexRules(complexRules);
	 
	 	return opsDescribeDiagnoseRuleDefinitionResponse;
	}
}