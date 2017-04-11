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
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryMetricLastRequest extends RpcAcsRequest<QueryMetricLastResponse> {
	
	public QueryMetricLastRequest() {
		super("Cms", "2017-03-01", "QueryMetricLast", "cms");
	}

	private Long resourceOwnerId;

	private String callby_cms_owner;

	private String project;

	private String metric;

	private String period;

	private String startTime;

	private String endTime;

	private String dimensions;

	private String cursor;

	private String page;

	private String length;

	private String express;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getcallby_cms_owner() {
		return this.callby_cms_owner;
	}

	public void setcallby_cms_owner(String callby_cms_owner) {
		this.callby_cms_owner = callby_cms_owner;
		putQueryParameter("callby_cms_owner", callby_cms_owner);
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		putQueryParameter("Project", project);
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
		putQueryParameter("Metric", metric);
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		putQueryParameter("Period", period);
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

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
		putQueryParameter("Dimensions", dimensions);
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
		putQueryParameter("Cursor", cursor);
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		putQueryParameter("Page", page);
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
		putQueryParameter("Length", length);
	}

	public String getExpress() {
		return this.express;
	}

	public void setExpress(String express) {
		this.express = express;
		putQueryParameter("Express", express);
	}

	@Override
	public Class<QueryMetricLastResponse> getResponseClass() {
		return QueryMetricLastResponse.class;
	}

}
