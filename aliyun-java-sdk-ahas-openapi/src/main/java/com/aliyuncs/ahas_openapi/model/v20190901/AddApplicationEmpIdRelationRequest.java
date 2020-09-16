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

package com.aliyuncs.ahas_openapi.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ahas_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddApplicationEmpIdRelationRequest extends RpcAcsRequest<AddApplicationEmpIdRelationResponse> {
	   

	private String applicationId;

	private String empIds;
	public AddApplicationEmpIdRelationRequest() {
		super("ahas-openapi", "2019-09-01", "AddApplicationEmpIdRelation", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public String getEmpIds() {
		return this.empIds;
	}

	public void setEmpIds(String empIds) {
		this.empIds = empIds;
		if(empIds != null){
			putQueryParameter("EmpIds", empIds);
		}
	}

	@Override
	public Class<AddApplicationEmpIdRelationResponse> getResponseClass() {
		return AddApplicationEmpIdRelationResponse.class;
	}

}
