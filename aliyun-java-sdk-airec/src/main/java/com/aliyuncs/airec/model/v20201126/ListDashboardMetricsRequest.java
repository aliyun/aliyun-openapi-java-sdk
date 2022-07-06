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
public class ListDashboardMetricsRequest extends RoaAcsRequest<ListDashboardMetricsResponse> {
	   

	private String metricType;

	private String instanceId;

	private String metricQuery;

	private Integer endTime;

	private Integer startTime;

	private String metricView;
	public ListDashboardMetricsRequest() {
		super("Airec", "2020-11-26", "ListDashboardMetrics", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/dashboard/metrics");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
		if(metricType != null){
			putQueryParameter("metricType", metricType);
		}
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

	public String getMetricQuery() {
		return this.metricQuery;
	}

	public void setMetricQuery(String metricQuery) {
		this.metricQuery = metricQuery;
		if(metricQuery != null){
			putQueryParameter("metricQuery", metricQuery);
		}
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("endTime", endTime.toString());
		}
	}

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public String getMetricView() {
		return this.metricView;
	}

	public void setMetricView(String metricView) {
		this.metricView = metricView;
		if(metricView != null){
			putQueryParameter("metricView", metricView);
		}
	}

	@Override
	public Class<ListDashboardMetricsResponse> getResponseClass() {
		return ListDashboardMetricsResponse.class;
	}

}
