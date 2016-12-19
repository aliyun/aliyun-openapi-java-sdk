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
package com.aliyuncs.push.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.ListSummaryAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSummaryAppsResponse extends AcsResponse {

	private String requestId;

	private List<SummaryAppInfo> summaryAppInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SummaryAppInfo> getSummaryAppInfos() {
		return this.summaryAppInfos;
	}

	public void setSummaryAppInfos(List<SummaryAppInfo> summaryAppInfos) {
		this.summaryAppInfos = summaryAppInfos;
	}

	public static class SummaryAppInfo {

		private String appName;

		private Long appKey;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Long getAppKey() {
			return this.appKey;
		}

		public void setAppKey(Long appKey) {
			this.appKey = appKey;
		}
	}

	@Override
	public ListSummaryAppsResponse getInstance(UnmarshallerContext context) {
		return	ListSummaryAppsResponseUnmarshaller.unmarshall(this, context);
	}
}
