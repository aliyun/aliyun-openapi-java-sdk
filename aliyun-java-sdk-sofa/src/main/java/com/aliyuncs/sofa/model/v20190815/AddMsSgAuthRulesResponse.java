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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.AddMsSgAuthRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddMsSgAuthRulesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private AuthRule authRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public AuthRule getAuthRule() {
		return this.authRule;
	}

	public void setAuthRule(AuthRule authRule) {
		this.authRule = authRule;
	}

	public static class AuthRule {

		private Long authRuleGroupId;

		private Long enabled;

		private String mode;

		private String name;

		private List<RuleItemsItem> ruleItems;

		public Long getAuthRuleGroupId() {
			return this.authRuleGroupId;
		}

		public void setAuthRuleGroupId(Long authRuleGroupId) {
			this.authRuleGroupId = authRuleGroupId;
		}

		public Long getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Long enabled) {
			this.enabled = enabled;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<RuleItemsItem> getRuleItems() {
			return this.ruleItems;
		}

		public void setRuleItems(List<RuleItemsItem> ruleItems) {
			this.ruleItems = ruleItems;
		}

		public static class RuleItemsItem {

			private Long authRuleId;

			private String field;

			private String operation;

			private String type;

			private String value;

			public Long getAuthRuleId() {
				return this.authRuleId;
			}

			public void setAuthRuleId(Long authRuleId) {
				this.authRuleId = authRuleId;
			}

			public String getField() {
				return this.field;
			}

			public void setField(String field) {
				this.field = field;
			}

			public String getOperation() {
				return this.operation;
			}

			public void setOperation(String operation) {
				this.operation = operation;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public AddMsSgAuthRulesResponse getInstance(UnmarshallerContext context) {
		return	AddMsSgAuthRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
