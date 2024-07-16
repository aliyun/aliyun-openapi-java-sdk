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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeFirewallTemplateApplyResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFirewallTemplateApplyResultsResponse extends AcsResponse {

	private String requestId;

	private String pageNumber;

	private String pageSize;

	private String totalCount;

	private List<ApplyFirewallTemplateResult> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<ApplyFirewallTemplateResult> getData() {
		return this.data;
	}

	public void setData(List<ApplyFirewallTemplateResult> data) {
		this.data = data;
	}

	public static class ApplyFirewallTemplateResult {

		private String taskId;

		private String firewallTemplateId;

		private String status;

		private String totalCount;

		private String failedCount;

		private String createTime;

		private List<ApplyInstanceResult> instanceApplyResults;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getFirewallTemplateId() {
			return this.firewallTemplateId;
		}

		public void setFirewallTemplateId(String firewallTemplateId) {
			this.firewallTemplateId = firewallTemplateId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public String getFailedCount() {
			return this.failedCount;
		}

		public void setFailedCount(String failedCount) {
			this.failedCount = failedCount;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<ApplyInstanceResult> getInstanceApplyResults() {
			return this.instanceApplyResults;
		}

		public void setInstanceApplyResults(List<ApplyInstanceResult> instanceApplyResults) {
			this.instanceApplyResults = instanceApplyResults;
		}

		public static class ApplyInstanceResult {

			private String instanceId;

			private String status;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeFirewallTemplateApplyResultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFirewallTemplateApplyResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
