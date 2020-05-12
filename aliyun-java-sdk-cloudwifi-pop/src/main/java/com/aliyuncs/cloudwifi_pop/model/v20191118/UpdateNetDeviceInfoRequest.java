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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudwifi_pop.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateNetDeviceInfoRequest extends RpcAcsRequest<UpdateNetDeviceInfoResponse> {
	   

	private String appName;

	private List<Devices> devicess;

	private String requestId;

	private String appCode;
	public UpdateNetDeviceInfoRequest() {
		super("cloudwifi-pop", "2019-11-18", "UpdateNetDeviceInfo", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public List<Devices> getDevicess() {
		return this.devicess;
	}

	public void setDevicess(List<Devices> devicess) {
		this.devicess = devicess;	
		if (devicess != null) {
			for (int depth1 = 0; depth1 < devicess.size(); depth1++) {
				putBodyParameter("Devices." + (depth1 + 1) + ".Password" , devicess.get(depth1).getPassword());
				putBodyParameter("Devices." + (depth1 + 1) + ".Role" , devicess.get(depth1).getRole());
				putBodyParameter("Devices." + (depth1 + 1) + ".ServiceTag" , devicess.get(depth1).getServiceTag());
				putBodyParameter("Devices." + (depth1 + 1) + ".NetPod" , devicess.get(depth1).getNetPod());
				putBodyParameter("Devices." + (depth1 + 1) + ".Idc" , devicess.get(depth1).getIdc());
				putBodyParameter("Devices." + (depth1 + 1) + ".Model" , devicess.get(depth1).getModel());
				putBodyParameter("Devices." + (depth1 + 1) + ".Id" , devicess.get(depth1).getId());
				putBodyParameter("Devices." + (depth1 + 1) + ".MgnIp" , devicess.get(depth1).getMgnIp());
				putBodyParameter("Devices." + (depth1 + 1) + ".HostName" , devicess.get(depth1).getHostName());
				putBodyParameter("Devices." + (depth1 + 1) + ".Manufacturer" , devicess.get(depth1).getManufacturer());
				putBodyParameter("Devices." + (depth1 + 1) + ".LogicNetPod" , devicess.get(depth1).getLogicNetPod());
				putBodyParameter("Devices." + (depth1 + 1) + ".Username" , devicess.get(depth1).getUsername());
			}
		}	
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public static class Devices {

		private String password;

		private String role;

		private String serviceTag;

		private String netPod;

		private String idc;

		private String model;

		private Long id;

		private String mgnIp;

		private String hostName;

		private String manufacturer;

		private String logicNetPod;

		private String username;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getServiceTag() {
			return this.serviceTag;
		}

		public void setServiceTag(String serviceTag) {
			this.serviceTag = serviceTag;
		}

		public String getNetPod() {
			return this.netPod;
		}

		public void setNetPod(String netPod) {
			this.netPod = netPod;
		}

		public String getIdc() {
			return this.idc;
		}

		public void setIdc(String idc) {
			this.idc = idc;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMgnIp() {
			return this.mgnIp;
		}

		public void setMgnIp(String mgnIp) {
			this.mgnIp = mgnIp;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getManufacturer() {
			return this.manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getLogicNetPod() {
			return this.logicNetPod;
		}

		public void setLogicNetPod(String logicNetPod) {
			this.logicNetPod = logicNetPod;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	}

	@Override
	public Class<UpdateNetDeviceInfoResponse> getResponseClass() {
		return UpdateNetDeviceInfoResponse.class;
	}

}
