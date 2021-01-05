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
public class CreateVideoAbstractTaskRequest extends RpcAcsRequest<CreateVideoAbstractTaskResponse> {
	   

	private String targetVideoUri;

	private String project;

	private String notifyEndpoint;

	private String notifyTopicName;

	private String videoUri;

	private Integer abstractLength;

	private String targetClipsUri;
	public CreateVideoAbstractTaskRequest() {
		super("imm", "2017-09-06", "CreateVideoAbstractTask", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetVideoUri() {
		return this.targetVideoUri;
	}

	public void setTargetVideoUri(String targetVideoUri) {
		this.targetVideoUri = targetVideoUri;
		if(targetVideoUri != null){
			putQueryParameter("TargetVideoUri", targetVideoUri);
		}
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

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
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

	public Integer getAbstractLength() {
		return this.abstractLength;
	}

	public void setAbstractLength(Integer abstractLength) {
		this.abstractLength = abstractLength;
		if(abstractLength != null){
			putQueryParameter("AbstractLength", abstractLength.toString());
		}
	}

	public String getTargetClipsUri() {
		return this.targetClipsUri;
	}

	public void setTargetClipsUri(String targetClipsUri) {
		this.targetClipsUri = targetClipsUri;
		if(targetClipsUri != null){
			putQueryParameter("TargetClipsUri", targetClipsUri);
		}
	}

	@Override
	public Class<CreateVideoAbstractTaskResponse> getResponseClass() {
		return CreateVideoAbstractTaskResponse.class;
	}

}
