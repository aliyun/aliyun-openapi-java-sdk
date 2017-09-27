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
import com.aliyuncs.rds.transform.v20140815.DescribeReplicaPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReplicaPerformanceResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private String replicaId;

	private PerformanceKeys performanceKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getReplicaId() {
		return this.replicaId;
	}

	public void setReplicaId(String replicaId) {
		this.replicaId = replicaId;
	}

	public PerformanceKeys getPerformanceKeys() {
		return this.performanceKeys;
	}

	public void setPerformanceKeys(PerformanceKeys performanceKeys) {
		this.performanceKeys = performanceKeys;
	}

	public static class PerformanceKeys {

		private List<PerformanceKeyItem> performanceKey;

		public List<PerformanceKeyItem> getPerformanceKey() {
			return this.performanceKey;
		}

		public void setPerformanceKey(List<PerformanceKeyItem> performanceKey) {
			this.performanceKey = performanceKey;
		}

		public static class PerformanceKeyItem {

			private String key;

			private String unit;

			private String valueFormat;

			private PerformanceValues performanceValues;

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

			public String getValueFormat() {
				return this.valueFormat;
			}

			public void setValueFormat(String valueFormat) {
				this.valueFormat = valueFormat;
			}

			public PerformanceValues getPerformanceValues() {
				return this.performanceValues;
			}

			public void setPerformanceValues(PerformanceValues performanceValues) {
				this.performanceValues = performanceValues;
			}

			public static class PerformanceValues {

				private List<PerformanceValueItem> performanceValue;

				public List<PerformanceValueItem> getPerformanceValue() {
					return this.performanceValue;
				}

				public void setPerformanceValue(List<PerformanceValueItem> performanceValue) {
					this.performanceValue = performanceValue;
				}

				public static class PerformanceValueItem {

					private String value;

					private String date;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
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
	}

	@Override
	public DescribeReplicaPerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeReplicaPerformanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
