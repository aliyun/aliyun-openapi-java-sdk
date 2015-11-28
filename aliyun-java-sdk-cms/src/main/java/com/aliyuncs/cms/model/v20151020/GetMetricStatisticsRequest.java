/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20151020;

import com.aliyuncs.RpcAcsRequest;


/**
 * @author auto create
 * @version 
 */
public class GetMetricStatisticsRequest extends RpcAcsRequest<com.aliyuncs.cms.model.v20151020.GetMetricStatisticsResponse> {
	
	public GetMetricStatisticsRequest() {
		super("Cms", "2015-10-20", "GetMetricStatistics");
	}

	private String namespace;

	private String metricName;

	private String startTime;

	private String endTime;

	private String interval;

	private String dimensions;

	private Integer nextToken;

	private Integer length;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		putQueryParameter("Namespace", namespace);
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		putQueryParameter("MetricName", metricName);
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		putQueryParameter("StartTime", startTime);
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		putQueryParameter("EndTime", endTime);
	}

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		putQueryParameter("Interval", interval);
	}

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
		putQueryParameter("Dimensions", dimensions);
	}

	public Integer getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Integer nextToken) {
		this.nextToken = nextToken;
		putQueryParameter("NextToken", String.valueOf(nextToken));
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
		putQueryParameter("Length", String.valueOf(length));
	}

	@Override
	public Class<GetMetricStatisticsResponse> getResponseClass() {
		return GetMetricStatisticsResponse.class;
	}

}
