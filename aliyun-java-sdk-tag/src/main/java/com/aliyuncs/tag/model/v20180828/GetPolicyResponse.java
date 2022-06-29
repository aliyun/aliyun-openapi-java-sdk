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

package com.aliyuncs.tag.model.v20180828;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.tag.transform.v20180828.GetPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPolicyResponse extends AcsResponse {

	private String requestId;

	private Policy policy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Policy getPolicy() {
		return this.policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public static class Policy {

		private String policyName;

		private String policyDesc;

		private String policyContent;

		private String userType;

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getPolicyDesc() {
			return this.policyDesc;
		}

		public void setPolicyDesc(String policyDesc) {
			this.policyDesc = policyDesc;
		}

		public String getPolicyContent() {
			return this.policyContent;
		}

		public void setPolicyContent(String policyContent) {
			this.policyContent = policyContent;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}
	}

	@Override
	public GetPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
