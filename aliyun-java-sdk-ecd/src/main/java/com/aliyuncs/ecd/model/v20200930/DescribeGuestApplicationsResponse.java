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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeGuestApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGuestApplicationsResponse extends AcsResponse {

	private String requestId;

	private List<GuestApplicationModel> applications;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GuestApplicationModel> getApplications() {
		return this.applications;
	}

	public void setApplications(List<GuestApplicationModel> applications) {
		this.applications = applications;
	}

	public static class GuestApplicationModel {

		private String applicationName;

		private String applicationVersion;

		private String processPath;

		private Integer pid;

		private Double cpuPercent;

		private Double memPercent;

		private Double gpuPercent;

		private Double ioSpeed;

		private String iconUrl;

		private String status;

		private List<Process> processData;

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getApplicationVersion() {
			return this.applicationVersion;
		}

		public void setApplicationVersion(String applicationVersion) {
			this.applicationVersion = applicationVersion;
		}

		public String getProcessPath() {
			return this.processPath;
		}

		public void setProcessPath(String processPath) {
			this.processPath = processPath;
		}

		public Integer getPid() {
			return this.pid;
		}

		public void setPid(Integer pid) {
			this.pid = pid;
		}

		public Double getCpuPercent() {
			return this.cpuPercent;
		}

		public void setCpuPercent(Double cpuPercent) {
			this.cpuPercent = cpuPercent;
		}

		public Double getMemPercent() {
			return this.memPercent;
		}

		public void setMemPercent(Double memPercent) {
			this.memPercent = memPercent;
		}

		public Double getGpuPercent() {
			return this.gpuPercent;
		}

		public void setGpuPercent(Double gpuPercent) {
			this.gpuPercent = gpuPercent;
		}

		public Double getIoSpeed() {
			return this.ioSpeed;
		}

		public void setIoSpeed(Double ioSpeed) {
			this.ioSpeed = ioSpeed;
		}

		public String getIconUrl() {
			return this.iconUrl;
		}

		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Process> getProcessData() {
			return this.processData;
		}

		public void setProcessData(List<Process> processData) {
			this.processData = processData;
		}

		public static class Process {

			private String applicationName;

			private String applicationVersion;

			private String processPath;

			private Integer pid;

			private Double cpuPercent;

			private Double memPercent;

			private Double gpuPercent;

			private Double iospeed;

			public String getApplicationName() {
				return this.applicationName;
			}

			public void setApplicationName(String applicationName) {
				this.applicationName = applicationName;
			}

			public String getApplicationVersion() {
				return this.applicationVersion;
			}

			public void setApplicationVersion(String applicationVersion) {
				this.applicationVersion = applicationVersion;
			}

			public String getProcessPath() {
				return this.processPath;
			}

			public void setProcessPath(String processPath) {
				this.processPath = processPath;
			}

			public Integer getPid() {
				return this.pid;
			}

			public void setPid(Integer pid) {
				this.pid = pid;
			}

			public Double getCpuPercent() {
				return this.cpuPercent;
			}

			public void setCpuPercent(Double cpuPercent) {
				this.cpuPercent = cpuPercent;
			}

			public Double getMemPercent() {
				return this.memPercent;
			}

			public void setMemPercent(Double memPercent) {
				this.memPercent = memPercent;
			}

			public Double getGpuPercent() {
				return this.gpuPercent;
			}

			public void setGpuPercent(Double gpuPercent) {
				this.gpuPercent = gpuPercent;
			}

			public Double getIospeed() {
				return this.iospeed;
			}

			public void setIospeed(Double iospeed) {
				this.iospeed = iospeed;
			}
		}
	}

	@Override
	public DescribeGuestApplicationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGuestApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
