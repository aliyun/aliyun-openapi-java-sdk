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

package com.aliyuncs.airec.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.DescribeSyncReportDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSyncReportDetailResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<ResultItem> result;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String type;

		private Float errorPercent;

		private Integer errorCount;

		private Boolean defaultDisplay;

		private Boolean sampleDisplay;

		private List<HistoryDataItem> historyData;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Float getErrorPercent() {
			return this.errorPercent;
		}

		public void setErrorPercent(Float errorPercent) {
			this.errorPercent = errorPercent;
		}

		public Integer getErrorCount() {
			return this.errorCount;
		}

		public void setErrorCount(Integer errorCount) {
			this.errorCount = errorCount;
		}

		public Boolean getDefaultDisplay() {
			return this.defaultDisplay;
		}

		public void setDefaultDisplay(Boolean defaultDisplay) {
			this.defaultDisplay = defaultDisplay;
		}

		public Boolean getSampleDisplay() {
			return this.sampleDisplay;
		}

		public void setSampleDisplay(Boolean sampleDisplay) {
			this.sampleDisplay = sampleDisplay;
		}

		public List<HistoryDataItem> getHistoryData() {
			return this.historyData;
		}

		public void setHistoryData(List<HistoryDataItem> historyData) {
			this.historyData = historyData;
		}

		public static class HistoryDataItem {

			private Float errorPercent;

			private Long startTime;

			private Long endTime;

			public Float getErrorPercent() {
				return this.errorPercent;
			}

			public void setErrorPercent(Float errorPercent) {
				this.errorPercent = errorPercent;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public DescribeSyncReportDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeSyncReportDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
