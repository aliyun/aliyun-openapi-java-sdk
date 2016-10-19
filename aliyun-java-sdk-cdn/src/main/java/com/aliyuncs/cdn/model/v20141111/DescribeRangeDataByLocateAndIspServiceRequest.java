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
package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeRangeDataByLocateAndIspServiceRequest extends RpcAcsRequest<DescribeRangeDataByLocateAndIspServiceResponse> {
	
	public DescribeRangeDataByLocateAndIspServiceRequest() {
		super("Cdn", "2014-11-11", "DescribeRangeDataByLocateAndIspService");
	}

	private Long ownerId;

	private String securityToken;

	private String domainNames;

	private String locationNames;

	private String ispNames;

	private String startTime;

	private String endTime;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		putQueryParameter("SecurityToken", securityToken);
	}

	public String getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(String domainNames) {
		this.domainNames = domainNames;
		putQueryParameter("DomainNames", domainNames);
	}

	public String getLocationNames() {
		return this.locationNames;
	}

	public void setLocationNames(String locationNames) {
		this.locationNames = locationNames;
		putQueryParameter("LocationNames", locationNames);
	}

	public String getIspNames() {
		return this.ispNames;
	}

	public void setIspNames(String ispNames) {
		this.ispNames = ispNames;
		putQueryParameter("IspNames", ispNames);
	}

	public String getstartTime() {
		return this.startTime;
	}

	public void setstartTime(String startTime) {
		this.startTime = startTime;
		putQueryParameter("startTime", startTime);
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		putQueryParameter("EndTime", endTime);
	}

	@Override
	public Class<DescribeRangeDataByLocateAndIspServiceResponse> getResponseClass() {
		return DescribeRangeDataByLocateAndIspServiceResponse.class;
	}

}
