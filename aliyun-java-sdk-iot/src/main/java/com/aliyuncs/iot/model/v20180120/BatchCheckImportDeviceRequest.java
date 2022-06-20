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
public class BatchCheckImportDeviceRequest extends RpcAcsRequest<BatchCheckImportDeviceResponse> {
	   

	private String iotInstanceId;

	private String productKey;

	private List<DeviceList> deviceLists;
	public BatchCheckImportDeviceRequest() {
		super("Iot", "2018-01-20", "BatchCheckImportDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<DeviceList> getDeviceLists() {
		return this.deviceLists;
	}

	public void setDeviceLists(List<DeviceList> deviceLists) {
		this.deviceLists = deviceLists;	
		if (deviceLists != null) {
			for (int depth1 = 0; depth1 < deviceLists.size(); depth1++) {
				putQueryParameter("DeviceList." + (depth1 + 1) + ".DeviceSecret" , deviceLists.get(depth1).getDeviceSecret());
				putQueryParameter("DeviceList." + (depth1 + 1) + ".DeviceName" , deviceLists.get(depth1).getDeviceName());
				putQueryParameter("DeviceList." + (depth1 + 1) + ".Sn" , deviceLists.get(depth1).getSn());
			}
		}	
	}

	public static class DeviceList {

		private String deviceSecret;

		private String deviceName;

		private String sn;

		public String getDeviceSecret() {
			return this.deviceSecret;
		}

		public void setDeviceSecret(String deviceSecret) {
			this.deviceSecret = deviceSecret;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getSn() {
			return this.sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}
	}

	@Override
	public Class<BatchCheckImportDeviceResponse> getResponseClass() {
		return BatchCheckImportDeviceResponse.class;
	}

}
