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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceNetworkDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceNetworkDetailResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String startTime;

	private String endTime;

	private String newConnection;

	private String activeConnection;

	private String abortedConnection;

	private String networkRequest;

	private String networkTrafficIn;

	private String networkTrafficOut;

	private String networkLatency;

	private String backendLatency;

	private String networkErrors;

	private List<NetworkKey> networkDetail;

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

	public String getNewConnection() {
		return this.newConnection;
	}

	public void setNewConnection(String newConnection) {
		this.newConnection = newConnection;
	}

	public String getActiveConnection() {
		return this.activeConnection;
	}

	public void setActiveConnection(String activeConnection) {
		this.activeConnection = activeConnection;
	}

	public String getAbortedConnection() {
		return this.abortedConnection;
	}

	public void setAbortedConnection(String abortedConnection) {
		this.abortedConnection = abortedConnection;
	}

	public String getNetworkRequest() {
		return this.networkRequest;
	}

	public void setNetworkRequest(String networkRequest) {
		this.networkRequest = networkRequest;
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

	public List<NetworkKey> getNetworkDetail() {
		return this.networkDetail;
	}

	public void setNetworkDetail(List<NetworkKey> networkDetail) {
		this.networkDetail = networkDetail;
	}

	public static class NetworkKey {

		private String key;

		private String unit;

		private List<NetworkValue> values;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public List<NetworkValue> getValues() {
			return this.values;
		}

		public void setValues(List<NetworkValue> values) {
			this.values = values;
		}

		public static class NetworkValue {

			private String value;

			private String dateTime;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getDateTime() {
				return this.dateTime;
			}

			public void setDateTime(String dateTime) {
				this.dateTime = dateTime;
			}
		}
	}

	@Override
	public DescribeDBInstanceNetworkDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceNetworkDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
