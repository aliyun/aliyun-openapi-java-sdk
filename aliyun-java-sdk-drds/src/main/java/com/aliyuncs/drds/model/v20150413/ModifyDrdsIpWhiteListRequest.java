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
public class ModifyDrdsIpWhiteListRequest extends RpcAcsRequest<ModifyDrdsIpWhiteListResponse> {
	
	public ModifyDrdsIpWhiteListRequest() {
		super("Drds", "2015-04-13", "ModifyDrdsIpWhiteList");
	}

	private String drdsInstanceId;

	private String dbName;

	private String ipWhiteList;

	private Boolean mode;

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		putQueryParameter("DrdsInstanceId", drdsInstanceId);
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		putQueryParameter("DbName", dbName);
	}

	public String getIpWhiteList() {
		return this.ipWhiteList;
	}

	public void setIpWhiteList(String ipWhiteList) {
		this.ipWhiteList = ipWhiteList;
		putQueryParameter("IpWhiteList", ipWhiteList);
	}

	public Boolean getMode() {
		return this.mode;
	}

	public void setMode(Boolean mode) {
		this.mode = mode;
		putQueryParameter("Mode", String.valueOf(mode));
	}

	@Override
	public Class<ModifyDrdsIpWhiteListResponse> getResponseClass() {
		return ModifyDrdsIpWhiteListResponse.class;
	}

}
