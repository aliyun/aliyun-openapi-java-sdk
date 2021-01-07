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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OfflineFilteringAlgorithmRequest extends RoaAcsRequest<OfflineFilteringAlgorithmResponse> {
	   

	private String instanceId;

	private String algorithmId;
	public OfflineFilteringAlgorithmRequest() {
		super("Airec", "2020-11-26", "OfflineFilteringAlgorithm", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/filtering-algorithms/[algorithmId]/actions/offline");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getAlgorithmId() {
		return this.algorithmId;
	}

	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
		if(algorithmId != null){
			putPathParameter("algorithmId", algorithmId);
		}
	}

	@Override
	public Class<OfflineFilteringAlgorithmResponse> getResponseClass() {
		return OfflineFilteringAlgorithmResponse.class;
	}

}
