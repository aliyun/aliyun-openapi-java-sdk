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
public class ListCaCertificateRequest extends RpcAcsRequest<ListCaCertificateResponse> {
	   

	private String pageNo;

	private String pageSize;

	private String mqttInstanceId;
	public ListCaCertificateRequest() {
		super("OnsMqtt", "2020-04-20", "ListCaCertificate");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
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
	public Class<ListCaCertificateResponse> getResponseClass() {
		return ListCaCertificateResponse.class;
	}

}
