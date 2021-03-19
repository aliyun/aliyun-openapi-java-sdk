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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMqSofamqWarnRequest extends RpcAcsRequest<CreateMqSofamqWarnResponse> {
	   

	private Long delayTime;

	private String alertTime;

	private Long threshold;

	private Long frequency;

	private String groupId;

	private String instanceId;

	private String topic;

	private String contacts;
	public CreateMqSofamqWarnRequest() {
		super("SOFA", "2019-08-15", "CreateMqSofamqWarn", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(Long delayTime) {
		this.delayTime = delayTime;
		if(delayTime != null){
			putBodyParameter("DelayTime", delayTime.toString());
		}
	}

	public String getAlertTime() {
		return this.alertTime;
	}

	public void setAlertTime(String alertTime) {
		this.alertTime = alertTime;
		if(alertTime != null){
			putBodyParameter("AlertTime", alertTime);
		}
	}

	public Long getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Long threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putBodyParameter("Threshold", threshold.toString());
		}
	}

	public Long getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Long frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putBodyParameter("Frequency", frequency.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
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

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putBodyParameter("Topic", topic);
		}
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
		if(contacts != null){
			putBodyParameter("Contacts", contacts);
		}
	}

	@Override
	public Class<CreateMqSofamqWarnResponse> getResponseClass() {
		return CreateMqSofamqWarnResponse.class;
	}

}
