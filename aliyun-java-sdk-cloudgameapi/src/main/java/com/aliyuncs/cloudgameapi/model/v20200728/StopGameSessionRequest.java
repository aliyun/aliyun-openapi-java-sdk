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
public class StopGameSessionRequest extends RpcAcsRequest<StopGameSessionResponse> {
	   

	private String gameId;

	private String gameSession;

	private String userId;

	private String accessKey;

	private String bizParam;
	public StopGameSessionRequest() {
		super("CloudGameAPI", "2020-07-28", "StopGameSession", "CloudGameAPI");
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

	public String getGameSession() {
		return this.gameSession;
	}

	public void setGameSession(String gameSession) {
		this.gameSession = gameSession;
		if(gameSession != null){
			putBodyParameter("GameSession", gameSession);
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

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putBodyParameter("AccessKey", accessKey);
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

	@Override
	public Class<StopGameSessionResponse> getResponseClass() {
		return StopGameSessionResponse.class;
	}

}
