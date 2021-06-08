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
public class GetGameStockRequest extends RpcAcsRequest<GetGameStockResponse> {
	   

	private String gameId;

	private String accessKey;

	private Long userLevel;
	public GetGameStockRequest() {
		super("CloudGameAPI", "2020-07-28", "GetGameStock");
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
			putQueryParameter("GameId", gameId);
		}
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putQueryParameter("AccessKey", accessKey);
		}
	}

	public Long getUserLevel() {
		return this.userLevel;
	}

	public void setUserLevel(Long userLevel) {
		this.userLevel = userLevel;
		if(userLevel != null){
			putQueryParameter("UserLevel", userLevel.toString());
		}
	}

	@Override
	public Class<GetGameStockResponse> getResponseClass() {
		return GetGameStockResponse.class;
	}

}
