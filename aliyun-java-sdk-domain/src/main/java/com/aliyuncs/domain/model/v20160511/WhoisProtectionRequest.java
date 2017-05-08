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
package com.aliyuncs.domain.model.v20160511;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class WhoisProtectionRequest extends RpcAcsRequest<WhoisProtectionResponse> {
	
	public WhoisProtectionRequest() {
		super("Domain", "2016-05-11", "WhoisProtection");
	}

	private String userClientIp;

	private String lang;

	private Integer dataSource;

	private String dataContent;

	private Boolean whoisProtect;

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		putQueryParameter("UserClientIp", userClientIp);
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		putQueryParameter("Lang", lang);
	}

	public Integer getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(Integer dataSource) {
		this.dataSource = dataSource;
		putQueryParameter("DataSource", dataSource);
	}

	public String getDataContent() {
		return this.dataContent;
	}

	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
		putQueryParameter("DataContent", dataContent);
	}

	public Boolean getWhoisProtect() {
		return this.whoisProtect;
	}

	public void setWhoisProtect(Boolean whoisProtect) {
		this.whoisProtect = whoisProtect;
		putQueryParameter("WhoisProtect", whoisProtect);
	}

	@Override
	public Class<WhoisProtectionResponse> getResponseClass() {
		return WhoisProtectionResponse.class;
	}

}
