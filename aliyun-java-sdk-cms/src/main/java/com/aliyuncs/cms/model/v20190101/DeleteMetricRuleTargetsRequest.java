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
public class DeleteMetricRuleTargetsRequest extends RpcAcsRequest<DeleteMetricRuleTargetsResponse> {
	   

	private List<String> targetIdss;

	private String ruleId;
	public DeleteMetricRuleTargetsRequest() {
		super("Cms", "2019-01-01", "DeleteMetricRuleTargets", "cms");
		setMethod(MethodType.POST);
	}

	public List<String> getTargetIdss() {
		return this.targetIdss;
	}

	public void setTargetIdss(List<String> targetIdss) {
		this.targetIdss = targetIdss;	
		if (targetIdss != null) {
			for (int i = 0; i < targetIdss.size(); i++) {
				putQueryParameter("TargetIds." + (i + 1) , targetIdss.get(i));
			}
		}	
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	@Override
	public Class<DeleteMetricRuleTargetsResponse> getResponseClass() {
		return DeleteMetricRuleTargetsResponse.class;
	}

}
