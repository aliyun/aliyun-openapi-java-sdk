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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateTrafficControlRequest extends RpcAcsRequest<CreateTrafficControlResponse> {
	
	public CreateTrafficControlRequest() {
		super("CloudAPI", "2016-07-14", "CreateTrafficControl", "apigateway");
	}

	private String trafficControlName;

	private String trafficControlUnit;

	private Integer apiDefault;

	private Integer userDefault;

	private Integer appDefault;

	private String description;

	public String getTrafficControlName() {
		return this.trafficControlName;
	}

	public void setTrafficControlName(String trafficControlName) {
		this.trafficControlName = trafficControlName;
		putQueryParameter("TrafficControlName", trafficControlName);
	}

	public String getTrafficControlUnit() {
		return this.trafficControlUnit;
	}

	public void setTrafficControlUnit(String trafficControlUnit) {
		this.trafficControlUnit = trafficControlUnit;
		putQueryParameter("TrafficControlUnit", trafficControlUnit);
	}

	public Integer getApiDefault() {
		return this.apiDefault;
	}

	public void setApiDefault(Integer apiDefault) {
		this.apiDefault = apiDefault;
		putQueryParameter("ApiDefault", apiDefault);
	}

	public Integer getUserDefault() {
		return this.userDefault;
	}

	public void setUserDefault(Integer userDefault) {
		this.userDefault = userDefault;
		putQueryParameter("UserDefault", userDefault);
	}

	public Integer getAppDefault() {
		return this.appDefault;
	}

	public void setAppDefault(Integer appDefault) {
		this.appDefault = appDefault;
		putQueryParameter("AppDefault", appDefault);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	@Override
	public Class<CreateTrafficControlResponse> getResponseClass() {
		return CreateTrafficControlResponse.class;
	}

}
