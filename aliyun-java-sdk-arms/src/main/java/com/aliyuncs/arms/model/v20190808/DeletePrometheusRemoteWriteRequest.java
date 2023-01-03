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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeletePrometheusRemoteWriteRequest extends RpcAcsRequest<DeletePrometheusRemoteWriteResponse> {
	   

	private String remoteWriteNames;

	private String clusterId;
	public DeletePrometheusRemoteWriteRequest() {
		super("ARMS", "2019-08-08", "DeletePrometheusRemoteWrite", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRemoteWriteNames() {
		return this.remoteWriteNames;
	}

	public void setRemoteWriteNames(String remoteWriteNames) {
		this.remoteWriteNames = remoteWriteNames;
		if(remoteWriteNames != null){
			putQueryParameter("RemoteWriteNames", remoteWriteNames);
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
	public Class<DeletePrometheusRemoteWriteResponse> getResponseClass() {
		return DeletePrometheusRemoteWriteResponse.class;
	}

}
