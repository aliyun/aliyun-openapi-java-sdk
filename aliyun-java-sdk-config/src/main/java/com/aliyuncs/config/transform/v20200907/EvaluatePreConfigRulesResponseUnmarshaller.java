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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.EvaluatePreConfigRulesResponse;
import com.aliyuncs.config.model.v20200907.EvaluatePreConfigRulesResponse.ResourceEvaluation;
import com.aliyuncs.config.model.v20200907.EvaluatePreConfigRulesResponse.ResourceEvaluation.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class EvaluatePreConfigRulesResponseUnmarshaller {

	public static EvaluatePreConfigRulesResponse unmarshall(EvaluatePreConfigRulesResponse evaluatePreConfigRulesResponse, UnmarshallerContext _ctx) {
		
		evaluatePreConfigRulesResponse.setRequestId(_ctx.stringValue("EvaluatePreConfigRulesResponse.RequestId"));

		List<ResourceEvaluation> resourceEvaluations = new ArrayList<ResourceEvaluation>();
		for (int i = 0; i < _ctx.lengthValue("EvaluatePreConfigRulesResponse.ResourceEvaluations.Length"); i++) {
			ResourceEvaluation resourceEvaluation = new ResourceEvaluation();
			resourceEvaluation.setResourceLogicalId(_ctx.stringValue("EvaluatePreConfigRulesResponse.ResourceEvaluations["+ i +"].ResourceLogicalId"));
			resourceEvaluation.setResourceType(_ctx.stringValue("EvaluatePreConfigRulesResponse.ResourceEvaluations["+ i +"].ResourceType"));

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("EvaluatePreConfigRulesResponse.ResourceEvaluations["+ i +"].Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setIdentifier(_ctx.stringValue("EvaluatePreConfigRulesResponse.ResourceEvaluations["+ i +"].Rules["+ j +"].Identifier"));
				rule.setComplianceType(_ctx.stringValue("EvaluatePreConfigRulesResponse.ResourceEvaluations["+ i +"].Rules["+ j +"].ComplianceType"));
				rule.setAnnotation(_ctx.stringValue("EvaluatePreConfigRulesResponse.ResourceEvaluations["+ i +"].Rules["+ j +"].Annotation"));
				rule.setHelpUrl(_ctx.stringValue("EvaluatePreConfigRulesResponse.ResourceEvaluations["+ i +"].Rules["+ j +"].HelpUrl"));

				rules.add(rule);
			}
			resourceEvaluation.setRules(rules);

			resourceEvaluations.add(resourceEvaluation);
		}
		evaluatePreConfigRulesResponse.setResourceEvaluations(resourceEvaluations);
	 
	 	return evaluatePreConfigRulesResponse;
	}
}