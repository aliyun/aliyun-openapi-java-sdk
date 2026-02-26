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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateShopRequest extends RoaAcsRequest<UpdateShopResponse> {
	   

	private String country;

	private String regionCode;

	private String latitude;

	private String remark;

	private String regionAddress;

	private String longitude;

	private Integer businessStatus;

	@SerializedName("shopGroupIds")
	private List<String> shopGroupIds;

	private String weekdaysEndTime;

	private String weekendEndTime;

	private String shopName;

	private String shopId;

	private String location;

	private String weekendStartTime;

	private String weekdaysStartTime;
	public UpdateShopRequest() {
		super("cd", "2021-12-7", "UpdateShop");
		setUriPattern("/UpdateShop");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
		}
	}

	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
		if(regionCode != null){
			putBodyParameter("RegionCode", regionCode);
		}
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
		if(latitude != null){
			putBodyParameter("Latitude", latitude);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putBodyParameter("Remark", remark);
		}
	}

	public String getRegionAddress() {
		return this.regionAddress;
	}

	public void setRegionAddress(String regionAddress) {
		this.regionAddress = regionAddress;
		if(regionAddress != null){
			putBodyParameter("RegionAddress", regionAddress);
		}
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
		if(longitude != null){
			putBodyParameter("Longitude", longitude);
		}
	}

	public Integer getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(Integer businessStatus) {
		this.businessStatus = businessStatus;
		if(businessStatus != null){
			putBodyParameter("BusinessStatus", businessStatus.toString());
		}
	}

	public List<String> getShopGroupIds() {
		return this.shopGroupIds;
	}

	public void setShopGroupIds(List<String> shopGroupIds) {
		this.shopGroupIds = shopGroupIds;	
		if (shopGroupIds != null) {
			putBodyParameter("ShopGroupIds" , new Gson().toJson(shopGroupIds));
		}	
	}

	public String getWeekdaysEndTime() {
		return this.weekdaysEndTime;
	}

	public void setWeekdaysEndTime(String weekdaysEndTime) {
		this.weekdaysEndTime = weekdaysEndTime;
		if(weekdaysEndTime != null){
			putBodyParameter("WeekdaysEndTime", weekdaysEndTime);
		}
	}

	public String getWeekendEndTime() {
		return this.weekendEndTime;
	}

	public void setWeekendEndTime(String weekendEndTime) {
		this.weekendEndTime = weekendEndTime;
		if(weekendEndTime != null){
			putBodyParameter("WeekendEndTime", weekendEndTime);
		}
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
		if(shopName != null){
			putBodyParameter("ShopName", shopName);
		}
	}

	public String getShopId() {
		return this.shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
		if(shopId != null){
			putBodyParameter("ShopId", shopId);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	public String getWeekendStartTime() {
		return this.weekendStartTime;
	}

	public void setWeekendStartTime(String weekendStartTime) {
		this.weekendStartTime = weekendStartTime;
		if(weekendStartTime != null){
			putBodyParameter("WeekendStartTime", weekendStartTime);
		}
	}

	public String getWeekdaysStartTime() {
		return this.weekdaysStartTime;
	}

	public void setWeekdaysStartTime(String weekdaysStartTime) {
		this.weekdaysStartTime = weekdaysStartTime;
		if(weekdaysStartTime != null){
			putBodyParameter("WeekdaysStartTime", weekdaysStartTime);
		}
	}

	@Override
	public Class<UpdateShopResponse> getResponseClass() {
		return UpdateShopResponse.class;
	}

}
