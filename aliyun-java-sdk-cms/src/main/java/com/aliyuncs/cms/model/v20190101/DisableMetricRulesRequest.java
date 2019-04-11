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

/**
 * @author auto create
 * @version 
 */
public class DisableMetricRulesRequest extends RpcAcsRequest<DisableMetricRulesResponse> {
	
	public DisableMetricRulesRequest() {
		super("Cms", "2019-01-01", "DisableMetricRules", "cms");
	}

	private List<String> ruleIds;

	public List<String> getRuleIds() {
		return this.ruleIds;
	}

	public void setRuleIds(List<String> ruleIds) {
		this.ruleIds = ruleIds;	
		if (ruleIds != null) {
			for (int i = 0; i < ruleIds.size(); i++) {
				putQueryParameter("RuleId." + (i + 1) , ruleIds.get(i));
			}
		}	
	}

	@Override
	public Class<DisableMetricRulesResponse> getResponseClass() {
		return DisableMetricRulesResponse.class;
	}

}
