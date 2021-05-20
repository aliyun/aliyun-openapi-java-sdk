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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMergeFaceGroupsJobRequest extends RpcAcsRequest<CreateMergeFaceGroupsJobResponse> {
	   

	private String project;

	private String notifyEndpoint;

	private String customMessage;

	private String groupIdFrom;

	private String notifyTopicName;

	private String groupIdTo;

	private String setId;
	public CreateMergeFaceGroupsJobRequest() {
		super("imm", "2017-09-06", "CreateMergeFaceGroupsJob", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getNotifyEndpoint() {
		return this.notifyEndpoint;
	}

	public void setNotifyEndpoint(String notifyEndpoint) {
		this.notifyEndpoint = notifyEndpoint;
		if(notifyEndpoint != null){
			putQueryParameter("NotifyEndpoint", notifyEndpoint);
		}
	}

	public String getCustomMessage() {
		return this.customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
		if(customMessage != null){
			putQueryParameter("CustomMessage", customMessage);
		}
	}

	public String getGroupIdFrom() {
		return this.groupIdFrom;
	}

	public void setGroupIdFrom(String groupIdFrom) {
		this.groupIdFrom = groupIdFrom;
		if(groupIdFrom != null){
			putQueryParameter("GroupIdFrom", groupIdFrom);
		}
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public String getGroupIdTo() {
		return this.groupIdTo;
	}

	public void setGroupIdTo(String groupIdTo) {
		this.groupIdTo = groupIdTo;
		if(groupIdTo != null){
			putQueryParameter("GroupIdTo", groupIdTo);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	@Override
	public Class<CreateMergeFaceGroupsJobResponse> getResponseClass() {
		return CreateMergeFaceGroupsJobResponse.class;
	}

}
