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

package com.aliyuncs.resourcemanager.model.v20200331;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.ListAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccountsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Account> accounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public static class Account {

		private String resourceDirectoryId;

		private String accountId;

		private String displayName;

		private String folderId;

		private String joinMethod;

		private String joinTime;

		private String modifyTime;

		private String type;

		private String status;

		public String getResourceDirectoryId() {
			return this.resourceDirectoryId;
		}

		public void setResourceDirectoryId(String resourceDirectoryId) {
			this.resourceDirectoryId = resourceDirectoryId;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getFolderId() {
			return this.folderId;
		}

		public void setFolderId(String folderId) {
			this.folderId = folderId;
		}

		public String getJoinMethod() {
			return this.joinMethod;
		}

		public void setJoinMethod(String joinMethod) {
			this.joinMethod = joinMethod;
		}

		public String getJoinTime() {
			return this.joinTime;
		}

		public void setJoinTime(String joinTime) {
			this.joinTime = joinTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListAccountsResponse getInstance(UnmarshallerContext context) {
		return	ListAccountsResponseUnmarshaller.unmarshall(this, context);
	}
}
