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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySkillGroupBasicInfoRequest extends RpcAcsRequest<ModifySkillGroupBasicInfoResponse> {
	   

	private Boolean allowPrivateOutboundNumber;

	private String description;

	private String routingStrategy;

	private String instanceId;

	private String skillGroupId;

	private String name;
	public ModifySkillGroupBasicInfoRequest() {
		super("CCC", "2017-07-05", "ModifySkillGroupBasicInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAllowPrivateOutboundNumber() {
		return this.allowPrivateOutboundNumber;
	}

	public void setAllowPrivateOutboundNumber(Boolean allowPrivateOutboundNumber) {
		this.allowPrivateOutboundNumber = allowPrivateOutboundNumber;
		if(allowPrivateOutboundNumber != null){
			putQueryParameter("AllowPrivateOutboundNumber", allowPrivateOutboundNumber.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getRoutingStrategy() {
		return this.routingStrategy;
	}

	public void setRoutingStrategy(String routingStrategy) {
		this.routingStrategy = routingStrategy;
		if(routingStrategy != null){
			putQueryParameter("RoutingStrategy", routingStrategy);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<ModifySkillGroupBasicInfoResponse> getResponseClass() {
		return ModifySkillGroupBasicInfoResponse.class;
	}

}
