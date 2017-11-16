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
package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeServerRelatedGlobalAccelerationInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServerRelatedGlobalAccelerationInstancesResponse extends AcsResponse {

	private String requestId;

	private List<GlobalAccelerationInstance> globalAccelerationInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GlobalAccelerationInstance> getGlobalAccelerationInstances() {
		return this.globalAccelerationInstances;
	}

	public void setGlobalAccelerationInstances(List<GlobalAccelerationInstance> globalAccelerationInstances) {
		this.globalAccelerationInstances = globalAccelerationInstances;
	}

	public static class GlobalAccelerationInstance {

		private String regionId;

		private String globalAccelerationInstanceId;

		private String ipAddress;

		private String serverIpAddress;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getGlobalAccelerationInstanceId() {
			return this.globalAccelerationInstanceId;
		}

		public void setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
			this.globalAccelerationInstanceId = globalAccelerationInstanceId;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getServerIpAddress() {
			return this.serverIpAddress;
		}

		public void setServerIpAddress(String serverIpAddress) {
			this.serverIpAddress = serverIpAddress;
		}
	}

	@Override
	public DescribeServerRelatedGlobalAccelerationInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeServerRelatedGlobalAccelerationInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
