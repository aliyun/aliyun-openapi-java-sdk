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
package com.aliyuncs.push.model.v20150827;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20150827.QueryAppPushStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAppPushStatResponse extends AcsResponse {

	private String requestId;

	private List<AppPushStat> appPushStats;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AppPushStat> getAppPushStats() {
		return this.appPushStats;
	}

	public void setAppPushStats(List<AppPushStat> appPushStats) {
		this.appPushStats = appPushStats;
	}

	public static class AppPushStat {

		private String time;

		private Long sentCount;

		private Long receivedCount;

		private Long openedCount;

		private Long deletedCount;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Long getSentCount() {
			return this.sentCount;
		}

		public void setSentCount(Long sentCount) {
			this.sentCount = sentCount;
		}

		public Long getReceivedCount() {
			return this.receivedCount;
		}

		public void setReceivedCount(Long receivedCount) {
			this.receivedCount = receivedCount;
		}

		public Long getOpenedCount() {
			return this.openedCount;
		}

		public void setOpenedCount(Long openedCount) {
			this.openedCount = openedCount;
		}

		public Long getDeletedCount() {
			return this.deletedCount;
		}

		public void setDeletedCount(Long deletedCount) {
			this.deletedCount = deletedCount;
		}
	}

	@Override
	public QueryAppPushStatResponse getInstance(UnmarshallerContext context) {
		return	QueryAppPushStatResponseUnmarshaller.unmarshall(this, context);
	}
}
