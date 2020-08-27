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
public class AddDeviceRequest extends RpcAcsRequest<AddDeviceResponse> {
	   

	private String deviceSite;

	private String corpId;

	private String gbId;

	private String bitRate;

	private String deviceDirection;

	private String deviceAddress;

	private String deviceType;

	private String deviceResolution;

	private String vendor;

	private String deviceName;
	public AddDeviceRequest() {
		super("Vcs", "2020-05-15", "AddDevice");
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

	public String getBitRate() {
		return this.bitRate;
	}

	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
		if(bitRate != null){
			putBodyParameter("BitRate", bitRate);
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

	public String getDeviceAddress() {
		return this.deviceAddress;
	}

	public void setDeviceAddress(String deviceAddress) {
		this.deviceAddress = deviceAddress;
		if(deviceAddress != null){
			putBodyParameter("DeviceAddress", deviceAddress);
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

	public String getDeviceResolution() {
		return this.deviceResolution;
	}

	public void setDeviceResolution(String deviceResolution) {
		this.deviceResolution = deviceResolution;
		if(deviceResolution != null){
			putBodyParameter("DeviceResolution", deviceResolution);
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
	public Class<AddDeviceResponse> getResponseClass() {
		return AddDeviceResponse.class;
	}

}
