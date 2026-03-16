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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.DescribeGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<Group> groups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public static class Group {

		private String groupName;

		private String groupId;

		private String description;

		private String createTime;

		private Integer userCount;

		private Boolean transferFileNeedApproval;

		private Map<Object,Object> authedResources;

		private AttachedLoginPolicy attachedLoginPolicy;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Integer userCount) {
			this.userCount = userCount;
		}

		public Boolean getTransferFileNeedApproval() {
			return this.transferFileNeedApproval;
		}

		public void setTransferFileNeedApproval(Boolean transferFileNeedApproval) {
			this.transferFileNeedApproval = transferFileNeedApproval;
		}

		public Map<Object,Object> getAuthedResources() {
			return this.authedResources;
		}

		public void setAuthedResources(Map<Object,Object> authedResources) {
			this.authedResources = authedResources;
		}

		public AttachedLoginPolicy getAttachedLoginPolicy() {
			return this.attachedLoginPolicy;
		}

		public void setAttachedLoginPolicy(AttachedLoginPolicy attachedLoginPolicy) {
			this.attachedLoginPolicy = attachedLoginPolicy;
		}

		public static class AttachedLoginPolicy {

			private String policyId;

			private String name;

			public String getPolicyId() {
				return this.policyId;
			}

			public void setPolicyId(String policyId) {
				this.policyId = policyId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public DescribeGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
