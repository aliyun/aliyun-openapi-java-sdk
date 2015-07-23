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
package com.aliyuncs.drds.model.v20150413;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDrdsInstanceRequest extends RpcAcsRequest<CreateDrdsInstanceResponse> {
	
	public CreateDrdsInstanceRequest() {
		super("Drds", "2015-04-13", "CreateDrdsInstance");
	}

	private String description;

	private String zoneId;

	private String type;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		putQueryParameter("ZoneId", zoneId);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		putQueryParameter("Type", type);
	}

	@Override
	public Class<CreateDrdsInstanceResponse> getResponseClass() {
		return CreateDrdsInstanceResponse.class;
	}

}
