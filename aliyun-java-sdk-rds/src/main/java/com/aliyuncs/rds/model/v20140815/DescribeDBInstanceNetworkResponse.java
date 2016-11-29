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
package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceNetworkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceNetworkResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String startTime;

	private String endTime;

	private List<Topology> topology;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<Topology> getTopology() {
		return this.topology;
	}

	public void setTopology(List<Topology> topology) {
		this.topology = topology;
	}

	public static class Topology {

		private String startPoint;

		private String endPoint;

		private String networkTrafficIn;

		private String networkTrafficOut;

		private String networkLatency;

		private String backendLatency;

		private String networkErrors;

		public String getStartPoint() {
			return this.startPoint;
		}

		public void setStartPoint(String startPoint) {
			this.startPoint = startPoint;
		}

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public String getNetworkTrafficIn() {
			return this.networkTrafficIn;
		}

		public void setNetworkTrafficIn(String networkTrafficIn) {
			this.networkTrafficIn = networkTrafficIn;
		}

		public String getNetworkTrafficOut() {
			return this.networkTrafficOut;
		}

		public void setNetworkTrafficOut(String networkTrafficOut) {
			this.networkTrafficOut = networkTrafficOut;
		}

		public String getNetworkLatency() {
			return this.networkLatency;
		}

		public void setNetworkLatency(String networkLatency) {
			this.networkLatency = networkLatency;
		}

		public String getBackendLatency() {
			return this.backendLatency;
		}

		public void setBackendLatency(String backendLatency) {
			this.backendLatency = backendLatency;
		}

		public String getNetworkErrors() {
			return this.networkErrors;
		}

		public void setNetworkErrors(String networkErrors) {
			this.networkErrors = networkErrors;
		}
	}

	@Override
	public DescribeDBInstanceNetworkResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceNetworkResponseUnmarshaller.unmarshall(this, context);
	}
}
