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

package com.aliyuncs.mseap.model.v20210118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPlatformUserInfoForPartnerRequest extends RpcAcsRequest<GetPlatformUserInfoForPartnerResponse> {
	   

	private String userId;

	private String appId;

	private String platformType;
	public GetPlatformUserInfoForPartnerRequest() {
		super("mseap", "2021-01-18", "GetPlatformUserInfoForPartner");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getPlatformType() {
		return this.platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
		if(platformType != null){
			putQueryParameter("PlatformType", platformType);
		}
	}

	@Override
	public Class<GetPlatformUserInfoForPartnerResponse> getResponseClass() {
		return GetPlatformUserInfoForPartnerResponse.class;
	}

}
