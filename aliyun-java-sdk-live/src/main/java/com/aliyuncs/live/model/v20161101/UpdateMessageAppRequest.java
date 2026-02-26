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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMessageAppRequest extends RpcAcsRequest<UpdateMessageAppResponse> {
	   

	@SerializedName("extension")
	private Map<String,String> extension;

	@SerializedName("appConfig")
	private Map<String,String> appConfig;

	private String appName;

	private String appId;
	public UpdateMessageAppRequest() {
		super("live", "2016-11-01", "UpdateMessageApp", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Map<String,String> getExtension() {
		return this.extension;
	}

	public void setExtension(Map<String,String> extension) {
		this.extension = extension;	
		if (extension != null) {
			putBodyParameter("Extension" , new Gson().toJson(extension));
		}	
	}

	public Map<String,String> getAppConfig() {
		return this.appConfig;
	}

	public void setAppConfig(Map<String,String> appConfig) {
		this.appConfig = appConfig;	
		if (appConfig != null) {
			putBodyParameter("AppConfig" , new Gson().toJson(appConfig));
		}	
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
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

	@Override
	public Class<UpdateMessageAppResponse> getResponseClass() {
		return UpdateMessageAppResponse.class;
	}

}
