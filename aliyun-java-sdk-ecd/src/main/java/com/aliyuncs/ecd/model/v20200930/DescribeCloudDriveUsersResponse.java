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
import com.aliyuncs.ecd.transform.v20200930.DescribeCloudDriveUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudDriveUsersResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<CloudDriveUser> cloudDriveUsers;

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

	public List<CloudDriveUser> getCloudDriveUsers() {
		return this.cloudDriveUsers;
	}

	public void setCloudDriveUsers(List<CloudDriveUser> cloudDriveUsers) {
		this.cloudDriveUsers = cloudDriveUsers;
	}

	public static class CloudDriveUser {

		private Long usedSize;

		private String status;

		private String driveId;

		private Long totalSize;

		private String userId;

		private String userName;

		private String endUserId;

		public Long getUsedSize() {
			return this.usedSize;
		}

		public void setUsedSize(Long usedSize) {
			this.usedSize = usedSize;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDriveId() {
			return this.driveId;
		}

		public void setDriveId(String driveId) {
			this.driveId = driveId;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}
	}

	@Override
	public DescribeCloudDriveUsersResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudDriveUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
