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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetLiveDomainMultiStreamOptimalModeRequest extends RpcAcsRequest<SetLiveDomainMultiStreamOptimalModeResponse> {
	   

	private String appName;

	private String streamName;

	private Long ownerId;

	private String domain;

	private String optimalMode;
	public SetLiveDomainMultiStreamOptimalModeRequest() {
		super("live", "2016-11-01", "SetLiveDomainMultiStreamOptimalMode", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("StreamName", streamName);
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

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public String getOptimalMode() {
		return this.optimalMode;
	}

	public void setOptimalMode(String optimalMode) {
		this.optimalMode = optimalMode;
		if(optimalMode != null){
			putQueryParameter("OptimalMode", optimalMode);
		}
	}

	@Override
	public Class<SetLiveDomainMultiStreamOptimalModeResponse> getResponseClass() {
		return SetLiveDomainMultiStreamOptimalModeResponse.class;
	}

}
