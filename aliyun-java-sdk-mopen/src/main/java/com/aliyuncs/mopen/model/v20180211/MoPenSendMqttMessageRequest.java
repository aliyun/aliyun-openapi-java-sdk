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

package com.aliyuncs.mopen.model.v20180211;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MoPenSendMqttMessageRequest extends RpcAcsRequest<MoPenSendMqttMessageResponse> {
	
	public MoPenSendMqttMessageRequest() {
		super("MoPen", "2018-02-11", "MoPenSendMqttMessage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String payload;

	private String deviceName;

	public String getPayload() {
		return this.payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
		if(payload != null){
			putBodyParameter("Payload", payload);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putBodyParameter("DeviceName", deviceName);
		}
	}

	@Override
	public Class<MoPenSendMqttMessageResponse> getResponseClass() {
		return MoPenSendMqttMessageResponse.class;
	}

}
