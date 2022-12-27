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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.ListAggregateRemediationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAggregateRemediationsResponse extends AcsResponse {

	private String requestId;

	private List<Remediation> remediations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Remediation> getRemediations() {
		return this.remediations;
	}

	public void setRemediations(List<Remediation> remediations) {
		this.remediations = remediations;
	}

	public static class Remediation {

		private String remediationTemplateId;

		private String remediationDynamicParams;

		private String remediationSourceType;

		private String remediationType;

		private String lastSuccessfulInvocationId;

		private Long accountId;

		private String aggregatorId;

		private String lastSuccessfulInvocationType;

		private String remediationId;

		private String invokeType;

		private String configRuleId;

		private Long lastSuccessfulInvocationTime;

		private String remediaitonOriginParams;

		public String getRemediationTemplateId() {
			return this.remediationTemplateId;
		}

		public void setRemediationTemplateId(String remediationTemplateId) {
			this.remediationTemplateId = remediationTemplateId;
		}

		public String getRemediationDynamicParams() {
			return this.remediationDynamicParams;
		}

		public void setRemediationDynamicParams(String remediationDynamicParams) {
			this.remediationDynamicParams = remediationDynamicParams;
		}

		public String getRemediationSourceType() {
			return this.remediationSourceType;
		}

		public void setRemediationSourceType(String remediationSourceType) {
			this.remediationSourceType = remediationSourceType;
		}

		public String getRemediationType() {
			return this.remediationType;
		}

		public void setRemediationType(String remediationType) {
			this.remediationType = remediationType;
		}

		public String getLastSuccessfulInvocationId() {
			return this.lastSuccessfulInvocationId;
		}

		public void setLastSuccessfulInvocationId(String lastSuccessfulInvocationId) {
			this.lastSuccessfulInvocationId = lastSuccessfulInvocationId;
		}

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getAggregatorId() {
			return this.aggregatorId;
		}

		public void setAggregatorId(String aggregatorId) {
			this.aggregatorId = aggregatorId;
		}

		public String getLastSuccessfulInvocationType() {
			return this.lastSuccessfulInvocationType;
		}

		public void setLastSuccessfulInvocationType(String lastSuccessfulInvocationType) {
			this.lastSuccessfulInvocationType = lastSuccessfulInvocationType;
		}

		public String getRemediationId() {
			return this.remediationId;
		}

		public void setRemediationId(String remediationId) {
			this.remediationId = remediationId;
		}

		public String getInvokeType() {
			return this.invokeType;
		}

		public void setInvokeType(String invokeType) {
			this.invokeType = invokeType;
		}

		public String getConfigRuleId() {
			return this.configRuleId;
		}

		public void setConfigRuleId(String configRuleId) {
			this.configRuleId = configRuleId;
		}

		public Long getLastSuccessfulInvocationTime() {
			return this.lastSuccessfulInvocationTime;
		}

		public void setLastSuccessfulInvocationTime(Long lastSuccessfulInvocationTime) {
			this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
		}

		public String getRemediaitonOriginParams() {
			return this.remediaitonOriginParams;
		}

		public void setRemediaitonOriginParams(String remediaitonOriginParams) {
			this.remediaitonOriginParams = remediaitonOriginParams;
		}
	}

	@Override
	public ListAggregateRemediationsResponse getInstance(UnmarshallerContext context) {
		return	ListAggregateRemediationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
