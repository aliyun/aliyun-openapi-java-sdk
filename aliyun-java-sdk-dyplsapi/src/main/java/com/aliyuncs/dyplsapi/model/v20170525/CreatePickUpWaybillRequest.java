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

package com.aliyuncs.dyplsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyplsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePickUpWaybillRequest extends RpcAcsRequest<CreatePickUpWaybillResponse> {
	   

	private String consigneeName;

	private String orderChannels;

	@SerializedName("sendAddress")
	private SendAddress sendAddress;

	private String outerOrderCode;

	private String remark;

	private String appointGotStartTime;

	private String appointGotEndTime;

	private String cpCode;

	private String sendMobile;

	private String consigneeMobile;

	private String contentType;

	@SerializedName("consigneeAddress")
	private ConsigneeAddress consigneeAddress;

	private String sendPhone;

	@SerializedName("goodsInfos")
	private List<GoodsInfos> goodsInfos;

	private Integer bizType;

	private String sendName;

	private String consigneePhone;
	public CreatePickUpWaybillRequest() {
		super("Dyplsapi", "2017-05-25", "CreatePickUpWaybill", "dypls");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConsigneeName() {
		return this.consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
		if(consigneeName != null){
			putQueryParameter("ConsigneeName", consigneeName);
		}
	}

	public String getOrderChannels() {
		return this.orderChannels;
	}

	public void setOrderChannels(String orderChannels) {
		this.orderChannels = orderChannels;
		if(orderChannels != null){
			putQueryParameter("OrderChannels", orderChannels);
		}
	}

	public SendAddress getSendAddress() {
		return this.sendAddress;
	}

	public void setSendAddress(SendAddress sendAddress) {
		this.sendAddress = sendAddress;	
		if (sendAddress != null) {
			putQueryParameter("SendAddress" , new Gson().toJson(sendAddress));
		}	
	}

	public String getOuterOrderCode() {
		return this.outerOrderCode;
	}

	public void setOuterOrderCode(String outerOrderCode) {
		this.outerOrderCode = outerOrderCode;
		if(outerOrderCode != null){
			putQueryParameter("OuterOrderCode", outerOrderCode);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getAppointGotStartTime() {
		return this.appointGotStartTime;
	}

	public void setAppointGotStartTime(String appointGotStartTime) {
		this.appointGotStartTime = appointGotStartTime;
		if(appointGotStartTime != null){
			putQueryParameter("AppointGotStartTime", appointGotStartTime);
		}
	}

	public String getAppointGotEndTime() {
		return this.appointGotEndTime;
	}

	public void setAppointGotEndTime(String appointGotEndTime) {
		this.appointGotEndTime = appointGotEndTime;
		if(appointGotEndTime != null){
			putQueryParameter("AppointGotEndTime", appointGotEndTime);
		}
	}

	public String getCpCode() {
		return this.cpCode;
	}

	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
		if(cpCode != null){
			putQueryParameter("CpCode", cpCode);
		}
	}

	public String getSendMobile() {
		return this.sendMobile;
	}

	public void setSendMobile(String sendMobile) {
		this.sendMobile = sendMobile;
		if(sendMobile != null){
			putQueryParameter("SendMobile", sendMobile);
		}
	}

	public String getConsigneeMobile() {
		return this.consigneeMobile;
	}

	public void setConsigneeMobile(String consigneeMobile) {
		this.consigneeMobile = consigneeMobile;
		if(consigneeMobile != null){
			putQueryParameter("ConsigneeMobile", consigneeMobile);
		}
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putHeaderParameter("Content-Type", contentType);
		}
	}

	public ConsigneeAddress getConsigneeAddress() {
		return this.consigneeAddress;
	}

	public void setConsigneeAddress(ConsigneeAddress consigneeAddress) {
		this.consigneeAddress = consigneeAddress;	
		if (consigneeAddress != null) {
			putQueryParameter("ConsigneeAddress" , new Gson().toJson(consigneeAddress));
		}	
	}

	public String getSendPhone() {
		return this.sendPhone;
	}

	public void setSendPhone(String sendPhone) {
		this.sendPhone = sendPhone;
		if(sendPhone != null){
			putQueryParameter("SendPhone", sendPhone);
		}
	}

	public List<GoodsInfos> getGoodsInfos() {
		return this.goodsInfos;
	}

	public void setGoodsInfos(List<GoodsInfos> goodsInfos) {
		this.goodsInfos = goodsInfos;	
		if (goodsInfos != null) {
			putQueryParameter("GoodsInfos" , new Gson().toJson(goodsInfos));
		}	
	}

	public Integer getBizType() {
		return this.bizType;
	}

	public void setBizType(Integer bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType.toString());
		}
	}

	public String getSendName() {
		return this.sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
		if(sendName != null){
			putQueryParameter("SendName", sendName);
		}
	}

	public String getConsigneePhone() {
		return this.consigneePhone;
	}

	public void setConsigneePhone(String consigneePhone) {
		this.consigneePhone = consigneePhone;
		if(consigneePhone != null){
			putQueryParameter("ConsigneePhone", consigneePhone);
		}
	}

	public static class SendAddress {

		@SerializedName("ProvinceName")
		private String provinceName;

		@SerializedName("CityName")
		private String cityName;

		@SerializedName("AreaName")
		private String areaName;

		@SerializedName("TownName")
		private String townName;

		@SerializedName("AddressDetail")
		private String addressDetail;

		public String getProvinceName() {
			return this.provinceName;
		}

		public void setProvinceName(String provinceName) {
			this.provinceName = provinceName;
		}

		public String getCityName() {
			return this.cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getAreaName() {
			return this.areaName;
		}

		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}

		public String getTownName() {
			return this.townName;
		}

		public void setTownName(String townName) {
			this.townName = townName;
		}

		public String getAddressDetail() {
			return this.addressDetail;
		}

		public void setAddressDetail(String addressDetail) {
			this.addressDetail = addressDetail;
		}
	}

	public static class ConsigneeAddress {

		@SerializedName("ProvinceName")
		private String provinceName;

		@SerializedName("CityName")
		private String cityName;

		@SerializedName("AreaName")
		private String areaName;

		@SerializedName("TownName")
		private String townName;

		@SerializedName("AddressDetail")
		private String addressDetail;

		public String getProvinceName() {
			return this.provinceName;
		}

		public void setProvinceName(String provinceName) {
			this.provinceName = provinceName;
		}

		public String getCityName() {
			return this.cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getAreaName() {
			return this.areaName;
		}

		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}

		public String getTownName() {
			return this.townName;
		}

		public void setTownName(String townName) {
			this.townName = townName;
		}

		public String getAddressDetail() {
			return this.addressDetail;
		}

		public void setAddressDetail(String addressDetail) {
			this.addressDetail = addressDetail;
		}
	}

	public static class GoodsInfos {

		@SerializedName("Name")
		private String name;

		@SerializedName("Weight")
		private String weight;

		@SerializedName("Quantity")
		private String quantity;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWeight() {
			return this.weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getQuantity() {
			return this.quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
	}

	@Override
	public Class<CreatePickUpWaybillResponse> getResponseClass() {
		return CreatePickUpWaybillResponse.class;
	}

}
