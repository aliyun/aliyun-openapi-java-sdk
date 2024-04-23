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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateServiceInstanceAttributeRequest extends RpcAcsRequest<UpdateServiceInstanceAttributeResponse> {
	   

	private String serviceInstanceId;

	private String endTime;
	public UpdateServiceInstanceAttributeRequest() {
		super("ComputeNestSupplier", "2021-05-21", "UpdateServiceInstanceAttribute");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServiceInstanceId() {
		return this.serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
		if(serviceInstanceId != null){
			putQueryParameter("ServiceInstanceId", serviceInstanceId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	@Override
	public Class<UpdateServiceInstanceAttributeResponse> getResponseClass() {
		return UpdateServiceInstanceAttributeResponse.class;
	}

}
