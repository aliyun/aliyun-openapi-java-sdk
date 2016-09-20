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
import com.aliyuncs.push.transform.v20150827.ListDevicePushRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevicePushRecordsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageSize;

	private Integer page;

	private List<DevicePushStat> messageList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public List<DevicePushStat> getMessageList() {
		return this.messageList;
	}

	public void setMessageList(List<DevicePushStat> messageList) {
		this.messageList = messageList;
	}

	public static class DevicePushStat {

		private String messageId;

		private String pushStatus;

		private String deviceStatusWhenPush;

		private String pushTime;

		private String lastModifyTime;

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public String getPushStatus() {
			return this.pushStatus;
		}

		public void setPushStatus(String pushStatus) {
			this.pushStatus = pushStatus;
		}

		public String getDeviceStatusWhenPush() {
			return this.deviceStatusWhenPush;
		}

		public void setDeviceStatusWhenPush(String deviceStatusWhenPush) {
			this.deviceStatusWhenPush = deviceStatusWhenPush;
		}

		public String getPushTime() {
			return this.pushTime;
		}

		public void setPushTime(String pushTime) {
			this.pushTime = pushTime;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}
	}

	@Override
	public ListDevicePushRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListDevicePushRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
