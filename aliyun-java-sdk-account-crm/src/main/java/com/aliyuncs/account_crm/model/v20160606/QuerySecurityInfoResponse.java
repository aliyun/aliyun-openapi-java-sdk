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
import com.aliyuncs.account_crm.transform.v20160606.QuerySecurityInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySecurityInfoResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private AccountSecurityInfoDto accountSecurityInfoDto;

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

	public AccountSecurityInfoDto getAccountSecurityInfoDto() {
		return this.accountSecurityInfoDto;
	}

	public void setAccountSecurityInfoDto(AccountSecurityInfoDto accountSecurityInfoDto) {
		this.accountSecurityInfoDto = accountSecurityInfoDto;
	}

	public static class AccountSecurityInfoDto {

		private String pk;

		private String securityEmail;

		private String securityMobile;

		private String profileType;

		private String name;

		private String aliyunId;

		private String nationalityCode;

		public String getPk() {
			return this.pk;
		}

		public void setPk(String pk) {
			this.pk = pk;
		}

		public String getSecurityEmail() {
			return this.securityEmail;
		}

		public void setSecurityEmail(String securityEmail) {
			this.securityEmail = securityEmail;
		}

		public String getSecurityMobile() {
			return this.securityMobile;
		}

		public void setSecurityMobile(String securityMobile) {
			this.securityMobile = securityMobile;
		}

		public String getProfileType() {
			return this.profileType;
		}

		public void setProfileType(String profileType) {
			this.profileType = profileType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(String aliyunId) {
			this.aliyunId = aliyunId;
		}

		public String getNationalityCode() {
			return this.nationalityCode;
		}

		public void setNationalityCode(String nationalityCode) {
			this.nationalityCode = nationalityCode;
		}
	}

	@Override
	public QuerySecurityInfoResponse getInstance(UnmarshallerContext context) {
		return	QuerySecurityInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
