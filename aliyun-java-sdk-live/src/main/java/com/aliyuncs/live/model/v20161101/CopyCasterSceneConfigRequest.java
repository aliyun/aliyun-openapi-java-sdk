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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CopyCasterSceneConfigRequest extends RpcAcsRequest<CopyCasterSceneConfigResponse> {
	   

	private String fromSceneId;

	private String toSceneId;

	private String casterId;

	private Long ownerId;
	public CopyCasterSceneConfigRequest() {
		super("live", "2016-11-01", "CopyCasterSceneConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFromSceneId() {
		return this.fromSceneId;
	}

	public void setFromSceneId(String fromSceneId) {
		this.fromSceneId = fromSceneId;
		if(fromSceneId != null){
			putQueryParameter("FromSceneId", fromSceneId);
		}
	}

	public String getToSceneId() {
		return this.toSceneId;
	}

	public void setToSceneId(String toSceneId) {
		this.toSceneId = toSceneId;
		if(toSceneId != null){
			putQueryParameter("ToSceneId", toSceneId);
		}
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
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

	@Override
	public Class<CopyCasterSceneConfigResponse> getResponseClass() {
		return CopyCasterSceneConfigResponse.class;
	}

}
