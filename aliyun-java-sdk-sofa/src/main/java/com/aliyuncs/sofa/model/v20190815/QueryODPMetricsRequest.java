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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryODPMetricsRequest extends RpcAcsRequest<QueryODPMetricsResponse> {
	   

	private String metricsQueryJsonStr;

	private String zdalproxyInstanceId;

	private String instanceId;

	private String metricsType;
	public QueryODPMetricsRequest() {
		super("SOFA", "2019-08-15", "QueryODPMetrics", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMetricsQueryJsonStr() {
		return this.metricsQueryJsonStr;
	}

	public void setMetricsQueryJsonStr(String metricsQueryJsonStr) {
		this.metricsQueryJsonStr = metricsQueryJsonStr;
		if(metricsQueryJsonStr != null){
			putBodyParameter("MetricsQueryJsonStr", metricsQueryJsonStr);
		}
	}

	public String getZdalproxyInstanceId() {
		return this.zdalproxyInstanceId;
	}

	public void setZdalproxyInstanceId(String zdalproxyInstanceId) {
		this.zdalproxyInstanceId = zdalproxyInstanceId;
		if(zdalproxyInstanceId != null){
			putBodyParameter("ZdalproxyInstanceId", zdalproxyInstanceId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getMetricsType() {
		return this.metricsType;
	}

	public void setMetricsType(String metricsType) {
		this.metricsType = metricsType;
		if(metricsType != null){
			putBodyParameter("MetricsType", metricsType);
		}
	}

	@Override
	public Class<QueryODPMetricsResponse> getResponseClass() {
		return QueryODPMetricsResponse.class;
	}

}
