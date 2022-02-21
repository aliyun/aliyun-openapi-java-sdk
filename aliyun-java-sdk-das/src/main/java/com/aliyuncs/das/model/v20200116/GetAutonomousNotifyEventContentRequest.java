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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAutonomousNotifyEventContentRequest extends RpcAcsRequest<GetAutonomousNotifyEventContentResponse> {
	   

	private String __context;

	private String spanId;

	private String instanceId;
	public GetAutonomousNotifyEventContentRequest() {
		super("DAS", "2020-01-16", "GetAutonomousNotifyEventContent");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String get__Context() {
		return this.__context;
	}

	public void set__Context(String __context) {
		this.__context = __context;
		if(__context != null){
			putQueryParameter("__context", __context);
		}
	}

	public String getSpanId() {
		return this.spanId;
	}

	public void setSpanId(String spanId) {
		this.spanId = spanId;
		if(spanId != null){
			putQueryParameter("SpanId", spanId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<GetAutonomousNotifyEventContentResponse> getResponseClass() {
		return GetAutonomousNotifyEventContentResponse.class;
	}

}
