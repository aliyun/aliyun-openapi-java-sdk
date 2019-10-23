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
public class SubmitDynamicImageJobRequest extends RpcAcsRequest<SubmitDynamicImageJobResponse> {
	   

	private Long resourceOwnerId;

	private String dynamicImageTemplateId;

	private String resourceOwnerAccount;

	private String videoId;

	private String overrideParams;

	private Long ownerId;
	public SubmitDynamicImageJobRequest() {
		super("vod", "2017-03-21", "SubmitDynamicImageJob", "vod");
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

	public String getDynamicImageTemplateId() {
		return this.dynamicImageTemplateId;
	}

	public void setDynamicImageTemplateId(String dynamicImageTemplateId) {
		this.dynamicImageTemplateId = dynamicImageTemplateId;
		if(dynamicImageTemplateId != null){
			putQueryParameter("DynamicImageTemplateId", dynamicImageTemplateId);
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

	@Override
	public Class<SubmitDynamicImageJobResponse> getResponseClass() {
		return SubmitDynamicImageJobResponse.class;
	}

}
