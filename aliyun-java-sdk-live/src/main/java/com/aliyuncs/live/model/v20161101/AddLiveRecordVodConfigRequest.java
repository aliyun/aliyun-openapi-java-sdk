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
public class AddLiveRecordVodConfigRequest extends RpcAcsRequest<AddLiveRecordVodConfigResponse> {
	
	public AddLiveRecordVodConfigRequest() {
		super("live", "2016-11-01", "AddLiveRecordVodConfig", "live");
	}

	private String appName;

	private String securityToken;

	private String domainName;

	private Integer cycleDuration;

	private Long ownerId;

	private String streamName;

	private String vodTranscodeGroupId;

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

	public Integer getCycleDuration() {
		return this.cycleDuration;
	}

	public void setCycleDuration(Integer cycleDuration) {
		this.cycleDuration = cycleDuration;
		if(cycleDuration != null){
			putQueryParameter("CycleDuration", cycleDuration.toString());
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

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
		if(streamName != null){
			putQueryParameter("StreamName", streamName);
		}
	}

	public String getVodTranscodeGroupId() {
		return this.vodTranscodeGroupId;
	}

	public void setVodTranscodeGroupId(String vodTranscodeGroupId) {
		this.vodTranscodeGroupId = vodTranscodeGroupId;
		if(vodTranscodeGroupId != null){
			putQueryParameter("VodTranscodeGroupId", vodTranscodeGroupId);
		}
	}

	@Override
	public Class<AddLiveRecordVodConfigResponse> getResponseClass() {
		return AddLiveRecordVodConfigResponse.class;
	}

}
