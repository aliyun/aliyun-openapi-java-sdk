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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetRequestDiagnosisResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRequestDiagnosisResultResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String messageId;

		private String uuid;

		private String accountId;

		private String sqlId;

		private String engine;

		private String dbSchema;

		private String param;

		private Integer state;

		private String result;

		private String gmtCreate;

		private String gmtModified;

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getSqlId() {
			return this.sqlId;
		}

		public void setSqlId(String sqlId) {
			this.sqlId = sqlId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getDbSchema() {
			return this.dbSchema;
		}

		public void setDbSchema(String dbSchema) {
			this.dbSchema = dbSchema;
		}

		public String getParam() {
			return this.param;
		}

		public void setParam(String param) {
			this.param = param;
		}

		public Integer getState() {
			return this.state;
		}

		public void setState(Integer state) {
			this.state = state;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public GetRequestDiagnosisResultResponse getInstance(UnmarshallerContext context) {
		return	GetRequestDiagnosisResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
