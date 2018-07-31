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

package com.aliyuncs.mopen.model.v20180211;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MoPenCreateDeviceRequest extends RpcAcsRequest<MoPenCreateDeviceResponse> {
	
	public MoPenCreateDeviceRequest() {
		super("MoPen", "2018-02-11", "MoPenCreateDevice");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String deviceName;

	private Integer deviceType;

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putBodyParameter("DeviceName", deviceName);
		}
	}

	public Integer getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putBodyParameter("DeviceType", deviceType.toString());
		}
	}

	@Override
	public Class<MoPenCreateDeviceResponse> getResponseClass() {
		return MoPenCreateDeviceResponse.class;
	}

}
