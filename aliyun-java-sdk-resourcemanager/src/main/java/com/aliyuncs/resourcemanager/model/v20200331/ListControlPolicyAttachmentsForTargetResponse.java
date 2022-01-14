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
import com.aliyuncs.resourcemanager.transform.v20200331.ListControlPolicyAttachmentsForTargetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListControlPolicyAttachmentsForTargetResponse extends AcsResponse {

	private String requestId;

	private List<ControlPolicyAttachment> controlPolicyAttachments;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ControlPolicyAttachment> getControlPolicyAttachments() {
		return this.controlPolicyAttachments;
	}

	public void setControlPolicyAttachments(List<ControlPolicyAttachment> controlPolicyAttachments) {
		this.controlPolicyAttachments = controlPolicyAttachments;
	}

	public static class ControlPolicyAttachment {

		private String description;

		private String effectScope;

		private String policyName;

		private String policyId;

		private String attachDate;

		private String policyType;

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

		public String getAttachDate() {
			return this.attachDate;
		}

		public void setAttachDate(String attachDate) {
			this.attachDate = attachDate;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}
	}

	@Override
	public ListControlPolicyAttachmentsForTargetResponse getInstance(UnmarshallerContext context) {
		return	ListControlPolicyAttachmentsForTargetResponseUnmarshaller.unmarshall(this, context);
	}
}
