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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.zhuque.transform.v20160701.GetProjectInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectInfoResponse extends AcsResponse {

	private String requestId;

	private String result;

	private String message;

	private ProjectBaseInfoResp projectBaseInfoResp;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ProjectBaseInfoResp getProjectBaseInfoResp() {
		return this.projectBaseInfoResp;
	}

	public void setProjectBaseInfoResp(ProjectBaseInfoResp projectBaseInfoResp) {
		this.projectBaseInfoResp = projectBaseInfoResp;
	}

	public static class ProjectBaseInfoResp {

		private Integer id;

		private String projectId;

		private String projectName;

		private String projectType;

		private String cloudInstance;

		private String displayName;

		private String cloudType;

		private String region;

		private String azone;

		private String manager;

		private String customerId;

		private String currentVersion;

		private String deliveryDay;

		private String description;

		private String updateTime;

		private String origin;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectType() {
			return this.projectType;
		}

		public void setProjectType(String projectType) {
			this.projectType = projectType;
		}

		public String getCloudInstance() {
			return this.cloudInstance;
		}

		public void setCloudInstance(String cloudInstance) {
			this.cloudInstance = cloudInstance;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getCloudType() {
			return this.cloudType;
		}

		public void setCloudType(String cloudType) {
			this.cloudType = cloudType;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getAzone() {
			return this.azone;
		}

		public void setAzone(String azone) {
			this.azone = azone;
		}

		public String getManager() {
			return this.manager;
		}

		public void setManager(String manager) {
			this.manager = manager;
		}

		public String getCustomerId() {
			return this.customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public String getDeliveryDay() {
			return this.deliveryDay;
		}

		public void setDeliveryDay(String deliveryDay) {
			this.deliveryDay = deliveryDay;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getOrigin() {
			return this.origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}
	}

	@Override
	public GetProjectInfoResponse getInstance(UnmarshallerContext context) {
		return	GetProjectInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
