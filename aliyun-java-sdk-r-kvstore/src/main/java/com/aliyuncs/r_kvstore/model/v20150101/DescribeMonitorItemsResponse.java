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
package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeMonitorItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorItemsResponse extends AcsResponse {

	private String requestId;

	private List<KVStoreMonitorItem> monitorItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<KVStoreMonitorItem> getMonitorItems() {
		return this.monitorItems;
	}

	public void setMonitorItems(List<KVStoreMonitorItem> monitorItems) {
		this.monitorItems = monitorItems;
	}

	public static class KVStoreMonitorItem {

		private String monitorKey;

		private String unit;

		public String getMonitorKey() {
			return this.monitorKey;
		}

		public void setMonitorKey(String monitorKey) {
			this.monitorKey = monitorKey;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}
	}

	@Override
	public DescribeMonitorItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
