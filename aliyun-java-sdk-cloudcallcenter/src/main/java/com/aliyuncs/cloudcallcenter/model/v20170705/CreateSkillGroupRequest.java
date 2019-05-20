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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateSkillGroupRequest extends RpcAcsRequest<CreateSkillGroupResponse> {
	
	public CreateSkillGroupRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateSkillGroup", "CloudCallCenter", "innerAPI");
	}

	private List<Integer> skillLevels;

	private String instanceId;

	private Boolean allowPrivateOutboundNumber;

	private List<String> outboundPhoneNumberIds;

	private String name;

	private String description;

	private String routingStrategy;

	private List<String> userIds;

	public List<Integer> getSkillLevels() {
		return this.skillLevels;
	}

	public void setSkillLevels(List<Integer> skillLevels) {
		this.skillLevels = skillLevels;	
		if (skillLevels != null) {
			for (int i = 0; i < skillLevels.size(); i++) {
				putQueryParameter("SkillLevel." + (i + 1) , skillLevels.get(i));
			}
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

	public Boolean getAllowPrivateOutboundNumber() {
		return this.allowPrivateOutboundNumber;
	}

	public void setAllowPrivateOutboundNumber(Boolean allowPrivateOutboundNumber) {
		this.allowPrivateOutboundNumber = allowPrivateOutboundNumber;
		if(allowPrivateOutboundNumber != null){
			putQueryParameter("AllowPrivateOutboundNumber", allowPrivateOutboundNumber.toString());
		}
	}

	public List<String> getOutboundPhoneNumberIds() {
		return this.outboundPhoneNumberIds;
	}

	public void setOutboundPhoneNumberIds(List<String> outboundPhoneNumberIds) {
		this.outboundPhoneNumberIds = outboundPhoneNumberIds;	
		if (outboundPhoneNumberIds != null) {
			for (int i = 0; i < outboundPhoneNumberIds.size(); i++) {
				putQueryParameter("OutboundPhoneNumberId." + (i + 1) , outboundPhoneNumberIds.get(i));
			}
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

	public List<String> getUserIds() {
		return this.userIds;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;	
		if (userIds != null) {
			for (int i = 0; i < userIds.size(); i++) {
				putQueryParameter("UserId." + (i + 1) , userIds.get(i));
			}
		}	
	}

	@Override
	public Class<CreateSkillGroupResponse> getResponseClass() {
		return CreateSkillGroupResponse.class;
	}

}
