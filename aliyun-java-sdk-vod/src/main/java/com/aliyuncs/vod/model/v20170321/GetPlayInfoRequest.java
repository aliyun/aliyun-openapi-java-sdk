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

/**
 * @author auto create
 * @version 
 */
public class GetPlayInfoRequest extends RpcAcsRequest<GetPlayInfoResponse> {
	
	public GetPlayInfoRequest() {
		super("vod", "2017-03-21", "GetPlayInfo", "vod");
	}

	private Long resourceOwnerId;

	private String streamType;

	private String formats;

	private String resourceOwnerAccount;

	private String channel;

	private String videoId;

	private String playerVersion;

	private Long ownerId;

	private String rand;

	private String reAuthInfo;

	private String outputType;

	private String definition;

	private Long authTimeout;

	private String authInfo;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getStreamType() {
		return this.streamType;
	}

	public void setStreamType(String streamType) {
		this.streamType = streamType;
		if(streamType != null){
			putQueryParameter("StreamType", streamType);
		}
	}

	public String getFormats() {
		return this.formats;
	}

	public void setFormats(String formats) {
		this.formats = formats;
		if(formats != null){
			putQueryParameter("Formats", formats);
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

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
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

	public String getPlayerVersion() {
		return this.playerVersion;
	}

	public void setPlayerVersion(String playerVersion) {
		this.playerVersion = playerVersion;
		if(playerVersion != null){
			putQueryParameter("PlayerVersion", playerVersion);
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

	public String getRand() {
		return this.rand;
	}

	public void setRand(String rand) {
		this.rand = rand;
		if(rand != null){
			putQueryParameter("Rand", rand);
		}
	}

	public String getReAuthInfo() {
		return this.reAuthInfo;
	}

	public void setReAuthInfo(String reAuthInfo) {
		this.reAuthInfo = reAuthInfo;
		if(reAuthInfo != null){
			putQueryParameter("ReAuthInfo", reAuthInfo);
		}
	}

	public String getOutputType() {
		return this.outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
		if(outputType != null){
			putQueryParameter("OutputType", outputType);
		}
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
		if(definition != null){
			putQueryParameter("Definition", definition);
		}
	}

	public Long getAuthTimeout() {
		return this.authTimeout;
	}

	public void setAuthTimeout(Long authTimeout) {
		this.authTimeout = authTimeout;
		if(authTimeout != null){
			putQueryParameter("AuthTimeout", authTimeout.toString());
		}
	}

	public String getAuthInfo() {
		return this.authInfo;
	}

	public void setAuthInfo(String authInfo) {
		this.authInfo = authInfo;
		if(authInfo != null){
			putQueryParameter("AuthInfo", authInfo);
		}
	}

	@Override
	public Class<GetPlayInfoResponse> getResponseClass() {
		return GetPlayInfoResponse.class;
	}

}
