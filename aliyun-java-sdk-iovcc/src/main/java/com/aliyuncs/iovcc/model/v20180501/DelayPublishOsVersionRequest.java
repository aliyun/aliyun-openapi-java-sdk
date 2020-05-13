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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DelayPublishOsVersionRequest extends RpcAcsRequest<DelayPublishOsVersionResponse> {
	   

	private String sendMessage;

	private String description;

	private String versionId;

	private String prepublishCount;

	private String projectId;

	private String email;

	private Long prepubTime;

	private Long downTime;

	private Long publishTime;
	public DelayPublishOsVersionRequest() {
		super("iovcc", "2018-05-01", "DelayPublishOsVersion", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSendMessage() {
		return this.sendMessage;
	}

	public void setSendMessage(String sendMessage) {
		this.sendMessage = sendMessage;
		if(sendMessage != null){
			putQueryParameter("SendMessage", sendMessage);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getPrepublishCount() {
		return this.prepublishCount;
	}

	public void setPrepublishCount(String prepublishCount) {
		this.prepublishCount = prepublishCount;
		if(prepublishCount != null){
			putQueryParameter("PrepublishCount", prepublishCount);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public Long getPrepubTime() {
		return this.prepubTime;
	}

	public void setPrepubTime(Long prepubTime) {
		this.prepubTime = prepubTime;
		if(prepubTime != null){
			putQueryParameter("PrepubTime", prepubTime.toString());
		}
	}

	public Long getDownTime() {
		return this.downTime;
	}

	public void setDownTime(Long downTime) {
		this.downTime = downTime;
		if(downTime != null){
			putQueryParameter("DownTime", downTime.toString());
		}
	}

	public Long getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Long publishTime) {
		this.publishTime = publishTime;
		if(publishTime != null){
			putQueryParameter("PublishTime", publishTime.toString());
		}
	}

	@Override
	public Class<DelayPublishOsVersionResponse> getResponseClass() {
		return DelayPublishOsVersionResponse.class;
	}

}
