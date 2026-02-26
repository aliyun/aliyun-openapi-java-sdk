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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainTranscodeParamsRequest extends RpcAcsRequest<DescribeLiveDomainTranscodeParamsResponse> {
	   

	private String pushdomain;

	private String securityToken;

	private String app;

	private String template_name;
	public DescribeLiveDomainTranscodeParamsRequest() {
		super("live", "2016-11-01", "DescribeLiveDomainTranscodeParams", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPushdomain() {
		return this.pushdomain;
	}

	public void setPushdomain(String pushdomain) {
		this.pushdomain = pushdomain;
		if(pushdomain != null){
			putQueryParameter("pushdomain", pushdomain);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("app", app);
		}
	}

	public String getTemplate_name() {
		return this.template_name;
	}

	public void setTemplate_name(String template_name) {
		this.template_name = template_name;
		if(template_name != null){
			putQueryParameter("template_name", template_name);
		}
	}

	@Override
	public Class<DescribeLiveDomainTranscodeParamsResponse> getResponseClass() {
		return DescribeLiveDomainTranscodeParamsResponse.class;
	}

}
