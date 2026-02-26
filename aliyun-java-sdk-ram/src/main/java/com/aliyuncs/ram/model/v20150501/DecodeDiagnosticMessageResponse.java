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

package com.aliyuncs.ram.model.v20150501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.DecodeDiagnosticMessageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DecodeDiagnosticMessageResponse extends AcsResponse {

	private String requestId;

	private DecodedDiagnosticMessage decodedDiagnosticMessage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DecodedDiagnosticMessage getDecodedDiagnosticMessage() {
		return this.decodedDiagnosticMessage;
	}

	public void setDecodedDiagnosticMessage(DecodedDiagnosticMessage decodedDiagnosticMessage) {
		this.decodedDiagnosticMessage = decodedDiagnosticMessage;
	}

	public static class DecodedDiagnosticMessage {

		private Boolean explicitDeny;

		private String noPermissionPolicyType;

		private String authAction;

		private String authResource;

		private List<AuthConditionsItem> authConditions;

		private List<MatchedPoliciesItem> matchedPolicies;

		private AuthPrincipal authPrincipal;

		public Boolean getExplicitDeny() {
			return this.explicitDeny;
		}

		public void setExplicitDeny(Boolean explicitDeny) {
			this.explicitDeny = explicitDeny;
		}

		public String getNoPermissionPolicyType() {
			return this.noPermissionPolicyType;
		}

		public void setNoPermissionPolicyType(String noPermissionPolicyType) {
			this.noPermissionPolicyType = noPermissionPolicyType;
		}

		public String getAuthAction() {
			return this.authAction;
		}

		public void setAuthAction(String authAction) {
			this.authAction = authAction;
		}

		public String getAuthResource() {
			return this.authResource;
		}

		public void setAuthResource(String authResource) {
			this.authResource = authResource;
		}

		public List<AuthConditionsItem> getAuthConditions() {
			return this.authConditions;
		}

		public void setAuthConditions(List<AuthConditionsItem> authConditions) {
			this.authConditions = authConditions;
		}

		public List<MatchedPoliciesItem> getMatchedPolicies() {
			return this.matchedPolicies;
		}

		public void setMatchedPolicies(List<MatchedPoliciesItem> matchedPolicies) {
			this.matchedPolicies = matchedPolicies;
		}

		public AuthPrincipal getAuthPrincipal() {
			return this.authPrincipal;
		}

		public void setAuthPrincipal(AuthPrincipal authPrincipal) {
			this.authPrincipal = authPrincipal;
		}

		public static class AuthConditionsItem {

			private String conditionKey;

			private List<String> conditionValues;

			public String getConditionKey() {
				return this.conditionKey;
			}

			public void setConditionKey(String conditionKey) {
				this.conditionKey = conditionKey;
			}

			public List<String> getConditionValues() {
				return this.conditionValues;
			}

			public void setConditionValues(List<String> conditionValues) {
				this.conditionValues = conditionValues;
			}
		}

		public static class MatchedPoliciesItem {

			private String effect;

			private String policyIdentifier;

			private String policyType;

			private String policyVersion;

			private String attachedEntityType;

			private String attachedScope;

			public String getEffect() {
				return this.effect;
			}

			public void setEffect(String effect) {
				this.effect = effect;
			}

			public String getPolicyIdentifier() {
				return this.policyIdentifier;
			}

			public void setPolicyIdentifier(String policyIdentifier) {
				this.policyIdentifier = policyIdentifier;
			}

			public String getPolicyType() {
				return this.policyType;
			}

			public void setPolicyType(String policyType) {
				this.policyType = policyType;
			}

			public String getPolicyVersion() {
				return this.policyVersion;
			}

			public void setPolicyVersion(String policyVersion) {
				this.policyVersion = policyVersion;
			}

			public String getAttachedEntityType() {
				return this.attachedEntityType;
			}

			public void setAttachedEntityType(String attachedEntityType) {
				this.attachedEntityType = attachedEntityType;
			}

			public String getAttachedScope() {
				return this.attachedScope;
			}

			public void setAttachedScope(String attachedScope) {
				this.attachedScope = attachedScope;
			}
		}

		public static class AuthPrincipal {

			private String authPrincipalType;

			private String authPrincipalOwnerId;

			private String authPrincipalDisplayName;

			public String getAuthPrincipalType() {
				return this.authPrincipalType;
			}

			public void setAuthPrincipalType(String authPrincipalType) {
				this.authPrincipalType = authPrincipalType;
			}

			public String getAuthPrincipalOwnerId() {
				return this.authPrincipalOwnerId;
			}

			public void setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
				this.authPrincipalOwnerId = authPrincipalOwnerId;
			}

			public String getAuthPrincipalDisplayName() {
				return this.authPrincipalDisplayName;
			}

			public void setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
				this.authPrincipalDisplayName = authPrincipalDisplayName;
			}
		}
	}

	@Override
	public DecodeDiagnosticMessageResponse getInstance(UnmarshallerContext context) {
		return	DecodeDiagnosticMessageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
