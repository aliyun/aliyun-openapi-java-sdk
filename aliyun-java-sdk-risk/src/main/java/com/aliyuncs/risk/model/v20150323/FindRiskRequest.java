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
package com.aliyuncs.risk.model.v20150323;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class FindRiskRequest extends RpcAcsRequest<FindRiskResponse> {
	
	public FindRiskRequest() {
		super("Risk", "2015-03-23", "FindRisk");
	}

	private String mteeCode;

	private String codeType;

	private String idType;

	private String userId;

	private String collina;

	private String umidToken;

	private String ip;

	private String email;

	private String phone;

	public String getMteeCode() {
		return this.mteeCode;
	}

	public void setMteeCode(String mteeCode) {
		this.mteeCode = mteeCode;
		putQueryParameter("MteeCode", mteeCode);
	}

	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
		putQueryParameter("CodeType", codeType);
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
		putQueryParameter("IdType", idType);
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		putQueryParameter("UserId", userId);
	}

	public String getCollina() {
		return this.collina;
	}

	public void setCollina(String collina) {
		this.collina = collina;
		putQueryParameter("Collina", collina);
	}

	public String getUmidToken() {
		return this.umidToken;
	}

	public void setUmidToken(String umidToken) {
		this.umidToken = umidToken;
		putQueryParameter("UmidToken", umidToken);
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		putQueryParameter("Ip", ip);
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		putQueryParameter("Email", email);
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		putQueryParameter("Phone", phone);
	}

	@Override
	public Class<FindRiskResponse> getResponseClass() {
		return FindRiskResponse.class;
	}

}
