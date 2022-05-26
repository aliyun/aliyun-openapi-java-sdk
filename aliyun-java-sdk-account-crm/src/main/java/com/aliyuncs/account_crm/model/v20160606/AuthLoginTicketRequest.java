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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AuthLoginTicketRequest extends RpcAcsRequest<AuthLoginTicketResponse> {
	   

	private String authCode;

	private String appName;

	private String minorAuthCode;

	private String scene;
	public AuthLoginTicketRequest() {
		super("account-crm", "2016-06-06", "AuthLoginTicket");
		setMethod(MethodType.POST);
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
		if(authCode != null){
			putQueryParameter("AuthCode", authCode);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getMinorAuthCode() {
		return this.minorAuthCode;
	}

	public void setMinorAuthCode(String minorAuthCode) {
		this.minorAuthCode = minorAuthCode;
		if(minorAuthCode != null){
			putQueryParameter("MinorAuthCode", minorAuthCode);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	@Override
	public Class<AuthLoginTicketResponse> getResponseClass() {
		return AuthLoginTicketResponse.class;
	}

}
