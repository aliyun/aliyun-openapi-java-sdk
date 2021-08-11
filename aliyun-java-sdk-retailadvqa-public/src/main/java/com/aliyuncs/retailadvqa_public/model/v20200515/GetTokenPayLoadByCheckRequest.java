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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTokenPayLoadByCheckRequest extends RpcAcsRequest<GetTokenPayLoadByCheckResponse> {
	   

	private String accessId;

	private String signNonce;

	private String signDriver;

	private String tenantId;

	private String signToken;

	private String signPk;
	public GetTokenPayLoadByCheckRequest() {
		super("retailadvqa-public", "2020-05-15", "GetTokenPayLoadByCheck");
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getSignNonce() {
		return this.signNonce;
	}

	public void setSignNonce(String signNonce) {
		this.signNonce = signNonce;
		if(signNonce != null){
			putBodyParameter("SignNonce", signNonce);
		}
	}

	public String getSignDriver() {
		return this.signDriver;
	}

	public void setSignDriver(String signDriver) {
		this.signDriver = signDriver;
		if(signDriver != null){
			putBodyParameter("SignDriver", signDriver);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getSignToken() {
		return this.signToken;
	}

	public void setSignToken(String signToken) {
		this.signToken = signToken;
		if(signToken != null){
			putBodyParameter("SignToken", signToken);
		}
	}

	public String getSignPk() {
		return this.signPk;
	}

	public void setSignPk(String signPk) {
		this.signPk = signPk;
		if(signPk != null){
			putBodyParameter("SignPk", signPk);
		}
	}

	@Override
	public Class<GetTokenPayLoadByCheckResponse> getResponseClass() {
		return GetTokenPayLoadByCheckResponse.class;
	}

}
