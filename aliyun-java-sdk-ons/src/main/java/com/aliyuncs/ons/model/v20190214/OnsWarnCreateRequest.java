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

package com.aliyuncs.ons.model.v20190214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ons.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OnsWarnCreateRequest extends RpcAcsRequest<OnsWarnCreateResponse> {
	   

	private String level;

	private String groupId;

	private String delayTime;

	private String threshold;

	private String alertTime;

	private String instanceId;

	private String topic;

	private String contacts;
	public OnsWarnCreateRequest() {
		super("Ons", "2019-02-14", "OnsWarnCreate", "ons");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(String delayTime) {
		this.delayTime = delayTime;
		if(delayTime != null){
			putQueryParameter("DelayTime", delayTime);
		}
	}

	public String getThreshold() {
		return this.threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold);
		}
	}

	public String getAlertTime() {
		return this.alertTime;
	}

	public void setAlertTime(String alertTime) {
		this.alertTime = alertTime;
		if(alertTime != null){
			putQueryParameter("AlertTime", alertTime);
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

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
		}
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
		if(contacts != null){
			putQueryParameter("Contacts", contacts);
		}
	}

	@Override
	public Class<OnsWarnCreateResponse> getResponseClass() {
		return OnsWarnCreateResponse.class;
	}

}
