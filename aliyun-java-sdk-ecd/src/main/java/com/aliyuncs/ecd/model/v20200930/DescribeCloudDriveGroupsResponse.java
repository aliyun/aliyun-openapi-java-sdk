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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeCloudDriveGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudDriveGroupsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Long count;

	private Boolean success;

	private List<CloudDriveGroup> cloudDriveGroups;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<CloudDriveGroup> getCloudDriveGroups() {
		return this.cloudDriveGroups;
	}

	public void setCloudDriveGroups(List<CloudDriveGroup> cloudDriveGroups) {
		this.cloudDriveGroups = cloudDriveGroups;
	}

	public static class CloudDriveGroup {

		private String status;

		private String groupId;

		private String groupName;

		private String directoryId;

		private String driveId;

		private String createTime;

		private Long totalSize;

		private String usedSize;

		private String adminUserIds;

		private String orgId;

		private List<EndUserIdWithNickNameModel> adminUserInfos;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}

		public String getDriveId() {
			return this.driveId;
		}

		public void setDriveId(String driveId) {
			this.driveId = driveId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public String getUsedSize() {
			return this.usedSize;
		}

		public void setUsedSize(String usedSize) {
			this.usedSize = usedSize;
		}

		public String getAdminUserIds() {
			return this.adminUserIds;
		}

		public void setAdminUserIds(String adminUserIds) {
			this.adminUserIds = adminUserIds;
		}

		public String getOrgId() {
			return this.orgId;
		}

		public void setOrgId(String orgId) {
			this.orgId = orgId;
		}

		public List<EndUserIdWithNickNameModel> getAdminUserInfos() {
			return this.adminUserInfos;
		}

		public void setAdminUserInfos(List<EndUserIdWithNickNameModel> adminUserInfos) {
			this.adminUserInfos = adminUserInfos;
		}

		public static class EndUserIdWithNickNameModel {

			private String endUserId;

			private String nickName;

			public String getEndUserId() {
				return this.endUserId;
			}

			public void setEndUserId(String endUserId) {
				this.endUserId = endUserId;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}
		}
	}

	@Override
	public DescribeCloudDriveGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudDriveGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
