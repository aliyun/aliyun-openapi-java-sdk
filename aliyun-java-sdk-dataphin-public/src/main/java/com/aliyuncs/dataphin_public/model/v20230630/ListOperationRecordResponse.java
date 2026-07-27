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
import com.aliyuncs.dataphin_public.transform.v20230630.ListOperationRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOperationRecordResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private OperationLogListResponse operationLogListResponse;

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

	public OperationLogListResponse getOperationLogListResponse() {
		return this.operationLogListResponse;
	}

	public void setOperationLogListResponse(OperationLogListResponse operationLogListResponse) {
		this.operationLogListResponse = operationLogListResponse;
	}

	public static class OperationLogListResponse {

		private Integer count;

		private List<OperationLog> resultData;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<OperationLog> getResultData() {
			return this.resultData;
		}

		public void setResultData(List<OperationLog> resultData) {
			this.resultData = resultData;
		}

		public static class OperationLog {

			private Integer status;

			private String runner;

			private Long operationId;

			private Long projectId;

			private String beginTime;

			private Long duration;

			private String name;

			private String objectType;

			private Long tenantId;

			private Integer codeType;

			private Long id;

			private String runnerName;

			private List<String> relationTables;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getRunner() {
				return this.runner;
			}

			public void setRunner(String runner) {
				this.runner = runner;
			}

			public Long getOperationId() {
				return this.operationId;
			}

			public void setOperationId(Long operationId) {
				this.operationId = operationId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(String beginTime) {
				this.beginTime = beginTime;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public Long getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(Long tenantId) {
				this.tenantId = tenantId;
			}

			public Integer getCodeType() {
				return this.codeType;
			}

			public void setCodeType(Integer codeType) {
				this.codeType = codeType;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getRunnerName() {
				return this.runnerName;
			}

			public void setRunnerName(String runnerName) {
				this.runnerName = runnerName;
			}

			public List<String> getRelationTables() {
				return this.relationTables;
			}

			public void setRelationTables(List<String> relationTables) {
				this.relationTables = relationTables;
			}
		}
	}

	@Override
	public ListOperationRecordResponse getInstance(UnmarshallerContext context) {
		return	ListOperationRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
