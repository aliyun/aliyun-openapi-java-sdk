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
public class QueryServiceMetricDataRequest extends RpcAcsRequest<QueryServiceMetricDataResponse> {
	
	public QueryServiceMetricDataRequest() {
		super("Emr", "2016-04-08", "QueryServiceMetricData");
	}

	private Long resourceOwnerId;

	private Long period;

	private String dims;

	private String metric;

	private String project;

	private Long startTimeStamp;

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

	public String getDims() {
		return this.dims;
	}

	public void setDims(String dims) {
		this.dims = dims;
		if(dims != null){
			putQueryParameter("Dims", dims);
		}
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
		if(metric != null){
			putQueryParameter("Metric", metric);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
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
	public Class<QueryServiceMetricDataResponse> getResponseClass() {
		return QueryServiceMetricDataResponse.class;
	}

}
