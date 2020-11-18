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
public class UpdateFaceUserGroupAndDeviceGroupRelationRequest extends RpcAcsRequest<UpdateFaceUserGroupAndDeviceGroupRelationResponse> {
	   

	private String isolationId;

	private String controlId;

	private String relation;
	public UpdateFaceUserGroupAndDeviceGroupRelationRequest() {
		super("Linkvisual", "2018-01-20", "UpdateFaceUserGroupAndDeviceGroupRelation", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIsolationId() {
		return this.isolationId;
	}

	public void setIsolationId(String isolationId) {
		this.isolationId = isolationId;
		if(isolationId != null){
			putQueryParameter("IsolationId", isolationId);
		}
	}

	public String getControlId() {
		return this.controlId;
	}

	public void setControlId(String controlId) {
		this.controlId = controlId;
		if(controlId != null){
			putQueryParameter("ControlId", controlId);
		}
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
		if(relation != null){
			putQueryParameter("Relation", relation);
		}
	}

	@Override
	public Class<UpdateFaceUserGroupAndDeviceGroupRelationResponse> getResponseClass() {
		return UpdateFaceUserGroupAndDeviceGroupRelationResponse.class;
	}

}
