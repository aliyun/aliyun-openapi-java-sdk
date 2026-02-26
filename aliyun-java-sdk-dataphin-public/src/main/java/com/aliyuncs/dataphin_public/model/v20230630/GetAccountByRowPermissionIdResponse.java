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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetAccountByRowPermissionIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountByRowPermissionIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long id;

		private List<UserMappingListItem> userMappingList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<UserMappingListItem> getUserMappingList() {
			return this.userMappingList;
		}

		public void setUserMappingList(List<UserMappingListItem> userMappingList) {
			this.userMappingList = userMappingList;
		}

		public static class UserMappingListItem {

			private String accountType;

			private List<AccountsItem> accounts;

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public List<AccountsItem> getAccounts() {
				return this.accounts;
			}

			public void setAccounts(List<AccountsItem> accounts) {
				this.accounts = accounts;
			}

			public static class AccountsItem {

				private String accountId;

				private String accountName;

				public String getAccountId() {
					return this.accountId;
				}

				public void setAccountId(String accountId) {
					this.accountId = accountId;
				}

				public String getAccountName() {
					return this.accountName;
				}

				public void setAccountName(String accountName) {
					this.accountName = accountName;
				}
			}
		}
	}

	@Override
	public GetAccountByRowPermissionIdResponse getInstance(UnmarshallerContext context) {
		return	GetAccountByRowPermissionIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
