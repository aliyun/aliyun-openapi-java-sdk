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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeAnomalySQLListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnomalySQLListResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private List<Data> anomalySQLList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getAnomalySQLList() {
		return this.anomalySQLList;
	}

	public void setAnomalySQLList(List<Data> anomalySQLList) {
		this.anomalySQLList = anomalySQLList;
	}

	public static class Data {

		private Long key;

		private String diagnosisRule;

		private String sQLText;

		private String suggestion;

		private String dbName;

		private String requestTimeUTCString;

		private Float cpuTime;

		private String sQLId;

		private String diagnosis;

		private Float requestTime;

		private Long executions;

		private String userName;

		public Long getKey() {
			return this.key;
		}

		public void setKey(Long key) {
			this.key = key;
		}

		public String getDiagnosisRule() {
			return this.diagnosisRule;
		}

		public void setDiagnosisRule(String diagnosisRule) {
			this.diagnosisRule = diagnosisRule;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getRequestTimeUTCString() {
			return this.requestTimeUTCString;
		}

		public void setRequestTimeUTCString(String requestTimeUTCString) {
			this.requestTimeUTCString = requestTimeUTCString;
		}

		public Float getCpuTime() {
			return this.cpuTime;
		}

		public void setCpuTime(Float cpuTime) {
			this.cpuTime = cpuTime;
		}

		public String getSQLId() {
			return this.sQLId;
		}

		public void setSQLId(String sQLId) {
			this.sQLId = sQLId;
		}

		public String getDiagnosis() {
			return this.diagnosis;
		}

		public void setDiagnosis(String diagnosis) {
			this.diagnosis = diagnosis;
		}

		public Float getRequestTime() {
			return this.requestTime;
		}

		public void setRequestTime(Float requestTime) {
			this.requestTime = requestTime;
		}

		public Long getExecutions() {
			return this.executions;
		}

		public void setExecutions(Long executions) {
			this.executions = executions;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	@Override
	public DescribeAnomalySQLListResponse getInstance(UnmarshallerContext context) {
		return	DescribeAnomalySQLListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
