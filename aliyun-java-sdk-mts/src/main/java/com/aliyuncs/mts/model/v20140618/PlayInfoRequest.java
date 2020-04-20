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
public class PlayInfoRequest extends RpcAcsRequest<PlayInfoResponse> {
	   

	private String resourceOwnerId;

	private String formats;

	private String rand;

	private Long authTimeout;

	private String playDomain;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String hlsUriToken;

	private String terminal;

	private String ownerId;

	private String mediaId;

	private String authInfo;
	public PlayInfoRequest() {
		super("Mts", "2014-06-18", "PlayInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(String resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId);
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

	public String getRand() {
		return this.rand;
	}

	public void setRand(String rand) {
		this.rand = rand;
		if(rand != null){
			putQueryParameter("Rand", rand);
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

	public String getPlayDomain() {
		return this.playDomain;
	}

	public void setPlayDomain(String playDomain) {
		this.playDomain = playDomain;
		if(playDomain != null){
			putQueryParameter("PlayDomain", playDomain);
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

	public String getHlsUriToken() {
		return this.hlsUriToken;
	}

	public void setHlsUriToken(String hlsUriToken) {
		this.hlsUriToken = hlsUriToken;
		if(hlsUriToken != null){
			putQueryParameter("HlsUriToken", hlsUriToken);
		}
	}

	public String getTerminal() {
		return this.terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
		if(terminal != null){
			putQueryParameter("Terminal", terminal);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
		if(mediaId != null){
			putQueryParameter("MediaId", mediaId);
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
	public Class<PlayInfoResponse> getResponseClass() {
		return PlayInfoResponse.class;
	}

}
