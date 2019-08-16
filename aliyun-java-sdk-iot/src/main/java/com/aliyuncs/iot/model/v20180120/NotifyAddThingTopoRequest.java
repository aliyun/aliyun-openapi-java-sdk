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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class NotifyAddThingTopoRequest extends RpcAcsRequest<NotifyAddThingTopoResponse> {
	
	public NotifyAddThingTopoRequest() {
		super("Iot", "2018-01-20", "NotifyAddThingTopo", "iot");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String gwProductKey;

	private String gwDeviceName;

	private String iotInstanceId;

	private String gwIotId;

	private String deviceListStr;

	public String getGwProductKey() {
		return this.gwProductKey;
	}

	public void setGwProductKey(String gwProductKey) {
		this.gwProductKey = gwProductKey;
		if(gwProductKey != null){
			putQueryParameter("GwProductKey", gwProductKey);
		}
	}

	public String getGwDeviceName() {
		return this.gwDeviceName;
	}

	public void setGwDeviceName(String gwDeviceName) {
		this.gwDeviceName = gwDeviceName;
		if(gwDeviceName != null){
			putQueryParameter("GwDeviceName", gwDeviceName);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getGwIotId() {
		return this.gwIotId;
	}

	public void setGwIotId(String gwIotId) {
		this.gwIotId = gwIotId;
		if(gwIotId != null){
			putQueryParameter("GwIotId", gwIotId);
		}
	}

	public String getDeviceListStr() {
		return this.deviceListStr;
	}

	public void setDeviceListStr(String deviceListStr) {
		this.deviceListStr = deviceListStr;
		if(deviceListStr != null){
			putQueryParameter("DeviceListStr", deviceListStr);
		}
	}

	@Override
	public Class<NotifyAddThingTopoResponse> getResponseClass() {
		return NotifyAddThingTopoResponse.class;
	}

}
