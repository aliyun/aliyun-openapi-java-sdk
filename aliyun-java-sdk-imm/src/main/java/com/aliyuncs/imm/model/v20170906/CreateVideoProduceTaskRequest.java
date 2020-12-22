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
public class CreateVideoProduceTaskRequest extends RpcAcsRequest<CreateVideoProduceTaskResponse> {
	   

	private String project;

	private String music;

	private String notifyEndpoint;

	private String targetUri;

	private String templateName;

	private Integer height;

	private String customMessage;

	private String images;

	private String notifyTopicName;

	private Integer width;
	public CreateVideoProduceTaskRequest() {
		super("imm", "2017-09-06", "CreateVideoProduceTask", "imm");
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

	public String getMusic() {
		return this.music;
	}

	public void setMusic(String music) {
		this.music = music;
		if(music != null){
			putQueryParameter("Music", music);
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

	public String getTargetUri() {
		return this.targetUri;
	}

	public void setTargetUri(String targetUri) {
		this.targetUri = targetUri;
		if(targetUri != null){
			putQueryParameter("TargetUri", targetUri);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putQueryParameter("Height", height.toString());
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

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
		if(images != null){
			putQueryParameter("Images", images);
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

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putQueryParameter("Width", width.toString());
		}
	}

	@Override
	public Class<CreateVideoProduceTaskResponse> getResponseClass() {
		return CreateVideoProduceTaskResponse.class;
	}

}
