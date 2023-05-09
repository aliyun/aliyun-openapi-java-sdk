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
public class BatchGrayMigrationDeviceRequest extends RpcAcsRequest<BatchGrayMigrationDeviceResponse> {
	   

	private List<String> deviceNamess;

	private String productKey;
	public BatchGrayMigrationDeviceRequest() {
		super("Iot", "2018-01-20", "BatchGrayMigrationDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDeviceNamess() {
		return this.deviceNamess;
	}

	public void setDeviceNamess(List<String> deviceNamess) {
		this.deviceNamess = deviceNamess;	
		if (deviceNamess != null) {
			for (int i = 0; i < deviceNamess.size(); i++) {
				putBodyParameter("DeviceNames." + (i + 1) , deviceNamess.get(i));
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
	public Class<BatchGrayMigrationDeviceResponse> getResponseClass() {
		return BatchGrayMigrationDeviceResponse.class;
	}

}
