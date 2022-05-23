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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateNotificationPolicyRequest extends RpcAcsRequest<CreateOrUpdateNotificationPolicyResponse> {
	   

	private Long escalationPolicyId;

	private Boolean sendRecoverMessage;

	private Long integrationId;

	private String matchingRules;

	private String groupRule;

	private Boolean repeat;

	private String name;

	private Long id;

	private String notifyRule;

	private String notifyTemplate;

	private Long repeatInterval;
	public CreateOrUpdateNotificationPolicyRequest() {
		super("ARMS", "2019-08-08", "CreateOrUpdateNotificationPolicy", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getEscalationPolicyId() {
		return this.escalationPolicyId;
	}

	public void setEscalationPolicyId(Long escalationPolicyId) {
		this.escalationPolicyId = escalationPolicyId;
		if(escalationPolicyId != null){
			putBodyParameter("EscalationPolicyId", escalationPolicyId.toString());
		}
	}

	public Boolean getSendRecoverMessage() {
		return this.sendRecoverMessage;
	}

	public void setSendRecoverMessage(Boolean sendRecoverMessage) {
		this.sendRecoverMessage = sendRecoverMessage;
		if(sendRecoverMessage != null){
			putBodyParameter("SendRecoverMessage", sendRecoverMessage.toString());
		}
	}

	public Long getIntegrationId() {
		return this.integrationId;
	}

	public void setIntegrationId(Long integrationId) {
		this.integrationId = integrationId;
		if(integrationId != null){
			putBodyParameter("IntegrationId", integrationId.toString());
		}
	}

	public String getMatchingRules() {
		return this.matchingRules;
	}

	public void setMatchingRules(String matchingRules) {
		this.matchingRules = matchingRules;
		if(matchingRules != null){
			putBodyParameter("MatchingRules", matchingRules);
		}
	}

	public String getGroupRule() {
		return this.groupRule;
	}

	public void setGroupRule(String groupRule) {
		this.groupRule = groupRule;
		if(groupRule != null){
			putBodyParameter("GroupRule", groupRule);
		}
	}

	public Boolean getRepeat() {
		return this.repeat;
	}

	public void setRepeat(Boolean repeat) {
		this.repeat = repeat;
		if(repeat != null){
			putBodyParameter("Repeat", repeat.toString());
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getNotifyRule() {
		return this.notifyRule;
	}

	public void setNotifyRule(String notifyRule) {
		this.notifyRule = notifyRule;
		if(notifyRule != null){
			putBodyParameter("NotifyRule", notifyRule);
		}
	}

	public String getNotifyTemplate() {
		return this.notifyTemplate;
	}

	public void setNotifyTemplate(String notifyTemplate) {
		this.notifyTemplate = notifyTemplate;
		if(notifyTemplate != null){
			putBodyParameter("NotifyTemplate", notifyTemplate);
		}
	}

	public Long getRepeatInterval() {
		return this.repeatInterval;
	}

	public void setRepeatInterval(Long repeatInterval) {
		this.repeatInterval = repeatInterval;
		if(repeatInterval != null){
			putBodyParameter("RepeatInterval", repeatInterval.toString());
		}
	}

	@Override
	public Class<CreateOrUpdateNotificationPolicyResponse> getResponseClass() {
		return CreateOrUpdateNotificationPolicyResponse.class;
	}

}
