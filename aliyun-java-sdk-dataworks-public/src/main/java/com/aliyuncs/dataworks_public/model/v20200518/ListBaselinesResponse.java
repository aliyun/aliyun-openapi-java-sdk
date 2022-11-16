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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListBaselinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBaselinesResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private String dynamicErrorCode;

	private String dynamicErrorMessage;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicErrorCode() {
		return this.dynamicErrorCode;
	}

	public void setDynamicErrorCode(String dynamicErrorCode) {
		this.dynamicErrorCode = dynamicErrorCode;
	}

	public String getDynamicErrorMessage() {
		return this.dynamicErrorMessage;
	}

	public void setDynamicErrorMessage(String dynamicErrorMessage) {
		this.dynamicErrorMessage = dynamicErrorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String pageNumber;

		private String pageSize;

		private String totalCount;

		private List<BaselinesItem> baselines;

		public String getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(String pageNumber) {
			this.pageNumber = pageNumber;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public List<BaselinesItem> getBaselines() {
			return this.baselines;
		}

		public void setBaselines(List<BaselinesItem> baselines) {
			this.baselines = baselines;
		}

		public static class BaselinesItem {

			private Long baselineId;

			private Long projectId;

			private String baselineType;

			private Integer priority;

			private String owner;

			private String baselineName;

			private Boolean enabled;

			private Boolean alertEnabled;

			private Integer alertMarginThreshold;

			private List<OverTimeSettingsItem> overTimeSettings;

			public Long getBaselineId() {
				return this.baselineId;
			}

			public void setBaselineId(Long baselineId) {
				this.baselineId = baselineId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getBaselineType() {
				return this.baselineType;
			}

			public void setBaselineType(String baselineType) {
				this.baselineType = baselineType;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getBaselineName() {
				return this.baselineName;
			}

			public void setBaselineName(String baselineName) {
				this.baselineName = baselineName;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public Boolean getAlertEnabled() {
				return this.alertEnabled;
			}

			public void setAlertEnabled(Boolean alertEnabled) {
				this.alertEnabled = alertEnabled;
			}

			public Integer getAlertMarginThreshold() {
				return this.alertMarginThreshold;
			}

			public void setAlertMarginThreshold(Integer alertMarginThreshold) {
				this.alertMarginThreshold = alertMarginThreshold;
			}

			public List<OverTimeSettingsItem> getOverTimeSettings() {
				return this.overTimeSettings;
			}

			public void setOverTimeSettings(List<OverTimeSettingsItem> overTimeSettings) {
				this.overTimeSettings = overTimeSettings;
			}

			public static class OverTimeSettingsItem {

				private Integer cycle;

				private String time;

				public Integer getCycle() {
					return this.cycle;
				}

				public void setCycle(Integer cycle) {
					this.cycle = cycle;
				}

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}
			}
		}
	}

	@Override
	public ListBaselinesResponse getInstance(UnmarshallerContext context) {
		return	ListBaselinesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
