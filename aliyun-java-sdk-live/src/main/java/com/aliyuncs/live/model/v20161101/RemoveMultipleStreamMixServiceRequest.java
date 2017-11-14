/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RemoveMultipleStreamMixServiceRequest extends RpcAcsRequest<RemoveMultipleStreamMixServiceResponse> {
	
	public RemoveMultipleStreamMixServiceRequest() {
		super("live", "2016-11-01", "RemoveMultipleStreamMixService");
	}

	private String appName;

	private String securityToken;

	private String domainName;

	private String mixStreamName;

	private String mixDomainName;

	private Long ownerId;

	private String mixAppName;

	private String streamName;

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getMixAppName() {
		return this.mixAppName;
	}

	public void setMixAppName(String mixAppName) {
		this.mixAppName = mixAppName;
		if(mixAppName != null){
			putQueryParameter("MixAppName", mixAppName);
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

	@Override
	public Class<RemoveMultipleStreamMixServiceResponse> getResponseClass() {
		return RemoveMultipleStreamMixServiceResponse.class;
	}

}
