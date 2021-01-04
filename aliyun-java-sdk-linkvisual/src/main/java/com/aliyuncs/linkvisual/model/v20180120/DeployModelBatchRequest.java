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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployModelBatchRequest extends RpcAcsRequest<DeployModelBatchResponse> {
	   

	private Long modelId;

	private List<DeviceList> deviceLists;
	public DeployModelBatchRequest() {
		super("Linkvisual", "2018-01-20", "DeployModelBatch", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getModelId() {
		return this.modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId.toString());
		}
	}

	public List<DeviceList> getDeviceLists() {
		return this.deviceLists;
	}

	public void setDeviceLists(List<DeviceList> deviceLists) {
		this.deviceLists = deviceLists;	
		if (deviceLists != null) {
			for (int depth1 = 0; depth1 < deviceLists.size(); depth1++) {
				putQueryParameter("DeviceList." + (depth1 + 1) + ".IotId" , deviceLists.get(depth1).getIotId());
				putQueryParameter("DeviceList." + (depth1 + 1) + ".DeviceName" , deviceLists.get(depth1).getDeviceName());
				putQueryParameter("DeviceList." + (depth1 + 1) + ".ProductKey" , deviceLists.get(depth1).getProductKey());
			}
		}	
	}

	public static class DeviceList {

		private String iotId;

		private String deviceName;

		private String productKey;

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

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
	public Class<DeployModelBatchResponse> getResponseClass() {
		return DeployModelBatchResponse.class;
	}

}
