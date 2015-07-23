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
public class ValidateVerifyCodeRequest extends RpcAcsRequest<ValidateVerifyCodeResponse> {
	
	public ValidateVerifyCodeRequest() {
		super("Risk", "2015-03-23", "ValidateVerifyCode");
	}

	private String requestId;

	private String mteeCode;

	private String codeType;

	private String idType;

	private String userId;

	private String channelType;

	private String verifyCode;

	private String umidToken;

	private String collina;

	private String ip;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		putQueryParameter("RequestId", requestId);
	}

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

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
		putQueryParameter("ChannelType", channelType);
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
		putQueryParameter("VerifyCode", verifyCode);
	}

	public String getUmidToken() {
		return this.umidToken;
	}

	public void setUmidToken(String umidToken) {
		this.umidToken = umidToken;
		putQueryParameter("UmidToken", umidToken);
	}

	public String getCollina() {
		return this.collina;
	}

	public void setCollina(String collina) {
		this.collina = collina;
		putQueryParameter("Collina", collina);
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		putQueryParameter("Ip", ip);
	}

	@Override
	public Class<ValidateVerifyCodeResponse> getResponseClass() {
		return ValidateVerifyCodeResponse.class;
	}

}
