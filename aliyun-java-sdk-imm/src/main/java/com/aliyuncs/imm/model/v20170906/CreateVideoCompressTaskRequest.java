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
public class CreateVideoCompressTaskRequest extends RpcAcsRequest<CreateVideoCompressTaskResponse> {
	   

	private String project;

	private String notifyEndpoint;

	private String targetContainer;

	private String customMessage;

	private String notifyTopicName;

	private String targetList;

	private String videoUri;

	private String targetSegment;
	public CreateVideoCompressTaskRequest() {
		super("imm", "2017-09-06", "CreateVideoCompressTask", "imm");
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

	public String getTargetContainer() {
		return this.targetContainer;
	}

	public void setTargetContainer(String targetContainer) {
		this.targetContainer = targetContainer;
		if(targetContainer != null){
			putQueryParameter("TargetContainer", targetContainer);
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

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public String getTargetList() {
		return this.targetList;
	}

	public void setTargetList(String targetList) {
		this.targetList = targetList;
		if(targetList != null){
			putQueryParameter("TargetList", targetList);
		}
	}

	public String getVideoUri() {
		return this.videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
		if(videoUri != null){
			putQueryParameter("VideoUri", videoUri);
		}
	}

	public String getTargetSegment() {
		return this.targetSegment;
	}

	public void setTargetSegment(String targetSegment) {
		this.targetSegment = targetSegment;
		if(targetSegment != null){
			putQueryParameter("TargetSegment", targetSegment);
		}
	}

	@Override
	public Class<CreateVideoCompressTaskResponse> getResponseClass() {
		return CreateVideoCompressTaskResponse.class;
	}

}
