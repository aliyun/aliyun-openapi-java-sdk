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

/**
 * @author auto create
 * @version 
 */
public class GetDeviceShadowRequest extends RpcAcsRequest<GetDeviceShadowResponse> {
	
	public GetDeviceShadowRequest() {
		super("Iot", "2018-01-20", "GetDeviceShadow");
	}

	private String shadowMessage;

	private String iotInstanceId;

	private String deviceName;

	private String productKey;

	public String getShadowMessage() {
		return this.shadowMessage;
	}

	public void setShadowMessage(String shadowMessage) {
		this.shadowMessage = shadowMessage;
		if(shadowMessage != null){
			putQueryParameter("ShadowMessage", shadowMessage);
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

	@Override
	public Class<GetDeviceShadowResponse> getResponseClass() {
		return GetDeviceShadowResponse.class;
	}

}
