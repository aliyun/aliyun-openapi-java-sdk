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
package com.aliyuncs.waf_openapi.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	
	public CreateInstanceRequest() {
		super("waf-openapi", "2016-11-11", "CreateInstance");
	}

	private Long ownerId;

	private String clientToken;

	private Integer duration;

	private String pricingCycle;

	private String packageCode;

	private Integer extDomainPackage;

	private Integer extBandwidth;

	private Boolean isAutoRenew;

	private Integer autoRenewDuration;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		putQueryParameter("Duration", duration);
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		putQueryParameter("PricingCycle", pricingCycle);
	}

	public String getPackageCode() {
		return this.packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
		putQueryParameter("PackageCode", packageCode);
	}

	public Integer getExtDomainPackage() {
		return this.extDomainPackage;
	}

	public void setExtDomainPackage(Integer extDomainPackage) {
		this.extDomainPackage = extDomainPackage;
		putQueryParameter("ExtDomainPackage", extDomainPackage);
	}

	public Integer getExtBandwidth() {
		return this.extBandwidth;
	}

	public void setExtBandwidth(Integer extBandwidth) {
		this.extBandwidth = extBandwidth;
		putQueryParameter("ExtBandwidth", extBandwidth);
	}

	public Boolean getIsAutoRenew() {
		return this.isAutoRenew;
	}

	public void setIsAutoRenew(Boolean isAutoRenew) {
		this.isAutoRenew = isAutoRenew;
		putQueryParameter("IsAutoRenew", isAutoRenew);
	}

	public Integer getAutoRenewDuration() {
		return this.autoRenewDuration;
	}

	public void setAutoRenewDuration(Integer autoRenewDuration) {
		this.autoRenewDuration = autoRenewDuration;
		putQueryParameter("AutoRenewDuration", autoRenewDuration);
	}

	@Override
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
