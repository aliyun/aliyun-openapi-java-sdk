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

package com.aliyuncs.dbs.model.v20190306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeRestoreRangeInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreRangeInfoResponse extends AcsResponse {

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private List<DBSRecoverRange> items;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBSRecoverRange> getItems() {
		return this.items;
	}

	public void setItems(List<DBSRecoverRange> items) {
		this.items = items;
	}

	public static class DBSRecoverRange {

		private String sourceEndpointInstanceType;

		private String sourceEndpointInstanceID;

		private String beginTimestampForRestore;

		private String endTimestampForRestore;

		private String rangeType;

		private List<FullBackupDetail> fullBackupList;

		public String getSourceEndpointInstanceType() {
			return this.sourceEndpointInstanceType;
		}

		public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
			this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		}

		public String getSourceEndpointInstanceID() {
			return this.sourceEndpointInstanceID;
		}

		public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
			this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		}

		public String getBeginTimestampForRestore() {
			return this.beginTimestampForRestore;
		}

		public void setBeginTimestampForRestore(String beginTimestampForRestore) {
			this.beginTimestampForRestore = beginTimestampForRestore;
		}

		public String getEndTimestampForRestore() {
			return this.endTimestampForRestore;
		}

		public void setEndTimestampForRestore(String endTimestampForRestore) {
			this.endTimestampForRestore = endTimestampForRestore;
		}

		public String getRangeType() {
			return this.rangeType;
		}

		public void setRangeType(String rangeType) {
			this.rangeType = rangeType;
		}

		public List<FullBackupDetail> getFullBackupList() {
			return this.fullBackupList;
		}

		public void setFullBackupList(List<FullBackupDetail> fullBackupList) {
			this.fullBackupList = fullBackupList;
		}

		public static class FullBackupDetail {

			private String backupSetId;

			private String startTime;

			private String endTime;

			public String getBackupSetId() {
				return this.backupSetId;
			}

			public void setBackupSetId(String backupSetId) {
				this.backupSetId = backupSetId;
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
		}
	}

	@Override
	public DescribeRestoreRangeInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreRangeInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
