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
public class BatchAddDeviceGroupRelationsRequest extends RpcAcsRequest<BatchAddDeviceGroupRelationsResponse> {
	   

	private String iotInstanceId;

	private String groupId;

	private List<Device> devices;
	public BatchAddDeviceGroupRelationsRequest() {
		super("Iot", "2018-01-20", "BatchAddDeviceGroupRelations", "iot");
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public List<Device> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;	
		if (devices != null) {
			for (int depth1 = 0; depth1 < devices.size(); depth1++) {
				putQueryParameter("Device." + (depth1 + 1) + ".DeviceName" , devices.get(depth1).getDeviceName());
				putQueryParameter("Device." + (depth1 + 1) + ".ProductKey" , devices.get(depth1).getProductKey());
			}
		}	
	}

	public static class Device {

		private String deviceName;

		private String productKey;

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}
	}

	@Override
	public Class<BatchAddDeviceGroupRelationsResponse> getResponseClass() {
		return BatchAddDeviceGroupRelationsResponse.class;
	}

}
