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

package com.aliyuncs.openanalytics_open.model.v20180619;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.QueryTaskSumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskSumResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private QueryTaskSumInfo queryTaskSumInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public QueryTaskSumInfo getQueryTaskSumInfo() {
		return this.queryTaskSumInfo;
	}

	public void setQueryTaskSumInfo(QueryTaskSumInfo queryTaskSumInfo) {
		this.queryTaskSumInfo = queryTaskSumInfo;
	}

	public static class QueryTaskSumInfo {

		private String uid;

		private String scannedDataBytesGbToday;

		private String totalStmtCountToday;

		private String totalChargedStmtCountToday;

		private String scannedDataBytesTodayIncr;

		private String totalStmtCountTodayIncr;

		private String totalChargedStmtCountTodayIncr;

		private String scannedDataBytesGbYesterday;

		private String totalStmtCountYesterday;

		private String totalChargedStmtCountYesterday;

		private String scannedDataBytesYesterdayIncr;

		private String totalStmtCountYesterdayIncr;

		private String totalChargedStmtCountYesterdayIncr;

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getScannedDataBytesGbToday() {
			return this.scannedDataBytesGbToday;
		}

		public void setScannedDataBytesGbToday(String scannedDataBytesGbToday) {
			this.scannedDataBytesGbToday = scannedDataBytesGbToday;
		}

		public String getTotalStmtCountToday() {
			return this.totalStmtCountToday;
		}

		public void setTotalStmtCountToday(String totalStmtCountToday) {
			this.totalStmtCountToday = totalStmtCountToday;
		}

		public String getTotalChargedStmtCountToday() {
			return this.totalChargedStmtCountToday;
		}

		public void setTotalChargedStmtCountToday(String totalChargedStmtCountToday) {
			this.totalChargedStmtCountToday = totalChargedStmtCountToday;
		}

		public String getScannedDataBytesTodayIncr() {
			return this.scannedDataBytesTodayIncr;
		}

		public void setScannedDataBytesTodayIncr(String scannedDataBytesTodayIncr) {
			this.scannedDataBytesTodayIncr = scannedDataBytesTodayIncr;
		}

		public String getTotalStmtCountTodayIncr() {
			return this.totalStmtCountTodayIncr;
		}

		public void setTotalStmtCountTodayIncr(String totalStmtCountTodayIncr) {
			this.totalStmtCountTodayIncr = totalStmtCountTodayIncr;
		}

		public String getTotalChargedStmtCountTodayIncr() {
			return this.totalChargedStmtCountTodayIncr;
		}

		public void setTotalChargedStmtCountTodayIncr(String totalChargedStmtCountTodayIncr) {
			this.totalChargedStmtCountTodayIncr = totalChargedStmtCountTodayIncr;
		}

		public String getScannedDataBytesGbYesterday() {
			return this.scannedDataBytesGbYesterday;
		}

		public void setScannedDataBytesGbYesterday(String scannedDataBytesGbYesterday) {
			this.scannedDataBytesGbYesterday = scannedDataBytesGbYesterday;
		}

		public String getTotalStmtCountYesterday() {
			return this.totalStmtCountYesterday;
		}

		public void setTotalStmtCountYesterday(String totalStmtCountYesterday) {
			this.totalStmtCountYesterday = totalStmtCountYesterday;
		}

		public String getTotalChargedStmtCountYesterday() {
			return this.totalChargedStmtCountYesterday;
		}

		public void setTotalChargedStmtCountYesterday(String totalChargedStmtCountYesterday) {
			this.totalChargedStmtCountYesterday = totalChargedStmtCountYesterday;
		}

		public String getScannedDataBytesYesterdayIncr() {
			return this.scannedDataBytesYesterdayIncr;
		}

		public void setScannedDataBytesYesterdayIncr(String scannedDataBytesYesterdayIncr) {
			this.scannedDataBytesYesterdayIncr = scannedDataBytesYesterdayIncr;
		}

		public String getTotalStmtCountYesterdayIncr() {
			return this.totalStmtCountYesterdayIncr;
		}

		public void setTotalStmtCountYesterdayIncr(String totalStmtCountYesterdayIncr) {
			this.totalStmtCountYesterdayIncr = totalStmtCountYesterdayIncr;
		}

		public String getTotalChargedStmtCountYesterdayIncr() {
			return this.totalChargedStmtCountYesterdayIncr;
		}

		public void setTotalChargedStmtCountYesterdayIncr(String totalChargedStmtCountYesterdayIncr) {
			this.totalChargedStmtCountYesterdayIncr = totalChargedStmtCountYesterdayIncr;
		}
	}

	@Override
	public QueryTaskSumResponse getInstance(UnmarshallerContext context) {
		return	QueryTaskSumResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
