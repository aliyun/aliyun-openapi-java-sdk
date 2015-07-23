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
package com.aliyuncs.yundun.model.v20150416;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceInfosRequest extends RpcAcsRequest<ListInstanceInfosResponse> {
	
	public ListInstanceInfosRequest() {
		super("Yundun", "2015-04-16", "ListInstanceInfos");
	}

	private Long jstOwnerId;

	private Integer pageNumber;

	private Integer pageSize;

	private String region;

	private String eventType;

	private String instanceName;

	private String instanceType;

	private String instanceIds;

	public Long getJstOwnerId() {
		return this.jstOwnerId;
	}

	public void setJstOwnerId(Long jstOwnerId) {
		this.jstOwnerId = jstOwnerId;
		putQueryParameter("JstOwnerId", String.valueOf(jstOwnerId));
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", String.valueOf(pageNumber));
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", String.valueOf(pageSize));
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		putQueryParameter("Region", region);
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		putQueryParameter("EventType", eventType);
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		putQueryParameter("InstanceName", instanceName);
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		putQueryParameter("InstanceType", instanceType);
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		putQueryParameter("InstanceIds", instanceIds);
	}

	@Override
	public Class<ListInstanceInfosResponse> getResponseClass() {
		return ListInstanceInfosResponse.class;
	}

}
