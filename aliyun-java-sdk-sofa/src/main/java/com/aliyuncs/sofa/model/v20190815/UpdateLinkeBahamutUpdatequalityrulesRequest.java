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
public class UpdateLinkeBahamutUpdatequalityrulesRequest extends RpcAcsRequest<UpdateLinkeBahamutUpdatequalityrulesResponse> {
	   

	private String appName;

	private String tenantId;

	private String metaJsonStr;
	public UpdateLinkeBahamutUpdatequalityrulesRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeBahamutUpdatequalityrules", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getMetaJsonStr() {
		return this.metaJsonStr;
	}

	public void setMetaJsonStr(String metaJsonStr) {
		this.metaJsonStr = metaJsonStr;
		if(metaJsonStr != null){
			putBodyParameter("MetaJsonStr", metaJsonStr);
		}
	}

	@Override
	public Class<UpdateLinkeBahamutUpdatequalityrulesResponse> getResponseClass() {
		return UpdateLinkeBahamutUpdatequalityrulesResponse.class;
	}

}
