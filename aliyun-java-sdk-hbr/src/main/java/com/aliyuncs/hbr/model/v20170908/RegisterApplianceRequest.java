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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RegisterApplianceRequest extends RpcAcsRequest<RegisterApplianceResponse> {
	   

	private String ipAddress;

	private String applianceVersion;

	private String hardwareModel;

	private String applianceType;

	private String uuid;

	private String hostname;

	private String applianceName;

	private String macAddress;
	public RegisterApplianceRequest() {
		super("hbr", "2017-09-08", "RegisterAppliance", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		if(ipAddress != null){
			putQueryParameter("IpAddress", ipAddress);
		}
	}

	public String getApplianceVersion() {
		return this.applianceVersion;
	}

	public void setApplianceVersion(String applianceVersion) {
		this.applianceVersion = applianceVersion;
		if(applianceVersion != null){
			putQueryParameter("ApplianceVersion", applianceVersion);
		}
	}

	public String getHardwareModel() {
		return this.hardwareModel;
	}

	public void setHardwareModel(String hardwareModel) {
		this.hardwareModel = hardwareModel;
		if(hardwareModel != null){
			putQueryParameter("HardwareModel", hardwareModel);
		}
	}

	public String getApplianceType() {
		return this.applianceType;
	}

	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
		if(applianceType != null){
			putQueryParameter("ApplianceType", applianceType);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
		if(hostname != null){
			putQueryParameter("Hostname", hostname);
		}
	}

	public String getApplianceName() {
		return this.applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
		if(applianceName != null){
			putQueryParameter("ApplianceName", applianceName);
		}
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
		if(macAddress != null){
			putQueryParameter("MacAddress", macAddress);
		}
	}

	@Override
	public Class<RegisterApplianceResponse> getResponseClass() {
		return RegisterApplianceResponse.class;
	}

}
