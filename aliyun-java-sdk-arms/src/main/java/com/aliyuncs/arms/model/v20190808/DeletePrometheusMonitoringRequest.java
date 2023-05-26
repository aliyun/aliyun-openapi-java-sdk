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
public class DeletePrometheusMonitoringRequest extends RpcAcsRequest<DeletePrometheusMonitoringResponse> {
	   

	private String clusterId;

	private String type;

	private String monitoringName;
	public DeletePrometheusMonitoringRequest() {
		super("ARMS", "2019-08-08", "DeletePrometheusMonitoring", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getMonitoringName() {
		return this.monitoringName;
	}

	public void setMonitoringName(String monitoringName) {
		this.monitoringName = monitoringName;
		if(monitoringName != null){
			putQueryParameter("MonitoringName", monitoringName);
		}
	}

	@Override
	public Class<DeletePrometheusMonitoringResponse> getResponseClass() {
		return DeletePrometheusMonitoringResponse.class;
	}

}
