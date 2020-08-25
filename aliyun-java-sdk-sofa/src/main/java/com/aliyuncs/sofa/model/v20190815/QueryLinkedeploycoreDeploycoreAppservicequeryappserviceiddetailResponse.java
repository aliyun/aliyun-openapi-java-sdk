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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String applyOwner;

		private String appInstanceGroup;

		private String appName;

		private String appServiceName;

		private String branchName;

		private String cluster;

		private String codeUrl;

		private String commitId;

		private String cpuLimit;

		private String cpuRequest;

		private String envName;

		private String envType;

		private Boolean firstCreate;

		private String fromApp;

		private Long gmtCreate;

		private Long gmtModified;

		private Long id;

		private String image;

		private String memoryLimit;

		private String memoryRequest;

		private String meta;

		private String name;

		private String namespace;

		private String paasDetailUrl;

		private String projectId;

		private Long replicas;

		private String serviceStatus;

		private String tenantName;

		private String uniqueId;

		public String getApplyOwner() {
			return this.applyOwner;
		}

		public void setApplyOwner(String applyOwner) {
			this.applyOwner = applyOwner;
		}

		public String getAppInstanceGroup() {
			return this.appInstanceGroup;
		}

		public void setAppInstanceGroup(String appInstanceGroup) {
			this.appInstanceGroup = appInstanceGroup;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppServiceName() {
			return this.appServiceName;
		}

		public void setAppServiceName(String appServiceName) {
			this.appServiceName = appServiceName;
		}

		public String getBranchName() {
			return this.branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public String getCodeUrl() {
			return this.codeUrl;
		}

		public void setCodeUrl(String codeUrl) {
			this.codeUrl = codeUrl;
		}

		public String getCommitId() {
			return this.commitId;
		}

		public void setCommitId(String commitId) {
			this.commitId = commitId;
		}

		public String getCpuLimit() {
			return this.cpuLimit;
		}

		public void setCpuLimit(String cpuLimit) {
			this.cpuLimit = cpuLimit;
		}

		public String getCpuRequest() {
			return this.cpuRequest;
		}

		public void setCpuRequest(String cpuRequest) {
			this.cpuRequest = cpuRequest;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public Boolean getFirstCreate() {
			return this.firstCreate;
		}

		public void setFirstCreate(Boolean firstCreate) {
			this.firstCreate = firstCreate;
		}

		public String getFromApp() {
			return this.fromApp;
		}

		public void setFromApp(String fromApp) {
			this.fromApp = fromApp;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getMemoryLimit() {
			return this.memoryLimit;
		}

		public void setMemoryLimit(String memoryLimit) {
			this.memoryLimit = memoryLimit;
		}

		public String getMemoryRequest() {
			return this.memoryRequest;
		}

		public void setMemoryRequest(String memoryRequest) {
			this.memoryRequest = memoryRequest;
		}

		public String getMeta() {
			return this.meta;
		}

		public void setMeta(String meta) {
			this.meta = meta;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getPaasDetailUrl() {
			return this.paasDetailUrl;
		}

		public void setPaasDetailUrl(String paasDetailUrl) {
			this.paasDetailUrl = paasDetailUrl;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public Long getReplicas() {
			return this.replicas;
		}

		public void setReplicas(Long replicas) {
			this.replicas = replicas;
		}

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
		}
	}

	@Override
	public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
