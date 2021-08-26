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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfigADConnectorUserRequest extends RpcAcsRequest<ConfigADConnectorUserResponse> {
	   

	private String officeSiteId;

	private String domainPassword;

	private String domainUserName;

	private String oUName;
	public ConfigADConnectorUserRequest() {
		super("ecd", "2020-09-30", "ConfigADConnectorUser");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public String getDomainPassword() {
		return this.domainPassword;
	}

	public void setDomainPassword(String domainPassword) {
		this.domainPassword = domainPassword;
		if(domainPassword != null){
			putQueryParameter("DomainPassword", domainPassword);
		}
	}

	public String getDomainUserName() {
		return this.domainUserName;
	}

	public void setDomainUserName(String domainUserName) {
		this.domainUserName = domainUserName;
		if(domainUserName != null){
			putQueryParameter("DomainUserName", domainUserName);
		}
	}

	public String getOUName() {
		return this.oUName;
	}

	public void setOUName(String oUName) {
		this.oUName = oUName;
		if(oUName != null){
			putQueryParameter("OUName", oUName);
		}
	}

	@Override
	public Class<ConfigADConnectorUserResponse> getResponseClass() {
		return ConfigADConnectorUserResponse.class;
	}

}
