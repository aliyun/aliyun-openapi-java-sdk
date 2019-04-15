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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeAnalysisLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnalysisLogsResponse extends AcsResponse {

	private String requestId;

	private Logs logs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Logs getLogs() {
		return this.logs;
	}

	public void setLogs(Logs logs) {
		this.logs = logs;
	}

	public static class Logs {

		private Integer processedRow;

		private String whereQuery;

		private String aggQuery;

		private Integer mLimited;

		private String terms;

		private String keys;

		private Integer count;

		private Integer elapsedMilliSecond;

		private String logs;

		private String mMarker;

		public Integer getProcessedRow() {
			return this.processedRow;
		}

		public void setProcessedRow(Integer processedRow) {
			this.processedRow = processedRow;
		}

		public String getWhereQuery() {
			return this.whereQuery;
		}

		public void setWhereQuery(String whereQuery) {
			this.whereQuery = whereQuery;
		}

		public String getAggQuery() {
			return this.aggQuery;
		}

		public void setAggQuery(String aggQuery) {
			this.aggQuery = aggQuery;
		}

		public Integer getMLimited() {
			return this.mLimited;
		}

		public void setMLimited(Integer mLimited) {
			this.mLimited = mLimited;
		}

		public String getTerms() {
			return this.terms;
		}

		public void setTerms(String terms) {
			this.terms = terms;
		}

		public String getKeys() {
			return this.keys;
		}

		public void setKeys(String keys) {
			this.keys = keys;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getElapsedMilliSecond() {
			return this.elapsedMilliSecond;
		}

		public void setElapsedMilliSecond(Integer elapsedMilliSecond) {
			this.elapsedMilliSecond = elapsedMilliSecond;
		}

		public String getLogs() {
			return this.logs;
		}

		public void setLogs(String logs) {
			this.logs = logs;
		}

		public String getMMarker() {
			return this.mMarker;
		}

		public void setMMarker(String mMarker) {
			this.mMarker = mMarker;
		}
	}

	@Override
	public DescribeAnalysisLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAnalysisLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
