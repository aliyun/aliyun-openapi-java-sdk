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
import com.aliyuncs.dataphin_public.transform.v20230630.GetTableLineageByTaskIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableLineageByTaskIdResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private List<LineageInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<LineageInfo> getData() {
		return this.data;
	}

	public void setData(List<LineageInfo> data) {
		this.data = data;
	}

	public static class LineageInfo {

		private Long outputProjectId;

		private String inputTableType;

		private String taskId;

		private String outputTableType;

		private Long inputProjectId;

		private String outputTableName;

		private Boolean inputTableDeleted;

		private String inputEnv;

		private String inputDbType;

		private Long outputBizUnitId;

		private Boolean outputTableDeleted;

		private Long tenantId;

		private String outputTableId;

		private String outputEnv;

		private String inputTableName;

		private String inputTableId;

		private Long outputDataSourceId;

		private String outputDataSourceType;

		private String outputDbType;

		private String inputDataSourceType;

		private Long inputBizUnitId;

		private Long inputDataSourceId;

		private String taskEnv;

		public Long getOutputProjectId() {
			return this.outputProjectId;
		}

		public void setOutputProjectId(Long outputProjectId) {
			this.outputProjectId = outputProjectId;
		}

		public String getInputTableType() {
			return this.inputTableType;
		}

		public void setInputTableType(String inputTableType) {
			this.inputTableType = inputTableType;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getOutputTableType() {
			return this.outputTableType;
		}

		public void setOutputTableType(String outputTableType) {
			this.outputTableType = outputTableType;
		}

		public Long getInputProjectId() {
			return this.inputProjectId;
		}

		public void setInputProjectId(Long inputProjectId) {
			this.inputProjectId = inputProjectId;
		}

		public String getOutputTableName() {
			return this.outputTableName;
		}

		public void setOutputTableName(String outputTableName) {
			this.outputTableName = outputTableName;
		}

		public Boolean getInputTableDeleted() {
			return this.inputTableDeleted;
		}

		public void setInputTableDeleted(Boolean inputTableDeleted) {
			this.inputTableDeleted = inputTableDeleted;
		}

		public String getInputEnv() {
			return this.inputEnv;
		}

		public void setInputEnv(String inputEnv) {
			this.inputEnv = inputEnv;
		}

		public String getInputDbType() {
			return this.inputDbType;
		}

		public void setInputDbType(String inputDbType) {
			this.inputDbType = inputDbType;
		}

		public Long getOutputBizUnitId() {
			return this.outputBizUnitId;
		}

		public void setOutputBizUnitId(Long outputBizUnitId) {
			this.outputBizUnitId = outputBizUnitId;
		}

		public Boolean getOutputTableDeleted() {
			return this.outputTableDeleted;
		}

		public void setOutputTableDeleted(Boolean outputTableDeleted) {
			this.outputTableDeleted = outputTableDeleted;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getOutputTableId() {
			return this.outputTableId;
		}

		public void setOutputTableId(String outputTableId) {
			this.outputTableId = outputTableId;
		}

		public String getOutputEnv() {
			return this.outputEnv;
		}

		public void setOutputEnv(String outputEnv) {
			this.outputEnv = outputEnv;
		}

		public String getInputTableName() {
			return this.inputTableName;
		}

		public void setInputTableName(String inputTableName) {
			this.inputTableName = inputTableName;
		}

		public String getInputTableId() {
			return this.inputTableId;
		}

		public void setInputTableId(String inputTableId) {
			this.inputTableId = inputTableId;
		}

		public Long getOutputDataSourceId() {
			return this.outputDataSourceId;
		}

		public void setOutputDataSourceId(Long outputDataSourceId) {
			this.outputDataSourceId = outputDataSourceId;
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

		public String getInputDataSourceType() {
			return this.inputDataSourceType;
		}

		public void setInputDataSourceType(String inputDataSourceType) {
			this.inputDataSourceType = inputDataSourceType;
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

		public String getTaskEnv() {
			return this.taskEnv;
		}

		public void setTaskEnv(String taskEnv) {
			this.taskEnv = taskEnv;
		}
	}

	@Override
	public GetTableLineageByTaskIdResponse getInstance(UnmarshallerContext context) {
		return	GetTableLineageByTaskIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
