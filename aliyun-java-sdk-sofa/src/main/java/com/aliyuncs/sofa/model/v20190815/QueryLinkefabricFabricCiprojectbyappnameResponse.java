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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkefabricFabricCiprojectbyappnameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricCiprojectbyappnameResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String antxVersion;

		private String appName;

		private Boolean baseJar;

		private Boolean configBak;

		private String devStage;

		private String extraInfo;

		private Boolean grayRelease;

		private Long id;

		private Boolean isNewApp;

		private Boolean isRollback;

		private String originReleaseIds;

		private String projectId;

		private String releaseId;

		private Boolean sandboxRelease;

		private String station;

		private Long tenantId;

		private Long utcCreate;

		private Long utcModified;

		public String getAntxVersion() {
			return this.antxVersion;
		}

		public void setAntxVersion(String antxVersion) {
			this.antxVersion = antxVersion;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Boolean getBaseJar() {
			return this.baseJar;
		}

		public void setBaseJar(Boolean baseJar) {
			this.baseJar = baseJar;
		}

		public Boolean getConfigBak() {
			return this.configBak;
		}

		public void setConfigBak(Boolean configBak) {
			this.configBak = configBak;
		}

		public String getDevStage() {
			return this.devStage;
		}

		public void setDevStage(String devStage) {
			this.devStage = devStage;
		}

		public String getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(String extraInfo) {
			this.extraInfo = extraInfo;
		}

		public Boolean getGrayRelease() {
			return this.grayRelease;
		}

		public void setGrayRelease(Boolean grayRelease) {
			this.grayRelease = grayRelease;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getIsNewApp() {
			return this.isNewApp;
		}

		public void setIsNewApp(Boolean isNewApp) {
			this.isNewApp = isNewApp;
		}

		public Boolean getIsRollback() {
			return this.isRollback;
		}

		public void setIsRollback(Boolean isRollback) {
			this.isRollback = isRollback;
		}

		public String getOriginReleaseIds() {
			return this.originReleaseIds;
		}

		public void setOriginReleaseIds(String originReleaseIds) {
			this.originReleaseIds = originReleaseIds;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getReleaseId() {
			return this.releaseId;
		}

		public void setReleaseId(String releaseId) {
			this.releaseId = releaseId;
		}

		public Boolean getSandboxRelease() {
			return this.sandboxRelease;
		}

		public void setSandboxRelease(Boolean sandboxRelease) {
			this.sandboxRelease = sandboxRelease;
		}

		public String getStation() {
			return this.station;
		}

		public void setStation(String station) {
			this.station = station;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Long getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(Long utcCreate) {
			this.utcCreate = utcCreate;
		}

		public Long getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(Long utcModified) {
			this.utcModified = utcModified;
		}
	}

	@Override
	public QueryLinkefabricFabricCiprojectbyappnameResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkefabricFabricCiprojectbyappnameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
