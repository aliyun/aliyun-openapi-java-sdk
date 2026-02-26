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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListDataServicePublishedApisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataServicePublishedApisResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer totalCount;

		private List<Api> apiList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Api> getApiList() {
			return this.apiList;
		}

		public void setApiList(List<Api> apiList) {
			this.apiList = apiList;
		}

		public static class Api {

			private String groupName;

			private String owner;

			private String description;

			private Integer updateRate;

			private String apiName;

			private String projectName;

			private Integer appCount;

			private Integer mode;

			private Integer applyStatus;

			private Integer projectId;

			private Integer groupId;

			private String customUpdateRate;

			private String deployTime;

			private String version;

			private Long logicUnitNo;

			private String updateTime;

			private Integer createType;

			private String ownerUserName;

			private Integer callCount;

			private Integer executeMode;

			private Long apiId;

			private List<AppInfo> appInfoList;

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getUpdateRate() {
				return this.updateRate;
			}

			public void setUpdateRate(Integer updateRate) {
				this.updateRate = updateRate;
			}

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Integer getAppCount() {
				return this.appCount;
			}

			public void setAppCount(Integer appCount) {
				this.appCount = appCount;
			}

			public Integer getMode() {
				return this.mode;
			}

			public void setMode(Integer mode) {
				this.mode = mode;
			}

			public Integer getApplyStatus() {
				return this.applyStatus;
			}

			public void setApplyStatus(Integer applyStatus) {
				this.applyStatus = applyStatus;
			}

			public Integer getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Integer projectId) {
				this.projectId = projectId;
			}

			public Integer getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Integer groupId) {
				this.groupId = groupId;
			}

			public String getCustomUpdateRate() {
				return this.customUpdateRate;
			}

			public void setCustomUpdateRate(String customUpdateRate) {
				this.customUpdateRate = customUpdateRate;
			}

			public String getDeployTime() {
				return this.deployTime;
			}

			public void setDeployTime(String deployTime) {
				this.deployTime = deployTime;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Long getLogicUnitNo() {
				return this.logicUnitNo;
			}

			public void setLogicUnitNo(Long logicUnitNo) {
				this.logicUnitNo = logicUnitNo;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public Integer getCreateType() {
				return this.createType;
			}

			public void setCreateType(Integer createType) {
				this.createType = createType;
			}

			public String getOwnerUserName() {
				return this.ownerUserName;
			}

			public void setOwnerUserName(String ownerUserName) {
				this.ownerUserName = ownerUserName;
			}

			public Integer getCallCount() {
				return this.callCount;
			}

			public void setCallCount(Integer callCount) {
				this.callCount = callCount;
			}

			public Integer getExecuteMode() {
				return this.executeMode;
			}

			public void setExecuteMode(Integer executeMode) {
				this.executeMode = executeMode;
			}

			public Long getApiId() {
				return this.apiId;
			}

			public void setApiId(Long apiId) {
				this.apiId = apiId;
			}

			public List<AppInfo> getAppInfoList() {
				return this.appInfoList;
			}

			public void setAppInfoList(List<AppInfo> appInfoList) {
				this.appInfoList = appInfoList;
			}

			public static class AppInfo {

				private Integer appId;

				private Long appKey;

				private String appName;

				public Integer getAppId() {
					return this.appId;
				}

				public void setAppId(Integer appId) {
					this.appId = appId;
				}

				public Long getAppKey() {
					return this.appKey;
				}

				public void setAppKey(Long appKey) {
					this.appKey = appKey;
				}

				public String getAppName() {
					return this.appName;
				}

				public void setAppName(String appName) {
					this.appName = appName;
				}
			}
		}
	}

	@Override
	public ListDataServicePublishedApisResponse getInstance(UnmarshallerContext context) {
		return	ListDataServicePublishedApisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
