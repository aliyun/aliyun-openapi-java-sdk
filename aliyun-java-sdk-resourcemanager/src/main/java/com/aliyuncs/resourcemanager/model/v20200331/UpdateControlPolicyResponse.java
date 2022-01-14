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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.UpdateControlPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateControlPolicyResponse extends AcsResponse {

	private String requestId;

	private ControlPolicy controlPolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ControlPolicy getControlPolicy() {
		return this.controlPolicy;
	}

	public void setControlPolicy(ControlPolicy controlPolicy) {
		this.controlPolicy = controlPolicy;
	}

	public static class ControlPolicy {

		private String updateDate;

		private String description;

		private String effectScope;

		private String attachmentCount;

		private String policyName;

		private String policyId;

		private String createDate;

		private String policyType;

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEffectScope() {
			return this.effectScope;
		}

		public void setEffectScope(String effectScope) {
			this.effectScope = effectScope;
		}

		public String getAttachmentCount() {
			return this.attachmentCount;
		}

		public void setAttachmentCount(String attachmentCount) {
			this.attachmentCount = attachmentCount;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}
	}

	@Override
	public UpdateControlPolicyResponse getInstance(UnmarshallerContext context) {
		return	UpdateControlPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
