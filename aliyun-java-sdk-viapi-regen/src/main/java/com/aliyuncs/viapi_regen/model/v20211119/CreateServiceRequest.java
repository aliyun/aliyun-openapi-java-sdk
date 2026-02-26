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
public class CreateServiceRequest extends RpcAcsRequest<CreateServiceResponse> {
	   

	private String description;

	private Long trainTaskId;

	private String authorizationType;

	private String name;

	private String authorizedAccount;
	public CreateServiceRequest() {
		super("viapi-regen", "2021-11-19", "CreateService", "selflearning");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Long getTrainTaskId() {
		return this.trainTaskId;
	}

	public void setTrainTaskId(Long trainTaskId) {
		this.trainTaskId = trainTaskId;
		if(trainTaskId != null){
			putBodyParameter("TrainTaskId", trainTaskId.toString());
		}
	}

	public String getAuthorizationType() {
		return this.authorizationType;
	}

	public void setAuthorizationType(String authorizationType) {
		this.authorizationType = authorizationType;
		if(authorizationType != null){
			putBodyParameter("AuthorizationType", authorizationType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getAuthorizedAccount() {
		return this.authorizedAccount;
	}

	public void setAuthorizedAccount(String authorizedAccount) {
		this.authorizedAccount = authorizedAccount;
		if(authorizedAccount != null){
			putBodyParameter("AuthorizedAccount", authorizedAccount);
		}
	}

	@Override
	public Class<CreateServiceResponse> getResponseClass() {
		return CreateServiceResponse.class;
	}

}
