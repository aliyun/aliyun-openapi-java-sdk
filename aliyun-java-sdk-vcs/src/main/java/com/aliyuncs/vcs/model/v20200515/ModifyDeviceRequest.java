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
public class ModifyDeviceRequest extends RpcAcsRequest<ModifyDeviceResponse> {
	   

	private String deviceSite;

	private String frameRate;

	private String oSDTimeEnable;

	private String latitude;

	private String oSDTimeY;

	private String oSDTimeX;

	private String deviceResolution;

	private String password;

	private String encodeFormat;

	private String vendor;

	private String oSDTimeType;

	private String longitude;

	private String deviceModel;

	private String audioEnable;

	private String deviceIp;

	private String deviceDirection;

	private String deviceRate;

	private String govLength;

	private String deviceId;

	private String deviceAddress;

	private String deviceSubType;

	private String deviceName;
	public ModifyDeviceRequest() {
		super("Vcs", "2020-05-15", "ModifyDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeviceSite() {
		return this.deviceSite;
	}

	public void setDeviceSite(String deviceSite) {
		this.deviceSite = deviceSite;
		if(deviceSite != null){
			putBodyParameter("DeviceSite", deviceSite);
		}
	}

	public String getFrameRate() {
		return this.frameRate;
	}

	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
		if(frameRate != null){
			putBodyParameter("FrameRate", frameRate);
		}
	}

	public String getOSDTimeEnable() {
		return this.oSDTimeEnable;
	}

	public void setOSDTimeEnable(String oSDTimeEnable) {
		this.oSDTimeEnable = oSDTimeEnable;
		if(oSDTimeEnable != null){
			putBodyParameter("OSDTimeEnable", oSDTimeEnable);
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

	public String getOSDTimeY() {
		return this.oSDTimeY;
	}

	public void setOSDTimeY(String oSDTimeY) {
		this.oSDTimeY = oSDTimeY;
		if(oSDTimeY != null){
			putBodyParameter("OSDTimeY", oSDTimeY);
		}
	}

	public String getOSDTimeX() {
		return this.oSDTimeX;
	}

	public void setOSDTimeX(String oSDTimeX) {
		this.oSDTimeX = oSDTimeX;
		if(oSDTimeX != null){
			putBodyParameter("OSDTimeX", oSDTimeX);
		}
	}

	public String getDeviceResolution() {
		return this.deviceResolution;
	}

	public void setDeviceResolution(String deviceResolution) {
		this.deviceResolution = deviceResolution;
		if(deviceResolution != null){
			putBodyParameter("DeviceResolution", deviceResolution);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public String getEncodeFormat() {
		return this.encodeFormat;
	}

	public void setEncodeFormat(String encodeFormat) {
		this.encodeFormat = encodeFormat;
		if(encodeFormat != null){
			putBodyParameter("EncodeFormat", encodeFormat);
		}
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putBodyParameter("Vendor", vendor);
		}
	}

	public String getOSDTimeType() {
		return this.oSDTimeType;
	}

	public void setOSDTimeType(String oSDTimeType) {
		this.oSDTimeType = oSDTimeType;
		if(oSDTimeType != null){
			putBodyParameter("OSDTimeType", oSDTimeType);
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

	public String getAudioEnable() {
		return this.audioEnable;
	}

	public void setAudioEnable(String audioEnable) {
		this.audioEnable = audioEnable;
		if(audioEnable != null){
			putBodyParameter("AudioEnable", audioEnable);
		}
	}

	public String getDeviceIp() {
		return this.deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
		if(deviceIp != null){
			putBodyParameter("DeviceIp", deviceIp);
		}
	}

	public String getDeviceDirection() {
		return this.deviceDirection;
	}

	public void setDeviceDirection(String deviceDirection) {
		this.deviceDirection = deviceDirection;
		if(deviceDirection != null){
			putBodyParameter("DeviceDirection", deviceDirection);
		}
	}

	public String getDeviceRate() {
		return this.deviceRate;
	}

	public void setDeviceRate(String deviceRate) {
		this.deviceRate = deviceRate;
		if(deviceRate != null){
			putBodyParameter("DeviceRate", deviceRate);
		}
	}

	public String getGovLength() {
		return this.govLength;
	}

	public void setGovLength(String govLength) {
		this.govLength = govLength;
		if(govLength != null){
			putBodyParameter("GovLength", govLength);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putBodyParameter("DeviceId", deviceId);
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

	public String getDeviceSubType() {
		return this.deviceSubType;
	}

	public void setDeviceSubType(String deviceSubType) {
		this.deviceSubType = deviceSubType;
		if(deviceSubType != null){
			putBodyParameter("DeviceSubType", deviceSubType);
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

	@Override
	public Class<ModifyDeviceResponse> getResponseClass() {
		return ModifyDeviceResponse.class;
	}

}
