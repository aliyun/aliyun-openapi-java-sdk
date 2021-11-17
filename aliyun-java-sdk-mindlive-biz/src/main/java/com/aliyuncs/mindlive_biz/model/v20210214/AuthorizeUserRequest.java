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

package com.aliyuncs.mindlive_biz.model.v20210214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AuthorizeUserRequest extends RpcAcsRequest<AuthorizeUserResponse> {
	   

	private String userSource;

	private String userId;

	private String code;
	public AuthorizeUserRequest() {
		super("mindlive-biz", "2021-02-14", "AuthorizeUser");
		setMethod(MethodType.POST);
	}

	public String getUserSource() {
		return this.userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
		if(userSource != null){
			putQueryParameter("UserSource", userSource);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code);
		}
	}

	@Override
	public Class<AuthorizeUserResponse> getResponseClass() {
		return AuthorizeUserResponse.class;
	}

}
