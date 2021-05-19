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
public class QueryMqttTraceMessagePublishRequest extends RpcAcsRequest<QueryMqttTraceMessagePublishResponse> {
	   

	private String msgId;

	private String onsRegionId;

	private Long from;

	private Long to;

	private String mqttInstanceId;

	private String onsSessionId;
	public QueryMqttTraceMessagePublishRequest() {
		super("OnsMqtt", "2020-04-20", "QueryMqttTraceMessagePublish");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
		if(msgId != null){
			putQueryParameter("MsgId", msgId);
		}
	}

	public String getOnsRegionId() {
		return this.onsRegionId;
	}

	public void setOnsRegionId(String onsRegionId) {
		this.onsRegionId = onsRegionId;
		if(onsRegionId != null){
			putQueryParameter("OnsRegionId", onsRegionId);
		}
	}

	public Long getFrom() {
		return this.from;
	}

	public void setFrom(Long from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from.toString());
		}
	}

	public Long getTo() {
		return this.to;
	}

	public void setTo(Long to) {
		this.to = to;
		if(to != null){
			putQueryParameter("To", to.toString());
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

	public String getOnsSessionId() {
		return this.onsSessionId;
	}

	public void setOnsSessionId(String onsSessionId) {
		this.onsSessionId = onsSessionId;
		if(onsSessionId != null){
			putQueryParameter("OnsSessionId", onsSessionId);
		}
	}

	@Override
	public Class<QueryMqttTraceMessagePublishResponse> getResponseClass() {
		return QueryMqttTraceMessagePublishResponse.class;
	}

}
