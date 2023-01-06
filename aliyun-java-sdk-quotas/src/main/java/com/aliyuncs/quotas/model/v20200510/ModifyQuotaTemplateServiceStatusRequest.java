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
public class ModifyQuotaTemplateServiceStatusRequest extends RpcAcsRequest<ModifyQuotaTemplateServiceStatusResponse> {
	   

	private Integer serviceStatus;
	public ModifyQuotaTemplateServiceStatusRequest() {
		super("quotas", "2020-05-10", "ModifyQuotaTemplateServiceStatus", "quotas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(Integer serviceStatus) {
		this.serviceStatus = serviceStatus;
		if(serviceStatus != null){
			putBodyParameter("ServiceStatus", serviceStatus.toString());
		}
	}

	@Override
	public Class<ModifyQuotaTemplateServiceStatusResponse> getResponseClass() {
		return ModifyQuotaTemplateServiceStatusResponse.class;
	}

}
