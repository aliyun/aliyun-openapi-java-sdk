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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DisableEventRulesRequest extends RpcAcsRequest<DisableEventRulesResponse> {
	   

	private List<String> ruleNamess;
	public DisableEventRulesRequest() {
		super("Cms", "2019-01-01", "DisableEventRules", "cms");
		setMethod(MethodType.POST);
	}

	public List<String> getRuleNamess() {
		return this.ruleNamess;
	}

	public void setRuleNamess(List<String> ruleNamess) {
		this.ruleNamess = ruleNamess;	
		if (ruleNamess != null) {
			for (int i = 0; i < ruleNamess.size(); i++) {
				putQueryParameter("RuleNames." + (i + 1) , ruleNamess.get(i));
			}
		}	
	}

	@Override
	public Class<DisableEventRulesResponse> getResponseClass() {
		return DisableEventRulesResponse.class;
	}

}
