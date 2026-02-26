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

package com.aliyuncs.openitag.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.GetTaskWorkforceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskWorkforceResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String details;

	private Boolean success;

	private String errorCode;

	private List<WorkforceItem> workforce;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<WorkforceItem> getWorkforce() {
		return this.workforce;
	}

	public void setWorkforce(List<WorkforceItem> workforce) {
		this.workforce = workforce;
	}

	public static class WorkforceItem {

		private String nodeType;

		private Integer workNodeId;

		private List<UsersItem> users;

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public Integer getWorkNodeId() {
			return this.workNodeId;
		}

		public void setWorkNodeId(Integer workNodeId) {
			this.workNodeId = workNodeId;
		}

		public List<UsersItem> getUsers() {
			return this.users;
		}

		public void setUsers(List<UsersItem> users) {
			this.users = users;
		}

		public static class UsersItem {

			private Long userId;

			private String accountType;

			private String accountNo;

			private String userName;

			private String role;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getAccountNo() {
				return this.accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}
		}
	}

	@Override
	public GetTaskWorkforceResponse getInstance(UnmarshallerContext context) {
		return	GetTaskWorkforceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
