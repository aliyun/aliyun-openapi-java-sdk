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
public class DeleteTrafficSpecialControlRequest extends RpcAcsRequest<DeleteTrafficSpecialControlResponse> {
	
	public DeleteTrafficSpecialControlRequest() {
		super("CloudAPI", "2016-07-14", "DeleteTrafficSpecialControl", "apigateway");
	}

	private String trafficControlId;

	private String specialType;

	private String specialKey;

	public String getTrafficControlId() {
		return this.trafficControlId;
	}

	public void setTrafficControlId(String trafficControlId) {
		this.trafficControlId = trafficControlId;
		putQueryParameter("TrafficControlId", trafficControlId);
	}

	public String getSpecialType() {
		return this.specialType;
	}

	public void setSpecialType(String specialType) {
		this.specialType = specialType;
		putQueryParameter("SpecialType", specialType);
	}

	public String getSpecialKey() {
		return this.specialKey;
	}

	public void setSpecialKey(String specialKey) {
		this.specialKey = specialKey;
		putQueryParameter("SpecialKey", specialKey);
	}

	@Override
	public Class<DeleteTrafficSpecialControlResponse> getResponseClass() {
		return DeleteTrafficSpecialControlResponse.class;
	}

}
