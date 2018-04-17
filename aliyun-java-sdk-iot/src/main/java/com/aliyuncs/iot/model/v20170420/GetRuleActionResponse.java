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

package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20170420.GetRuleActionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRuleActionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private RuleActionInfo ruleActionInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public RuleActionInfo getRuleActionInfo() {
		return this.ruleActionInfo;
	}

	public void setRuleActionInfo(RuleActionInfo ruleActionInfo) {
		this.ruleActionInfo = ruleActionInfo;
	}

	public static class RuleActionInfo {

		private Long id;

		private Long ruleId;

		private String type;

		private String configuration;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getConfiguration() {
			return this.configuration;
		}

		public void setConfiguration(String configuration) {
			this.configuration = configuration;
		}
	}

	@Override
	public GetRuleActionResponse getInstance(UnmarshallerContext context) {
		return	GetRuleActionResponseUnmarshaller.unmarshall(this, context);
	}
}
