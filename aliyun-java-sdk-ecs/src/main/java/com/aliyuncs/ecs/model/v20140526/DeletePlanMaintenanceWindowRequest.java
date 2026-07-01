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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeletePlanMaintenanceWindowRequest extends RpcAcsRequest<DeletePlanMaintenanceWindowResponse> {
	   

	private String planWindowId;
	public DeletePlanMaintenanceWindowRequest() {
		super("Ecs", "2014-05-26", "DeletePlanMaintenanceWindow", "ecs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPlanWindowId() {
		return this.planWindowId;
	}

	public void setPlanWindowId(String planWindowId) {
		this.planWindowId = planWindowId;
		if(planWindowId != null){
			putQueryParameter("PlanWindowId", planWindowId);
		}
	}

	@Override
	public Class<DeletePlanMaintenanceWindowResponse> getResponseClass() {
		return DeletePlanMaintenanceWindowResponse.class;
	}

}
