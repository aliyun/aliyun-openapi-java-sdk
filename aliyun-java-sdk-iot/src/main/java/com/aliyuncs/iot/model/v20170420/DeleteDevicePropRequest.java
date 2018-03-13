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
package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteDevicePropRequest extends RpcAcsRequest<DeleteDevicePropResponse> {
	
	public DeleteDevicePropRequest() {
		super("Iot", "2017-04-20", "DeleteDeviceProp");
	}

	private String deviceName;

	private String productKey;

	private String propKey;

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
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

	public String getPropKey() {
		return this.propKey;
	}

	public void setPropKey(String propKey) {
		this.propKey = propKey;
		if(propKey != null){
			putQueryParameter("PropKey", propKey);
		}
	}

	@Override
	public Class<DeleteDevicePropResponse> getResponseClass() {
		return DeleteDevicePropResponse.class;
	}

}
