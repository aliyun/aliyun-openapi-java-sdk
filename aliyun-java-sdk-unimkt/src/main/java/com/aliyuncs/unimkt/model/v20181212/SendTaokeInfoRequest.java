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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendTaokeInfoRequest extends RpcAcsRequest<SendTaokeInfoResponse> {
	   

	private String productId;

	private String gender;

	private String city;

	private String userId;

	private String mac;

	private String province;

	private String productTitle;

	private String brandId;

	private String sellPrice;

	private String plat;

	private String componentId;

	private String address;

	private String ip;

	private String mediaId;

	private String phone;

	private String v;

	private String environmentType;

	private String district;

	private String imei;

	private String payPrice;

	private String channelId;

	private String age;

	private String status;
	public SendTaokeInfoRequest() {
		super("UniMkt", "2018-12-12", "SendTaokeInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putBodyParameter("ProductId", productId);
		}
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		if(gender != null){
			putBodyParameter("Gender", gender);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putBodyParameter("City", city);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putBodyParameter("Mac", mac);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putBodyParameter("Province", province);
		}
	}

	public String getProductTitle() {
		return this.productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
		if(productTitle != null){
			putBodyParameter("ProductTitle", productTitle);
		}
	}

	public String getBrandId() {
		return this.brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
		if(brandId != null){
			putBodyParameter("BrandId", brandId);
		}
	}

	public String getSellPrice() {
		return this.sellPrice;
	}

	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
		if(sellPrice != null){
			putBodyParameter("SellPrice", sellPrice);
		}
	}

	public String getPlat() {
		return this.plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
		if(plat != null){
			putBodyParameter("Plat", plat);
		}
	}

	public String getComponentId() {
		return this.componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
		if(componentId != null){
			putBodyParameter("ComponentId", componentId);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putBodyParameter("Address", address);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putBodyParameter("Ip", ip);
		}
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
		if(mediaId != null){
			putBodyParameter("MediaId", mediaId);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putBodyParameter("Phone", phone);
		}
	}

	public String getV() {
		return this.v;
	}

	public void setV(String v) {
		this.v = v;
		if(v != null){
			putBodyParameter("V", v);
		}
	}

	public String getEnvironmentType() {
		return this.environmentType;
	}

	public void setEnvironmentType(String environmentType) {
		this.environmentType = environmentType;
		if(environmentType != null){
			putBodyParameter("EnvironmentType", environmentType);
		}
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
		if(district != null){
			putBodyParameter("District", district);
		}
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
		if(imei != null){
			putBodyParameter("Imei", imei);
		}
	}

	public String getPayPrice() {
		return this.payPrice;
	}

	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
		if(payPrice != null){
			putBodyParameter("PayPrice", payPrice);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
		if(age != null){
			putBodyParameter("Age", age);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<SendTaokeInfoResponse> getResponseClass() {
		return SendTaokeInfoResponse.class;
	}

}
