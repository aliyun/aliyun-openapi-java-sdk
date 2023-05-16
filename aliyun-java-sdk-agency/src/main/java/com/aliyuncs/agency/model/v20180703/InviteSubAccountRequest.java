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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InviteSubAccountRequest extends RpcAcsRequest<InviteSubAccountResponse> {
	   

	private List<AccountInfoList> accountInfoLists;
	public InviteSubAccountRequest() {
		super("Agency", "2018-07-03", "InviteSubAccount", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<AccountInfoList> getAccountInfoLists() {
		return this.accountInfoLists;
	}

	public void setAccountInfoLists(List<AccountInfoList> accountInfoLists) {
		this.accountInfoLists = accountInfoLists;	
		if (accountInfoLists != null) {
			for (int depth1 = 0; depth1 < accountInfoLists.size(); depth1++) {
				putQueryParameter("AccountInfoList." + (depth1 + 1) + ".SubAccountType" , accountInfoLists.get(depth1).getSubAccountType());
				putQueryParameter("AccountInfoList." + (depth1 + 1) + ".CreditLine" , accountInfoLists.get(depth1).getCreditLine());
				putQueryParameter("AccountInfoList." + (depth1 + 1) + ".ZeroCreditShutdownPolicy" , accountInfoLists.get(depth1).getZeroCreditShutdownPolicy());
				putQueryParameter("AccountInfoList." + (depth1 + 1) + ".EmailAddress" , accountInfoLists.get(depth1).getEmailAddress());
				putQueryParameter("AccountInfoList." + (depth1 + 1) + ".Remark" , accountInfoLists.get(depth1).getRemark());
				putQueryParameter("AccountInfoList." + (depth1 + 1) + ".AccountNickname" , accountInfoLists.get(depth1).getAccountNickname());
			}
		}	
	}

	public static class AccountInfoList {

		private String subAccountType;

		private String creditLine;

		private String zeroCreditShutdownPolicy;

		private String emailAddress;

		private String remark;

		private String accountNickname;

		public String getSubAccountType() {
			return this.subAccountType;
		}

		public void setSubAccountType(String subAccountType) {
			this.subAccountType = subAccountType;
		}

		public String getCreditLine() {
			return this.creditLine;
		}

		public void setCreditLine(String creditLine) {
			this.creditLine = creditLine;
		}

		public String getZeroCreditShutdownPolicy() {
			return this.zeroCreditShutdownPolicy;
		}

		public void setZeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
			this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
		}

		public String getEmailAddress() {
			return this.emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getAccountNickname() {
			return this.accountNickname;
		}

		public void setAccountNickname(String accountNickname) {
			this.accountNickname = accountNickname;
		}
	}

	@Override
	public Class<InviteSubAccountResponse> getResponseClass() {
		return InviteSubAccountResponse.class;
	}

}
