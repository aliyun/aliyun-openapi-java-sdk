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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.ListOTAJobByDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOTAJobByDeviceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Integer total;

	private Integer pageSize;

	private Integer pageCount;

	private Integer currentPage;

	private List<SimpleOTAJobInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<SimpleOTAJobInfo> getData() {
		return this.data;
	}

	public void setData(List<SimpleOTAJobInfo> data) {
		this.data = data;
	}

	public static class SimpleOTAJobInfo {

		private String jobId;

		private String utcCreate;

		private String utcModified;

		private String productKey;

		private String firmwareId;

		private String utcStartTime;

		private String utcEndTime;

		private String jobStatus;

		private String jobType;

		private String targetSelection;

		private String selectionType;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getFirmwareId() {
			return this.firmwareId;
		}

		public void setFirmwareId(String firmwareId) {
			this.firmwareId = firmwareId;
		}

		public String getUtcStartTime() {
			return this.utcStartTime;
		}

		public void setUtcStartTime(String utcStartTime) {
			this.utcStartTime = utcStartTime;
		}

		public String getUtcEndTime() {
			return this.utcEndTime;
		}

		public void setUtcEndTime(String utcEndTime) {
			this.utcEndTime = utcEndTime;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getTargetSelection() {
			return this.targetSelection;
		}

		public void setTargetSelection(String targetSelection) {
			this.targetSelection = targetSelection;
		}

		public String getSelectionType() {
			return this.selectionType;
		}

		public void setSelectionType(String selectionType) {
			this.selectionType = selectionType;
		}
	}

	@Override
	public ListOTAJobByDeviceResponse getInstance(UnmarshallerContext context) {
		return	ListOTAJobByDeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
