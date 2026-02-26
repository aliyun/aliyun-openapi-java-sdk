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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListAbacPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAbacPoliciesResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Long tid;

	private Long totalCount;

	private List<PolicyListItem> policyList;

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

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<PolicyListItem> getPolicyList() {
		return this.policyList;
	}

	public void setPolicyList(List<PolicyListItem> policyList) {
		this.policyList = policyList;
	}

	public static class PolicyListItem {

		private Long abacPolicyId;

		private String abacPolicyName;

		private String abacPolicyDesc;

		private String abacPolicyContent;

		private Long creatorId;

		private String abacPolicySource;

		public Long getAbacPolicyId() {
			return this.abacPolicyId;
		}

		public void setAbacPolicyId(Long abacPolicyId) {
			this.abacPolicyId = abacPolicyId;
		}

		public String getAbacPolicyName() {
			return this.abacPolicyName;
		}

		public void setAbacPolicyName(String abacPolicyName) {
			this.abacPolicyName = abacPolicyName;
		}

		public String getAbacPolicyDesc() {
			return this.abacPolicyDesc;
		}

		public void setAbacPolicyDesc(String abacPolicyDesc) {
			this.abacPolicyDesc = abacPolicyDesc;
		}

		public String getAbacPolicyContent() {
			return this.abacPolicyContent;
		}

		public void setAbacPolicyContent(String abacPolicyContent) {
			this.abacPolicyContent = abacPolicyContent;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public String getAbacPolicySource() {
			return this.abacPolicySource;
		}

		public void setAbacPolicySource(String abacPolicySource) {
			this.abacPolicySource = abacPolicySource;
		}
	}

	@Override
	public ListAbacPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListAbacPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
