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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiErrorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiErrorDataResponse extends AcsResponse {

	private String requestId;

	private List<MonitorItem> clientErrors;

	private List<MonitorItem> serverErrors;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorItem> getClientErrors() {
		return this.clientErrors;
	}

	public void setClientErrors(List<MonitorItem> clientErrors) {
		this.clientErrors = clientErrors;
	}

	public List<MonitorItem> getServerErrors() {
		return this.serverErrors;
	}

	public void setServerErrors(List<MonitorItem> serverErrors) {
		this.serverErrors = serverErrors;
	}

	public static class MonitorItem {

		private String itemTime;

		private String itemValue;

		public String getItemTime() {
			return this.itemTime;
		}

		public void setItemTime(String itemTime) {
			this.itemTime = itemTime;
		}

		public String getItemValue() {
			return this.itemValue;
		}

		public void setItemValue(String itemValue) {
			this.itemValue = itemValue;
		}
	}

	@Override
	public DescribeApiErrorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiErrorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
