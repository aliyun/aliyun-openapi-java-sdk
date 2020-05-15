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

package com.aliyuncs.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeSynchronizationJobStatusListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSynchronizationJobStatusListResponse extends AcsResponse {

	private String errCode;

	private String errMessage;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private String success;

	private Long totalRecordCount;

	private List<SynchronizationJobStatusInfo> synchronizationJobListStatusList;

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<SynchronizationJobStatusInfo> getSynchronizationJobListStatusList() {
		return this.synchronizationJobListStatusList;
	}

	public void setSynchronizationJobListStatusList(List<SynchronizationJobStatusInfo> synchronizationJobListStatusList) {
		this.synchronizationJobListStatusList = synchronizationJobListStatusList;
	}

	public static class SynchronizationJobStatusInfo {

		private String synchronizationJobId;

		private List<SynchronizationDirectionInfo> synchronizationDirectionInfoList;

		public String getSynchronizationJobId() {
			return this.synchronizationJobId;
		}

		public void setSynchronizationJobId(String synchronizationJobId) {
			this.synchronizationJobId = synchronizationJobId;
		}

		public List<SynchronizationDirectionInfo> getSynchronizationDirectionInfoList() {
			return this.synchronizationDirectionInfoList;
		}

		public void setSynchronizationDirectionInfoList(List<SynchronizationDirectionInfo> synchronizationDirectionInfoList) {
			this.synchronizationDirectionInfoList = synchronizationDirectionInfoList;
		}

		public static class SynchronizationDirectionInfo {

			private String checkpoint;

			private String status;

			private String synchronizationDirection;

			public String getCheckpoint() {
				return this.checkpoint;
			}

			public void setCheckpoint(String checkpoint) {
				this.checkpoint = checkpoint;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSynchronizationDirection() {
				return this.synchronizationDirection;
			}

			public void setSynchronizationDirection(String synchronizationDirection) {
				this.synchronizationDirection = synchronizationDirection;
			}
		}
	}

	@Override
	public DescribeSynchronizationJobStatusListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSynchronizationJobStatusListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
