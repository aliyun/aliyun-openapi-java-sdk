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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribePlanMaintenanceWindowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlanMaintenanceWindowsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<PlanMaintenanceWindowInfo> planMaintenanceWindowList;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<PlanMaintenanceWindowInfo> getPlanMaintenanceWindowList() {
		return this.planMaintenanceWindowList;
	}

	public void setPlanMaintenanceWindowList(List<PlanMaintenanceWindowInfo> planMaintenanceWindowList) {
		this.planMaintenanceWindowList = planMaintenanceWindowList;
	}

	public static class PlanMaintenanceWindowInfo {

		private String supportMaintenanceAction;

		private String modifiedTime;

		private String createTime;

		private Integer minMaintenanceInterval;

		private String planWindowName;

		private Boolean enable;

		private String planWindowId;

		private TargetResource targetResource;

		private TimePeriod timePeriod;

		public String getSupportMaintenanceAction() {
			return this.supportMaintenanceAction;
		}

		public void setSupportMaintenanceAction(String supportMaintenanceAction) {
			this.supportMaintenanceAction = supportMaintenanceAction;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getMinMaintenanceInterval() {
			return this.minMaintenanceInterval;
		}

		public void setMinMaintenanceInterval(Integer minMaintenanceInterval) {
			this.minMaintenanceInterval = minMaintenanceInterval;
		}

		public String getPlanWindowName() {
			return this.planWindowName;
		}

		public void setPlanWindowName(String planWindowName) {
			this.planWindowName = planWindowName;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getPlanWindowId() {
			return this.planWindowId;
		}

		public void setPlanWindowId(String planWindowId) {
			this.planWindowId = planWindowId;
		}

		public TargetResource getTargetResource() {
			return this.targetResource;
		}

		public void setTargetResource(TargetResource targetResource) {
			this.targetResource = targetResource;
		}

		public TimePeriod getTimePeriod() {
			return this.timePeriod;
		}

		public void setTimePeriod(TimePeriod timePeriod) {
			this.timePeriod = timePeriod;
		}

		public static class TargetResource {

			private String scope;

			private String resourceGroupId;

			private List<ResourceTags> tags;

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public List<ResourceTags> getTags() {
				return this.tags;
			}

			public void setTags(List<ResourceTags> tags) {
				this.tags = tags;
			}

			public static class ResourceTags {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}

		public static class TimePeriod {

			private String periodUnit;

			private List<TimeWindows> rangeList;

			public String getPeriodUnit() {
				return this.periodUnit;
			}

			public void setPeriodUnit(String periodUnit) {
				this.periodUnit = periodUnit;
			}

			public List<TimeWindows> getRangeList() {
				return this.rangeList;
			}

			public void setRangeList(List<TimeWindows> rangeList) {
				this.rangeList = rangeList;
			}

			public static class TimeWindows {

				private String endTime;

				private String startTime;

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}
			}
		}
	}

	@Override
	public DescribePlanMaintenanceWindowsResponse getInstance(UnmarshallerContext context) {
		return	DescribePlanMaintenanceWindowsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
