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
import com.aliyuncs.dataphin_public.transform.v20230630.GetTableLineagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableLineagesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<TableLineage> tableLineageList;

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

	public List<TableLineage> getTableLineageList() {
		return this.tableLineageList;
	}

	public void setTableLineageList(List<TableLineage> tableLineageList) {
		this.tableLineageList = tableLineageList;
	}

	public static class TableLineage {

		private String nodeId;

		private String nodeEnv;

		private String inputTableEnv;

		private String inputTableGuid;

		private String inputTableName;

		private Long inputProjectId;

		private Long inputBizUnitId;

		private Long inputDataSourceId;

		private String inputDataSourceType;

		private Boolean inputTableDeleted;

		private String outputTableEnv;

		private String outputTableGuid;

		private String outputTableName;

		private Long outputProjectId;

		private Long outputBizUnitId;

		private Long outputDataSourceId;

		private String outputDataSourceType;

		private Boolean outputTableDeleted;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getNodeEnv() {
			return this.nodeEnv;
		}

		public void setNodeEnv(String nodeEnv) {
			this.nodeEnv = nodeEnv;
		}

		public String getInputTableEnv() {
			return this.inputTableEnv;
		}

		public void setInputTableEnv(String inputTableEnv) {
			this.inputTableEnv = inputTableEnv;
		}

		public String getInputTableGuid() {
			return this.inputTableGuid;
		}

		public void setInputTableGuid(String inputTableGuid) {
			this.inputTableGuid = inputTableGuid;
		}

		public String getInputTableName() {
			return this.inputTableName;
		}

		public void setInputTableName(String inputTableName) {
			this.inputTableName = inputTableName;
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

		public String getInputDataSourceType() {
			return this.inputDataSourceType;
		}

		public void setInputDataSourceType(String inputDataSourceType) {
			this.inputDataSourceType = inputDataSourceType;
		}

		public Boolean getInputTableDeleted() {
			return this.inputTableDeleted;
		}

		public void setInputTableDeleted(Boolean inputTableDeleted) {
			this.inputTableDeleted = inputTableDeleted;
		}

		public String getOutputTableEnv() {
			return this.outputTableEnv;
		}

		public void setOutputTableEnv(String outputTableEnv) {
			this.outputTableEnv = outputTableEnv;
		}

		public String getOutputTableGuid() {
			return this.outputTableGuid;
		}

		public void setOutputTableGuid(String outputTableGuid) {
			this.outputTableGuid = outputTableGuid;
		}

		public String getOutputTableName() {
			return this.outputTableName;
		}

		public void setOutputTableName(String outputTableName) {
			this.outputTableName = outputTableName;
		}

		public Long getOutputProjectId() {
			return this.outputProjectId;
		}

		public void setOutputProjectId(Long outputProjectId) {
			this.outputProjectId = outputProjectId;
		}

		public Long getOutputBizUnitId() {
			return this.outputBizUnitId;
		}

		public void setOutputBizUnitId(Long outputBizUnitId) {
			this.outputBizUnitId = outputBizUnitId;
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

		public Boolean getOutputTableDeleted() {
			return this.outputTableDeleted;
		}

		public void setOutputTableDeleted(Boolean outputTableDeleted) {
			this.outputTableDeleted = outputTableDeleted;
		}
	}

	@Override
	public GetTableLineagesResponse getInstance(UnmarshallerContext context) {
		return	GetTableLineagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
