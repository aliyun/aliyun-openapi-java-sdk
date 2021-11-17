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

package com.aliyuncs.mindlive_biz.model.v20210214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryScriptRequest extends RpcAcsRequest<QueryScriptResponse> {
	   

	private String itemIds;

	private String liveType;

	private String userSource;

	private String userId;

	private String deviceId;

	private String liveId;
	public QueryScriptRequest() {
		super("mindlive-biz", "2021-02-14", "QueryScript");
		setMethod(MethodType.POST);
	}

	public String getItemIds() {
		return this.itemIds;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
		if(itemIds != null){
			putQueryParameter("ItemIds", itemIds);
		}
	}

	public String getLiveType() {
		return this.liveType;
	}

	public void setLiveType(String liveType) {
		this.liveType = liveType;
		if(liveType != null){
			putQueryParameter("LiveType", liveType);
		}
	}

	public String getUserSource() {
		return this.userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
		if(userSource != null){
			putQueryParameter("UserSource", userSource);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public String getLiveId() {
		return this.liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
		if(liveId != null){
			putQueryParameter("LiveId", liveId);
		}
	}

	@Override
	public Class<QueryScriptResponse> getResponseClass() {
		return QueryScriptResponse.class;
	}

}
