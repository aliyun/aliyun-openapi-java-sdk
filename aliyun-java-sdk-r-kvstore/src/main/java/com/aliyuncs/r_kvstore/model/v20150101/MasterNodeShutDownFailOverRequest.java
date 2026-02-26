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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.r_kvstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MasterNodeShutDownFailOverRequest extends RpcAcsRequest<MasterNodeShutDownFailOverResponse> {
	   

	private String failMode;

	private String proxyFaultMode;

	private String proxyInstanceIds;

	private String dBNodes;

	private String dBFaultMode;

	private String instanceId;

	private String category;
	public MasterNodeShutDownFailOverRequest() {
		super("R-kvstore", "2015-01-01", "MasterNodeShutDownFailOver", "redisa");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFailMode() {
		return this.failMode;
	}

	public void setFailMode(String failMode) {
		this.failMode = failMode;
		if(failMode != null){
			putQueryParameter("FailMode", failMode);
		}
	}

	public String getProxyFaultMode() {
		return this.proxyFaultMode;
	}

	public void setProxyFaultMode(String proxyFaultMode) {
		this.proxyFaultMode = proxyFaultMode;
		if(proxyFaultMode != null){
			putQueryParameter("ProxyFaultMode", proxyFaultMode);
		}
	}

	public String getProxyInstanceIds() {
		return this.proxyInstanceIds;
	}

	public void setProxyInstanceIds(String proxyInstanceIds) {
		this.proxyInstanceIds = proxyInstanceIds;
		if(proxyInstanceIds != null){
			putQueryParameter("ProxyInstanceIds", proxyInstanceIds);
		}
	}

	public String getDBNodes() {
		return this.dBNodes;
	}

	public void setDBNodes(String dBNodes) {
		this.dBNodes = dBNodes;
		if(dBNodes != null){
			putQueryParameter("DBNodes", dBNodes);
		}
	}

	public String getDBFaultMode() {
		return this.dBFaultMode;
	}

	public void setDBFaultMode(String dBFaultMode) {
		this.dBFaultMode = dBFaultMode;
		if(dBFaultMode != null){
			putQueryParameter("DBFaultMode", dBFaultMode);
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

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	@Override
	public Class<MasterNodeShutDownFailOverResponse> getResponseClass() {
		return MasterNodeShutDownFailOverResponse.class;
	}

}
