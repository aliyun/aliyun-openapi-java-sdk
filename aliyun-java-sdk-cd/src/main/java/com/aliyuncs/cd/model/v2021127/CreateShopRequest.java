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
public class CreateShopRequest extends RoaAcsRequest<CreateShopResponse> {
	   

	private String country;

	@SerializedName("shopList")
	private List<ShopList> shopList;
	public CreateShopRequest() {
		super("cd", "2021-12-7", "CreateShop");
		setUriPattern("/CreateShop");
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

	public List<ShopList> getShopList() {
		return this.shopList;
	}

	public void setShopList(List<ShopList> shopList) {
		this.shopList = shopList;	
		if (shopList != null) {
			putBodyParameter("ShopList" , new Gson().toJson(shopList));
		}	
	}

	public static class ShopList {

		@SerializedName("BusinessStatus")
		private Integer businessStatus;

		@SerializedName("ShopGroupIds")
		private List<String> shopGroupIds;

		@SerializedName("RegionCode")
		private String regionCode;

		@SerializedName("WeekdaysEndTime")
		private String weekdaysEndTime;

		@SerializedName("Latitude")
		private String latitude;

		@SerializedName("Remark")
		private String remark;

		@SerializedName("WeekendEndTime")
		private String weekendEndTime;

		@SerializedName("ShopName")
		private String shopName;

		@SerializedName("RegionAddress")
		private String regionAddress;

		@SerializedName("ShopId")
		private String shopId;

		@SerializedName("Location")
		private String location;

		@SerializedName("WeekendStartTime")
		private String weekendStartTime;

		@SerializedName("WeekdaysStartTime")
		private String weekdaysStartTime;

		@SerializedName("Longitude")
		private String longitude;

		public Integer getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(Integer businessStatus) {
			this.businessStatus = businessStatus;
		}

		public List<String> getShopGroupIds() {
			return this.shopGroupIds;
		}

		public void setShopGroupIds(List<String> shopGroupIds) {
			this.shopGroupIds = shopGroupIds;
		}

		public String getRegionCode() {
			return this.regionCode;
		}

		public void setRegionCode(String regionCode) {
			this.regionCode = regionCode;
		}

		public String getWeekdaysEndTime() {
			return this.weekdaysEndTime;
		}

		public void setWeekdaysEndTime(String weekdaysEndTime) {
			this.weekdaysEndTime = weekdaysEndTime;
		}

		public String getLatitude() {
			return this.latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getWeekendEndTime() {
			return this.weekendEndTime;
		}

		public void setWeekendEndTime(String weekendEndTime) {
			this.weekendEndTime = weekendEndTime;
		}

		public String getShopName() {
			return this.shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public String getRegionAddress() {
			return this.regionAddress;
		}

		public void setRegionAddress(String regionAddress) {
			this.regionAddress = regionAddress;
		}

		public String getShopId() {
			return this.shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getWeekendStartTime() {
			return this.weekendStartTime;
		}

		public void setWeekendStartTime(String weekendStartTime) {
			this.weekendStartTime = weekendStartTime;
		}

		public String getWeekdaysStartTime() {
			return this.weekdaysStartTime;
		}

		public void setWeekdaysStartTime(String weekdaysStartTime) {
			this.weekdaysStartTime = weekdaysStartTime;
		}

		public String getLongitude() {
			return this.longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
	}

	@Override
	public Class<CreateShopResponse> getResponseClass() {
		return CreateShopResponse.class;
	}

}
