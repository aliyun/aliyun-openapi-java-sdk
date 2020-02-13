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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataCorrectOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataCorrectOrderDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private DataCorrectOrderDetail dataCorrectOrderDetail;

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

	public DataCorrectOrderDetail getDataCorrectOrderDetail() {
		return this.dataCorrectOrderDetail;
	}

	public void setDataCorrectOrderDetail(DataCorrectOrderDetail dataCorrectOrderDetail) {
		this.dataCorrectOrderDetail = dataCorrectOrderDetail;
	}

	public static class DataCorrectOrderDetail {

		private List<TaskCheckDO> preCheckDetail;

		private List<Database> databaseList;

		private OrderDetail orderDetail;

		public List<TaskCheckDO> getPreCheckDetail() {
			return this.preCheckDetail;
		}

		public void setPreCheckDetail(List<TaskCheckDO> preCheckDetail) {
			this.preCheckDetail = preCheckDetail;
		}

		public List<Database> getDatabaseList() {
			return this.databaseList;
		}

		public void setDatabaseList(List<Database> databaseList) {
			this.databaseList = databaseList;
		}

		public OrderDetail getOrderDetail() {
			return this.orderDetail;
		}

		public void setOrderDetail(OrderDetail orderDetail) {
			this.orderDetail = orderDetail;
		}

		public static class TaskCheckDO {

			private String checkStatus;

			private String checkStep;

			private String userTip;

			public String getCheckStatus() {
				return this.checkStatus;
			}

			public void setCheckStatus(String checkStatus) {
				this.checkStatus = checkStatus;
			}

			public String getCheckStep() {
				return this.checkStep;
			}

			public void setCheckStep(String checkStep) {
				this.checkStep = checkStep;
			}

			public String getUserTip() {
				return this.userTip;
			}

			public void setUserTip(String userTip) {
				this.userTip = userTip;
			}
		}

		public static class Database {

			private String searchName;

			private String envType;

			private String dbType;

			private Integer dbId;

			private Boolean logic;

			public String getSearchName() {
				return this.searchName;
			}

			public void setSearchName(String searchName) {
				this.searchName = searchName;
			}

			public String getEnvType() {
				return this.envType;
			}

			public void setEnvType(String envType) {
				this.envType = envType;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}

			public Integer getDbId() {
				return this.dbId;
			}

			public void setDbId(Integer dbId) {
				this.dbId = dbId;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}
		}

		public static class OrderDetail {

			private String classify;

			private Long estimateAffectRows;

			private Long actualAffectRows;

			private Boolean ignoreAffectRows;

			private String ignoreAffectRowsReason;

			private String sqlType;

			private String exeSQL;

			private String attachmentName;

			private String rbSQLType;

			private String rbSQL;

			private String rbAttachmentName;

			public String getClassify() {
				return this.classify;
			}

			public void setClassify(String classify) {
				this.classify = classify;
			}

			public Long getEstimateAffectRows() {
				return this.estimateAffectRows;
			}

			public void setEstimateAffectRows(Long estimateAffectRows) {
				this.estimateAffectRows = estimateAffectRows;
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

			public String getSqlType() {
				return this.sqlType;
			}

			public void setSqlType(String sqlType) {
				this.sqlType = sqlType;
			}

			public String getExeSQL() {
				return this.exeSQL;
			}

			public void setExeSQL(String exeSQL) {
				this.exeSQL = exeSQL;
			}

			public String getAttachmentName() {
				return this.attachmentName;
			}

			public void setAttachmentName(String attachmentName) {
				this.attachmentName = attachmentName;
			}

			public String getRbSQLType() {
				return this.rbSQLType;
			}

			public void setRbSQLType(String rbSQLType) {
				this.rbSQLType = rbSQLType;
			}

			public String getRbSQL() {
				return this.rbSQL;
			}

			public void setRbSQL(String rbSQL) {
				this.rbSQL = rbSQL;
			}

			public String getRbAttachmentName() {
				return this.rbAttachmentName;
			}

			public void setRbAttachmentName(String rbAttachmentName) {
				this.rbAttachmentName = rbAttachmentName;
			}
		}
	}

	@Override
	public GetDataCorrectOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDataCorrectOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
