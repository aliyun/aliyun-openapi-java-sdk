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

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InstanceLifecycleApiRequest extends RpcAcsRequest<InstanceLifecycleApiResponse> {
	
	public InstanceLifecycleApiRequest() {
		super("Phoenixsp-inner", "2016-08-05", "InstanceLifecycleApi");
	}

	private String eventResult;

	private String async;

	private String instanceIds;

	private String orderId;

	private Boolean success;

	private String extraData;

	private String eventType;

	private Long eventTime;

	private Long aliUid;

	private String resourceType;

	private String eventSource;

	private String token;

	public String getEventResult() {
		return this.eventResult;
	}

	public void setEventResult(String eventResult) {
		this.eventResult = eventResult;
		if(eventResult != null){
			putQueryParameter("EventResult", eventResult);
		}
	}

	public String getAsync() {
		return this.async;
	}

	public void setAsync(String async) {
		this.async = async;
		if(async != null){
			putQueryParameter("Async", async);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
		}
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
		if(success != null){
			putQueryParameter("Success", success.toString());
		}
	}

	public String getExtraData() {
		return this.extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
		if(extraData != null){
			putQueryParameter("ExtraData", extraData);
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	public Long getEventTime() {
		return this.eventTime;
	}

	public void setEventTime(Long eventTime) {
		this.eventTime = eventTime;
		if(eventTime != null){
			putQueryParameter("EventTime", eventTime.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getEventSource() {
		return this.eventSource;
	}

	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
		if(eventSource != null){
			putQueryParameter("EventSource", eventSource);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	@Override
	public Class<InstanceLifecycleApiResponse> getResponseClass() {
		return InstanceLifecycleApiResponse.class;
	}

}
