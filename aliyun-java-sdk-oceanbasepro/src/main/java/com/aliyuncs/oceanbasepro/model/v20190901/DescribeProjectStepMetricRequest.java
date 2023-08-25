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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeProjectStepMetricRequest extends RpcAcsRequest<DescribeProjectStepMetricResponse> {
	   

	private String metricType;

	private String stepName;

	private String aggregator;

	private Integer maxPointNum;

	private Long endTimestamp;

	private Long beginTimestamp;

	private String projectId;
	public DescribeProjectStepMetricRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeProjectStepMetric", "oceanbase");
		setMethod(MethodType.POST);
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
			putBodyParameter("MetricType", metricType);
		}
	}

	public String getStepName() {
		return this.stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
		if(stepName != null){
			putBodyParameter("StepName", stepName);
		}
	}

	public String getAggregator() {
		return this.aggregator;
	}

	public void setAggregator(String aggregator) {
		this.aggregator = aggregator;
		if(aggregator != null){
			putBodyParameter("Aggregator", aggregator);
		}
	}

	public Integer getMaxPointNum() {
		return this.maxPointNum;
	}

	public void setMaxPointNum(Integer maxPointNum) {
		this.maxPointNum = maxPointNum;
		if(maxPointNum != null){
			putBodyParameter("MaxPointNum", maxPointNum.toString());
		}
	}

	public Long getEndTimestamp() {
		return this.endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		if(endTimestamp != null){
			putBodyParameter("EndTimestamp", endTimestamp.toString());
		}
	}

	public Long getBeginTimestamp() {
		return this.beginTimestamp;
	}

	public void setBeginTimestamp(Long beginTimestamp) {
		this.beginTimestamp = beginTimestamp;
		if(beginTimestamp != null){
			putBodyParameter("BeginTimestamp", beginTimestamp.toString());
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<DescribeProjectStepMetricResponse> getResponseClass() {
		return DescribeProjectStepMetricResponse.class;
	}

}
