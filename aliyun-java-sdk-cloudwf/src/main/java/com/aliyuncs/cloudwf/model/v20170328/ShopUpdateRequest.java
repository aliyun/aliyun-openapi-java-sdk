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
public class ShopUpdateRequest extends RpcAcsRequest<ShopUpdateResponse> {
	
	public ShopUpdateRequest() {
		super("cloudwf", "2017-03-28", "ShopUpdate");
	}

	private String shopCoordinate;

	private String shopProvince;

	private Integer shopTopType;

	private String shopAddress;

	private Integer shopType;

	private String warnEmail;

	private Long sid;

	private String shopTel;

	private String warnpHone;

	private Integer warn;

	private Integer shopArea;

	private String shopRemarks;

	private String shopCity;

	private Integer shopSubtype;

	private String shopBrand;

	private String shopName;

	private Integer shopCloseWarn;

	private String shopManager;

	private String shopBusinessHours;

	public String getShopCoordinate() {
		return this.shopCoordinate;
	}

	public void setShopCoordinate(String shopCoordinate) {
		this.shopCoordinate = shopCoordinate;
		if(shopCoordinate != null){
			putQueryParameter("ShopCoordinate", shopCoordinate);
		}
	}

	public String getShopProvince() {
		return this.shopProvince;
	}

	public void setShopProvince(String shopProvince) {
		this.shopProvince = shopProvince;
		if(shopProvince != null){
			putQueryParameter("ShopProvince", shopProvince);
		}
	}

	public Integer getShopTopType() {
		return this.shopTopType;
	}

	public void setShopTopType(Integer shopTopType) {
		this.shopTopType = shopTopType;
		if(shopTopType != null){
			putQueryParameter("ShopTopType", shopTopType.toString());
		}
	}

	public String getShopAddress() {
		return this.shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
		if(shopAddress != null){
			putQueryParameter("ShopAddress", shopAddress);
		}
	}

	public Integer getShopType() {
		return this.shopType;
	}

	public void setShopType(Integer shopType) {
		this.shopType = shopType;
		if(shopType != null){
			putQueryParameter("ShopType", shopType.toString());
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

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid.toString());
		}
	}

	public String getShopTel() {
		return this.shopTel;
	}

	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
		if(shopTel != null){
			putQueryParameter("ShopTel", shopTel);
		}
	}

	public String getWarnpHone() {
		return this.warnpHone;
	}

	public void setWarnpHone(String warnpHone) {
		this.warnpHone = warnpHone;
		if(warnpHone != null){
			putQueryParameter("WarnpHone", warnpHone);
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

	public Integer getShopArea() {
		return this.shopArea;
	}

	public void setShopArea(Integer shopArea) {
		this.shopArea = shopArea;
		if(shopArea != null){
			putQueryParameter("ShopArea", shopArea.toString());
		}
	}

	public String getShopRemarks() {
		return this.shopRemarks;
	}

	public void setShopRemarks(String shopRemarks) {
		this.shopRemarks = shopRemarks;
		if(shopRemarks != null){
			putQueryParameter("ShopRemarks", shopRemarks);
		}
	}

	public String getShopCity() {
		return this.shopCity;
	}

	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
		if(shopCity != null){
			putQueryParameter("ShopCity", shopCity);
		}
	}

	public Integer getShopSubtype() {
		return this.shopSubtype;
	}

	public void setShopSubtype(Integer shopSubtype) {
		this.shopSubtype = shopSubtype;
		if(shopSubtype != null){
			putQueryParameter("ShopSubtype", shopSubtype.toString());
		}
	}

	public String getShopBrand() {
		return this.shopBrand;
	}

	public void setShopBrand(String shopBrand) {
		this.shopBrand = shopBrand;
		if(shopBrand != null){
			putQueryParameter("ShopBrand", shopBrand);
		}
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
		if(shopName != null){
			putQueryParameter("ShopName", shopName);
		}
	}

	public Integer getShopCloseWarn() {
		return this.shopCloseWarn;
	}

	public void setShopCloseWarn(Integer shopCloseWarn) {
		this.shopCloseWarn = shopCloseWarn;
		if(shopCloseWarn != null){
			putQueryParameter("ShopCloseWarn", shopCloseWarn.toString());
		}
	}

	public String getShopManager() {
		return this.shopManager;
	}

	public void setShopManager(String shopManager) {
		this.shopManager = shopManager;
		if(shopManager != null){
			putQueryParameter("ShopManager", shopManager);
		}
	}

	public String getShopBusinessHours() {
		return this.shopBusinessHours;
	}

	public void setShopBusinessHours(String shopBusinessHours) {
		this.shopBusinessHours = shopBusinessHours;
		if(shopBusinessHours != null){
			putQueryParameter("ShopBusinessHours", shopBusinessHours);
		}
	}

	@Override
	public Class<ShopUpdateResponse> getResponseClass() {
		return ShopUpdateResponse.class;
	}

}
