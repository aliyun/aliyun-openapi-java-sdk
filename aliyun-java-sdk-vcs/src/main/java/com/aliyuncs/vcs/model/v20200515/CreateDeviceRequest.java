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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceRequest extends RpcAcsRequest<CreateDeviceResponse> {
	   

	private String dataSourceType;

	private String corpId;

	private String gbId;

	private String latitude;

	private String deviceVendor;

	private String deviceType;

	private String cityCode;

	private String filePath;

	private String longitude;

	private String deviceModel;

	private String deviceAddress;

	private String deviceName;

	private String deviceGroupName;

	private Long subDeviceCount;
	public CreateDeviceRequest() {
		super("Vcs", "2020-05-15", "CreateDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
		if(dataSourceType != null){
			putBodyParameter("DataSourceType", dataSourceType);
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getGbId() {
		return this.gbId;
	}

	public void setGbId(String gbId) {
		this.gbId = gbId;
		if(gbId != null){
			putBodyParameter("GbId", gbId);
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

	public String getDeviceVendor() {
		return this.deviceVendor;
	}

	public void setDeviceVendor(String deviceVendor) {
		this.deviceVendor = deviceVendor;
		if(deviceVendor != null){
			putBodyParameter("DeviceVendor", deviceVendor);
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

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
		if(cityCode != null){
			putBodyParameter("CityCode", cityCode);
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putBodyParameter("FilePath", filePath);
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

	public String getDeviceModel() {
		return this.deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
		if(deviceModel != null){
			putBodyParameter("DeviceModel", deviceModel);
		}
	}

	public String getDeviceAddress() {
		return this.deviceAddress;
	}

	public void setDeviceAddress(String deviceAddress) {
		this.deviceAddress = deviceAddress;
		if(deviceAddress != null){
			putBodyParameter("DeviceAddress", deviceAddress);
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

	public String getDeviceGroupName() {
		return this.deviceGroupName;
	}

	public void setDeviceGroupName(String deviceGroupName) {
		this.deviceGroupName = deviceGroupName;
		if(deviceGroupName != null){
			putBodyParameter("DeviceGroupName", deviceGroupName);
		}
	}

	public Long getSubDeviceCount() {
		return this.subDeviceCount;
	}

	public void setSubDeviceCount(Long subDeviceCount) {
		this.subDeviceCount = subDeviceCount;
		if(subDeviceCount != null){
			putBodyParameter("SubDeviceCount", subDeviceCount.toString());
		}
	}

	@Override
	public Class<CreateDeviceResponse> getResponseClass() {
		return CreateDeviceResponse.class;
	}

}
