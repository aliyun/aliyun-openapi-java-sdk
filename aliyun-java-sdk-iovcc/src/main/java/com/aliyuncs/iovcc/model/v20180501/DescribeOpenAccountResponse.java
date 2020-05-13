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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeOpenAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOpenAccountResponse extends AcsResponse {

	private String requestId;

	private OpenAccount openAccount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OpenAccount getOpenAccount() {
		return this.openAccount;
	}

	public void setOpenAccount(OpenAccount openAccount) {
		this.openAccount = openAccount;
	}

	public static class OpenAccount {

		private String identityId;

		private String aliyunId;

		private String displayName;

		private String loginId;

		private String idp;

		private String openId;

		private String mobile;

		private Integer type;

		private Integer status;

		private String region;

		private String createAccessKey;

		public String getIdentityId() {
			return this.identityId;
		}

		public void setIdentityId(String identityId) {
			this.identityId = identityId;
		}

		public String getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(String aliyunId) {
			this.aliyunId = aliyunId;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getLoginId() {
			return this.loginId;
		}

		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}

		public String getIdp() {
			return this.idp;
		}

		public void setIdp(String idp) {
			this.idp = idp;
		}

		public String getOpenId() {
			return this.openId;
		}

		public void setOpenId(String openId) {
			this.openId = openId;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getCreateAccessKey() {
			return this.createAccessKey;
		}

		public void setCreateAccessKey(String createAccessKey) {
			this.createAccessKey = createAccessKey;
		}
	}

	@Override
	public DescribeOpenAccountResponse getInstance(UnmarshallerContext context) {
		return	DescribeOpenAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
