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
public class BruteforceLogRequest extends RpcAcsRequest<BruteforceLogResponse> {
	
	public BruteforceLogRequest() {
		super("Yundun", "2015-04-16", "BruteforceLog");
	}

	private Long jstOwnerId;

	private Integer pageNumber;

	private Integer pageSize;

	private String instanceId;

	private Integer recordType;

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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public Integer getRecordType() {
		return this.recordType;
	}

	public void setRecordType(Integer recordType) {
		this.recordType = recordType;
		putQueryParameter("RecordType", String.valueOf(recordType));
	}

	@Override
	public Class<BruteforceLogResponse> getResponseClass() {
		return BruteforceLogResponse.class;
	}

}
