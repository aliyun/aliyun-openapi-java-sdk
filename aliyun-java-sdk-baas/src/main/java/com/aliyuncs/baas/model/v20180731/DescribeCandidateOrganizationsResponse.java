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

package com.aliyuncs.baas.model.v20180731;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.DescribeCandidateOrganizationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCandidateOrganizationsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private List<DescribeCandidateOrganization> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public List<DescribeCandidateOrganization> getResult() {
		return this.result;
	}

	public void setResult(List<DescribeCandidateOrganization> result) {
		this.result = result;
	}

	public static class DescribeCandidateOrganization {

		private String organizationId;

		private String organizationName;

		private String clusterState;

		private String serviceState;

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getOrganizationName() {
			return this.organizationName;
		}

		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}

		public String getClusterState() {
			return this.clusterState;
		}

		public void setClusterState(String clusterState) {
			this.clusterState = clusterState;
		}

		public String getServiceState() {
			return this.serviceState;
		}

		public void setServiceState(String serviceState) {
			this.serviceState = serviceState;
		}
	}

	@Override
	public DescribeCandidateOrganizationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCandidateOrganizationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
