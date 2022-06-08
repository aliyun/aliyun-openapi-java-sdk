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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDesensitizationRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDesensitizationRuleResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<DesensitizationRule> desensitizationRuleList;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DesensitizationRule> getDesensitizationRuleList() {
		return this.desensitizationRuleList;
	}

	public void setDesensitizationRuleList(List<DesensitizationRule> desensitizationRuleList) {
		this.desensitizationRuleList = desensitizationRuleList;
	}

	public static class DesensitizationRule {

		private String ruleName;

		private String ruleType;

		private String ruleDesc;

		private String functionType;

		private String funcParams;

		private String funcSample;

		private String lastModifierId;

		private String lastModifierName;

		private Integer referenceCount;

		private Integer ruleId;

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public String getRuleDesc() {
			return this.ruleDesc;
		}

		public void setRuleDesc(String ruleDesc) {
			this.ruleDesc = ruleDesc;
		}

		public String getFunctionType() {
			return this.functionType;
		}

		public void setFunctionType(String functionType) {
			this.functionType = functionType;
		}

		public String getFuncParams() {
			return this.funcParams;
		}

		public void setFuncParams(String funcParams) {
			this.funcParams = funcParams;
		}

		public String getFuncSample() {
			return this.funcSample;
		}

		public void setFuncSample(String funcSample) {
			this.funcSample = funcSample;
		}

		public String getLastModifierId() {
			return this.lastModifierId;
		}

		public void setLastModifierId(String lastModifierId) {
			this.lastModifierId = lastModifierId;
		}

		public String getLastModifierName() {
			return this.lastModifierName;
		}

		public void setLastModifierName(String lastModifierName) {
			this.lastModifierName = lastModifierName;
		}

		public Integer getReferenceCount() {
			return this.referenceCount;
		}

		public void setReferenceCount(Integer referenceCount) {
			this.referenceCount = referenceCount;
		}

		public Integer getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Integer ruleId) {
			this.ruleId = ruleId;
		}
	}

	@Override
	public ListDesensitizationRuleResponse getInstance(UnmarshallerContext context) {
		return	ListDesensitizationRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
