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
public class SetDynamicConfigRequest extends RpcAcsRequest<SetDynamicConfigResponse> {
	
	public SetDynamicConfigRequest() {
		super("Cdn", "2014-11-11", "SetDynamicConfig");
	}

	private Long ownerId;

	private String securityToken;

	private String domainName;

	private String dynamicOrigin;

	private String staticType;

	private String staticUri;

	private String staticPath;

	private String dynamicCacheControl;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		putQueryParameter("SecurityToken", securityToken);
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		putQueryParameter("DomainName", domainName);
	}

	public String getDynamicOrigin() {
		return this.dynamicOrigin;
	}

	public void setDynamicOrigin(String dynamicOrigin) {
		this.dynamicOrigin = dynamicOrigin;
		putQueryParameter("DynamicOrigin", dynamicOrigin);
	}

	public String getStaticType() {
		return this.staticType;
	}

	public void setStaticType(String staticType) {
		this.staticType = staticType;
		putQueryParameter("StaticType", staticType);
	}

	public String getStaticUri() {
		return this.staticUri;
	}

	public void setStaticUri(String staticUri) {
		this.staticUri = staticUri;
		putQueryParameter("StaticUri", staticUri);
	}

	public String getStaticPath() {
		return this.staticPath;
	}

	public void setStaticPath(String staticPath) {
		this.staticPath = staticPath;
		putQueryParameter("StaticPath", staticPath);
	}

	public String getDynamicCacheControl() {
		return this.dynamicCacheControl;
	}

	public void setDynamicCacheControl(String dynamicCacheControl) {
		this.dynamicCacheControl = dynamicCacheControl;
		putQueryParameter("DynamicCacheControl", dynamicCacheControl);
	}

	@Override
	public Class<SetDynamicConfigResponse> getResponseClass() {
		return SetDynamicConfigResponse.class;
	}

}
