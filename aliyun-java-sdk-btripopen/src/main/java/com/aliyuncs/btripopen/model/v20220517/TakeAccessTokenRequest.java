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

package com.aliyuncs.btripopen.model.v20220517;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TakeAccessTokenRequest extends RoaAcsRequest<TakeAccessTokenResponse> {
	   

	private String app_key;

	private String app_secret;
	public TakeAccessTokenRequest() {
		super("btripOpen", "2022-05-17", "TakeAccessToken");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/btrip/open/access-token/take");
		setMethod(MethodType.GET);
	}

	public String getApp_key() {
		return this.app_key;
	}

	public void setApp_key(String app_key) {
		this.app_key = app_key;
		if(app_key != null){
			putQueryParameter("app_key", app_key);
		}
	}

	public String getApp_secret() {
		return this.app_secret;
	}

	public void setApp_secret(String app_secret) {
		this.app_secret = app_secret;
		if(app_secret != null){
			putQueryParameter("app_secret", app_secret);
		}
	}

	@Override
	public Class<TakeAccessTokenResponse> getResponseClass() {
		return TakeAccessTokenResponse.class;
	}

}
