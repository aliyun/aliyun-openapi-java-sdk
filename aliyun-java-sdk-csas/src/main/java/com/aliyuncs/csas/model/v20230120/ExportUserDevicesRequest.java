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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExportUserDevicesRequest extends RpcAcsRequest<ExportUserDevicesResponse> {
	   

	private String mac;

	private List<String> deviceTypes;

	private String hostname;

	private List<String> appStatuses;

	private List<String> dlpStatuses;

	private String saseUserId;

	private List<String> nacStatuses;

	private String department;

	private List<String> iaStatuses;

	private String deviceBelong;

	private Boolean sharingStatus;

	private List<String> deviceTags;

	private List<String> deviceStatuses;

	private List<String> paStatuses;

	private String username;
	public ExportUserDevicesRequest() {
		super("csas", "2023-01-20", "ExportUserDevices");
		setMethod(MethodType.POST);
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putBodyParameter("Mac", mac);
		}
	}

	public List<String> getDeviceTypes() {
		return this.deviceTypes;
	}

	public void setDeviceTypes(List<String> deviceTypes) {
		this.deviceTypes = deviceTypes;	
		if (deviceTypes != null) {
			for (int depth1 = 0; depth1 < deviceTypes.size(); depth1++) {
				putBodyParameter("DeviceTypes." + (depth1 + 1) , deviceTypes.get(depth1));
			}
		}	
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
		if(hostname != null){
			putBodyParameter("Hostname", hostname);
		}
	}

	public List<String> getAppStatuses() {
		return this.appStatuses;
	}

	public void setAppStatuses(List<String> appStatuses) {
		this.appStatuses = appStatuses;	
		if (appStatuses != null) {
			for (int depth1 = 0; depth1 < appStatuses.size(); depth1++) {
				putBodyParameter("AppStatuses." + (depth1 + 1) , appStatuses.get(depth1));
			}
		}	
	}

	public List<String> getDlpStatuses() {
		return this.dlpStatuses;
	}

	public void setDlpStatuses(List<String> dlpStatuses) {
		this.dlpStatuses = dlpStatuses;	
		if (dlpStatuses != null) {
			for (int depth1 = 0; depth1 < dlpStatuses.size(); depth1++) {
				putBodyParameter("DlpStatuses." + (depth1 + 1) , dlpStatuses.get(depth1));
			}
		}	
	}

	public String getSaseUserId() {
		return this.saseUserId;
	}

	public void setSaseUserId(String saseUserId) {
		this.saseUserId = saseUserId;
		if(saseUserId != null){
			putBodyParameter("SaseUserId", saseUserId);
		}
	}

	public List<String> getNacStatuses() {
		return this.nacStatuses;
	}

	public void setNacStatuses(List<String> nacStatuses) {
		this.nacStatuses = nacStatuses;	
		if (nacStatuses != null) {
			for (int depth1 = 0; depth1 < nacStatuses.size(); depth1++) {
				putBodyParameter("NacStatuses." + (depth1 + 1) , nacStatuses.get(depth1));
			}
		}	
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
		if(department != null){
			putBodyParameter("Department", department);
		}
	}

	public List<String> getIaStatuses() {
		return this.iaStatuses;
	}

	public void setIaStatuses(List<String> iaStatuses) {
		this.iaStatuses = iaStatuses;	
		if (iaStatuses != null) {
			for (int depth1 = 0; depth1 < iaStatuses.size(); depth1++) {
				putBodyParameter("IaStatuses." + (depth1 + 1) , iaStatuses.get(depth1));
			}
		}	
	}

	public String getDeviceBelong() {
		return this.deviceBelong;
	}

	public void setDeviceBelong(String deviceBelong) {
		this.deviceBelong = deviceBelong;
		if(deviceBelong != null){
			putBodyParameter("DeviceBelong", deviceBelong);
		}
	}

	public Boolean getSharingStatus() {
		return this.sharingStatus;
	}

	public void setSharingStatus(Boolean sharingStatus) {
		this.sharingStatus = sharingStatus;
		if(sharingStatus != null){
			putBodyParameter("SharingStatus", sharingStatus.toString());
		}
	}

	public List<String> getDeviceTags() {
		return this.deviceTags;
	}

	public void setDeviceTags(List<String> deviceTags) {
		this.deviceTags = deviceTags;	
		if (deviceTags != null) {
			for (int depth1 = 0; depth1 < deviceTags.size(); depth1++) {
				putBodyParameter("DeviceTags." + (depth1 + 1) , deviceTags.get(depth1));
			}
		}	
	}

	public List<String> getDeviceStatuses() {
		return this.deviceStatuses;
	}

	public void setDeviceStatuses(List<String> deviceStatuses) {
		this.deviceStatuses = deviceStatuses;	
		if (deviceStatuses != null) {
			for (int depth1 = 0; depth1 < deviceStatuses.size(); depth1++) {
				putBodyParameter("DeviceStatuses." + (depth1 + 1) , deviceStatuses.get(depth1));
			}
		}	
	}

	public List<String> getPaStatuses() {
		return this.paStatuses;
	}

	public void setPaStatuses(List<String> paStatuses) {
		this.paStatuses = paStatuses;	
		if (paStatuses != null) {
			for (int depth1 = 0; depth1 < paStatuses.size(); depth1++) {
				putBodyParameter("PaStatuses." + (depth1 + 1) , paStatuses.get(depth1));
			}
		}	
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putBodyParameter("Username", username);
		}
	}

	@Override
	public Class<ExportUserDevicesResponse> getResponseClass() {
		return ExportUserDevicesResponse.class;
	}

}
