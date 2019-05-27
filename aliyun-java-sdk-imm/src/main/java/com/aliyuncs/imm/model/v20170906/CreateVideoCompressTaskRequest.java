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

/**
 * @author auto create
 * @version 
 */
public class CreateVideoCompressTaskRequest extends RpcAcsRequest<CreateVideoCompressTaskResponse> {
	
	public CreateVideoCompressTaskRequest() {
		super("imm", "2017-09-06", "CreateVideoCompressTask", "imm");
	}

	private String videoUri;

	private String notifyTopicName;

	private String targetList;

	private String notifyEndpoint;

	private String project;

	public String getVideoUri() {
		return this.videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
		if(videoUri != null){
			putQueryParameter("VideoUri", videoUri);
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

	public String getNotifyEndpoint() {
		return this.notifyEndpoint;
	}

	public void setNotifyEndpoint(String notifyEndpoint) {
		this.notifyEndpoint = notifyEndpoint;
		if(notifyEndpoint != null){
			putQueryParameter("NotifyEndpoint", notifyEndpoint);
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

	@Override
	public Class<CreateVideoCompressTaskResponse> getResponseClass() {
		return CreateVideoCompressTaskResponse.class;
	}

}
