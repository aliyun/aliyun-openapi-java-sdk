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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.DescribeSyncReportDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSyncReportDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<ResultItem> result;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Boolean defaultDisplay;

		private Integer errorCount;

		private Float errorPercent;

		private Boolean sampleDisplay;

		private String type;

		private List<HistoryDataItem> historyData;

		public Boolean getDefaultDisplay() {
			return this.defaultDisplay;
		}

		public void setDefaultDisplay(Boolean defaultDisplay) {
			this.defaultDisplay = defaultDisplay;
		}

		public Integer getErrorCount() {
			return this.errorCount;
		}

		public void setErrorCount(Integer errorCount) {
			this.errorCount = errorCount;
		}

		public Float getErrorPercent() {
			return this.errorPercent;
		}

		public void setErrorPercent(Float errorPercent) {
			this.errorPercent = errorPercent;
		}

		public Boolean getSampleDisplay() {
			return this.sampleDisplay;
		}

		public void setSampleDisplay(Boolean sampleDisplay) {
			this.sampleDisplay = sampleDisplay;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<HistoryDataItem> getHistoryData() {
			return this.historyData;
		}

		public void setHistoryData(List<HistoryDataItem> historyData) {
			this.historyData = historyData;
		}

		public static class HistoryDataItem {

			private Long endTime;

			private Float errorPercent;

			private Long startTime;

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

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
