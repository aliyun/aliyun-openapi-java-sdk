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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.elasticsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ShrinkNodeRequest extends RoaAcsRequest<ShrinkNodeResponse> {
	   

	private Boolean ignoreStatus;

	private String instanceId;

	private String nodeType;

	private String clientToken;

	private Integer count;

	private String body;
	public ShrinkNodeRequest() {
		super("elasticsearch", "2017-06-13", "ShrinkNode", "elasticsearch");
		setUriPattern("/openapi/instances/[InstanceId]/actions/shrink");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIgnoreStatus() {
		return this.ignoreStatus;
	}

	public void setIgnoreStatus(Boolean ignoreStatus) {
		this.ignoreStatus = ignoreStatus;
		if(ignoreStatus != null){
			putQueryParameter("ignoreStatus", ignoreStatus.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
		if(nodeType != null){
			putQueryParameter("nodeType", nodeType);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("clientToken", clientToken);
		}
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putQueryParameter("count", count.toString());
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	@Override
	public Class<ShrinkNodeResponse> getResponseClass() {
		return ShrinkNodeResponse.class;
	}

}
