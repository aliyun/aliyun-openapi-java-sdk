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
import com.aliyuncs.oos.transform.v20190601.CreateApplicationGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationGroupResponse extends AcsResponse {

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

		private String name;

		private String applicationName;

		private String createDate;

		private String updateDate;

		private String description;

		private String deployRegionId;

		private String importTagKey;

		private String importTagValue;

		private String cmsGroupId;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDeployRegionId() {
			return this.deployRegionId;
		}

		public void setDeployRegionId(String deployRegionId) {
			this.deployRegionId = deployRegionId;
		}

		public String getImportTagKey() {
			return this.importTagKey;
		}

		public void setImportTagKey(String importTagKey) {
			this.importTagKey = importTagKey;
		}

		public String getImportTagValue() {
			return this.importTagValue;
		}

		public void setImportTagValue(String importTagValue) {
			this.importTagValue = importTagValue;
		}

		public String getCmsGroupId() {
			return this.cmsGroupId;
		}

		public void setCmsGroupId(String cmsGroupId) {
			this.cmsGroupId = cmsGroupId;
		}
	}

	@Override
	public CreateApplicationGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateApplicationGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
