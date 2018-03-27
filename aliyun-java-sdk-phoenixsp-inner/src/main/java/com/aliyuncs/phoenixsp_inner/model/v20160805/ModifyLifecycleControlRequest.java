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

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyLifecycleControlRequest extends RpcAcsRequest<ModifyLifecycleControlResponse> {
	
	public ModifyLifecycleControlRequest() {
		super("Phoenixsp-inner", "2016-08-05", "ModifyLifecycleControl");
	}

	private String instanceIDs;

	private Long aliUID;

	private String bid;

	private String resourceType;

	private String operator;

	private Boolean controlLifecycle;

	public String getInstanceIDs() {
		return this.instanceIDs;
	}

	public void setInstanceIDs(String instanceIDs) {
		this.instanceIDs = instanceIDs;
		if(instanceIDs != null){
			putQueryParameter("InstanceIDs", instanceIDs);
		}
	}

	public Long getAliUID() {
		return this.aliUID;
	}

	public void setAliUID(Long aliUID) {
		this.aliUID = aliUID;
		if(aliUID != null){
			putQueryParameter("AliUID", aliUID.toString());
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public Boolean getControlLifecycle() {
		return this.controlLifecycle;
	}

	public void setControlLifecycle(Boolean controlLifecycle) {
		this.controlLifecycle = controlLifecycle;
		if(controlLifecycle != null){
			putQueryParameter("ControlLifecycle", controlLifecycle.toString());
		}
	}

	@Override
	public Class<ModifyLifecycleControlResponse> getResponseClass() {
		return ModifyLifecycleControlResponse.class;
	}

}
