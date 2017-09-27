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
import com.aliyuncs.rds.transform.v20140815.CalculateDBInstanceWeightResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CalculateDBInstanceWeightResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceWeight> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceWeight> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstanceWeight> items) {
		this.items = items;
	}

	public static class DBInstanceWeight {

		private String dBInstanceId;

		private String dBInstanceType;

		private String availability;

		private String weight;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public String getAvailability() {
			return this.availability;
		}

		public void setAvailability(String availability) {
			this.availability = availability;
		}

		public String getWeight() {
			return this.weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}
	}

	@Override
	public CalculateDBInstanceWeightResponse getInstance(UnmarshallerContext context) {
		return	CalculateDBInstanceWeightResponseUnmarshaller.unmarshall(this, context);
	}
}
