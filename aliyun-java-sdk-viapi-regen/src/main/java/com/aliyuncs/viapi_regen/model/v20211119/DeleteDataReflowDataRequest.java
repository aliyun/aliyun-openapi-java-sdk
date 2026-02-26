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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.viapi_regen.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteDataReflowDataRequest extends RpcAcsRequest<DeleteDataReflowDataResponse> {
	   

	private Long id;

	private Long serviceId;
	public DeleteDataReflowDataRequest() {
		super("viapi-regen", "2021-11-19", "DeleteDataReflowData", "selflearning");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putBodyParameter("ServiceId", serviceId.toString());
		}
	}

	@Override
	public Class<DeleteDataReflowDataResponse> getResponseClass() {
		return DeleteDataReflowDataResponse.class;
	}

}
