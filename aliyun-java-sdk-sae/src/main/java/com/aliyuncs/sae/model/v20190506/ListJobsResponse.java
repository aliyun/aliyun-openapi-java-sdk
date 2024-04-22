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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.ListJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Integer currentPage;

	private Integer totalSize;

	private Integer pageSize;

	private Data data;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Integer totalSize;

		private Integer pageSize;

		private List<Application> applications;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Application> getApplications() {
			return this.applications;
		}

		public void setApplications(List<Application> applications) {
			this.applications = applications;
		}

		public static class Application {

			private String appName;

			private String namespaceId;

			private Boolean appDeletingStatus;

			private String appId;

			private Boolean scaleRuleEnabled;

			private String scaleRuleType;

			private Integer runningInstances;

			private Integer instances;

			private String regionId;

			private String appDescription;

			private String triggerConfig;

			private Boolean suspend;

			private Long active;

			private Long succeeded;

			private Long failed;

			private Long lastStartTime;

			private Long completionTime;

			private String lastChangeorderState;

			private String lastJobState;

			private Integer cpu;

			private Integer mem;

			private String message;

			private List<TagsItem> tags;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getNamespaceId() {
				return this.namespaceId;
			}

			public void setNamespaceId(String namespaceId) {
				this.namespaceId = namespaceId;
			}

			public Boolean getAppDeletingStatus() {
				return this.appDeletingStatus;
			}

			public void setAppDeletingStatus(Boolean appDeletingStatus) {
				this.appDeletingStatus = appDeletingStatus;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Boolean getScaleRuleEnabled() {
				return this.scaleRuleEnabled;
			}

			public void setScaleRuleEnabled(Boolean scaleRuleEnabled) {
				this.scaleRuleEnabled = scaleRuleEnabled;
			}

			public String getScaleRuleType() {
				return this.scaleRuleType;
			}

			public void setScaleRuleType(String scaleRuleType) {
				this.scaleRuleType = scaleRuleType;
			}

			public Integer getRunningInstances() {
				return this.runningInstances;
			}

			public void setRunningInstances(Integer runningInstances) {
				this.runningInstances = runningInstances;
			}

			public Integer getInstances() {
				return this.instances;
			}

			public void setInstances(Integer instances) {
				this.instances = instances;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getAppDescription() {
				return this.appDescription;
			}

			public void setAppDescription(String appDescription) {
				this.appDescription = appDescription;
			}

			public String getTriggerConfig() {
				return this.triggerConfig;
			}

			public void setTriggerConfig(String triggerConfig) {
				this.triggerConfig = triggerConfig;
			}

			public Boolean getSuspend() {
				return this.suspend;
			}

			public void setSuspend(Boolean suspend) {
				this.suspend = suspend;
			}

			public Long getActive() {
				return this.active;
			}

			public void setActive(Long active) {
				this.active = active;
			}

			public Long getSucceeded() {
				return this.succeeded;
			}

			public void setSucceeded(Long succeeded) {
				this.succeeded = succeeded;
			}

			public Long getFailed() {
				return this.failed;
			}

			public void setFailed(Long failed) {
				this.failed = failed;
			}

			public Long getLastStartTime() {
				return this.lastStartTime;
			}

			public void setLastStartTime(Long lastStartTime) {
				this.lastStartTime = lastStartTime;
			}

			public Long getCompletionTime() {
				return this.completionTime;
			}

			public void setCompletionTime(Long completionTime) {
				this.completionTime = completionTime;
			}

			public String getLastChangeorderState() {
				return this.lastChangeorderState;
			}

			public void setLastChangeorderState(String lastChangeorderState) {
				this.lastChangeorderState = lastChangeorderState;
			}

			public String getLastJobState() {
				return this.lastJobState;
			}

			public void setLastJobState(String lastJobState) {
				this.lastJobState = lastJobState;
			}

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public Integer getMem() {
				return this.mem;
			}

			public void setMem(Integer mem) {
				this.mem = mem;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public static class TagsItem {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public ListJobsResponse getInstance(UnmarshallerContext context) {
		return	ListJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
