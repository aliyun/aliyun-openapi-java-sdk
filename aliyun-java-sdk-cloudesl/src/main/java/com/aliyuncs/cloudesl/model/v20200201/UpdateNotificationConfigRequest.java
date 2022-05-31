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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateNotificationConfigRequest extends RpcAcsRequest<UpdateNotificationConfigResponse> {
	   

	private String endpoint;

	private Boolean enable;

	private String tag;

	private String groupId;

	private String topic;
	public UpdateNotificationConfigRequest() {
		super("cloudesl", "2020-02-01", "UpdateNotificationConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		if(endpoint != null){
			putBodyParameter("Endpoint", endpoint);
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putBodyParameter("Enable", enable.toString());
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putBodyParameter("Tag", tag);
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

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putBodyParameter("Topic", topic);
		}
	}

	@Override
	public Class<UpdateNotificationConfigResponse> getResponseClass() {
		return UpdateNotificationConfigResponse.class;
	}

}
