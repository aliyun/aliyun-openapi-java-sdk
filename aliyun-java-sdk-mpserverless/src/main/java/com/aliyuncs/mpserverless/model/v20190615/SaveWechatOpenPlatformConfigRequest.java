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

package com.aliyuncs.mpserverless.model.v20190615;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveWechatOpenPlatformConfigRequest extends RpcAcsRequest<SaveWechatOpenPlatformConfigResponse> {
	   

	private String spaceId;

	private String appId;

	private String appSecret;
	public SaveWechatOpenPlatformConfigRequest() {
		super("MPServerless", "2019-06-15", "SaveWechatOpenPlatformConfig", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getSpaceId() {
		return this.spaceId;
	}

	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
		if(spaceId != null){
			putBodyParameter("SpaceId", spaceId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getAppSecret() {
		return this.appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
		if(appSecret != null){
			putBodyParameter("AppSecret", appSecret);
		}
	}

	@Override
	public Class<SaveWechatOpenPlatformConfigResponse> getResponseClass() {
		return SaveWechatOpenPlatformConfigResponse.class;
	}

}
