/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateTemplateRequest extends RpcAcsRequest<UpdateTemplateResponse> {
	
	public UpdateTemplateRequest() {
		super("Mts", "2014-06-18", "UpdateTemplate");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String templateId;

	private String name;

	private String container;

	private String video;

	private String audio;

	private String muxConfig;

	private String transConfig;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", String.valueOf(ownerId));
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", String.valueOf(resourceOwnerId));
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		putQueryParameter("TemplateId", templateId);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public String getContainer() {
		return this.container;
	}

	public void setContainer(String container) {
		this.container = container;
		putQueryParameter("Container", container);
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
		putQueryParameter("Video", video);
	}

	public String getAudio() {
		return this.audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
		putQueryParameter("Audio", audio);
	}

	public String getMuxConfig() {
		return this.muxConfig;
	}

	public void setMuxConfig(String muxConfig) {
		this.muxConfig = muxConfig;
		putQueryParameter("MuxConfig", muxConfig);
	}

	public String getTransConfig() {
		return this.transConfig;
	}

	public void setTransConfig(String transConfig) {
		this.transConfig = transConfig;
		putQueryParameter("TransConfig", transConfig);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<UpdateTemplateResponse> getResponseClass() {
		return UpdateTemplateResponse.class;
	}

}
