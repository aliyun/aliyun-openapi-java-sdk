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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDBClusterHealthStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterHealthStatusResponse extends AcsResponse {

	private String instanceStatus;

	private String requestId;

	private CS cS;

	private Executor executor;

	private Worker worker;

	public String getInstanceStatus() {
		return this.instanceStatus;
	}

	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CS getCS() {
		return this.cS;
	}

	public void setCS(CS cS) {
		this.cS = cS;
	}

	public Executor getExecutor() {
		return this.executor;
	}

	public void setExecutor(Executor executor) {
		this.executor = executor;
	}

	public Worker getWorker() {
		return this.worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public static class CS {

		private Long activeCount;

		private Long unavailableCount;

		private Long riskCount;

		private Long expectedCount;

		private String status;

		public Long getActiveCount() {
			return this.activeCount;
		}

		public void setActiveCount(Long activeCount) {
			this.activeCount = activeCount;
		}

		public Long getUnavailableCount() {
			return this.unavailableCount;
		}

		public void setUnavailableCount(Long unavailableCount) {
			this.unavailableCount = unavailableCount;
		}

		public Long getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(Long riskCount) {
			this.riskCount = riskCount;
		}

		public Long getExpectedCount() {
			return this.expectedCount;
		}

		public void setExpectedCount(Long expectedCount) {
			this.expectedCount = expectedCount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class Executor {

		private Long activeCount;

		private Long unavailableCount;

		private Long riskCount;

		private Long expectedCount;

		private String status;

		public Long getActiveCount() {
			return this.activeCount;
		}

		public void setActiveCount(Long activeCount) {
			this.activeCount = activeCount;
		}

		public Long getUnavailableCount() {
			return this.unavailableCount;
		}

		public void setUnavailableCount(Long unavailableCount) {
			this.unavailableCount = unavailableCount;
		}

		public Long getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(Long riskCount) {
			this.riskCount = riskCount;
		}

		public Long getExpectedCount() {
			return this.expectedCount;
		}

		public void setExpectedCount(Long expectedCount) {
			this.expectedCount = expectedCount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class Worker {

		private Long activeCount;

		private Long unavailableCount;

		private Long riskCount;

		private Long expectedCount;

		private String status;

		public Long getActiveCount() {
			return this.activeCount;
		}

		public void setActiveCount(Long activeCount) {
			this.activeCount = activeCount;
		}

		public Long getUnavailableCount() {
			return this.unavailableCount;
		}

		public void setUnavailableCount(Long unavailableCount) {
			this.unavailableCount = unavailableCount;
		}

		public Long getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(Long riskCount) {
			this.riskCount = riskCount;
		}

		public Long getExpectedCount() {
			return this.expectedCount;
		}

		public void setExpectedCount(Long expectedCount) {
			this.expectedCount = expectedCount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeDBClusterHealthStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterHealthStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
