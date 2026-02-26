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

package com.aliyuncs.eds_user.model.v20210308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.DescribeResourceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceGroupsResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private List<ResourceGroupItem> resourceGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<ResourceGroupItem> getResourceGroup() {
		return this.resourceGroup;
	}

	public void setResourceGroup(List<ResourceGroupItem> resourceGroup) {
		this.resourceGroup = resourceGroup;
	}

	public static class ResourceGroupItem {

		private String resourceGroupId;

		private String resourceGroupName;

		private String resourceCount;

		private String authCount;

		private String createTime;

		private List<Policy> policies;

		private List<Timer> timers;

		private List<AppRule> appRules;

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public String getResourceCount() {
			return this.resourceCount;
		}

		public void setResourceCount(String resourceCount) {
			this.resourceCount = resourceCount;
		}

		public String getAuthCount() {
			return this.authCount;
		}

		public void setAuthCount(String authCount) {
			this.authCount = authCount;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<Policy> getPolicies() {
			return this.policies;
		}

		public void setPolicies(List<Policy> policies) {
			this.policies = policies;
		}

		public List<Timer> getTimers() {
			return this.timers;
		}

		public void setTimers(List<Timer> timers) {
			this.timers = timers;
		}

		public List<AppRule> getAppRules() {
			return this.appRules;
		}

		public void setAppRules(List<AppRule> appRules) {
			this.appRules = appRules;
		}

		public static class Policy {

			private String id;

			private String name;

			private Boolean isDefault;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}
		}

		public static class Timer {

			private String id;

			private String name;

			private String timerStatus;

			private String bindStatus;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTimerStatus() {
				return this.timerStatus;
			}

			public void setTimerStatus(String timerStatus) {
				this.timerStatus = timerStatus;
			}

			public String getBindStatus() {
				return this.bindStatus;
			}

			public void setBindStatus(String bindStatus) {
				this.bindStatus = bindStatus;
			}
		}

		public static class AppRule {

			private String id;

			private String name;

			private Integer type;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}
		}
	}

	@Override
	public DescribeResourceGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
