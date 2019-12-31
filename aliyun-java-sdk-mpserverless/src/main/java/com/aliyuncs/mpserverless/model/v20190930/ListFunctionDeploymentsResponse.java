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

package com.aliyuncs.mpserverless.model.v20190930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpserverless.transform.v20190930.ListFunctionDeploymentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFunctionDeploymentsResponse extends AcsResponse {

	private String httpStatusCode;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private String code1;

	private String message2;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<DeploymentsItem> deployments;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode1() {
		return this.code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getMessage2() {
		return this.message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DeploymentsItem> getDeployments() {
		return this.deployments;
	}

	public void setDeployments(List<DeploymentsItem> deployments) {
		this.deployments = deployments;
	}

	public static class DeploymentsItem {

		private String deploymentId;

		private String deploymentVersion;

		private String artifactDownloadUrl;

		private String createTime;

		private String updateTime;

		private DeploymentStatus deploymentStatus;

		public String getDeploymentId() {
			return this.deploymentId;
		}

		public void setDeploymentId(String deploymentId) {
			this.deploymentId = deploymentId;
		}

		public String getDeploymentVersion() {
			return this.deploymentVersion;
		}

		public void setDeploymentVersion(String deploymentVersion) {
			this.deploymentVersion = deploymentVersion;
		}

		public String getArtifactDownloadUrl() {
			return this.artifactDownloadUrl;
		}

		public void setArtifactDownloadUrl(String artifactDownloadUrl) {
			this.artifactDownloadUrl = artifactDownloadUrl;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public DeploymentStatus getDeploymentStatus() {
			return this.deploymentStatus;
		}

		public void setDeploymentStatus(DeploymentStatus deploymentStatus) {
			this.deploymentStatus = deploymentStatus;
		}

		public static class DeploymentStatus {

			private String message;

			private String status;

			private String label;

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}
		}
	}

	@Override
	public ListFunctionDeploymentsResponse getInstance(UnmarshallerContext context) {
		return	ListFunctionDeploymentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
