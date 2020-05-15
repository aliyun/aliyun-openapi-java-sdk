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
public class PutMetricRuleTargetsRequest extends RpcAcsRequest<PutMetricRuleTargetsResponse> {
	   

	private List<Targets> targetss;

	private String ruleId;
	public PutMetricRuleTargetsRequest() {
		super("Cms", "2019-01-01", "PutMetricRuleTargets", "cms");
		setMethod(MethodType.POST);
	}

	public List<Targets> getTargetss() {
		return this.targetss;
	}

	public void setTargetss(List<Targets> targetss) {
		this.targetss = targetss;	
		if (targetss != null) {
			for (int depth1 = 0; depth1 < targetss.size(); depth1++) {
				putQueryParameter("Targets." + (depth1 + 1) + ".Level" , targetss.get(depth1).getLevel());
				putQueryParameter("Targets." + (depth1 + 1) + ".Id" , targetss.get(depth1).getId());
				putQueryParameter("Targets." + (depth1 + 1) + ".Arn" , targetss.get(depth1).getArn());
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

	public static class Targets {

		private String level;

		private String id;

		private String arn;

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}
	}

	@Override
	public Class<PutMetricRuleTargetsResponse> getResponseClass() {
		return PutMetricRuleTargetsResponse.class;
	}

}
