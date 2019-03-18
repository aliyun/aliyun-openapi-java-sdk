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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeTrafficControlsByApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrafficControlsByApiResponse extends AcsResponse {

	private String requestId;

	private List<TrafficControlItem> trafficControlItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrafficControlItem> getTrafficControlItems() {
		return this.trafficControlItems;
	}

	public void setTrafficControlItems(List<TrafficControlItem> trafficControlItems) {
		this.trafficControlItems = trafficControlItems;
	}

	public static class TrafficControlItem {

		private String trafficControlItemId;

		private String trafficControlItemName;

		private String boundTime;

		public String getTrafficControlItemId() {
			return this.trafficControlItemId;
		}

		public void setTrafficControlItemId(String trafficControlItemId) {
			this.trafficControlItemId = trafficControlItemId;
		}

		public String getTrafficControlItemName() {
			return this.trafficControlItemName;
		}

		public void setTrafficControlItemName(String trafficControlItemName) {
			this.trafficControlItemName = trafficControlItemName;
		}

		public String getBoundTime() {
			return this.boundTime;
		}

		public void setBoundTime(String boundTime) {
			this.boundTime = boundTime;
		}
	}

	@Override
	public DescribeTrafficControlsByApiResponse getInstance(UnmarshallerContext context) {
		return	DescribeTrafficControlsByApiResponseUnmarshaller.unmarshall(this, context);
	}
}
