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
public class AddLiveAppSnapshotConfigRequest extends RpcAcsRequest<AddLiveAppSnapshotConfigResponse> {
	
	public AddLiveAppSnapshotConfigRequest() {
		super("live", "2016-11-01", "AddLiveAppSnapshotConfig", "live");
	}

	private Integer timeInterval;

	private String ossBucket;

	private String appName;

	private String securityToken;

	private String domainName;

	private String ossEndpoint;

	private String sequenceOssObject;

	private String overwriteOssObject;

	private Long ownerId;

	public Integer getTimeInterval() {
		return this.timeInterval;
	}

	public void setTimeInterval(Integer timeInterval) {
		this.timeInterval = timeInterval;
		if(timeInterval != null){
			putQueryParameter("TimeInterval", timeInterval.toString());
		}
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		if(ossBucket != null){
			putQueryParameter("OssBucket", ossBucket);
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

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
		if(ossEndpoint != null){
			putQueryParameter("OssEndpoint", ossEndpoint);
		}
	}

	public String getSequenceOssObject() {
		return this.sequenceOssObject;
	}

	public void setSequenceOssObject(String sequenceOssObject) {
		this.sequenceOssObject = sequenceOssObject;
		if(sequenceOssObject != null){
			putQueryParameter("SequenceOssObject", sequenceOssObject);
		}
	}

	public String getOverwriteOssObject() {
		return this.overwriteOssObject;
	}

	public void setOverwriteOssObject(String overwriteOssObject) {
		this.overwriteOssObject = overwriteOssObject;
		if(overwriteOssObject != null){
			putQueryParameter("OverwriteOssObject", overwriteOssObject);
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
	public Class<AddLiveAppSnapshotConfigResponse> getResponseClass() {
		return AddLiveAppSnapshotConfigResponse.class;
	}

}
