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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutOpengetrelatereleaseappsRequest extends RpcAcsRequest<GetLinkeBahamutOpengetrelatereleaseappsResponse> {
	   

	private String state;

	private String loginName;

	private String releaseId;

	private String tenantName;
	public GetLinkeBahamutOpengetrelatereleaseappsRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutOpengetrelatereleaseapps", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putBodyParameter("State", state);
		}
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
		if(loginName != null){
			putBodyParameter("LoginName", loginName);
		}
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
		}
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	@Override
	public Class<GetLinkeBahamutOpengetrelatereleaseappsResponse> getResponseClass() {
		return GetLinkeBahamutOpengetrelatereleaseappsResponse.class;
	}

}
