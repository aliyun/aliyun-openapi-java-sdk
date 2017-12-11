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
package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.ModifyDBClusterConnectionStringResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterConnectionStringResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private String oldConnectionString;

	private String oldPort;

	private String newConnectionString;

	private String newPort;

	private String iPType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getOldConnectionString() {
		return this.oldConnectionString;
	}

	public void setOldConnectionString(String oldConnectionString) {
		this.oldConnectionString = oldConnectionString;
	}

	public String getOldPort() {
		return this.oldPort;
	}

	public void setOldPort(String oldPort) {
		this.oldPort = oldPort;
	}

	public String getNewConnectionString() {
		return this.newConnectionString;
	}

	public void setNewConnectionString(String newConnectionString) {
		this.newConnectionString = newConnectionString;
	}

	public String getNewPort() {
		return this.newPort;
	}

	public void setNewPort(String newPort) {
		this.newPort = newPort;
	}

	public String getIPType() {
		return this.iPType;
	}

	public void setIPType(String iPType) {
		this.iPType = iPType;
	}

	@Override
	public ModifyDBClusterConnectionStringResponse getInstance(UnmarshallerContext context) {
		return	ModifyDBClusterConnectionStringResponseUnmarshaller.unmarshall(this, context);
	}
}
