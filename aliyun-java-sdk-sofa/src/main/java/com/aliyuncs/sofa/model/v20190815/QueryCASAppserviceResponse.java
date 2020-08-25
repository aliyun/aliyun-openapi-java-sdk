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
import com.aliyuncs.sofa.transform.v20190815.QueryCASAppserviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCASAppserviceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String appId;

		private String appName;

		private String buildpackFullVersion;

		private String buildpackId;

		private String description;

		private String extendProperties;

		private String id;

		private Boolean isDefault;

		private Boolean isService;

		private String lastDeployStatus;

		private String lastDeployVersion;

		private String lastOpsOrderId;

		private String name;

		private String ownerId;

		private Long techstackId;

		private String techstackIdentity;

		private String techstackName;

		private String utcCreate;

		private String utcModified;

		private String workspaceId;

		private List<String> cellIds;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getBuildpackFullVersion() {
			return this.buildpackFullVersion;
		}

		public void setBuildpackFullVersion(String buildpackFullVersion) {
			this.buildpackFullVersion = buildpackFullVersion;
		}

		public String getBuildpackId() {
			return this.buildpackId;
		}

		public void setBuildpackId(String buildpackId) {
			this.buildpackId = buildpackId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExtendProperties() {
			return this.extendProperties;
		}

		public void setExtendProperties(String extendProperties) {
			this.extendProperties = extendProperties;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public Boolean getIsService() {
			return this.isService;
		}

		public void setIsService(Boolean isService) {
			this.isService = isService;
		}

		public String getLastDeployStatus() {
			return this.lastDeployStatus;
		}

		public void setLastDeployStatus(String lastDeployStatus) {
			this.lastDeployStatus = lastDeployStatus;
		}

		public String getLastDeployVersion() {
			return this.lastDeployVersion;
		}

		public void setLastDeployVersion(String lastDeployVersion) {
			this.lastDeployVersion = lastDeployVersion;
		}

		public String getLastOpsOrderId() {
			return this.lastOpsOrderId;
		}

		public void setLastOpsOrderId(String lastOpsOrderId) {
			this.lastOpsOrderId = lastOpsOrderId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public Long getTechstackId() {
			return this.techstackId;
		}

		public void setTechstackId(Long techstackId) {
			this.techstackId = techstackId;
		}

		public String getTechstackIdentity() {
			return this.techstackIdentity;
		}

		public void setTechstackIdentity(String techstackIdentity) {
			this.techstackIdentity = techstackIdentity;
		}

		public String getTechstackName() {
			return this.techstackName;
		}

		public void setTechstackName(String techstackName) {
			this.techstackName = techstackName;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public List<String> getCellIds() {
			return this.cellIds;
		}

		public void setCellIds(List<String> cellIds) {
			this.cellIds = cellIds;
		}
	}

	@Override
	public QueryCASAppserviceResponse getInstance(UnmarshallerContext context) {
		return	QueryCASAppserviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
