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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateFCTriggerRequest extends RpcAcsRequest<UpdateFCTriggerResponse> {
	
	public UpdateFCTriggerRequest() {
		super("Cdn", "2014-11-11", "UpdateFCTrigger", "cdn");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String notes;

	private String triggerARN;

	private String sourceARN;

	private Long ownerId;

	private String roleARN;

	private String functionARN;

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
		if(notes != null){
			putBodyParameter("Notes", notes);
		}
	}

	public String getTriggerARN() {
		return this.triggerARN;
	}

	public void setTriggerARN(String triggerARN) {
		this.triggerARN = triggerARN;
		if(triggerARN != null){
			putQueryParameter("TriggerARN", triggerARN);
		}
	}

	public String getSourceARN() {
		return this.sourceARN;
	}

	public void setSourceARN(String sourceARN) {
		this.sourceARN = sourceARN;
		if(sourceARN != null){
			putBodyParameter("SourceARN", sourceARN);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getRoleARN() {
		return this.roleARN;
	}

	public void setRoleARN(String roleARN) {
		this.roleARN = roleARN;
		if(roleARN != null){
			putBodyParameter("RoleARN", roleARN);
		}
	}

	public String getFunctionARN() {
		return this.functionARN;
	}

	public void setFunctionARN(String functionARN) {
		this.functionARN = functionARN;
		if(functionARN != null){
			putBodyParameter("FunctionARN", functionARN);
		}
	}

	@Override
	public Class<UpdateFCTriggerResponse> getResponseClass() {
		return UpdateFCTriggerResponse.class;
	}

}
