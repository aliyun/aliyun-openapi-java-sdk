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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SwitchLinkeBahamutAdminswitchlinkqRequest extends RpcAcsRequest<SwitchLinkeBahamutAdminswitchlinkqResponse> {
	   

	private String tenantPath;

	private String opoType;

	private List<String> appNamesRepeatLists;
	public SwitchLinkeBahamutAdminswitchlinkqRequest() {
		super("SOFA", "2019-08-15", "SwitchLinkeBahamutAdminswitchlinkq", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantPath() {
		return this.tenantPath;
	}

	public void setTenantPath(String tenantPath) {
		this.tenantPath = tenantPath;
		if(tenantPath != null){
			putBodyParameter("TenantPath", tenantPath);
		}
	}

	public String getOpoType() {
		return this.opoType;
	}

	public void setOpoType(String opoType) {
		this.opoType = opoType;
		if(opoType != null){
			putBodyParameter("OpoType", opoType);
		}
	}

	public List<String> getAppNamesRepeatLists() {
		return this.appNamesRepeatLists;
	}

	public void setAppNamesRepeatLists(List<String> appNamesRepeatLists) {
		this.appNamesRepeatLists = appNamesRepeatLists;	
		if (appNamesRepeatLists != null) {
			for (int i = 0; i < appNamesRepeatLists.size(); i++) {
				putBodyParameter("AppNamesRepeatList." + (i + 1) , appNamesRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<SwitchLinkeBahamutAdminswitchlinkqResponse> getResponseClass() {
		return SwitchLinkeBahamutAdminswitchlinkqResponse.class;
	}

}
