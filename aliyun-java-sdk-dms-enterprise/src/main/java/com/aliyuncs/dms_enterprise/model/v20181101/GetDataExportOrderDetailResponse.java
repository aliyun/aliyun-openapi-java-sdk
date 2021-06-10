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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataExportOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataExportOrderDetailResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private DataExportOrderDetail dataExportOrderDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public DataExportOrderDetail getDataExportOrderDetail() {
		return this.dataExportOrderDetail;
	}

	public void setDataExportOrderDetail(DataExportOrderDetail dataExportOrderDetail) {
		this.dataExportOrderDetail = dataExportOrderDetail;
	}

	public static class DataExportOrderDetail {

		private KeyInfo keyInfo;

		private OrderDetail orderDetail;

		public KeyInfo getKeyInfo() {
			return this.keyInfo;
		}

		public void setKeyInfo(KeyInfo keyInfo) {
			this.keyInfo = keyInfo;
		}

		public OrderDetail getOrderDetail() {
			return this.orderDetail;
		}

		public void setOrderDetail(OrderDetail orderDetail) {
			this.orderDetail = orderDetail;
		}

		public static class KeyInfo {

			private Long preCheckId;

			private String jobStatus;

			public Long getPreCheckId() {
				return this.preCheckId;
			}

			public void setPreCheckId(Long preCheckId) {
				this.preCheckId = preCheckId;
			}

			public String getJobStatus() {
				return this.jobStatus;
			}

			public void setJobStatus(String jobStatus) {
				this.jobStatus = jobStatus;
			}
		}

		public static class OrderDetail {

			private Integer dbId;

			private String database;

			private String classify;

			private String exeSQL;

			private Boolean logic;

			private Long actualAffectRows;

			private Boolean ignoreAffectRows;

			private String ignoreAffectRowsReason;

			private String envType;

			public Integer getDbId() {
				return this.dbId;
			}

			public void setDbId(Integer dbId) {
				this.dbId = dbId;
			}

			public String getDatabase() {
				return this.database;
			}

			public void setDatabase(String database) {
				this.database = database;
			}

			public String getClassify() {
				return this.classify;
			}

			public void setClassify(String classify) {
				this.classify = classify;
			}

			public String getExeSQL() {
				return this.exeSQL;
			}

			public void setExeSQL(String exeSQL) {
				this.exeSQL = exeSQL;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}

			public Long getActualAffectRows() {
				return this.actualAffectRows;
			}

			public void setActualAffectRows(Long actualAffectRows) {
				this.actualAffectRows = actualAffectRows;
			}

			public Boolean getIgnoreAffectRows() {
				return this.ignoreAffectRows;
			}

			public void setIgnoreAffectRows(Boolean ignoreAffectRows) {
				this.ignoreAffectRows = ignoreAffectRows;
			}

			public String getIgnoreAffectRowsReason() {
				return this.ignoreAffectRowsReason;
			}

			public void setIgnoreAffectRowsReason(String ignoreAffectRowsReason) {
				this.ignoreAffectRowsReason = ignoreAffectRowsReason;
			}

			public String getEnvType() {
				return this.envType;
			}

			public void setEnvType(String envType) {
				this.envType = envType;
			}
		}
	}

	@Override
	public GetDataExportOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDataExportOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
