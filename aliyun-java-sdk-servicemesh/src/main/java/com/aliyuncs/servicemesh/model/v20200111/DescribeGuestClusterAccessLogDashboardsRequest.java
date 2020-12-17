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

package com.aliyuncs.servicemesh.model.v20200111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.servicemesh.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeGuestClusterAccessLogDashboardsRequest extends RpcAcsRequest<DescribeGuestClusterAccessLogDashboardsResponse> {
	   

	private String k8sClusterId;
	public DescribeGuestClusterAccessLogDashboardsRequest() {
		super("servicemesh", "2020-01-11", "DescribeGuestClusterAccessLogDashboards", "servicemesh");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getK8sClusterId() {
		return this.k8sClusterId;
	}

	public void setK8sClusterId(String k8sClusterId) {
		this.k8sClusterId = k8sClusterId;
		if(k8sClusterId != null){
			putBodyParameter("K8sClusterId", k8sClusterId);
		}
	}

	@Override
	public Class<DescribeGuestClusterAccessLogDashboardsResponse> getResponseClass() {
		return DescribeGuestClusterAccessLogDashboardsResponse.class;
	}

}
