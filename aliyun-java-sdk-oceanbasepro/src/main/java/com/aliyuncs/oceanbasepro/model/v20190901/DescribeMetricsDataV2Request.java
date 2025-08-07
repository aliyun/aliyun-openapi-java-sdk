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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricsDataV2Request extends RpcAcsRequest<DescribeMetricsDataV2Response> {
	   

	private String groupByLabels;

	private String startTime;

	private String limit;

	private String sortOrder;

	private String sortMetricKey;

	private String replicaType;

	private String endTime;

	private String labels;

	private String instanceId;

	private String metrics;
	public DescribeMetricsDataV2Request() {
		super("OceanBasePro", "2019-09-01", "DescribeMetricsDataV2", "oceanbase");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGroupByLabels() {
		return this.groupByLabels;
	}

	public void setGroupByLabels(String groupByLabels) {
		this.groupByLabels = groupByLabels;
		if(groupByLabels != null){
			putBodyParameter("GroupByLabels", groupByLabels);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public String getLimit() {
		return this.limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit);
		}
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putBodyParameter("SortOrder", sortOrder);
		}
	}

	public String getSortMetricKey() {
		return this.sortMetricKey;
	}

	public void setSortMetricKey(String sortMetricKey) {
		this.sortMetricKey = sortMetricKey;
		if(sortMetricKey != null){
			putBodyParameter("SortMetricKey", sortMetricKey);
		}
	}

	public String getReplicaType() {
		return this.replicaType;
	}

	public void setReplicaType(String replicaType) {
		this.replicaType = replicaType;
		if(replicaType != null){
			putBodyParameter("ReplicaType", replicaType);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putBodyParameter("Labels", labels);
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

	public String getMetrics() {
		return this.metrics;
	}

	public void setMetrics(String metrics) {
		this.metrics = metrics;
		if(metrics != null){
			putBodyParameter("Metrics", metrics);
		}
	}

	@Override
	public Class<DescribeMetricsDataV2Response> getResponseClass() {
		return DescribeMetricsDataV2Response.class;
	}

}
