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
package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CallbackClusterTokenRequest extends RoaAcsRequest<CallbackClusterTokenResponse> {
	
	public CallbackClusterTokenRequest() {
		super("CS", "2015-12-15", "CallbackClusterToken");
		setUriPattern("/token/[Token]/req_once/[ReqOnce]/callback");
		setMethod(MethodType.POST);
	}

	private String reqOnce;

	private String token;

	public String getReqOnce() {
		return this.reqOnce;
	}

	public void setReqOnce(String reqOnce) {
		this.reqOnce = reqOnce;
		if(reqOnce != null){
			putPathParameter("ReqOnce", reqOnce);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putPathParameter("Token", token);
		}
	}

	@Override
	public Class<CallbackClusterTokenResponse> getResponseClass() {
		return CallbackClusterTokenResponse.class;
	}

}
