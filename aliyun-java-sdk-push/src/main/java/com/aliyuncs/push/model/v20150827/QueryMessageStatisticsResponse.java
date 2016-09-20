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
import com.aliyuncs.push.transform.v20150827.QueryMessageStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMessageStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<PushMessageStatisticsInfo> pushMessageStatisticsInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PushMessageStatisticsInfo> getPushMessageStatisticsInfos() {
		return this.pushMessageStatisticsInfos;
	}

	public void setPushMessageStatisticsInfos(List<PushMessageStatisticsInfo> pushMessageStatisticsInfos) {
		this.pushMessageStatisticsInfos = pushMessageStatisticsInfos;
	}

	public static class PushMessageStatisticsInfo {

		private String date;

		private Integer sent;

		private Integer received;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Integer getSent() {
			return this.sent;
		}

		public void setSent(Integer sent) {
			this.sent = sent;
		}

		public Integer getReceived() {
			return this.received;
		}

		public void setReceived(Integer received) {
			this.received = received;
		}
	}

	@Override
	public QueryMessageStatisticsResponse getInstance(UnmarshallerContext context) {
		return	QueryMessageStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
