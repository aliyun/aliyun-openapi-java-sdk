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
import com.aliyuncs.dfs.transform.v20180620.GetAccessRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccessRuleResponse extends AcsResponse {

	private String requestId;

	private AccessRule accessRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccessRule getAccessRule() {
		return this.accessRule;
	}

	public void setAccessRule(AccessRule accessRule) {
		this.accessRule = accessRule;
	}

	public static class AccessRule {

		private String accessRuleId;

		private String networkSegment;

		private String description;

		private String accessGroupId;

		private String createTime;

		private String rWAccessType;

		private Integer priority;

		private String regionId;

		public String getAccessRuleId() {
			return this.accessRuleId;
		}

		public void setAccessRuleId(String accessRuleId) {
			this.accessRuleId = accessRuleId;
		}

		public String getNetworkSegment() {
			return this.networkSegment;
		}

		public void setNetworkSegment(String networkSegment) {
			this.networkSegment = networkSegment;
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

		public String getRWAccessType() {
			return this.rWAccessType;
		}

		public void setRWAccessType(String rWAccessType) {
			this.rWAccessType = rWAccessType;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public GetAccessRuleResponse getInstance(UnmarshallerContext context) {
		return	GetAccessRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
