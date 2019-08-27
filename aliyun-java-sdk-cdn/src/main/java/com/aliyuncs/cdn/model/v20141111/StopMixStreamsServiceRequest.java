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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StopMixStreamsServiceRequest extends RpcAcsRequest<StopMixStreamsServiceResponse> {
	
	public StopMixStreamsServiceRequest() {
		super("Cdn", "2014-11-11", "StopMixStreamsService", "cdn");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String securityToken;

	private String mainDomainName;

	private String mixStreamName;

	private String mixDomainName;

	private Long ownerId;

	private String mainAppName;

	private String mixAppName;

	private String mainStreamName;

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getMainDomainName() {
		return this.mainDomainName;
	}

	public void setMainDomainName(String mainDomainName) {
		this.mainDomainName = mainDomainName;
		if(mainDomainName != null){
			putQueryParameter("MainDomainName", mainDomainName);
		}
	}

	public String getMixStreamName() {
		return this.mixStreamName;
	}

	public void setMixStreamName(String mixStreamName) {
		this.mixStreamName = mixStreamName;
		if(mixStreamName != null){
			putQueryParameter("MixStreamName", mixStreamName);
		}
	}

	public String getMixDomainName() {
		return this.mixDomainName;
	}

	public void setMixDomainName(String mixDomainName) {
		this.mixDomainName = mixDomainName;
		if(mixDomainName != null){
			putQueryParameter("MixDomainName", mixDomainName);
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

	public String getMainAppName() {
		return this.mainAppName;
	}

	public void setMainAppName(String mainAppName) {
		this.mainAppName = mainAppName;
		if(mainAppName != null){
			putQueryParameter("MainAppName", mainAppName);
		}
	}

	public String getMixAppName() {
		return this.mixAppName;
	}

	public void setMixAppName(String mixAppName) {
		this.mixAppName = mixAppName;
		if(mixAppName != null){
			putQueryParameter("MixAppName", mixAppName);
		}
	}

	public String getMainStreamName() {
		return this.mainStreamName;
	}

	public void setMainStreamName(String mainStreamName) {
		this.mainStreamName = mainStreamName;
		if(mainStreamName != null){
			putQueryParameter("MainStreamName", mainStreamName);
		}
	}

	@Override
	public Class<StopMixStreamsServiceResponse> getResponseClass() {
		return StopMixStreamsServiceResponse.class;
	}

}
