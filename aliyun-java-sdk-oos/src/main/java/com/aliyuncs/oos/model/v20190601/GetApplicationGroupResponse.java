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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.GetApplicationGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationGroupResponse extends AcsResponse {

	private String requestId;

	private ApplicationGroup applicationGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationGroup getApplicationGroup() {
		return this.applicationGroup;
	}

	public void setApplicationGroup(ApplicationGroup applicationGroup) {
		this.applicationGroup = applicationGroup;
	}

	public static class ApplicationGroup {

		private String cmsGroupId;

		private String deployRegionId;

		private String description;

		private String updateDate;

		private String importTagKey;

		private String applicationName;

		private String importTagValue;

		private String name;

		private String createDate;

		private String deployParameters;

		private String status;

		private String statusReason;

		private String deployOutputs;

		private String progress;

		public String getCmsGroupId() {
			return this.cmsGroupId;
		}

		public void setCmsGroupId(String cmsGroupId) {
			this.cmsGroupId = cmsGroupId;
		}

		public String getDeployRegionId() {
			return this.deployRegionId;
		}

		public void setDeployRegionId(String deployRegionId) {
			this.deployRegionId = deployRegionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getImportTagKey() {
			return this.importTagKey;
		}

		public void setImportTagKey(String importTagKey) {
			this.importTagKey = importTagKey;
		}

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getImportTagValue() {
			return this.importTagValue;
		}

		public void setImportTagValue(String importTagValue) {
			this.importTagValue = importTagValue;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getDeployParameters() {
			return this.deployParameters;
		}

		public void setDeployParameters(String deployParameters) {
			this.deployParameters = deployParameters;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}

		public String getDeployOutputs() {
			return this.deployOutputs;
		}

		public void setDeployOutputs(String deployOutputs) {
			this.deployOutputs = deployOutputs;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}
	}

	@Override
	public GetApplicationGroupResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
