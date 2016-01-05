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
public class DescribeCdnDomainLogsRequest extends RpcAcsRequest<DescribeCdnDomainLogsResponse> {
	
	public DescribeCdnDomainLogsRequest() {
		super("Cdn", "2014-11-11", "DescribeCdnDomainLogs");
	}

	private Long ownerId;

	private String securityToken;

	private String domainName;

	private String logDay;

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

	public String getLogDay() {
		return this.logDay;
	}

	public void setLogDay(String logDay) {
		this.logDay = logDay;
		putQueryParameter("LogDay", logDay);
	}

	@Override
	public Class<DescribeCdnDomainLogsResponse> getResponseClass() {
		return DescribeCdnDomainLogsResponse.class;
	}

}
