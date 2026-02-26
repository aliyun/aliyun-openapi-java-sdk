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
import com.aliyuncs.ga.transform.v20191120.ListApplicationMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationMonitorResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ApplicationMonitor> applicationMonitors;

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

	public List<ApplicationMonitor> getApplicationMonitors() {
		return this.applicationMonitors;
	}

	public void setApplicationMonitors(List<ApplicationMonitor> applicationMonitors) {
		this.applicationMonitors = applicationMonitors;
	}

	public static class ApplicationMonitor {

		private String acceleratorId;

		private String listenerId;

		private String taskId;

		private String taskName;

		private String address;

		private String optionsJson;

		private Boolean detectEnable;

		private Integer detectThreshold;

		private Integer detectTimes;

		private Integer silenceTime;

		private String state;

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

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getOptionsJson() {
			return this.optionsJson;
		}

		public void setOptionsJson(String optionsJson) {
			this.optionsJson = optionsJson;
		}

		public Boolean getDetectEnable() {
			return this.detectEnable;
		}

		public void setDetectEnable(Boolean detectEnable) {
			this.detectEnable = detectEnable;
		}

		public Integer getDetectThreshold() {
			return this.detectThreshold;
		}

		public void setDetectThreshold(Integer detectThreshold) {
			this.detectThreshold = detectThreshold;
		}

		public Integer getDetectTimes() {
			return this.detectTimes;
		}

		public void setDetectTimes(Integer detectTimes) {
			this.detectTimes = detectTimes;
		}

		public Integer getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Integer silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public ListApplicationMonitorResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationMonitorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
