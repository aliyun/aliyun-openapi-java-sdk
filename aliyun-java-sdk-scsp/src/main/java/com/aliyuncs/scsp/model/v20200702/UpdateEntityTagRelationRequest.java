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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateEntityTagRelationRequest extends RpcAcsRequest<UpdateEntityTagRelationResponse> {
	   

	private String instanceId;

	private String entityTagParam;
	public UpdateEntityTagRelationRequest() {
		super("scsp", "2020-07-02", "UpdateEntityTagRelation", "scsp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getEntityTagParam() {
		return this.entityTagParam;
	}

	public void setEntityTagParam(String entityTagParam) {
		this.entityTagParam = entityTagParam;
		if(entityTagParam != null){
			putBodyParameter("EntityTagParam", entityTagParam);
		}
	}

	@Override
	public Class<UpdateEntityTagRelationResponse> getResponseClass() {
		return UpdateEntityTagRelationResponse.class;
	}

}
