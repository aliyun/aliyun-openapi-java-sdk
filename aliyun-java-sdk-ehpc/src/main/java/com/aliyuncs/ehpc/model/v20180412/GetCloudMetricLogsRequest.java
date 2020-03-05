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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCloudMetricLogsRequest extends RpcAcsRequest<GetCloudMetricLogsResponse> {
	   

	private String metricScope;

	private String clusterId;

	private Integer aggregationInterval;

	private Boolean reverse;

	private String aggregationType;

	private String filter;

	private String metricCategories;

	private Integer from;

	private Integer to;
	public GetCloudMetricLogsRequest() {
		super("EHPC", "2018-04-12", "GetCloudMetricLogs", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMetricScope() {
		return this.metricScope;
	}

	public void setMetricScope(String metricScope) {
		this.metricScope = metricScope;
		if(metricScope != null){
			putQueryParameter("MetricScope", metricScope);
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

	public Integer getAggregationInterval() {
		return this.aggregationInterval;
	}

	public void setAggregationInterval(Integer aggregationInterval) {
		this.aggregationInterval = aggregationInterval;
		if(aggregationInterval != null){
			putQueryParameter("AggregationInterval", aggregationInterval.toString());
		}
	}

	public Boolean getReverse() {
		return this.reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
		if(reverse != null){
			putQueryParameter("Reverse", reverse.toString());
		}
	}

	public String getAggregationType() {
		return this.aggregationType;
	}

	public void setAggregationType(String aggregationType) {
		this.aggregationType = aggregationType;
		if(aggregationType != null){
			putQueryParameter("AggregationType", aggregationType);
		}
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putQueryParameter("Filter", filter);
		}
	}

	public String getMetricCategories() {
		return this.metricCategories;
	}

	public void setMetricCategories(String metricCategories) {
		this.metricCategories = metricCategories;
		if(metricCategories != null){
			putQueryParameter("MetricCategories", metricCategories);
		}
	}

	public Integer getFrom() {
		return this.from;
	}

	public void setFrom(Integer from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from.toString());
		}
	}

	public Integer getTo() {
		return this.to;
	}

	public void setTo(Integer to) {
		this.to = to;
		if(to != null){
			putQueryParameter("To", to.toString());
		}
	}

	@Override
	public Class<GetCloudMetricLogsResponse> getResponseClass() {
		return GetCloudMetricLogsResponse.class;
	}

}
