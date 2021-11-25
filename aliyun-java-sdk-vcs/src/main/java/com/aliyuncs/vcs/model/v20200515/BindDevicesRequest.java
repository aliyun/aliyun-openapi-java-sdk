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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindDevicesRequest extends RpcAcsRequest<BindDevicesResponse> {
	   

	private String corpId;

	@SerializedName("subDeviceList")
	private List<SubDeviceList> subDeviceList;

	private String deviceId;
	public BindDevicesRequest() {
		super("Vcs", "2020-05-15", "BindDevices");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<SubDeviceList> getSubDeviceList() {
		return this.subDeviceList;
	}

	public void setSubDeviceList(List<SubDeviceList> subDeviceList) {
		this.subDeviceList = subDeviceList;	
		if (subDeviceList != null) {
			putBodyParameter("SubDeviceList" , new Gson().toJson(subDeviceList));
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

	public static class SubDeviceList {

		@SerializedName("SubDeviceIp")
		private String subDeviceIp;

		@SerializedName("SubDevicePort")
		private String subDevicePort;

		@SerializedName("PIN")
		private String pIN;

		@SerializedName("AccessProtocol")
		private String accessProtocol;

		@SerializedName("LoginName")
		private String loginName;

		@SerializedName("SubDeviceName")
		private String subDeviceName;

		public String getSubDeviceIp() {
			return this.subDeviceIp;
		}

		public void setSubDeviceIp(String subDeviceIp) {
			this.subDeviceIp = subDeviceIp;
		}

		public String getSubDevicePort() {
			return this.subDevicePort;
		}

		public void setSubDevicePort(String subDevicePort) {
			this.subDevicePort = subDevicePort;
		}

		public String getPIN() {
			return this.pIN;
		}

		public void setPIN(String pIN) {
			this.pIN = pIN;
		}

		public String getAccessProtocol() {
			return this.accessProtocol;
		}

		public void setAccessProtocol(String accessProtocol) {
			this.accessProtocol = accessProtocol;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getSubDeviceName() {
			return this.subDeviceName;
		}

		public void setSubDeviceName(String subDeviceName) {
			this.subDeviceName = subDeviceName;
		}
	}

	@Override
	public Class<BindDevicesResponse> getResponseClass() {
		return BindDevicesResponse.class;
	}

}
