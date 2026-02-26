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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyplsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePickUpWaybillPreQueryRequest extends RpcAcsRequest<CreatePickUpWaybillPreQueryResponse> {
	   

	private String preWeight;

	private String orderChannels;

	private String outerOrderCode;

	@SerializedName("consigneeInfo")
	private ConsigneeInfo consigneeInfo;

	private String cpCode;

	private String contentType;

	@SerializedName("senderInfo")
	private SenderInfo senderInfo;
	public CreatePickUpWaybillPreQueryRequest() {
		super("Dyplsapi", "2017-05-25", "CreatePickUpWaybillPreQuery", "dypls");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPreWeight() {
		return this.preWeight;
	}

	public void setPreWeight(String preWeight) {
		this.preWeight = preWeight;
		if(preWeight != null){
			putQueryParameter("PreWeight", preWeight);
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

	public String getOuterOrderCode() {
		return this.outerOrderCode;
	}

	public void setOuterOrderCode(String outerOrderCode) {
		this.outerOrderCode = outerOrderCode;
		if(outerOrderCode != null){
			putQueryParameter("OuterOrderCode", outerOrderCode);
		}
	}

	public ConsigneeInfo getConsigneeInfo() {
		return this.consigneeInfo;
	}

	public void setConsigneeInfo(ConsigneeInfo consigneeInfo) {
		this.consigneeInfo = consigneeInfo;	
		if (consigneeInfo != null) {
			putQueryParameter("ConsigneeInfo" , new Gson().toJson(consigneeInfo));
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

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putHeaderParameter("Content-Type", contentType);
		}
	}

	public SenderInfo getSenderInfo() {
		return this.senderInfo;
	}

	public void setSenderInfo(SenderInfo senderInfo) {
		this.senderInfo = senderInfo;	
		if (senderInfo != null) {
			putQueryParameter("SenderInfo" , new Gson().toJson(senderInfo));
		}	
	}

	public static class ConsigneeInfo {

		@SerializedName("Name")
		private String name;

		@SerializedName("Mobile")
		private String mobile;

		@SerializedName("AddressInfo")
		private AddressInfo addressInfo;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public AddressInfo getAddressInfo() {
			return this.addressInfo;
		}

		public void setAddressInfo(AddressInfo addressInfo) {
			this.addressInfo = addressInfo;
		}

		public static class AddressInfo {

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
	}

	public static class SenderInfo {

		@SerializedName("Name")
		private String name;

		@SerializedName("Mobile")
		private String mobile;

		@SerializedName("AddressInfo")
		private AddressInfo addressInfo;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public AddressInfo getAddressInfo() {
			return this.addressInfo;
		}

		public void setAddressInfo(AddressInfo addressInfo) {
			this.addressInfo = addressInfo;
		}

		public static class AddressInfo {

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
	}

	@Override
	public Class<CreatePickUpWaybillPreQueryResponse> getResponseClass() {
		return CreatePickUpWaybillPreQueryResponse.class;
	}

}
