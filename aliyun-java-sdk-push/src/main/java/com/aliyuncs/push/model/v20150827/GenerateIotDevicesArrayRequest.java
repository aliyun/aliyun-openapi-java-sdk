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
package com.aliyuncs.push.model.v20150827;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GenerateIotDevicesArrayRequest extends RpcAcsRequest<GenerateIotDevicesArrayResponse> {
	
	public GenerateIotDevicesArrayRequest() {
		super("Push", "2015-08-27", "GenerateIotDevicesArray");
	}

	private Boolean isDev;

	private Long number;

	public Boolean getisDev() {
		return this.isDev;
	}

	public void setisDev(Boolean isDev) {
		this.isDev = isDev;
		putQueryParameter("isDev", isDev);
	}

	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
		putQueryParameter("Number", number);
	}

	@Override
	public Class<GenerateIotDevicesArrayResponse> getResponseClass() {
		return GenerateIotDevicesArrayResponse.class;
	}

}
