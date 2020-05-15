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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLoRaNodesTaskRequest extends RpcAcsRequest<CreateLoRaNodesTaskResponse> {
	   

	private String productKey;

	private String iotInstanceId;

	private List<DeviceInfo> deviceInfos;
	public CreateLoRaNodesTaskRequest() {
		super("Iot", "2018-01-20", "CreateLoRaNodesTask", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
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

	public List<DeviceInfo> getDeviceInfos() {
		return this.deviceInfos;
	}

	public void setDeviceInfos(List<DeviceInfo> deviceInfos) {
		this.deviceInfos = deviceInfos;	
		if (deviceInfos != null) {
			for (int depth1 = 0; depth1 < deviceInfos.size(); depth1++) {
				putQueryParameter("DeviceInfo." + (depth1 + 1) + ".PinCode" , deviceInfos.get(depth1).getPinCode());
				putQueryParameter("DeviceInfo." + (depth1 + 1) + ".DevEui" , deviceInfos.get(depth1).getDevEui());
			}
		}	
	}

	public static class DeviceInfo {

		private String pinCode;

		private String devEui;

		public String getPinCode() {
			return this.pinCode;
		}

		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}

		public String getDevEui() {
			return this.devEui;
		}

		public void setDevEui(String devEui) {
			this.devEui = devEui;
		}
	}

	@Override
	public Class<CreateLoRaNodesTaskResponse> getResponseClass() {
		return CreateLoRaNodesTaskResponse.class;
	}

}
