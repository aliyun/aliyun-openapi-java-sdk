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
public class QueryCustomAuthPermissionRequest extends RpcAcsRequest<QueryCustomAuthPermissionResponse> {
	   

	private String identityType;

	private String instanceId;

	private Integer size;

	private String nextToken;

	private String identity;

	private String topic;
	public QueryCustomAuthPermissionRequest() {
		super("OnsMqtt", "2020-04-20", "QueryCustomAuthPermission", "onsmqtt");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIdentityType() {
		return this.identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
		if(identityType != null){
			putQueryParameter("IdentityType", identityType);
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

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getIdentity() {
		return this.identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
		if(identity != null){
			putQueryParameter("Identity", identity);
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
		}
	}

	@Override
	public Class<QueryCustomAuthPermissionResponse> getResponseClass() {
		return QueryCustomAuthPermissionResponse.class;
	}

}
