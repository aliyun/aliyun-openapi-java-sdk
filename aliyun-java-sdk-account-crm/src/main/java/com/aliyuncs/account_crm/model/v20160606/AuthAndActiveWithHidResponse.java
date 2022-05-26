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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.AuthAndActiveWithHidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AuthAndActiveWithHidResponse extends AcsResponse {

	private String code;

	private String msg;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private AccountModel accountModel;

		private SessionModel sessionModel;

		public AccountModel getAccountModel() {
			return this.accountModel;
		}

		public void setAccountModel(AccountModel accountModel) {
			this.accountModel = accountModel;
		}

		public SessionModel getSessionModel() {
			return this.sessionModel;
		}

		public void setSessionModel(SessionModel sessionModel) {
			this.sessionModel = sessionModel;
		}

		public static class AccountModel {

			private String email;

			private String mobile;

			private Long havanaId;

			private Long createTime;

			private String pK;

			private String aliyunId;

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public Long getHavanaId() {
				return this.havanaId;
			}

			public void setHavanaId(Long havanaId) {
				this.havanaId = havanaId;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getPK() {
				return this.pK;
			}

			public void setPK(String pK) {
				this.pK = pK;
			}

			public String getAliyunId() {
				return this.aliyunId;
			}

			public void setAliyunId(String aliyunId) {
				this.aliyunId = aliyunId;
			}
		}

		public static class SessionModel {

			private String aliyunPK;

			private String loginTicket;

			public String getAliyunPK() {
				return this.aliyunPK;
			}

			public void setAliyunPK(String aliyunPK) {
				this.aliyunPK = aliyunPK;
			}

			public String getLoginTicket() {
				return this.loginTicket;
			}

			public void setLoginTicket(String loginTicket) {
				this.loginTicket = loginTicket;
			}
		}
	}

	@Override
	public AuthAndActiveWithHidResponse getInstance(UnmarshallerContext context) {
		return	AuthAndActiveWithHidResponseUnmarshaller.unmarshall(this, context);
	}
}
