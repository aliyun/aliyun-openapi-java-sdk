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
public class BatchCheckVehicleDeviceRequest extends RpcAcsRequest<BatchCheckVehicleDeviceResponse> {
	   

	private String iotInstanceId;

	private String productKey;

	private List<DeviceList> deviceLists;
	public BatchCheckVehicleDeviceRequest() {
		super("Iot", "2018-01-20", "BatchCheckVehicleDevice", "iot");
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
				putQueryParameter("DeviceList." + (depth1 + 1) + ".DeviceId" , deviceLists.get(depth1).getDeviceId());
				putQueryParameter("DeviceList." + (depth1 + 1) + ".Manufacturer" , deviceLists.get(depth1).getManufacturer());
				putQueryParameter("DeviceList." + (depth1 + 1) + ".DeviceModel" , deviceLists.get(depth1).getDeviceModel());
			}
		}	
	}

	public static class DeviceList {

		private String deviceId;

		private String manufacturer;

		private String deviceModel;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getManufacturer() {
			return this.manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getDeviceModel() {
			return this.deviceModel;
		}

		public void setDeviceModel(String deviceModel) {
			this.deviceModel = deviceModel;
		}
	}

	@Override
	public Class<BatchCheckVehicleDeviceResponse> getResponseClass() {
		return BatchCheckVehicleDeviceResponse.class;
	}

}
