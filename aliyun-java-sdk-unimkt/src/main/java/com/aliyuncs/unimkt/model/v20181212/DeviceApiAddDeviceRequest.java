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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeviceApiAddDeviceRequest extends RpcAcsRequest<DeviceApiAddDeviceResponse> {
	   

	@SerializedName("body")
	private Body body;
	public DeviceApiAddDeviceRequest() {
		super("UniMkt", "2018-12-12", "DeviceApiAddDevice", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("FirstScene")
		private String firstScene;

		@SerializedName("ExtraMap")
		private Map<String,String> extraMap;

		@SerializedName("City")
		private String city;

		@SerializedName("MediaId")
		private String mediaId;

		@SerializedName("DeviceType")
		private String deviceType;

		@SerializedName("LocationName")
		private String locationName;

		@SerializedName("Province")
		private String province;

		@SerializedName("District")
		private String district;

		@SerializedName("DeviceName")
		private String deviceName;

		@SerializedName("DeviceModelNumber")
		private String deviceModelNumber;

		@SerializedName("SecondScene")
		private String secondScene;

		@SerializedName("Floor")
		private String floor;

		@SerializedName("ChannelId")
		private String channelId;

		@SerializedName("OuterCode")
		private String outerCode;

		public String getFirstScene() {
			return this.firstScene;
		}

		public void setFirstScene(String firstScene) {
			this.firstScene = firstScene;
		}

		public Map<String,String> getExtraMap() {
			return this.extraMap;
		}

		public void setExtraMap(Map<String,String> extraMap) {
			this.extraMap = extraMap;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getLocationName() {
			return this.locationName;
		}

		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getDistrict() {
			return this.district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getDeviceModelNumber() {
			return this.deviceModelNumber;
		}

		public void setDeviceModelNumber(String deviceModelNumber) {
			this.deviceModelNumber = deviceModelNumber;
		}

		public String getSecondScene() {
			return this.secondScene;
		}

		public void setSecondScene(String secondScene) {
			this.secondScene = secondScene;
		}

		public String getFloor() {
			return this.floor;
		}

		public void setFloor(String floor) {
			this.floor = floor;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getOuterCode() {
			return this.outerCode;
		}

		public void setOuterCode(String outerCode) {
			this.outerCode = outerCode;
		}
	}

	@Override
	public Class<DeviceApiAddDeviceResponse> getResponseClass() {
		return DeviceApiAddDeviceResponse.class;
	}

}
