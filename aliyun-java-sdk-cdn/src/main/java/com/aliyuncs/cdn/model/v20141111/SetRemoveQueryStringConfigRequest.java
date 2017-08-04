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
package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetRemoveQueryStringConfigRequest extends RpcAcsRequest<SetRemoveQueryStringConfigResponse> {
	
	public SetRemoveQueryStringConfigRequest() {
		super("Cdn", "2014-11-11", "SetRemoveQueryStringConfig", "None");
	}

	private String keepOssArgs;

	private String securityToken;

	private String domainName;

	private String aliRemoveArgs;

	private Long ownerId;

	public String getKeepOssArgs() {
		return this.keepOssArgs;
	}

	public void setKeepOssArgs(String keepOssArgs) {
		this.keepOssArgs = keepOssArgs;
		if(keepOssArgs != null){
			putQueryParameter("KeepOssArgs", keepOssArgs);
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

	public String getAliRemoveArgs() {
		return this.aliRemoveArgs;
	}

	public void setAliRemoveArgs(String aliRemoveArgs) {
		this.aliRemoveArgs = aliRemoveArgs;
		if(aliRemoveArgs != null){
			putQueryParameter("AliRemoveArgs", aliRemoveArgs);
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
	public Class<SetRemoveQueryStringConfigResponse> getResponseClass() {
		return SetRemoveQueryStringConfigResponse.class;
	}

}
