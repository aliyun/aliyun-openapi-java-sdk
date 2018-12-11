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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDiagnosticReportListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosticReportListResponse extends AcsResponse {

	private String requestId;

	private List<Report> reportList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Report> getReportList() {
		return this.reportList;
	}

	public void setReportList(List<Report> reportList) {
		this.reportList = reportList;
	}

	public static class Report {

		private String diagnosticTime;

		private Integer score;

		private String startTime;

		private String endTime;

		private String downloadURL;

		public String getDiagnosticTime() {
			return this.diagnosticTime;
		}

		public void setDiagnosticTime(String diagnosticTime) {
			this.diagnosticTime = diagnosticTime;
		}

		public Integer getScore() {
			return this.score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getDownloadURL() {
			return this.downloadURL;
		}

		public void setDownloadURL(String downloadURL) {
			this.downloadURL = downloadURL;
		}
	}

	@Override
	public DescribeDiagnosticReportListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosticReportListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
