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
		super("Cdn", "2014-11-11", "DescribeRangeDataByLocateAndIspService", "None");
	}

	private String ispNames;

	private String securityToken;

	private String domainNames;

	private String locationNames;

	private String endTime;

	private String startTime;

	private Long ownerId;

	public String getIspNames() {
		return this.ispNames;
	}

	public void setIspNames(String ispNames) {
		this.ispNames = ispNames;
		if(ispNames != null){
			putQueryParameter("IspNames", ispNames);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(String domainNames) {
		this.domainNames = domainNames;
		if(domainNames != null){
			putQueryParameter("DomainNames", domainNames);
		}
	}

	public String getLocationNames() {
		return this.locationNames;
	}

	public void setLocationNames(String locationNames) {
		this.locationNames = locationNames;
		if(locationNames != null){
			putQueryParameter("LocationNames", locationNames);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<DescribeRangeDataByLocateAndIspServiceResponse> getResponseClass() {
		return DescribeRangeDataByLocateAndIspServiceResponse.class;
	}

}
