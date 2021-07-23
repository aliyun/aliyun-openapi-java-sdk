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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteModelServiceRequest extends RpcAcsRequest<DeleteModelServiceResponse> {
	   

	private String modelServiceId;
	public DeleteModelServiceRequest() {
		super("Vcs", "2020-05-15", "DeleteModelService");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getModelServiceId() {
		return this.modelServiceId;
	}

	public void setModelServiceId(String modelServiceId) {
		this.modelServiceId = modelServiceId;
		if(modelServiceId != null){
			putBodyParameter("ModelServiceId", modelServiceId);
		}
	}

	@Override
	public Class<DeleteModelServiceResponse> getResponseClass() {
		return DeleteModelServiceResponse.class;
	}

}
