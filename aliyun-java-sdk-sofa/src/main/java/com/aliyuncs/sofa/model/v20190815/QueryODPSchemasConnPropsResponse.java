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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryODPSchemasConnPropsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryODPSchemasConnPropsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean allowMinPoolTimeout;

		private Boolean backgroundValidation;

		private Long backgroundValidationMinutes;

		private Long blockingTimeoutMillis;

		private Long idleTimeoutMinutes;

		private Long maxConn;

		private Long minConn;

		private String newConnectionSql;

		private String others;

		private Boolean prefill;

		private Long queryTimeout;

		private Boolean testOnBorrow;

		private String validationQuery;

		private Long validationQueryTimeout;

		public Boolean getAllowMinPoolTimeout() {
			return this.allowMinPoolTimeout;
		}

		public void setAllowMinPoolTimeout(Boolean allowMinPoolTimeout) {
			this.allowMinPoolTimeout = allowMinPoolTimeout;
		}

		public Boolean getBackgroundValidation() {
			return this.backgroundValidation;
		}

		public void setBackgroundValidation(Boolean backgroundValidation) {
			this.backgroundValidation = backgroundValidation;
		}

		public Long getBackgroundValidationMinutes() {
			return this.backgroundValidationMinutes;
		}

		public void setBackgroundValidationMinutes(Long backgroundValidationMinutes) {
			this.backgroundValidationMinutes = backgroundValidationMinutes;
		}

		public Long getBlockingTimeoutMillis() {
			return this.blockingTimeoutMillis;
		}

		public void setBlockingTimeoutMillis(Long blockingTimeoutMillis) {
			this.blockingTimeoutMillis = blockingTimeoutMillis;
		}

		public Long getIdleTimeoutMinutes() {
			return this.idleTimeoutMinutes;
		}

		public void setIdleTimeoutMinutes(Long idleTimeoutMinutes) {
			this.idleTimeoutMinutes = idleTimeoutMinutes;
		}

		public Long getMaxConn() {
			return this.maxConn;
		}

		public void setMaxConn(Long maxConn) {
			this.maxConn = maxConn;
		}

		public Long getMinConn() {
			return this.minConn;
		}

		public void setMinConn(Long minConn) {
			this.minConn = minConn;
		}

		public String getNewConnectionSql() {
			return this.newConnectionSql;
		}

		public void setNewConnectionSql(String newConnectionSql) {
			this.newConnectionSql = newConnectionSql;
		}

		public String getOthers() {
			return this.others;
		}

		public void setOthers(String others) {
			this.others = others;
		}

		public Boolean getPrefill() {
			return this.prefill;
		}

		public void setPrefill(Boolean prefill) {
			this.prefill = prefill;
		}

		public Long getQueryTimeout() {
			return this.queryTimeout;
		}

		public void setQueryTimeout(Long queryTimeout) {
			this.queryTimeout = queryTimeout;
		}

		public Boolean getTestOnBorrow() {
			return this.testOnBorrow;
		}

		public void setTestOnBorrow(Boolean testOnBorrow) {
			this.testOnBorrow = testOnBorrow;
		}

		public String getValidationQuery() {
			return this.validationQuery;
		}

		public void setValidationQuery(String validationQuery) {
			this.validationQuery = validationQuery;
		}

		public Long getValidationQueryTimeout() {
			return this.validationQueryTimeout;
		}

		public void setValidationQueryTimeout(Long validationQueryTimeout) {
			this.validationQueryTimeout = validationQueryTimeout;
		}
	}

	@Override
	public QueryODPSchemasConnPropsResponse getInstance(UnmarshallerContext context) {
		return	QueryODPSchemasConnPropsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
