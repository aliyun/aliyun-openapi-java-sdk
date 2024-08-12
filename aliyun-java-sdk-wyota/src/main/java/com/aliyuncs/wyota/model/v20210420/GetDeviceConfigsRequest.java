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
public class GetDeviceConfigsRequest extends RpcAcsRequest<GetDeviceConfigsResponse> {
	   

	private String userCustomId;

	private String urclVersion;

	private String networkType;

	private String region;

	private String deviceId;

	private String serialNo;
	public GetDeviceConfigsRequest() {
		super("wyota", "2021-04-20", "GetDeviceConfigs");
		setMethod(MethodType.POST);
	}

	public String getUserCustomId() {
		return this.userCustomId;
	}

	public void setUserCustomId(String userCustomId) {
		this.userCustomId = userCustomId;
		if(userCustomId != null){
			putBodyParameter("UserCustomId", userCustomId);
		}
	}

	public String getUrclVersion() {
		return this.urclVersion;
	}

	public void setUrclVersion(String urclVersion) {
		this.urclVersion = urclVersion;
		if(urclVersion != null){
			putBodyParameter("UrclVersion", urclVersion);
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

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putBodyParameter("DeviceId", deviceId);
		}
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putBodyParameter("SerialNo", serialNo);
		}
	}

	@Override
	public Class<GetDeviceConfigsResponse> getResponseClass() {
		return GetDeviceConfigsResponse.class;
	}

}
