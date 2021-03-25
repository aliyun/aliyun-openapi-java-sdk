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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryFinancialAccountInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFinancialAccountInfoResponse extends AcsResponse {

	private String code;

	private String requestId;

	private Boolean success;

	private String message;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String userName;

		private Boolean isFinancialAccount;

		private String accountType;

		private String memberNickName;

		private Long memberGroupId;

		private String memberGroupName;

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Boolean getIsFinancialAccount() {
			return this.isFinancialAccount;
		}

		public void setIsFinancialAccount(Boolean isFinancialAccount) {
			this.isFinancialAccount = isFinancialAccount;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getMemberNickName() {
			return this.memberNickName;
		}

		public void setMemberNickName(String memberNickName) {
			this.memberNickName = memberNickName;
		}

		public Long getMemberGroupId() {
			return this.memberGroupId;
		}

		public void setMemberGroupId(Long memberGroupId) {
			this.memberGroupId = memberGroupId;
		}

		public String getMemberGroupName() {
			return this.memberGroupName;
		}

		public void setMemberGroupName(String memberGroupName) {
			this.memberGroupName = memberGroupName;
		}
	}

	@Override
	public QueryFinancialAccountInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryFinancialAccountInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
