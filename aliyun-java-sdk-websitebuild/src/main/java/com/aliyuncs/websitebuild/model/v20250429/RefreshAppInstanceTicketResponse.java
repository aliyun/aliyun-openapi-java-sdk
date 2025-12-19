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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.RefreshAppInstanceTicketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RefreshAppInstanceTicketResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private String uuid;

		private String bid;

		private String parentPk;

		private String aliyunPk;

		private String attributes;

		private String authorizationGrantType;

		private String accessTokenValue;

		private String accessTokenIssuedAt;

		private String accessTokenExpiresAt;

		private String refreshTokenValue;

		private String refreshTokenIssuedAt;

		private String refreshTokenExpiresAt;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getParentPk() {
			return this.parentPk;
		}

		public void setParentPk(String parentPk) {
			this.parentPk = parentPk;
		}

		public String getAliyunPk() {
			return this.aliyunPk;
		}

		public void setAliyunPk(String aliyunPk) {
			this.aliyunPk = aliyunPk;
		}

		public String getAttributes() {
			return this.attributes;
		}

		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}

		public String getAuthorizationGrantType() {
			return this.authorizationGrantType;
		}

		public void setAuthorizationGrantType(String authorizationGrantType) {
			this.authorizationGrantType = authorizationGrantType;
		}

		public String getAccessTokenValue() {
			return this.accessTokenValue;
		}

		public void setAccessTokenValue(String accessTokenValue) {
			this.accessTokenValue = accessTokenValue;
		}

		public String getAccessTokenIssuedAt() {
			return this.accessTokenIssuedAt;
		}

		public void setAccessTokenIssuedAt(String accessTokenIssuedAt) {
			this.accessTokenIssuedAt = accessTokenIssuedAt;
		}

		public String getAccessTokenExpiresAt() {
			return this.accessTokenExpiresAt;
		}

		public void setAccessTokenExpiresAt(String accessTokenExpiresAt) {
			this.accessTokenExpiresAt = accessTokenExpiresAt;
		}

		public String getRefreshTokenValue() {
			return this.refreshTokenValue;
		}

		public void setRefreshTokenValue(String refreshTokenValue) {
			this.refreshTokenValue = refreshTokenValue;
		}

		public String getRefreshTokenIssuedAt() {
			return this.refreshTokenIssuedAt;
		}

		public void setRefreshTokenIssuedAt(String refreshTokenIssuedAt) {
			this.refreshTokenIssuedAt = refreshTokenIssuedAt;
		}

		public String getRefreshTokenExpiresAt() {
			return this.refreshTokenExpiresAt;
		}

		public void setRefreshTokenExpiresAt(String refreshTokenExpiresAt) {
			this.refreshTokenExpiresAt = refreshTokenExpiresAt;
		}
	}

	@Override
	public RefreshAppInstanceTicketResponse getInstance(UnmarshallerContext context) {
		return	RefreshAppInstanceTicketResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
