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
package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.CreateMasterSlaveVServerGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMasterSlaveVServerGroupResponse extends AcsResponse {

	private String requestId;

	private String masterSlaveVServerGroupId;

	private List<MasterSlaveBackendServer> masterSlaveBackendServers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMasterSlaveVServerGroupId() {
		return this.masterSlaveVServerGroupId;
	}

	public void setMasterSlaveVServerGroupId(String masterSlaveVServerGroupId) {
		this.masterSlaveVServerGroupId = masterSlaveVServerGroupId;
	}

	public List<MasterSlaveBackendServer> getMasterSlaveBackendServers() {
		return this.masterSlaveBackendServers;
	}

	public void setMasterSlaveBackendServers(List<MasterSlaveBackendServer> masterSlaveBackendServers) {
		this.masterSlaveBackendServers = masterSlaveBackendServers;
	}

	public static class MasterSlaveBackendServer {

		private String serverId;

		private Integer port;

		private Integer weight;

		private Integer isBackup;

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public Integer getIsBackup() {
			return this.isBackup;
		}

		public void setIsBackup(Integer isBackup) {
			this.isBackup = isBackup;
		}
	}

	@Override
	public CreateMasterSlaveVServerGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateMasterSlaveVServerGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
