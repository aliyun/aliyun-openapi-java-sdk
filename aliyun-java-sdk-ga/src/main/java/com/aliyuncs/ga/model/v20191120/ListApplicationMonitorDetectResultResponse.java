/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListApplicationMonitorDetectResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationMonitorDetectResultResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ApplicationMonitorDetectResult> applicationMonitorDetectResultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ApplicationMonitorDetectResult> getApplicationMonitorDetectResultList() {
		return this.applicationMonitorDetectResultList;
	}

	public void setApplicationMonitorDetectResultList(List<ApplicationMonitorDetectResult> applicationMonitorDetectResultList) {
		this.applicationMonitorDetectResultList = applicationMonitorDetectResultList;
	}

	public static class ApplicationMonitorDetectResult {

		private String acceleratorId;

		private String listenerId;

		private String taskId;

		private String port;

		private String protocol;

		private String diagStatus;

		private String statusCode;

		private String content;

		private String detail;

		private String detectTime;

		public String getAcceleratorId() {
			return this.acceleratorId;
		}

		public void setAcceleratorId(String acceleratorId) {
			this.acceleratorId = acceleratorId;
		}

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getDiagStatus() {
			return this.diagStatus;
		}

		public void setDiagStatus(String diagStatus) {
			this.diagStatus = diagStatus;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getDetectTime() {
			return this.detectTime;
		}

		public void setDetectTime(String detectTime) {
			this.detectTime = detectTime;
		}
	}

	@Override
	public ListApplicationMonitorDetectResultResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationMonitorDetectResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
