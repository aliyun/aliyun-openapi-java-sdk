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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitTranscodeJobsRequest extends RpcAcsRequest<SubmitTranscodeJobsResponse> {
	   

	private Long resourceOwnerId;

	private String userData;

	private String resourceOwnerAccount;

	private String videoId;

	private String overrideParams;

	private Long ownerId;

	private String priority;

	private String pipelineId;

	private String templateGroupId;

	private String fileUrl;

	private String encryptConfig;
	public SubmitTranscodeJobsRequest() {
		super("vod", "2017-03-21", "SubmitTranscodeJobs", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putQueryParameter("VideoId", videoId);
		}
	}

	public String getOverrideParams() {
		return this.overrideParams;
	}

	public void setOverrideParams(String overrideParams) {
		this.overrideParams = overrideParams;
		if(overrideParams != null){
			putQueryParameter("OverrideParams", overrideParams);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority);
		}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	public String getTemplateGroupId() {
		return this.templateGroupId;
	}

	public void setTemplateGroupId(String templateGroupId) {
		this.templateGroupId = templateGroupId;
		if(templateGroupId != null){
			putQueryParameter("TemplateGroupId", templateGroupId);
		}
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		if(fileUrl != null){
			putQueryParameter("FileUrl", fileUrl);
		}
	}

	public String getEncryptConfig() {
		return this.encryptConfig;
	}

	public void setEncryptConfig(String encryptConfig) {
		this.encryptConfig = encryptConfig;
		if(encryptConfig != null){
			putQueryParameter("EncryptConfig", encryptConfig);
		}
	}

	@Override
	public Class<SubmitTranscodeJobsResponse> getResponseClass() {
		return SubmitTranscodeJobsResponse.class;
	}

}
