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

package com.aliyuncs.onsmqtt.model.v20200420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.onsmqtt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteDeviceCertificateRequest extends RpcAcsRequest<DeleteDeviceCertificateResponse> {
	   

	private String deviceSn;

	private String caSn;

	private String mqttInstanceId;
	public DeleteDeviceCertificateRequest() {
		super("OnsMqtt", "2020-04-20", "DeleteDeviceCertificate", "onsmqtt");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
		if(deviceSn != null){
			putQueryParameter("DeviceSn", deviceSn);
		}
	}

	public String getCaSn() {
		return this.caSn;
	}

	public void setCaSn(String caSn) {
		this.caSn = caSn;
		if(caSn != null){
			putQueryParameter("CaSn", caSn);
		}
	}

	public String getMqttInstanceId() {
		return this.mqttInstanceId;
	}

	public void setMqttInstanceId(String mqttInstanceId) {
		this.mqttInstanceId = mqttInstanceId;
		if(mqttInstanceId != null){
			putQueryParameter("MqttInstanceId", mqttInstanceId);
		}
	}

	@Override
	public Class<DeleteDeviceCertificateResponse> getResponseClass() {
		return DeleteDeviceCertificateResponse.class;
	}

}
