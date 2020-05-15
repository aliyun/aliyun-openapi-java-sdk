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
import com.aliyuncs.resourcemanager.transform.v20200331.ListPolicyAttachmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPolicyAttachmentsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<PolicyAttachment> policyAttachments;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<PolicyAttachment> getPolicyAttachments() {
		return this.policyAttachments;
	}

	public void setPolicyAttachments(List<PolicyAttachment> policyAttachments) {
		this.policyAttachments = policyAttachments;
	}

	public static class PolicyAttachment {

		private String resourceGroupId;

		private String policyType;

		private String policyName;

		private String principalType;

		private String principalName;

		private String attachDate;

		private String description;

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getPrincipalType() {
			return this.principalType;
		}

		public void setPrincipalType(String principalType) {
			this.principalType = principalType;
		}

		public String getPrincipalName() {
			return this.principalName;
		}

		public void setPrincipalName(String principalName) {
			this.principalName = principalName;
		}

		public String getAttachDate() {
			return this.attachDate;
		}

		public void setAttachDate(String attachDate) {
			this.attachDate = attachDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ListPolicyAttachmentsResponse getInstance(UnmarshallerContext context) {
		return	ListPolicyAttachmentsResponseUnmarshaller.unmarshall(this, context);
	}
}
