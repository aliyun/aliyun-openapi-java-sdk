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
import com.aliyuncs.push.transform.v20150827.QueryPushDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPushDataResponse extends AcsResponse {

	private String requestId;

	private List<BillInfo> pushDataInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BillInfo> getPushDataInfos() {
		return this.pushDataInfos;
	}

	public void setPushDataInfos(List<BillInfo> pushDataInfos) {
		this.pushDataInfos = pushDataInfos;
	}

	public static class BillInfo {

		private String date;

		private Integer accepted;

		private Integer sent;

		private Integer received;

		private Integer opened;

		private Integer deleted;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Integer getAccepted() {
			return this.accepted;
		}

		public void setAccepted(Integer accepted) {
			this.accepted = accepted;
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

		public Integer getOpened() {
			return this.opened;
		}

		public void setOpened(Integer opened) {
			this.opened = opened;
		}

		public Integer getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Integer deleted) {
			this.deleted = deleted;
		}
	}

	@Override
	public QueryPushDataResponse getInstance(UnmarshallerContext context) {
		return	QueryPushDataResponseUnmarshaller.unmarshall(this, context);
	}
}
