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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListOpsOperationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOpsOperationResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<OpsOperationListItem> opsOperationList;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<OpsOperationListItem> getOpsOperationList() {
		return this.opsOperationList;
	}

	public void setOpsOperationList(List<OpsOperationListItem> opsOperationList) {
		this.opsOperationList = opsOperationList;
	}

	public static class OpsOperationListItem {

		private Long id;

		private String startTime;

		private String endTime;

		private Long opsCommandId;

		private String opsCommandName;

		private String status;

		private Long totalTaskNum;

		private Long failedTaskNum;

		private Long finishedTaskNum;

		private String clusterId;

		private String regionId;

		private String params;

		private String remark;

		private Long runningTime;

		private String category;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Long getOpsCommandId() {
			return this.opsCommandId;
		}

		public void setOpsCommandId(Long opsCommandId) {
			this.opsCommandId = opsCommandId;
		}

		public String getOpsCommandName() {
			return this.opsCommandName;
		}

		public void setOpsCommandName(String opsCommandName) {
			this.opsCommandName = opsCommandName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTotalTaskNum() {
			return this.totalTaskNum;
		}

		public void setTotalTaskNum(Long totalTaskNum) {
			this.totalTaskNum = totalTaskNum;
		}

		public Long getFailedTaskNum() {
			return this.failedTaskNum;
		}

		public void setFailedTaskNum(Long failedTaskNum) {
			this.failedTaskNum = failedTaskNum;
		}

		public Long getFinishedTaskNum() {
			return this.finishedTaskNum;
		}

		public void setFinishedTaskNum(Long finishedTaskNum) {
			this.finishedTaskNum = finishedTaskNum;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getParams() {
			return this.params;
		}

		public void setParams(String params) {
			this.params = params;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Long getRunningTime() {
			return this.runningTime;
		}

		public void setRunningTime(Long runningTime) {
			this.runningTime = runningTime;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}

	@Override
	public ListOpsOperationResponse getInstance(UnmarshallerContext context) {
		return	ListOpsOperationResponseUnmarshaller.unmarshall(this, context);
	}
}
