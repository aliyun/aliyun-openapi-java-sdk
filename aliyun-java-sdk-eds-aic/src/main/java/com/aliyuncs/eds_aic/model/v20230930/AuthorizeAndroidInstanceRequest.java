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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AuthorizeAndroidInstanceRequest extends RpcAcsRequest<AuthorizeAndroidInstanceResponse> {
	   

	private List<String> androidInstanceIdss;

	private String authorizeUserId;

	private String unAuthorizeUserId;
	public AuthorizeAndroidInstanceRequest() {
		super("eds-aic", "2023-09-30", "AuthorizeAndroidInstance");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getAndroidInstanceIdss() {
		return this.androidInstanceIdss;
	}

	public void setAndroidInstanceIdss(List<String> androidInstanceIdss) {
		this.androidInstanceIdss = androidInstanceIdss;	
		if (androidInstanceIdss != null) {
			for (int i = 0; i < androidInstanceIdss.size(); i++) {
				putQueryParameter("AndroidInstanceIds." + (i + 1) , androidInstanceIdss.get(i));
			}
		}	
	}

	public String getAuthorizeUserId() {
		return this.authorizeUserId;
	}

	public void setAuthorizeUserId(String authorizeUserId) {
		this.authorizeUserId = authorizeUserId;
		if(authorizeUserId != null){
			putQueryParameter("AuthorizeUserId", authorizeUserId);
		}
	}

	public String getUnAuthorizeUserId() {
		return this.unAuthorizeUserId;
	}

	public void setUnAuthorizeUserId(String unAuthorizeUserId) {
		this.unAuthorizeUserId = unAuthorizeUserId;
		if(unAuthorizeUserId != null){
			putQueryParameter("UnAuthorizeUserId", unAuthorizeUserId);
		}
	}

	@Override
	public Class<AuthorizeAndroidInstanceResponse> getResponseClass() {
		return AuthorizeAndroidInstanceResponse.class;
	}

}
