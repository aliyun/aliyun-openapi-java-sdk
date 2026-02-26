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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataTrackOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataTrackOrderDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private DataTrackOrderDetail dataTrackOrderDetail;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public DataTrackOrderDetail getDataTrackOrderDetail() {
		return this.dataTrackOrderDetail;
	}

	public void setDataTrackOrderDetail(DataTrackOrderDetail dataTrackOrderDetail) {
		this.dataTrackOrderDetail = dataTrackOrderDetail;
	}

	public static class DataTrackOrderDetail {

		private Long dbId;

		private Boolean logic;

		private String databaseSearchName;

		private String jobStartTime;

		private String jobEndTime;

		private String schemaName;

		private String jobStatus;

		private String statusDesc;

		private List<String> tableNames;

		private List<String> trackTypes;

		public Long getDbId() {
			return this.dbId;
		}

		public void setDbId(Long dbId) {
			this.dbId = dbId;
		}

		public Boolean getLogic() {
			return this.logic;
		}

		public void setLogic(Boolean logic) {
			this.logic = logic;
		}

		public String getDatabaseSearchName() {
			return this.databaseSearchName;
		}

		public void setDatabaseSearchName(String databaseSearchName) {
			this.databaseSearchName = databaseSearchName;
		}

		public String getJobStartTime() {
			return this.jobStartTime;
		}

		public void setJobStartTime(String jobStartTime) {
			this.jobStartTime = jobStartTime;
		}

		public String getJobEndTime() {
			return this.jobEndTime;
		}

		public void setJobEndTime(String jobEndTime) {
			this.jobEndTime = jobEndTime;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public List<String> getTableNames() {
			return this.tableNames;
		}

		public void setTableNames(List<String> tableNames) {
			this.tableNames = tableNames;
		}

		public List<String> getTrackTypes() {
			return this.trackTypes;
		}

		public void setTrackTypes(List<String> trackTypes) {
			this.trackTypes = trackTypes;
		}
	}

	@Override
	public GetDataTrackOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDataTrackOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
