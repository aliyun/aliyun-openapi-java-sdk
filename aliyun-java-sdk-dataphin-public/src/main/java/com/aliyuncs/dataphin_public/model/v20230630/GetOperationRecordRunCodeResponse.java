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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetOperationRecordRunCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOperationRecordRunCodeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private OperationLogCodeResponse operationLogCodeResponse;

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

	public OperationLogCodeResponse getOperationLogCodeResponse() {
		return this.operationLogCodeResponse;
	}

	public void setOperationLogCodeResponse(OperationLogCodeResponse operationLogCodeResponse) {
		this.operationLogCodeResponse = operationLogCodeResponse;
	}

	public static class OperationLogCodeResponse {

		private Integer operatorId;

		private String code;

		private String operatorName;

		private Integer sqlNum;

		public Integer getOperatorId() {
			return this.operatorId;
		}

		public void setOperatorId(Integer operatorId) {
			this.operatorId = operatorId;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}

		public Integer getSqlNum() {
			return this.sqlNum;
		}

		public void setSqlNum(Integer sqlNum) {
			this.sqlNum = sqlNum;
		}
	}

	@Override
	public GetOperationRecordRunCodeResponse getInstance(UnmarshallerContext context) {
		return	GetOperationRecordRunCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
