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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetEventSubscriptionRequest extends RpcAcsRequest<SetEventSubscriptionResponse> {
	   

	private String contactGroupName;

	private String contactName;

	private String channelType;

	private String lang;

	private String level;

	private String active;

	private String minInterval;

	private String instanceId;

	private String eventContext;
	public SetEventSubscriptionRequest() {
		super("DAS", "2020-01-16", "SetEventSubscription");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactGroupName() {
		return this.contactGroupName;
	}

	public void setContactGroupName(String contactGroupName) {
		this.contactGroupName = contactGroupName;
		if(contactGroupName != null){
			putQueryParameter("ContactGroupName", contactGroupName);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putQueryParameter("ChannelType", channelType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
		if(active != null){
			putQueryParameter("Active", active);
		}
	}

	public String getMinInterval() {
		return this.minInterval;
	}

	public void setMinInterval(String minInterval) {
		this.minInterval = minInterval;
		if(minInterval != null){
			putQueryParameter("MinInterval", minInterval);
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

	public String getEventContext() {
		return this.eventContext;
	}

	public void setEventContext(String eventContext) {
		this.eventContext = eventContext;
		if(eventContext != null){
			putQueryParameter("EventContext", eventContext);
		}
	}

	@Override
	public Class<SetEventSubscriptionResponse> getResponseClass() {
		return SetEventSubscriptionResponse.class;
	}

}
