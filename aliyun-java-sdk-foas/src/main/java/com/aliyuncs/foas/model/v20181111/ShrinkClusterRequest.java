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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ShrinkClusterRequest extends RoaAcsRequest<ShrinkClusterResponse> {
	   

	private String instanceIds;

	private String clusterId;

	private String modelTargetCount;
	public ShrinkClusterRequest() {
		super("foas", "2018-11-11", "ShrinkCluster", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/clusters/[clusterId]/shrink");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putBodyParameter("instanceIds", instanceIds);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("clusterId", clusterId);
		}
	}

	public String getModelTargetCount() {
		return this.modelTargetCount;
	}

	public void setModelTargetCount(String modelTargetCount) {
		this.modelTargetCount = modelTargetCount;
		if(modelTargetCount != null){
			putBodyParameter("modelTargetCount", modelTargetCount);
		}
	}

	@Override
	public Class<ShrinkClusterResponse> getResponseClass() {
		return ShrinkClusterResponse.class;
	}

}
