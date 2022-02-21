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
public class BatchCheckDeviceNamesRequest extends RpcAcsRequest<BatchCheckDeviceNamesResponse> {
	   

	private List<DeviceNameList> deviceNameLists;

	private String iotInstanceId;

	private String productKey;

	private List<String> deviceNames;
	public BatchCheckDeviceNamesRequest() {
		super("Iot", "2018-01-20", "BatchCheckDeviceNames");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DeviceNameList> getDeviceNameLists() {
		return this.deviceNameLists;
	}

	public void setDeviceNameLists(List<DeviceNameList> deviceNameLists) {
		this.deviceNameLists = deviceNameLists;	
		if (deviceNameLists != null) {
			for (int depth1 = 0; depth1 < deviceNameLists.size(); depth1++) {
				putQueryParameter("DeviceNameList." + (depth1 + 1) + ".DeviceNickname" , deviceNameLists.get(depth1).getDeviceNickname());
				putQueryParameter("DeviceNameList." + (depth1 + 1) + ".DeviceName" , deviceNameLists.get(depth1).getDeviceName());
			}
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

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public List<String> getDeviceNames() {
		return this.deviceNames;
	}

	public void setDeviceNames(List<String> deviceNames) {
		this.deviceNames = deviceNames;	
		if (deviceNames != null) {
			for (int i = 0; i < deviceNames.size(); i++) {
				putQueryParameter("DeviceName." + (i + 1) , deviceNames.get(i));
			}
		}	
	}

	public static class DeviceNameList {

		private String deviceNickname;

		private String deviceName;

		public String getDeviceNickname() {
			return this.deviceNickname;
		}

		public void setDeviceNickname(String deviceNickname) {
			this.deviceNickname = deviceNickname;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}
	}

	@Override
	public Class<BatchCheckDeviceNamesResponse> getResponseClass() {
		return BatchCheckDeviceNamesResponse.class;
	}

}
