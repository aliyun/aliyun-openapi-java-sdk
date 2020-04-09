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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDevicePurifyJobByPlanIdRequest extends RpcAcsRequest<CreateDevicePurifyJobByPlanIdResponse> {
	   

	private Long utc;

	private String planId;
	public CreateDevicePurifyJobByPlanIdRequest() {
		super("Linkvisual", "2018-01-20", "CreateDevicePurifyJobByPlanId", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUtc() {
		return this.utc;
	}

	public void setUtc(Long utc) {
		this.utc = utc;
		if(utc != null){
			putQueryParameter("Utc", utc.toString());
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	@Override
	public Class<CreateDevicePurifyJobByPlanIdResponse> getResponseClass() {
		return CreateDevicePurifyJobByPlanIdResponse.class;
	}

}
