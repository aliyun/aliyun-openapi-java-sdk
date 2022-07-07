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
public class RegisterCaCertificateRequest extends RpcAcsRequest<RegisterCaCertificateResponse> {
	   

	private String verificationContent;

	private String caName;

	private String caContent;

	private String mqttInstanceId;
	public RegisterCaCertificateRequest() {
		super("OnsMqtt", "2020-04-20", "RegisterCaCertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVerificationContent() {
		return this.verificationContent;
	}

	public void setVerificationContent(String verificationContent) {
		this.verificationContent = verificationContent;
		if(verificationContent != null){
			putQueryParameter("VerificationContent", verificationContent);
		}
	}

	public String getCaName() {
		return this.caName;
	}

	public void setCaName(String caName) {
		this.caName = caName;
		if(caName != null){
			putQueryParameter("CaName", caName);
		}
	}

	public String getCaContent() {
		return this.caContent;
	}

	public void setCaContent(String caContent) {
		this.caContent = caContent;
		if(caContent != null){
			putQueryParameter("CaContent", caContent);
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
	public Class<RegisterCaCertificateResponse> getResponseClass() {
		return RegisterCaCertificateResponse.class;
	}

}
