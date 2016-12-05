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
package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ValidateAppCertRequest extends RpcAcsRequest<ValidateAppCertResponse> {
	
	public ValidateAppCertRequest() {
		super("Push", "2016-08-01", "ValidateAppCert");
	}

	private Long appKey;

	private String certPass;

	private Boolean isDevCert;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getCertPass() {
		return this.certPass;
	}

	public void setCertPass(String certPass) {
		this.certPass = certPass;
		putQueryParameter("CertPass", certPass);
	}

	public Boolean getIsDevCert() {
		return this.isDevCert;
	}

	public void setIsDevCert(Boolean isDevCert) {
		this.isDevCert = isDevCert;
		putQueryParameter("IsDevCert", isDevCert);
	}

	@Override
	public Class<ValidateAppCertResponse> getResponseClass() {
		return ValidateAppCertResponse.class;
	}

}
