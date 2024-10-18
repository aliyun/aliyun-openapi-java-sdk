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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitDomainSpecialBizCredentialsRequest extends RpcAcsRequest<SubmitDomainSpecialBizCredentialsResponse> {
	   

	private String credentials;

	private String extend;

	private Long bizId;

	private String userClientIp;
	public SubmitDomainSpecialBizCredentialsRequest() {
		super("Domain", "2018-01-29", "SubmitDomainSpecialBizCredentials", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCredentials() {
		return this.credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
		if(credentials != null){
			putBodyParameter("Credentials", credentials);
		}
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
		if(extend != null){
			putBodyParameter("Extend", extend);
		}
	}

	public Long getBizId() {
		return this.bizId;
	}

	public void setBizId(Long bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	@Override
	public Class<SubmitDomainSpecialBizCredentialsResponse> getResponseClass() {
		return SubmitDomainSpecialBizCredentialsResponse.class;
	}

}
