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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckComponentsVersionRequest extends RpcAcsRequest<CheckComponentsVersionResponse> {
	   

	private String components;

	private String clusterId;
	public CheckComponentsVersionRequest() {
		super("HBase", "2019-01-01", "CheckComponentsVersion");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getComponents() {
		return this.components;
	}

	public void setComponents(String components) {
		this.components = components;
		if(components != null){
			putQueryParameter("Components", components);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<CheckComponentsVersionResponse> getResponseClass() {
		return CheckComponentsVersionResponse.class;
	}

}
