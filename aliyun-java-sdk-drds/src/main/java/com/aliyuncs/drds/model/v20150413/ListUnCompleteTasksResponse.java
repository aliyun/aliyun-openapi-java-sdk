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
package com.aliyuncs.drds.model.v20150413;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20150413.ListUnCompleteTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUnCompleteTasksResponse extends AcsResponse {

	private List<task> data;

	public List<task> getData() {
		return this.data;
	}

	public void setData(List<task> data) {
		this.data = data;
	}

	public static class task {

		private String requestId;

		private String targetId;

		private String taskDetail;

		private Integer taskStatus;

		private String taskPhase;

		private Integer taskType;

		private String taskName;

		private Long gmtCreate;

		private String allowCancel;

		private String errMsg;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public String getTaskDetail() {
			return this.taskDetail;
		}

		public void setTaskDetail(String taskDetail) {
			this.taskDetail = taskDetail;
		}

		public Integer gettaskStatus() {
			return this.taskStatus;
		}

		public void settaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskPhase() {
			return this.taskPhase;
		}

		public void setTaskPhase(String taskPhase) {
			this.taskPhase = taskPhase;
		}

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Long getgmtCreate() {
			return this.gmtCreate;
		}

		public void setgmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getAllowCancel() {
			return this.allowCancel;
		}

		public void setAllowCancel(String allowCancel) {
			this.allowCancel = allowCancel;
		}

		public String getErrMsg() {
			return this.errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}
	}

	@Override
	public ListUnCompleteTasksResponse getInstance(UnmarshallerContext context) {
		return	ListUnCompleteTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
