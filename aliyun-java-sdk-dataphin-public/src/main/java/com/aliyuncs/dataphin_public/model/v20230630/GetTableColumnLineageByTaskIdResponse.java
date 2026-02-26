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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetTableColumnLineageByTaskIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableColumnLineageByTaskIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<LineageInfo> data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<LineageInfo> getData() {
		return this.data;
	}

	public void setData(List<LineageInfo> data) {
		this.data = data;
	}

	public static class LineageInfo {

		private Long tenantId;

		private String taskId;

		private String taskEnv;

		private String inputEnv;

		private String inputTableId;

		private String inputTableName;

		private String inputColumnId;

		private String inputColumnName;

		private String inputTableType;

		private String inputDataSourceType;

		private String inputDbType;

		private Long inputProjectId;

		private Long inputBizUnitId;

		private Long inputDataSourceId;

		private Boolean inputTableDeleted;

		private String outputTableType;

		private String outputEnv;

		private Long outputBizUnitId;

		private String outputDataSourceType;

		private String outputDbType;

		private Long outputProjectId;

		private Long outputDataSourceId;

		private String outputTableId;

		private String outputTableName;

		private String outputColumnId;

		private String outputColumnName;

		private Boolean outputTableDeleted;

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskEnv() {
			return this.taskEnv;
		}

		public void setTaskEnv(String taskEnv) {
			this.taskEnv = taskEnv;
		}

		public String getInputEnv() {
			return this.inputEnv;
		}

		public void setInputEnv(String inputEnv) {
			this.inputEnv = inputEnv;
		}

		public String getInputTableId() {
			return this.inputTableId;
		}

		public void setInputTableId(String inputTableId) {
			this.inputTableId = inputTableId;
		}

		public String getInputTableName() {
			return this.inputTableName;
		}

		public void setInputTableName(String inputTableName) {
			this.inputTableName = inputTableName;
		}

		public String getInputColumnId() {
			return this.inputColumnId;
		}

		public void setInputColumnId(String inputColumnId) {
			this.inputColumnId = inputColumnId;
		}

		public String getInputColumnName() {
			return this.inputColumnName;
		}

		public void setInputColumnName(String inputColumnName) {
			this.inputColumnName = inputColumnName;
		}

		public String getInputTableType() {
			return this.inputTableType;
		}

		public void setInputTableType(String inputTableType) {
			this.inputTableType = inputTableType;
		}

		public String getInputDataSourceType() {
			return this.inputDataSourceType;
		}

		public void setInputDataSourceType(String inputDataSourceType) {
			this.inputDataSourceType = inputDataSourceType;
		}

		public String getInputDbType() {
			return this.inputDbType;
		}

		public void setInputDbType(String inputDbType) {
			this.inputDbType = inputDbType;
		}

		public Long getInputProjectId() {
			return this.inputProjectId;
		}

		public void setInputProjectId(Long inputProjectId) {
			this.inputProjectId = inputProjectId;
		}

		public Long getInputBizUnitId() {
			return this.inputBizUnitId;
		}

		public void setInputBizUnitId(Long inputBizUnitId) {
			this.inputBizUnitId = inputBizUnitId;
		}

		public Long getInputDataSourceId() {
			return this.inputDataSourceId;
		}

		public void setInputDataSourceId(Long inputDataSourceId) {
			this.inputDataSourceId = inputDataSourceId;
		}

		public Boolean getInputTableDeleted() {
			return this.inputTableDeleted;
		}

		public void setInputTableDeleted(Boolean inputTableDeleted) {
			this.inputTableDeleted = inputTableDeleted;
		}

		public String getOutputTableType() {
			return this.outputTableType;
		}

		public void setOutputTableType(String outputTableType) {
			this.outputTableType = outputTableType;
		}

		public String getOutputEnv() {
			return this.outputEnv;
		}

		public void setOutputEnv(String outputEnv) {
			this.outputEnv = outputEnv;
		}

		public Long getOutputBizUnitId() {
			return this.outputBizUnitId;
		}

		public void setOutputBizUnitId(Long outputBizUnitId) {
			this.outputBizUnitId = outputBizUnitId;
		}

		public String getOutputDataSourceType() {
			return this.outputDataSourceType;
		}

		public void setOutputDataSourceType(String outputDataSourceType) {
			this.outputDataSourceType = outputDataSourceType;
		}

		public String getOutputDbType() {
			return this.outputDbType;
		}

		public void setOutputDbType(String outputDbType) {
			this.outputDbType = outputDbType;
		}

		public Long getOutputProjectId() {
			return this.outputProjectId;
		}

		public void setOutputProjectId(Long outputProjectId) {
			this.outputProjectId = outputProjectId;
		}

		public Long getOutputDataSourceId() {
			return this.outputDataSourceId;
		}

		public void setOutputDataSourceId(Long outputDataSourceId) {
			this.outputDataSourceId = outputDataSourceId;
		}

		public String getOutputTableId() {
			return this.outputTableId;
		}

		public void setOutputTableId(String outputTableId) {
			this.outputTableId = outputTableId;
		}

		public String getOutputTableName() {
			return this.outputTableName;
		}

		public void setOutputTableName(String outputTableName) {
			this.outputTableName = outputTableName;
		}

		public String getOutputColumnId() {
			return this.outputColumnId;
		}

		public void setOutputColumnId(String outputColumnId) {
			this.outputColumnId = outputColumnId;
		}

		public String getOutputColumnName() {
			return this.outputColumnName;
		}

		public void setOutputColumnName(String outputColumnName) {
			this.outputColumnName = outputColumnName;
		}

		public Boolean getOutputTableDeleted() {
			return this.outputTableDeleted;
		}

		public void setOutputTableDeleted(Boolean outputTableDeleted) {
			this.outputTableDeleted = outputTableDeleted;
		}
	}

	@Override
	public GetTableColumnLineageByTaskIdResponse getInstance(UnmarshallerContext context) {
		return	GetTableColumnLineageByTaskIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
