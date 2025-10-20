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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListApplicationAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationAccountsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<ApplicationAccount> applicationAccounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ApplicationAccount> getApplicationAccounts() {
		return this.applicationAccounts;
	}

	public void setApplicationAccounts(List<ApplicationAccount> applicationAccounts) {
		this.applicationAccounts = applicationAccounts;
	}

	public static class ApplicationAccount {

		private String instanceId;

		private String applicationId;

		private String applicationAccountId;

		private String userId;

		private String applicationUsername;

		private Long createTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getApplicationAccountId() {
			return this.applicationAccountId;
		}

		public void setApplicationAccountId(String applicationAccountId) {
			this.applicationAccountId = applicationAccountId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getApplicationUsername() {
			return this.applicationUsername;
		}

		public void setApplicationUsername(String applicationUsername) {
			this.applicationUsername = applicationUsername;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListApplicationAccountsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationAccountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
