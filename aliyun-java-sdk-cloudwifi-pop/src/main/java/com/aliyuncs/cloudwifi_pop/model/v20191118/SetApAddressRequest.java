/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudwifi_pop.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetApAddressRequest extends RpcAcsRequest<SetApAddressResponse> {
	   

	private String apProvinceName;

	private String apUnitName;

	private String apCampusName;

	private String lng;

	private String apAreaName;

	private String language;

	private String apGroup;

	private String mac;

	private String apCityName;

	private String appName;

	private String apFloor;

	private String apBuildingName;

	private String apName;

	private String appCode;

	private Long apUnitId;

	private String apNationName;

	private String lat;

	private String direction;
	public SetApAddressRequest() {
		super("cloudwifi-pop", "2019-11-18", "SetApAddress");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApProvinceName() {
		return this.apProvinceName;
	}

	public void setApProvinceName(String apProvinceName) {
		this.apProvinceName = apProvinceName;
		if(apProvinceName != null){
			putQueryParameter("ApProvinceName", apProvinceName);
		}
	}

	public String getApUnitName() {
		return this.apUnitName;
	}

	public void setApUnitName(String apUnitName) {
		this.apUnitName = apUnitName;
		if(apUnitName != null){
			putQueryParameter("ApUnitName", apUnitName);
		}
	}

	public String getApCampusName() {
		return this.apCampusName;
	}

	public void setApCampusName(String apCampusName) {
		this.apCampusName = apCampusName;
		if(apCampusName != null){
			putQueryParameter("ApCampusName", apCampusName);
		}
	}

	public String getLng() {
		return this.lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
		if(lng != null){
			putQueryParameter("Lng", lng);
		}
	}

	public String getApAreaName() {
		return this.apAreaName;
	}

	public void setApAreaName(String apAreaName) {
		this.apAreaName = apAreaName;
		if(apAreaName != null){
			putQueryParameter("ApAreaName", apAreaName);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getApGroup() {
		return this.apGroup;
	}

	public void setApGroup(String apGroup) {
		this.apGroup = apGroup;
		if(apGroup != null){
			putQueryParameter("ApGroup", apGroup);
		}
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
		}
	}

	public String getApCityName() {
		return this.apCityName;
	}

	public void setApCityName(String apCityName) {
		this.apCityName = apCityName;
		if(apCityName != null){
			putQueryParameter("ApCityName", apCityName);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getApFloor() {
		return this.apFloor;
	}

	public void setApFloor(String apFloor) {
		this.apFloor = apFloor;
		if(apFloor != null){
			putQueryParameter("ApFloor", apFloor);
		}
	}

	public String getApBuildingName() {
		return this.apBuildingName;
	}

	public void setApBuildingName(String apBuildingName) {
		this.apBuildingName = apBuildingName;
		if(apBuildingName != null){
			putQueryParameter("ApBuildingName", apBuildingName);
		}
	}

	public String getApName() {
		return this.apName;
	}

	public void setApName(String apName) {
		this.apName = apName;
		if(apName != null){
			putQueryParameter("ApName", apName);
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public Long getApUnitId() {
		return this.apUnitId;
	}

	public void setApUnitId(Long apUnitId) {
		this.apUnitId = apUnitId;
		if(apUnitId != null){
			putQueryParameter("ApUnitId", apUnitId.toString());
		}
	}

	public String getApNationName() {
		return this.apNationName;
	}

	public void setApNationName(String apNationName) {
		this.apNationName = apNationName;
		if(apNationName != null){
			putQueryParameter("ApNationName", apNationName);
		}
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
		if(lat != null){
			putQueryParameter("Lat", lat);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	@Override
	public Class<SetApAddressResponse> getResponseClass() {
		return SetApAddressResponse.class;
	}

}
