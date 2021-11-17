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

package com.aliyuncs.mindlive_biz.model.v20210214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDeviceConfigRequest extends RpcAcsRequest<UpdateDeviceConfigResponse> {
	   

	private String deviceConfig;

	private String deviceId;
	public UpdateDeviceConfigRequest() {
		super("mindlive-biz", "2021-02-14", "UpdateDeviceConfig");
		setMethod(MethodType.POST);
	}

	public String getDeviceConfig() {
		return this.deviceConfig;
	}

	public void setDeviceConfig(String deviceConfig) {
		this.deviceConfig = deviceConfig;
		if(deviceConfig != null){
			putQueryParameter("DeviceConfig", deviceConfig);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	@Override
	public Class<UpdateDeviceConfigResponse> getResponseClass() {
		return UpdateDeviceConfigResponse.class;
	}

}
