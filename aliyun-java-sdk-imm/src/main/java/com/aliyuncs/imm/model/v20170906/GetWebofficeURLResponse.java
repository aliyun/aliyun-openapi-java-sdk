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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.GetWebofficeURLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWebofficeURLResponse extends AcsResponse {

	private String requestId;

	private String webofficeURL;

	private String accessToken;

	private String refreshToken;

	private String accessTokenExpiredTime;

	private String refreshTokenExpiredTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWebofficeURL() {
		return this.webofficeURL;
	}

	public void setWebofficeURL(String webofficeURL) {
		this.webofficeURL = webofficeURL;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getAccessTokenExpiredTime() {
		return this.accessTokenExpiredTime;
	}

	public void setAccessTokenExpiredTime(String accessTokenExpiredTime) {
		this.accessTokenExpiredTime = accessTokenExpiredTime;
	}

	public String getRefreshTokenExpiredTime() {
		return this.refreshTokenExpiredTime;
	}

	public void setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
		this.refreshTokenExpiredTime = refreshTokenExpiredTime;
	}

	@Override
	public GetWebofficeURLResponse getInstance(UnmarshallerContext context) {
		return	GetWebofficeURLResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
