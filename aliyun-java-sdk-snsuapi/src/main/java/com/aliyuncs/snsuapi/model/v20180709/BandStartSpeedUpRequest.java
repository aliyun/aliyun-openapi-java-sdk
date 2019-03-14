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
public class BandStartSpeedUpRequest extends RpcAcsRequest<BandStartSpeedUpResponse> {
	
	public BandStartSpeedUpRequest() {
		super("Snsuapi", "2018-07-09", "BandStartSpeedUp", "snsuapi");
	}

	private String ipAddress;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private Integer port;

	private Long bandId;

	private Long ownerId;

	private Long targetBandwidth;

	private String bandScene;

	private String direction;

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		if(ipAddress != null){
			putQueryParameter("IpAddress", ipAddress);
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

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public Long getBandId() {
		return this.bandId;
	}

	public void setBandId(Long bandId) {
		this.bandId = bandId;
		if(bandId != null){
			putQueryParameter("BandId", bandId.toString());
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

	public Long getTargetBandwidth() {
		return this.targetBandwidth;
	}

	public void setTargetBandwidth(Long targetBandwidth) {
		this.targetBandwidth = targetBandwidth;
		if(targetBandwidth != null){
			putQueryParameter("TargetBandwidth", targetBandwidth.toString());
		}
	}

	public String getBandScene() {
		return this.bandScene;
	}

	public void setBandScene(String bandScene) {
		this.bandScene = bandScene;
		if(bandScene != null){
			putQueryParameter("BandScene", bandScene);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	@Override
	public Class<BandStartSpeedUpResponse> getResponseClass() {
		return BandStartSpeedUpResponse.class;
	}

}
