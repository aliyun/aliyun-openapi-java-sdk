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

package com.aliyuncs.imarketing.model.v20220704;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceRequest extends RpcAcsRequest<CreateDeviceResponse> {
	   

	private String firstScene;

	@SerializedName("extraMap")
	private Map<String,String> extraMap;

	private String city;

	private String mediaId;

	private String deviceType;

	private String locationName;

	private String province;

	private String district;

	private String deviceName;

	private String deviceModelNumber;

	private String secondScene;

	private String floor;

	private String channelId;

	private String outerCode;
	public CreateDeviceRequest() {
		super("imarketing", "2022-07-04", "CreateDevice");
		setMethod(MethodType.POST);
	}

	public String getFirstScene() {
		return this.firstScene;
	}

	public void setFirstScene(String firstScene) {
		this.firstScene = firstScene;
		if(firstScene != null){
			putBodyParameter("FirstScene", firstScene);
		}
	}

	public Map<String,String> getExtraMap() {
		return this.extraMap;
	}

	public void setExtraMap(Map<String,String> extraMap) {
		this.extraMap = extraMap;	
		if (extraMap != null) {
			putBodyParameter("ExtraMap" , new Gson().toJson(extraMap));
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

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
		if(mediaId != null){
			putBodyParameter("MediaId", mediaId);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putBodyParameter("DeviceType", deviceType);
		}
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
		if(locationName != null){
			putBodyParameter("LocationName", locationName);
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

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
		if(district != null){
			putBodyParameter("District", district);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putBodyParameter("DeviceName", deviceName);
		}
	}

	public String getDeviceModelNumber() {
		return this.deviceModelNumber;
	}

	public void setDeviceModelNumber(String deviceModelNumber) {
		this.deviceModelNumber = deviceModelNumber;
		if(deviceModelNumber != null){
			putBodyParameter("DeviceModelNumber", deviceModelNumber);
		}
	}

	public String getSecondScene() {
		return this.secondScene;
	}

	public void setSecondScene(String secondScene) {
		this.secondScene = secondScene;
		if(secondScene != null){
			putBodyParameter("SecondScene", secondScene);
		}
	}

	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
		if(floor != null){
			putBodyParameter("Floor", floor);
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

	public String getOuterCode() {
		return this.outerCode;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
		if(outerCode != null){
			putBodyParameter("OuterCode", outerCode);
		}
	}

	@Override
	public Class<CreateDeviceResponse> getResponseClass() {
		return CreateDeviceResponse.class;
	}

}
