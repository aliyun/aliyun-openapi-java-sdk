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

package com.aliyuncs.cloudgameapi.model.v20200728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudgameapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DispatchGameSlotRequest extends RpcAcsRequest<DispatchGameSlotResponse> {
	   

	private String gameId;

	private Boolean cancel;

	private String gameSession;

	private String systemInfo;

	private String userId;

	private Boolean reconnect;

	private String accessKey;

	private String clientIp;

	private String regionName;

	private String gameCommand;

	private String tags;

	private String bizParam;

	private String gameStartParam;
	public DispatchGameSlotRequest() {
		super("CloudGameAPI", "2020-07-28", "DispatchGameSlot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGameId() {
		return this.gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
		if(gameId != null){
			putBodyParameter("GameId", gameId);
		}
	}

	public Boolean getCancel() {
		return this.cancel;
	}

	public void setCancel(Boolean cancel) {
		this.cancel = cancel;
		if(cancel != null){
			putBodyParameter("Cancel", cancel.toString());
		}
	}

	public String getGameSession() {
		return this.gameSession;
	}

	public void setGameSession(String gameSession) {
		this.gameSession = gameSession;
		if(gameSession != null){
			putBodyParameter("GameSession", gameSession);
		}
	}

	public String getSystemInfo() {
		return this.systemInfo;
	}

	public void setSystemInfo(String systemInfo) {
		this.systemInfo = systemInfo;
		if(systemInfo != null){
			putBodyParameter("SystemInfo", systemInfo);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public Boolean getReconnect() {
		return this.reconnect;
	}

	public void setReconnect(Boolean reconnect) {
		this.reconnect = reconnect;
		if(reconnect != null){
			putBodyParameter("Reconnect", reconnect.toString());
		}
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putBodyParameter("AccessKey", accessKey);
		}
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putBodyParameter("ClientIp", clientIp);
		}
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
		if(regionName != null){
			putBodyParameter("RegionName", regionName);
		}
	}

	public String getGameCommand() {
		return this.gameCommand;
	}

	public void setGameCommand(String gameCommand) {
		this.gameCommand = gameCommand;
		if(gameCommand != null){
			putBodyParameter("GameCommand", gameCommand);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putBodyParameter("Tags", tags);
		}
	}

	public String getBizParam() {
		return this.bizParam;
	}

	public void setBizParam(String bizParam) {
		this.bizParam = bizParam;
		if(bizParam != null){
			putBodyParameter("BizParam", bizParam);
		}
	}

	public String getGameStartParam() {
		return this.gameStartParam;
	}

	public void setGameStartParam(String gameStartParam) {
		this.gameStartParam = gameStartParam;
		if(gameStartParam != null){
			putBodyParameter("GameStartParam", gameStartParam);
		}
	}

	@Override
	public Class<DispatchGameSlotResponse> getResponseClass() {
		return DispatchGameSlotResponse.class;
	}

}
