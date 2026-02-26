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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetCustomPrivacyPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomPrivacyPolicyResponse extends AcsResponse {

	private String requestId;

	private CustomPrivacyPolicy customPrivacyPolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CustomPrivacyPolicy getCustomPrivacyPolicy() {
		return this.customPrivacyPolicy;
	}

	public void setCustomPrivacyPolicy(CustomPrivacyPolicy customPrivacyPolicy) {
		this.customPrivacyPolicy = customPrivacyPolicy;
	}

	public static class CustomPrivacyPolicy {

		private String customPrivacyPolicyId;

		private String customPrivacyPolicyName;

		private String status;

		private String defaultLanguageCode;

		private String userConsentType;

		private String instanceId;

		private List<CustomPrivacyPolicyContentsItem> customPrivacyPolicyContents;

		public String getCustomPrivacyPolicyId() {
			return this.customPrivacyPolicyId;
		}

		public void setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
			this.customPrivacyPolicyId = customPrivacyPolicyId;
		}

		public String getCustomPrivacyPolicyName() {
			return this.customPrivacyPolicyName;
		}

		public void setCustomPrivacyPolicyName(String customPrivacyPolicyName) {
			this.customPrivacyPolicyName = customPrivacyPolicyName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDefaultLanguageCode() {
			return this.defaultLanguageCode;
		}

		public void setDefaultLanguageCode(String defaultLanguageCode) {
			this.defaultLanguageCode = defaultLanguageCode;
		}

		public String getUserConsentType() {
			return this.userConsentType;
		}

		public void setUserConsentType(String userConsentType) {
			this.userConsentType = userConsentType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<CustomPrivacyPolicyContentsItem> getCustomPrivacyPolicyContents() {
			return this.customPrivacyPolicyContents;
		}

		public void setCustomPrivacyPolicyContents(List<CustomPrivacyPolicyContentsItem> customPrivacyPolicyContents) {
			this.customPrivacyPolicyContents = customPrivacyPolicyContents;
		}

		public static class CustomPrivacyPolicyContentsItem {

			private String customPrivacyPolicyTip;

			private String languageCode;

			private List<CustomPrivacyPolicyItemsItem> customPrivacyPolicyItems;

			public String getCustomPrivacyPolicyTip() {
				return this.customPrivacyPolicyTip;
			}

			public void setCustomPrivacyPolicyTip(String customPrivacyPolicyTip) {
				this.customPrivacyPolicyTip = customPrivacyPolicyTip;
			}

			public String getLanguageCode() {
				return this.languageCode;
			}

			public void setLanguageCode(String languageCode) {
				this.languageCode = languageCode;
			}

			public List<CustomPrivacyPolicyItemsItem> getCustomPrivacyPolicyItems() {
				return this.customPrivacyPolicyItems;
			}

			public void setCustomPrivacyPolicyItems(List<CustomPrivacyPolicyItemsItem> customPrivacyPolicyItems) {
				this.customPrivacyPolicyItems = customPrivacyPolicyItems;
			}

			public static class CustomPrivacyPolicyItemsItem {

				private String customPrivacyPolicyItemName;

				private String customPrivacyPolicyItemUrl;

				public String getCustomPrivacyPolicyItemName() {
					return this.customPrivacyPolicyItemName;
				}

				public void setCustomPrivacyPolicyItemName(String customPrivacyPolicyItemName) {
					this.customPrivacyPolicyItemName = customPrivacyPolicyItemName;
				}

				public String getCustomPrivacyPolicyItemUrl() {
					return this.customPrivacyPolicyItemUrl;
				}

				public void setCustomPrivacyPolicyItemUrl(String customPrivacyPolicyItemUrl) {
					this.customPrivacyPolicyItemUrl = customPrivacyPolicyItemUrl;
				}
			}
		}
	}

	@Override
	public GetCustomPrivacyPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetCustomPrivacyPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
