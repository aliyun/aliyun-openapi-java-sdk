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
import com.aliyuncs.push.transform.v20150827.QueryPushStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPushStatResponse extends AcsResponse {

	private String requestId;

	private List<PushStat> pushStats;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PushStat> getPushStats() {
		return this.pushStats;
	}

	public void setPushStats(List<PushStat> pushStats) {
		this.pushStats = pushStats;
	}

	public static class PushStat {

		private String messageId;

		private Long sentCount;

		private Long receivedCount;

		private Long openedCount;

		private Long deletedCount;

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
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
	public QueryPushStatResponse getInstance(UnmarshallerContext context) {
		return	QueryPushStatResponseUnmarshaller.unmarshall(this, context);
	}
}
