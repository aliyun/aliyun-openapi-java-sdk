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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeServiceCronScalerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceCronScalerResponse extends AcsResponse {

	private String requestId;

	private String serviceName;

	private List<ScaleJob> scaleJobs;

	private List<String> excludeDates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<ScaleJob> getScaleJobs() {
		return this.scaleJobs;
	}

	public void setScaleJobs(List<ScaleJob> scaleJobs) {
		this.scaleJobs = scaleJobs;
	}

	public List<String> getExcludeDates() {
		return this.excludeDates;
	}

	public void setExcludeDates(List<String> excludeDates) {
		this.excludeDates = excludeDates;
	}

	public static class ScaleJob {

		private String schedule;

		private Integer targetSize;

		private String name;

		private String message;

		private String state;

		private String lastProbeTime;

		private String createTime;

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}

		public Integer getTargetSize() {
			return this.targetSize;
		}

		public void setTargetSize(Integer targetSize) {
			this.targetSize = targetSize;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getLastProbeTime() {
			return this.lastProbeTime;
		}

		public void setLastProbeTime(String lastProbeTime) {
			this.lastProbeTime = lastProbeTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeServiceCronScalerResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceCronScalerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
