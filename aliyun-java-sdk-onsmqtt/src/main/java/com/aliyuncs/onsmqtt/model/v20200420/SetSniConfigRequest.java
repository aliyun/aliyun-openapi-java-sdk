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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.onsmqtt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetSniConfigRequest extends RpcAcsRequest<SetSniConfigResponse> {
	   

	private String defaultCertificate;

	private String mqttInstanceId;

	private String sniConfig;
	public SetSniConfigRequest() {
		super("OnsMqtt", "2020-04-20", "SetSniConfig", "onsmqtt");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDefaultCertificate() {
		return this.defaultCertificate;
	}

	public void setDefaultCertificate(String defaultCertificate) {
		this.defaultCertificate = defaultCertificate;
		if(defaultCertificate != null){
			putQueryParameter("DefaultCertificate", defaultCertificate);
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

	public String getSniConfig() {
		return this.sniConfig;
	}

	public void setSniConfig(String sniConfig) {
		this.sniConfig = sniConfig;
		if(sniConfig != null){
			putQueryParameter("SniConfig", sniConfig);
		}
	}

	@Override
	public Class<SetSniConfigResponse> getResponseClass() {
		return SetSniConfigResponse.class;
	}

}
