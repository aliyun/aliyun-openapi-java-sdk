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

package com.aliyuncs.resourcemanager.model.v20200331;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.ListAssociatedTransferSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAssociatedTransferSettingResponse extends AcsResponse {

	private String requestId;

	private AssociatedTransferSetting associatedTransferSetting;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AssociatedTransferSetting getAssociatedTransferSetting() {
		return this.associatedTransferSetting;
	}

	public void setAssociatedTransferSetting(AssociatedTransferSetting associatedTransferSetting) {
		this.associatedTransferSetting = associatedTransferSetting;
	}

	public static class AssociatedTransferSetting {

		private String accountId;

		private String status;

		private String enablePartialRule;

		private String enableExistingResourcesTransfer;

		private List<RuleSetting> ruleSettings;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEnablePartialRule() {
			return this.enablePartialRule;
		}

		public void setEnablePartialRule(String enablePartialRule) {
			this.enablePartialRule = enablePartialRule;
		}

		public String getEnableExistingResourcesTransfer() {
			return this.enableExistingResourcesTransfer;
		}

		public void setEnableExistingResourcesTransfer(String enableExistingResourcesTransfer) {
			this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
		}

		public List<RuleSetting> getRuleSettings() {
			return this.ruleSettings;
		}

		public void setRuleSettings(List<RuleSetting> ruleSettings) {
			this.ruleSettings = ruleSettings;
		}

		public static class RuleSetting {

			private String associatedResourceType;

			private String masterResourceType;

			private String associatedService;

			private String masterService;

			private String triggerType;

			private String ruleId;

			private String status;

			public String getAssociatedResourceType() {
				return this.associatedResourceType;
			}

			public void setAssociatedResourceType(String associatedResourceType) {
				this.associatedResourceType = associatedResourceType;
			}

			public String getMasterResourceType() {
				return this.masterResourceType;
			}

			public void setMasterResourceType(String masterResourceType) {
				this.masterResourceType = masterResourceType;
			}

			public String getAssociatedService() {
				return this.associatedService;
			}

			public void setAssociatedService(String associatedService) {
				this.associatedService = associatedService;
			}

			public String getMasterService() {
				return this.masterService;
			}

			public void setMasterService(String masterService) {
				this.masterService = masterService;
			}

			public String getTriggerType() {
				return this.triggerType;
			}

			public void setTriggerType(String triggerType) {
				this.triggerType = triggerType;
			}

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListAssociatedTransferSettingResponse getInstance(UnmarshallerContext context) {
		return	ListAssociatedTransferSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
