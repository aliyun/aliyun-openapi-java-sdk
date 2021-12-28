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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderForHardwareRequest extends RpcAcsRequest<CreateOrderForHardwareResponse> {
	   

	private String streetName;

	private String countryCode;

	private String contactName;

	private String provName;

	private String cityCode;

	private String mobilePhone;

	private String hardwareType;

	private String districtCode;

	private String email;

	private String hardwareVersion;

	private Integer amount;

	private String detailAddress;

	private Boolean autoPay;

	private String cityName;

	private String countryName;

	private String promotionId;

	private String zipCode;

	private String districtName;

	private String phone;

	private String streetCode;

	private String provCode;
	public CreateOrderForHardwareRequest() {
		super("ecd", "2020-09-30", "CreateOrderForHardware");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
		if(streetName != null){
			putQueryParameter("StreetName", streetName);
		}
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		if(countryCode != null){
			putQueryParameter("CountryCode", countryCode);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getProvName() {
		return this.provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
		if(provName != null){
			putQueryParameter("ProvName", provName);
		}
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
		if(cityCode != null){
			putQueryParameter("CityCode", cityCode);
		}
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
		if(mobilePhone != null){
			putQueryParameter("MobilePhone", mobilePhone);
		}
	}

	public String getHardwareType() {
		return this.hardwareType;
	}

	public void setHardwareType(String hardwareType) {
		this.hardwareType = hardwareType;
		if(hardwareType != null){
			putQueryParameter("HardwareType", hardwareType);
		}
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
		if(districtCode != null){
			putQueryParameter("DistrictCode", districtCode);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getHardwareVersion() {
		return this.hardwareVersion;
	}

	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
		if(hardwareVersion != null){
			putQueryParameter("HardwareVersion", hardwareVersion);
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
		if(detailAddress != null){
			putQueryParameter("DetailAddress", detailAddress);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
		if(cityName != null){
			putQueryParameter("CityName", cityName);
		}
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
		if(countryName != null){
			putQueryParameter("CountryName", countryName);
		}
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putQueryParameter("PromotionId", promotionId);
		}
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
		if(zipCode != null){
			putQueryParameter("ZipCode", zipCode);
		}
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
		if(districtName != null){
			putQueryParameter("DistrictName", districtName);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public String getStreetCode() {
		return this.streetCode;
	}

	public void setStreetCode(String streetCode) {
		this.streetCode = streetCode;
		if(streetCode != null){
			putQueryParameter("StreetCode", streetCode);
		}
	}

	public String getProvCode() {
		return this.provCode;
	}

	public void setProvCode(String provCode) {
		this.provCode = provCode;
		if(provCode != null){
			putQueryParameter("ProvCode", provCode);
		}
	}

	@Override
	public Class<CreateOrderForHardwareResponse> getResponseClass() {
		return CreateOrderForHardwareResponse.class;
	}

}
