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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAIDBClusterTaskMetricsRequest extends RpcAcsRequest<DescribeAIDBClusterTaskMetricsResponse> {
	   

	private String metricType;

	private String startTime;

	private Long pageNumber;

	private Long pageSize;

	private String dBClusterId;

	private String relativeDBClusterId;

	private String endTime;

	private Boolean reverse;
	public DescribeAIDBClusterTaskMetricsRequest() {
		super("polardb", "2017-08-01", "DescribeAIDBClusterTaskMetrics", "polardb");
		setProtocol(ProtocolType.HTTPS);
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
			putQueryParameter("MetricType", metricType);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getRelativeDBClusterId() {
		return this.relativeDBClusterId;
	}

	public void setRelativeDBClusterId(String relativeDBClusterId) {
		this.relativeDBClusterId = relativeDBClusterId;
		if(relativeDBClusterId != null){
			putQueryParameter("RelativeDBClusterId", relativeDBClusterId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	@Override
	public Class<DescribeAIDBClusterTaskMetricsResponse> getResponseClass() {
		return DescribeAIDBClusterTaskMetricsResponse.class;
	}

}
