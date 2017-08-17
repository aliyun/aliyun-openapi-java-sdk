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
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class BusinessCreateRequest extends RpcAcsRequest<BusinessCreateResponse> {
	
	public BusinessCreateRequest() {
		super("cloudwf", "2017-03-28", "BusinessCreate");
	}

	private String businessCity;

	private String combo;

	private String warnEmail;

	private String businessManager;

	private Integer businessType;

	private Integer warn;

	private String businessName;

	private Integer businessTopType;

	private String businessAddress;

	private String businessTel;

	private String businessProvince;

	private Integer businessSubtype;

	public String getBusinessCity() {
		return this.businessCity;
	}

	public void setBusinessCity(String businessCity) {
		this.businessCity = businessCity;
		if(businessCity != null){
			putQueryParameter("BusinessCity", businessCity);
		}
	}

	public String getCombo() {
		return this.combo;
	}

	public void setCombo(String combo) {
		this.combo = combo;
		if(combo != null){
			putQueryParameter("Combo", combo);
		}
	}

	public String getWarnEmail() {
		return this.warnEmail;
	}

	public void setWarnEmail(String warnEmail) {
		this.warnEmail = warnEmail;
		if(warnEmail != null){
			putQueryParameter("WarnEmail", warnEmail);
		}
	}

	public String getBusinessManager() {
		return this.businessManager;
	}

	public void setBusinessManager(String businessManager) {
		this.businessManager = businessManager;
		if(businessManager != null){
			putQueryParameter("BusinessManager", businessManager);
		}
	}

	public Integer getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
		if(businessType != null){
			putQueryParameter("BusinessType", businessType.toString());
		}
	}

	public Integer getWarn() {
		return this.warn;
	}

	public void setWarn(Integer warn) {
		this.warn = warn;
		if(warn != null){
			putQueryParameter("Warn", warn.toString());
		}
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
		if(businessName != null){
			putQueryParameter("BusinessName", businessName);
		}
	}

	public Integer getBusinessTopType() {
		return this.businessTopType;
	}

	public void setBusinessTopType(Integer businessTopType) {
		this.businessTopType = businessTopType;
		if(businessTopType != null){
			putQueryParameter("BusinessTopType", businessTopType.toString());
		}
	}

	public String getBusinessAddress() {
		return this.businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
		if(businessAddress != null){
			putQueryParameter("BusinessAddress", businessAddress);
		}
	}

	public String getBusinessTel() {
		return this.businessTel;
	}

	public void setBusinessTel(String businessTel) {
		this.businessTel = businessTel;
		if(businessTel != null){
			putQueryParameter("BusinessTel", businessTel);
		}
	}

	public String getBusinessProvince() {
		return this.businessProvince;
	}

	public void setBusinessProvince(String businessProvince) {
		this.businessProvince = businessProvince;
		if(businessProvince != null){
			putQueryParameter("BusinessProvince", businessProvince);
		}
	}

	public Integer getBusinessSubtype() {
		return this.businessSubtype;
	}

	public void setBusinessSubtype(Integer businessSubtype) {
		this.businessSubtype = businessSubtype;
		if(businessSubtype != null){
			putQueryParameter("BusinessSubtype", businessSubtype.toString());
		}
	}

	@Override
	public Class<BusinessCreateResponse> getResponseClass() {
		return BusinessCreateResponse.class;
	}

}
