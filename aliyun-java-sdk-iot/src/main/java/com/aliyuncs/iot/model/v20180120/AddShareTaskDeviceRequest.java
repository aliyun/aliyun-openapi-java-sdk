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
public class AddShareTaskDeviceRequest extends RpcAcsRequest<AddShareTaskDeviceResponse> {
	   

	private String iotInstanceId;

	private List<String> iotIdLists;

	private String shareTaskId;

	private String productKey;
	public AddShareTaskDeviceRequest() {
		super("Iot", "2018-01-20", "AddShareTaskDevice");
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
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public List<String> getIotIdLists() {
		return this.iotIdLists;
	}

	public void setIotIdLists(List<String> iotIdLists) {
		this.iotIdLists = iotIdLists;	
		if (iotIdLists != null) {
			for (int i = 0; i < iotIdLists.size(); i++) {
				putBodyParameter("IotIdList." + (i + 1) , iotIdLists.get(i));
			}
		}	
	}

	public String getShareTaskId() {
		return this.shareTaskId;
	}

	public void setShareTaskId(String shareTaskId) {
		this.shareTaskId = shareTaskId;
		if(shareTaskId != null){
			putBodyParameter("ShareTaskId", shareTaskId);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putBodyParameter("ProductKey", productKey);
		}
	}

	@Override
	public Class<AddShareTaskDeviceResponse> getResponseClass() {
		return AddShareTaskDeviceResponse.class;
	}

}
