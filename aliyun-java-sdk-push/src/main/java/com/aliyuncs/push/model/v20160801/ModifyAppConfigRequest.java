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
public class ModifyAppConfigRequest extends RpcAcsRequest<ModifyAppConfigResponse> {
	
	public ModifyAppConfigRequest() {
		super("Push", "2016-08-01", "ModifyAppConfig");
	}

	private Long appKey;

	private String packageName;

	private String devCertKey;

	private String devCertPass;

	private String productCertKey;

	private String productCertPass;

	private String bundleId;

	private Boolean boxFlag;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
		putQueryParameter("PackageName", packageName);
	}

	public String getDevCertKey() {
		return this.devCertKey;
	}

	public void setDevCertKey(String devCertKey) {
		this.devCertKey = devCertKey;
		putQueryParameter("DevCertKey", devCertKey);
	}

	public String getDevCertPass() {
		return this.devCertPass;
	}

	public void setDevCertPass(String devCertPass) {
		this.devCertPass = devCertPass;
		putQueryParameter("DevCertPass", devCertPass);
	}

	public String getProductCertKey() {
		return this.productCertKey;
	}

	public void setProductCertKey(String productCertKey) {
		this.productCertKey = productCertKey;
		putQueryParameter("ProductCertKey", productCertKey);
	}

	public String getProductCertPass() {
		return this.productCertPass;
	}

	public void setProductCertPass(String productCertPass) {
		this.productCertPass = productCertPass;
		putQueryParameter("ProductCertPass", productCertPass);
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		putQueryParameter("BundleId", bundleId);
	}

	public Boolean getBoxFlag() {
		return this.boxFlag;
	}

	public void setBoxFlag(Boolean boxFlag) {
		this.boxFlag = boxFlag;
		putQueryParameter("BoxFlag", boxFlag);
	}

	@Override
	public Class<ModifyAppConfigResponse> getResponseClass() {
		return ModifyAppConfigResponse.class;
	}

}
