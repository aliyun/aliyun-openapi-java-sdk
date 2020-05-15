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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.GenerateOverallStatisticsReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateOverallStatisticsReportResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private OverallStatisticsReport overallStatisticsReport;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public OverallStatisticsReport getOverallStatisticsReport() {
		return this.overallStatisticsReport;
	}

	public void setOverallStatisticsReport(OverallStatisticsReport overallStatisticsReport) {
		this.overallStatisticsReport = overallStatisticsReport;
	}

	public static class OverallStatisticsReport {

		private List<KeyValuePair> indicators;

		private List<KeyValuePair> briefs;

		private List<KeyValuePair> summaries;

		public List<KeyValuePair> getIndicators() {
			return this.indicators;
		}

		public void setIndicators(List<KeyValuePair> indicators) {
			this.indicators = indicators;
		}

		public List<KeyValuePair> getBriefs() {
			return this.briefs;
		}

		public void setBriefs(List<KeyValuePair> briefs) {
			this.briefs = briefs;
		}

		public List<KeyValuePair> getSummaries() {
			return this.summaries;
		}

		public void setSummaries(List<KeyValuePair> summaries) {
			this.summaries = summaries;
		}

		public static class KeyValuePair {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GenerateOverallStatisticsReportResponse getInstance(UnmarshallerContext context) {
		return	GenerateOverallStatisticsReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
