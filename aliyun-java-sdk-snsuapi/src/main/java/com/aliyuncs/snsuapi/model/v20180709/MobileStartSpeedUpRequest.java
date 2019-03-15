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

package com.aliyuncs.snsuapi.model.v20180709;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class MobileStartSpeedUpRequest extends RpcAcsRequest<MobileStartSpeedUpResponse> {
	
	public MobileStartSpeedUpRequest() {
		super("Snsuapi", "2018-07-09", "MobileStartSpeedUp", "snsuapi");
	}

	private String duration;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ip;

	private String destinationIpAddress;

	private String publicIp;

	private String publicPort;

	private Long ownerId;

	private String token;

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public String getDestinationIpAddress() {
		return this.destinationIpAddress;
	}

	public void setDestinationIpAddress(String destinationIpAddress) {
		this.destinationIpAddress = destinationIpAddress;
		if(destinationIpAddress != null){
			putQueryParameter("DestinationIpAddress", destinationIpAddress);
		}
	}

	public String getPublicIp() {
		return this.publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
		if(publicIp != null){
			putQueryParameter("PublicIp", publicIp);
		}
	}

	public String getPublicPort() {
		return this.publicPort;
	}

	public void setPublicPort(String publicPort) {
		this.publicPort = publicPort;
		if(publicPort != null){
			putQueryParameter("PublicPort", publicPort);
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	@Override
	public Class<MobileStartSpeedUpResponse> getResponseClass() {
		return MobileStartSpeedUpResponse.class;
	}

}
