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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quotas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaTemplateServiceStatusRequest extends RpcAcsRequest<GetQuotaTemplateServiceStatusResponse> {
	   

	private String resourceDirectoryId;
	public GetQuotaTemplateServiceStatusRequest() {
		super("quotas", "2020-05-10", "GetQuotaTemplateServiceStatus", "quotas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceDirectoryId() {
		return this.resourceDirectoryId;
	}

	public void setResourceDirectoryId(String resourceDirectoryId) {
		this.resourceDirectoryId = resourceDirectoryId;
		if(resourceDirectoryId != null){
			putBodyParameter("ResourceDirectoryId", resourceDirectoryId);
		}
	}

	@Override
	public Class<GetQuotaTemplateServiceStatusResponse> getResponseClass() {
		return GetQuotaTemplateServiceStatusResponse.class;
	}

}
