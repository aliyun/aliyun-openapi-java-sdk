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

package com.aliyuncs.openanalytics_open.model.v20180619;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.DecodeStsTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DecodeStsTokenResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long accountUid;

		private Long accountBid;

		private Long grantorId;

		private String tokenPrincipalId;

		private String tokenPrincipalName;

		private Boolean mfaAuthenticated;

		private Long roleId;

		private String akProxy;

		private Boolean proxyTrustTransportInfo;

		private String policy;

		private String roleName;

		private String playerUid;

		private Long expireDate;

		private String tokenType;

		public Long getAccountUid() {
			return this.accountUid;
		}

		public void setAccountUid(Long accountUid) {
			this.accountUid = accountUid;
		}

		public Long getAccountBid() {
			return this.accountBid;
		}

		public void setAccountBid(Long accountBid) {
			this.accountBid = accountBid;
		}

		public Long getGrantorId() {
			return this.grantorId;
		}

		public void setGrantorId(Long grantorId) {
			this.grantorId = grantorId;
		}

		public String getTokenPrincipalId() {
			return this.tokenPrincipalId;
		}

		public void setTokenPrincipalId(String tokenPrincipalId) {
			this.tokenPrincipalId = tokenPrincipalId;
		}

		public String getTokenPrincipalName() {
			return this.tokenPrincipalName;
		}

		public void setTokenPrincipalName(String tokenPrincipalName) {
			this.tokenPrincipalName = tokenPrincipalName;
		}

		public Boolean getMfaAuthenticated() {
			return this.mfaAuthenticated;
		}

		public void setMfaAuthenticated(Boolean mfaAuthenticated) {
			this.mfaAuthenticated = mfaAuthenticated;
		}

		public Long getRoleId() {
			return this.roleId;
		}

		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}

		public String getAkProxy() {
			return this.akProxy;
		}

		public void setAkProxy(String akProxy) {
			this.akProxy = akProxy;
		}

		public Boolean getProxyTrustTransportInfo() {
			return this.proxyTrustTransportInfo;
		}

		public void setProxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
			this.proxyTrustTransportInfo = proxyTrustTransportInfo;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getPlayerUid() {
			return this.playerUid;
		}

		public void setPlayerUid(String playerUid) {
			this.playerUid = playerUid;
		}

		public Long getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(Long expireDate) {
			this.expireDate = expireDate;
		}

		public String getTokenType() {
			return this.tokenType;
		}

		public void setTokenType(String tokenType) {
			this.tokenType = tokenType;
		}
	}

	@Override
	public DecodeStsTokenResponse getInstance(UnmarshallerContext context) {
		return	DecodeStsTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
