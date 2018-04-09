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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryMetricDataRequest extends RpcAcsRequest<QueryMetricDataResponse> {
	
	public QueryMetricDataRequest() {
		super("Emr", "2016-04-08", "QueryMetricData");
	}

	private Long resourceOwnerId;

	private Long period;

	private String clusterId;

	private Long startTimeStamp;

	private String metricName;

	private String hostRole;

	private Long endTimeStamp;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Long getPeriod() {
		return this.period;
	}

	public void setPeriod(Long period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
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

	public Long getStartTimeStamp() {
		return this.startTimeStamp;
	}

	public void setStartTimeStamp(Long startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
		if(startTimeStamp != null){
			putQueryParameter("StartTimeStamp", startTimeStamp.toString());
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public String getHostRole() {
		return this.hostRole;
	}

	public void setHostRole(String hostRole) {
		this.hostRole = hostRole;
		if(hostRole != null){
			putQueryParameter("HostRole", hostRole);
		}
	}

	public Long getEndTimeStamp() {
		return this.endTimeStamp;
	}

	public void setEndTimeStamp(Long endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
		if(endTimeStamp != null){
			putQueryParameter("EndTimeStamp", endTimeStamp.toString());
		}
	}

	@Override
	public Class<QueryMetricDataResponse> getResponseClass() {
		return QueryMetricDataResponse.class;
	}

}
