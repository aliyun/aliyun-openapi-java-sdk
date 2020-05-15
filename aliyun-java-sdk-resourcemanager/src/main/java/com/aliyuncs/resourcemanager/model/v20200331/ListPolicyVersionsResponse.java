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
import com.aliyuncs.resourcemanager.transform.v20200331.ListPolicyVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPolicyVersionsResponse extends AcsResponse {

	private String requestId;

	private List<PolicyVersion> policyVersions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PolicyVersion> getPolicyVersions() {
		return this.policyVersions;
	}

	public void setPolicyVersions(List<PolicyVersion> policyVersions) {
		this.policyVersions = policyVersions;
	}

	public static class PolicyVersion {

		private String versionId;

		private Boolean isDefaultVersion;

		private String createDate;

		public String getVersionId() {
			return this.versionId;
		}

		public void setVersionId(String versionId) {
			this.versionId = versionId;
		}

		public Boolean getIsDefaultVersion() {
			return this.isDefaultVersion;
		}

		public void setIsDefaultVersion(Boolean isDefaultVersion) {
			this.isDefaultVersion = isDefaultVersion;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
	}

	@Override
	public ListPolicyVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListPolicyVersionsResponseUnmarshaller.unmarshall(this, context);
	}
}
