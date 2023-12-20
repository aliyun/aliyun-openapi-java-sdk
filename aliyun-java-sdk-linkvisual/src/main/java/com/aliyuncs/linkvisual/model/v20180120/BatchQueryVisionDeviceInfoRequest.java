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
public class BatchQueryVisionDeviceInfoRequest extends RpcAcsRequest<BatchQueryVisionDeviceInfoResponse> {
	   

	private List<String> deviceNameLists;

	private String iotInstanceId;

	private List<String> iotIdLists;

	private String productKey;
	public BatchQueryVisionDeviceInfoRequest() {
		super("Linkvisual", "2018-01-20", "BatchQueryVisionDeviceInfo", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDeviceNameLists() {
		return this.deviceNameLists;
	}

	public void setDeviceNameLists(List<String> deviceNameLists) {
		this.deviceNameLists = deviceNameLists;	
		if (deviceNameLists != null) {
			for (int i = 0; i < deviceNameLists.size(); i++) {
				putQueryParameter("DeviceNameList." + (i + 1) , deviceNameLists.get(i));
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

	public List<String> getIotIdLists() {
		return this.iotIdLists;
	}

	public void setIotIdLists(List<String> iotIdLists) {
		this.iotIdLists = iotIdLists;	
		if (iotIdLists != null) {
			for (int i = 0; i < iotIdLists.size(); i++) {
				putQueryParameter("IotIdList." + (i + 1) , iotIdLists.get(i));
			}
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

	@Override
	public Class<BatchQueryVisionDeviceInfoResponse> getResponseClass() {
		return BatchQueryVisionDeviceInfoResponse.class;
	}

}
