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
public class GetLinkeBahamutIterationtemplateiterationtemplateRequest extends RpcAcsRequest<GetLinkeBahamutIterationtemplateiterationtemplateResponse> {
	   

	private String type;

	private String tenantId;

	private String fabricBizType;
	public GetLinkeBahamutIterationtemplateiterationtemplateRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutIterationtemplateiterationtemplate", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
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

	public String getFabricBizType() {
		return this.fabricBizType;
	}

	public void setFabricBizType(String fabricBizType) {
		this.fabricBizType = fabricBizType;
		if(fabricBizType != null){
			putBodyParameter("FabricBizType", fabricBizType);
		}
	}

	@Override
	public Class<GetLinkeBahamutIterationtemplateiterationtemplateResponse> getResponseClass() {
		return GetLinkeBahamutIterationtemplateiterationtemplateResponse.class;
	}

}
