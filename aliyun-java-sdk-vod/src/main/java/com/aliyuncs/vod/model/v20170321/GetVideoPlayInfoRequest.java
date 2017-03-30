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
package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetVideoPlayInfoRequest extends RpcAcsRequest<GetVideoPlayInfoResponse> {
	
	public GetVideoPlayInfoRequest() {
		super("vod", "2017-03-21", "GetVideoPlayInfo");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String channel;

	private Long clientTS;

	private String clientVersion;

	private String playSign;

	private String signVersion;

	private String videoId;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
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
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		putQueryParameter("Channel", channel);
	}

	public Long getClientTS() {
		return this.clientTS;
	}

	public void setClientTS(Long clientTS) {
		this.clientTS = clientTS;
		putQueryParameter("ClientTS", clientTS);
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		putQueryParameter("ClientVersion", clientVersion);
	}

	public String getPlaySign() {
		return this.playSign;
	}

	public void setPlaySign(String playSign) {
		this.playSign = playSign;
		putQueryParameter("PlaySign", playSign);
	}

	public String getSignVersion() {
		return this.signVersion;
	}

	public void setSignVersion(String signVersion) {
		this.signVersion = signVersion;
		putQueryParameter("SignVersion", signVersion);
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		putQueryParameter("VideoId", videoId);
	}

	@Override
	public Class<GetVideoPlayInfoResponse> getResponseClass() {
		return GetVideoPlayInfoResponse.class;
	}

}
