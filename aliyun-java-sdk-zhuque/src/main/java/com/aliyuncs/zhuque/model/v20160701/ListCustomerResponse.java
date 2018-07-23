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

package com.aliyuncs.zhuque.model.v20160701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.zhuque.transform.v20160701.ListCustomerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomerResponse extends AcsResponse {

	private String requestId;

	private String result;

	private String message;

	private List<CustomerRespItem> customerResp;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<CustomerRespItem> getCustomerResp() {
		return this.customerResp;
	}

	public void setCustomerResp(List<CustomerRespItem> customerResp) {
		this.customerResp = customerResp;
	}

	public static class CustomerRespItem {

		private String customerId;

		private String customerName;

		private String customerType;

		private String description;

		private String origin;

		private List<UserListItem> userList;

		public String getCustomerId() {
			return this.customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return this.customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerType() {
			return this.customerType;
		}

		public void setCustomerType(String customerType) {
			this.customerType = customerType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOrigin() {
			return this.origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}

		public List<UserListItem> getUserList() {
			return this.userList;
		}

		public void setUserList(List<UserListItem> userList) {
			this.userList = userList;
		}

		public static class UserListItem {

			private String empId;

			private String account;

			private String emailAddr;

			private String lastName;

			private String userType;

			private String nickNameCn;

			public String getEmpId() {
				return this.empId;
			}

			public void setEmpId(String empId) {
				this.empId = empId;
			}

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getEmailAddr() {
				return this.emailAddr;
			}

			public void setEmailAddr(String emailAddr) {
				this.emailAddr = emailAddr;
			}

			public String getLastName() {
				return this.lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getUserType() {
				return this.userType;
			}

			public void setUserType(String userType) {
				this.userType = userType;
			}

			public String getNickNameCn() {
				return this.nickNameCn;
			}

			public void setNickNameCn(String nickNameCn) {
				this.nickNameCn = nickNameCn;
			}
		}
	}

	@Override
	public ListCustomerResponse getInstance(UnmarshallerContext context) {
		return	ListCustomerResponseUnmarshaller.unmarshall(this, context);
	}
}
