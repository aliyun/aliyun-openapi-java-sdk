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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceOtaInfoRequest extends RpcAcsRequest<GetDeviceOtaInfoResponse> {
	   

	private String targetVersionType;

	private String tenantId;

	private String channel;

	private String model;

	private String networkType;

	private String region;

	private String osVersion;

	private String deviceId;

	private String baseVersion;
	public GetDeviceOtaInfoRequest() {
		super("wyota", "2021-04-20", "GetDeviceOtaInfo");
		setMethod(MethodType.POST);
	}

	public String getTargetVersionType() {
		return this.targetVersionType;
	}

	public void setTargetVersionType(String targetVersionType) {
		this.targetVersionType = targetVersionType;
		if(targetVersionType != null){
			putBodyParameter("TargetVersionType", targetVersionType);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putBodyParameter("Channel", channel);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putBodyParameter("NetworkType", networkType);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	public String getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
		if(osVersion != null){
			putBodyParameter("OsVersion", osVersion);
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

	public String getBaseVersion() {
		return this.baseVersion;
	}

	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
		if(baseVersion != null){
			putBodyParameter("BaseVersion", baseVersion);
		}
	}

	@Override
	public Class<GetDeviceOtaInfoResponse> getResponseClass() {
		return GetDeviceOtaInfoResponse.class;
	}

}
