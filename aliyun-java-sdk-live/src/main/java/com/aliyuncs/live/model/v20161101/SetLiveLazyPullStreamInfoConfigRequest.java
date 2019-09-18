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
public class SetLiveLazyPullStreamInfoConfigRequest extends RpcAcsRequest<SetLiveLazyPullStreamInfoConfigResponse> {
	
	public SetLiveLazyPullStreamInfoConfigRequest() {
		super("live", "2016-11-01", "SetLiveLazyPullStreamInfoConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String pullArgs;

	private String appName;

	private String liveapiRequestFrom;

	private String pullAuthKey;

	private String pullAuthType;

	private String domainName;

	private String pullDomainName;

	private Long ownerId;

	private String pullAppName;

	private String pullProtocol;

	public String getPullArgs() {
		return this.pullArgs;
	}

	public void setPullArgs(String pullArgs) {
		this.pullArgs = pullArgs;
		if(pullArgs != null){
			putQueryParameter("PullArgs", pullArgs);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getLiveapiRequestFrom() {
		return this.liveapiRequestFrom;
	}

	public void setLiveapiRequestFrom(String liveapiRequestFrom) {
		this.liveapiRequestFrom = liveapiRequestFrom;
		if(liveapiRequestFrom != null){
			putQueryParameter("LiveapiRequestFrom", liveapiRequestFrom);
		}
	}

	public String getPullAuthKey() {
		return this.pullAuthKey;
	}

	public void setPullAuthKey(String pullAuthKey) {
		this.pullAuthKey = pullAuthKey;
		if(pullAuthKey != null){
			putQueryParameter("PullAuthKey", pullAuthKey);
		}
	}

	public String getPullAuthType() {
		return this.pullAuthType;
	}

	public void setPullAuthType(String pullAuthType) {
		this.pullAuthType = pullAuthType;
		if(pullAuthType != null){
			putQueryParameter("PullAuthType", pullAuthType);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getPullDomainName() {
		return this.pullDomainName;
	}

	public void setPullDomainName(String pullDomainName) {
		this.pullDomainName = pullDomainName;
		if(pullDomainName != null){
			putQueryParameter("PullDomainName", pullDomainName);
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

	public String getPullAppName() {
		return this.pullAppName;
	}

	public void setPullAppName(String pullAppName) {
		this.pullAppName = pullAppName;
		if(pullAppName != null){
			putQueryParameter("PullAppName", pullAppName);
		}
	}

	public String getPullProtocol() {
		return this.pullProtocol;
	}

	public void setPullProtocol(String pullProtocol) {
		this.pullProtocol = pullProtocol;
		if(pullProtocol != null){
			putQueryParameter("PullProtocol", pullProtocol);
		}
	}

	@Override
	public Class<SetLiveLazyPullStreamInfoConfigResponse> getResponseClass() {
		return SetLiveLazyPullStreamInfoConfigResponse.class;
	}

}
