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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddTemplateRequest extends RpcAcsRequest<AddTemplateResponse> {
	   

	private String container;

	private Long resourceOwnerId;

	private String video;

	private String transConfig;

	private String audio;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String muxConfig;

	private Long ownerId;

	private String name;
	public AddTemplateRequest() {
		super("Mts", "2014-06-18", "AddTemplate", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContainer() {
		return this.container;
	}

	public void setContainer(String container) {
		this.container = container;
		if(container != null){
			putQueryParameter("Container", container);
		}
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

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
		if(video != null){
			putQueryParameter("Video", video);
		}
	}

	public String getTransConfig() {
		return this.transConfig;
	}

	public void setTransConfig(String transConfig) {
		this.transConfig = transConfig;
		if(transConfig != null){
			putQueryParameter("TransConfig", transConfig);
		}
	}

	public String getAudio() {
		return this.audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
		if(audio != null){
			putQueryParameter("Audio", audio);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getMuxConfig() {
		return this.muxConfig;
	}

	public void setMuxConfig(String muxConfig) {
		this.muxConfig = muxConfig;
		if(muxConfig != null){
			putQueryParameter("MuxConfig", muxConfig);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<AddTemplateResponse> getResponseClass() {
		return AddTemplateResponse.class;
	}

}
