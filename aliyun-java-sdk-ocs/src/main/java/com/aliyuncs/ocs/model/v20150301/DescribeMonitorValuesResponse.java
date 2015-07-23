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
package com.aliyuncs.ocs.model.v20150301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocs.transform.v20150301.DescribeMonitorValuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorValuesResponse extends AcsResponse {

	private String requestId;

	private GetOcsMonitorValuesResponse getOcsMonitorValuesResponse;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GetOcsMonitorValuesResponse getGetOcsMonitorValuesResponse() {
		return this.getOcsMonitorValuesResponse;
	}

	public void setGetOcsMonitorValuesResponse(GetOcsMonitorValuesResponse getOcsMonitorValuesResponse) {
		this.getOcsMonitorValuesResponse = getOcsMonitorValuesResponse;
	}

	public static class GetOcsMonitorValuesResponse {

		private String date;

		private List<OcsMonitorDTO> ocsInstanceIds;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public List<OcsMonitorDTO> getOcsInstanceIds() {
			return this.ocsInstanceIds;
		}

		public void setOcsInstanceIds(List<OcsMonitorDTO> ocsInstanceIds) {
			this.ocsInstanceIds = ocsInstanceIds;
		}

		public static class OcsMonitorDTO {

			private String ocsInstanceId;

			private List<OcsMonitorKeyDTO> monitorKeys;

			public String getOcsInstanceId() {
				return this.ocsInstanceId;
			}

			public void setOcsInstanceId(String ocsInstanceId) {
				this.ocsInstanceId = ocsInstanceId;
			}

			public List<OcsMonitorKeyDTO> getMonitorKeys() {
				return this.monitorKeys;
			}

			public void setMonitorKeys(List<OcsMonitorKeyDTO> monitorKeys) {
				this.monitorKeys = monitorKeys;
			}

			public static class OcsMonitorKeyDTO {

				private String monitorKey;

				private String value;

				private String unit;

				private String date;

				public String getMonitorKey() {
					return this.monitorKey;
				}

				public void setMonitorKey(String monitorKey) {
					this.monitorKey = monitorKey;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getUnit() {
					return this.unit;
				}

				public void setUnit(String unit) {
					this.unit = unit;
				}

				public String getDate() {
					return this.date;
				}

				public void setDate(String date) {
					this.date = date;
				}
			}
		}
	}

	@Override
	public DescribeMonitorValuesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorValuesResponseUnmarshaller.unmarshall(this, context);
	}
}
