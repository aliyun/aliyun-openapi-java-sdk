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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.CreateForwardingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateForwardingRulesResponse extends AcsResponse {

	private String requestId;

	private List<ForwardingRulesItem> forwardingRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ForwardingRulesItem> getForwardingRules() {
		return this.forwardingRules;
	}

	public void setForwardingRules(List<ForwardingRulesItem> forwardingRules) {
		this.forwardingRules = forwardingRules;
	}

	public static class ForwardingRulesItem {

		private String forwardingRuleId;

		public String getForwardingRuleId() {
			return this.forwardingRuleId;
		}

		public void setForwardingRuleId(String forwardingRuleId) {
			this.forwardingRuleId = forwardingRuleId;
		}
	}

	@Override
	public CreateForwardingRulesResponse getInstance(UnmarshallerContext context) {
		return	CreateForwardingRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
