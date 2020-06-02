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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetAuthorizationTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAuthorizationTokenResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private String tempUsername;

	private String authorizationToken;

	private Long expireTime;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

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

	public String getTempUsername() {
		return this.tempUsername;
	}

	public void setTempUsername(String tempUsername) {
		this.tempUsername = tempUsername;
	}

	public String getAuthorizationToken() {
		return this.authorizationToken;
	}

	public void setAuthorizationToken(String authorizationToken) {
		this.authorizationToken = authorizationToken;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	@Override
	public GetAuthorizationTokenResponse getInstance(UnmarshallerContext context) {
		return	GetAuthorizationTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
