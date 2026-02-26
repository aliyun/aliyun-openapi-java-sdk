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

package com.aliyuncs.dfs.model.v20180620;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dfs.transform.v20180620.GetAccessGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccessGroupResponse extends AcsResponse {

	private String requestId;

	private AccessGroup accessGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccessGroup getAccessGroup() {
		return this.accessGroup;
	}

	public void setAccessGroup(AccessGroup accessGroup) {
		this.accessGroup = accessGroup;
	}

	public static class AccessGroup {

		private Boolean isDefault;

		private String accessGroupName;

		private Integer mountPointCount;

		private String description;

		private String accessGroupId;

		private String createTime;

		private String networkType;

		private Integer ruleCount;

		private String regionId;

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getAccessGroupName() {
			return this.accessGroupName;
		}

		public void setAccessGroupName(String accessGroupName) {
			this.accessGroupName = accessGroupName;
		}

		public Integer getMountPointCount() {
			return this.mountPointCount;
		}

		public void setMountPointCount(Integer mountPointCount) {
			this.mountPointCount = mountPointCount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAccessGroupId() {
			return this.accessGroupId;
		}

		public void setAccessGroupId(String accessGroupId) {
			this.accessGroupId = accessGroupId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Integer getRuleCount() {
			return this.ruleCount;
		}

		public void setRuleCount(Integer ruleCount) {
			this.ruleCount = ruleCount;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public GetAccessGroupResponse getInstance(UnmarshallerContext context) {
		return	GetAccessGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
