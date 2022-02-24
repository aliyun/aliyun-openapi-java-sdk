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

package com.aliyuncs.eas.model.v20171023;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeStressRequest extends RoaAcsRequest<DescribeStressResponse> {
	   

	private String cluster_id;

	private String stress_name;
	public DescribeStressRequest() {
		super("eas", "2017-10-23", "DescribeStress", "pai");
		setUriPattern("/api/stress/[cluster_id]/[stress_name]");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
		if(cluster_id != null){
			putPathParameter("cluster_id", cluster_id);
		}
	}

	public String getStress_name() {
		return this.stress_name;
	}

	public void setStress_name(String stress_name) {
		this.stress_name = stress_name;
		if(stress_name != null){
			putPathParameter("stress_name", stress_name);
		}
	}

	@Override
	public Class<DescribeStressResponse> getResponseClass() {
		return DescribeStressResponse.class;
	}

}
