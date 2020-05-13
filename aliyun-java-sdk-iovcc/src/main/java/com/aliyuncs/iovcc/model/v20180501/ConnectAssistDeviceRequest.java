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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConnectAssistDeviceRequest extends RpcAcsRequest<ConnectAssistDeviceResponse> {
	   

	private Boolean allowCommandExtension;

	private String uUID;

	private String hardwareId;

	private String vIN;

	private String projectId;

	private String serialNumber;

	private String deviceId;
	public ConnectAssistDeviceRequest() {
		super("iovcc", "2018-05-01", "ConnectAssistDevice", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAllowCommandExtension() {
		return this.allowCommandExtension;
	}

	public void setAllowCommandExtension(Boolean allowCommandExtension) {
		this.allowCommandExtension = allowCommandExtension;
		if(allowCommandExtension != null){
			putBodyParameter("AllowCommandExtension", allowCommandExtension.toString());
		}
	}

	public String getUUID() {
		return this.uUID;
	}

	public void setUUID(String uUID) {
		this.uUID = uUID;
		if(uUID != null){
			putBodyParameter("UUID", uUID);
		}
	}

	public String getHardwareId() {
		return this.hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
		if(hardwareId != null){
			putBodyParameter("HardwareId", hardwareId);
		}
	}

	public String getVIN() {
		return this.vIN;
	}

	public void setVIN(String vIN) {
		this.vIN = vIN;
		if(vIN != null){
			putBodyParameter("VIN", vIN);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		if(serialNumber != null){
			putBodyParameter("SerialNumber", serialNumber);
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

	@Override
	public Class<ConnectAssistDeviceResponse> getResponseClass() {
		return ConnectAssistDeviceResponse.class;
	}

}
