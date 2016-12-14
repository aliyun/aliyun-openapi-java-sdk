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
package com.aliyuncs.hpc.model.v20161213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hpc.transform.v20161213.DescribeInstancesInSecurityGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesInSecurityGroupResponse extends AcsResponse {

	private String requestId;

	private List<Record> records;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Record> getRecords() {
		return this.records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public static class Record {

		private String regionId;

		private String instanceId;

		private String innerIpAddress;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}
	}

	@Override
	public DescribeInstancesInSecurityGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesInSecurityGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
