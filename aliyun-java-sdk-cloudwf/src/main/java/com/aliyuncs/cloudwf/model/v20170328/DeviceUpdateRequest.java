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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeviceUpdateRequest extends RpcAcsRequest<DeviceUpdateResponse> {
	
	public DeviceUpdateRequest() {
		super("cloudwf", "2017-03-28", "DeviceUpdate", "cloudwf");
	}

	private String devicePosition;

	private String deviceName;

	private Long did;

	public String getDevicePosition() {
		return this.devicePosition;
	}

	public void setDevicePosition(String devicePosition) {
		this.devicePosition = devicePosition;
		if(devicePosition != null){
			putQueryParameter("DevicePosition", devicePosition);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
		}
	}

	public Long getDid() {
		return this.did;
	}

	public void setDid(Long did) {
		this.did = did;
		if(did != null){
			putQueryParameter("Did", did.toString());
		}
	}

	@Override
	public Class<DeviceUpdateResponse> getResponseClass() {
		return DeviceUpdateResponse.class;
	}

}
