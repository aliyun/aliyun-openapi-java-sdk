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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveRtcRecordUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveRtcRecordUsageDataResponse extends AcsResponse {

	private String requestId;

	private String recordMode;

	private String appId;

	private Double totalSummaryDuration;

	private Double audioSummaryDuration;

	private Double v480SummaryDuration;

	private Double v720SummaryDuration;

	private Double v1080SummaryDuration;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRecordMode() {
		return this.recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Double getTotalSummaryDuration() {
		return this.totalSummaryDuration;
	}

	public void setTotalSummaryDuration(Double totalSummaryDuration) {
		this.totalSummaryDuration = totalSummaryDuration;
	}

	public Double getAudioSummaryDuration() {
		return this.audioSummaryDuration;
	}

	public void setAudioSummaryDuration(Double audioSummaryDuration) {
		this.audioSummaryDuration = audioSummaryDuration;
	}

	public Double getV480SummaryDuration() {
		return this.v480SummaryDuration;
	}

	public void setV480SummaryDuration(Double v480SummaryDuration) {
		this.v480SummaryDuration = v480SummaryDuration;
	}

	public Double getV720SummaryDuration() {
		return this.v720SummaryDuration;
	}

	public void setV720SummaryDuration(Double v720SummaryDuration) {
		this.v720SummaryDuration = v720SummaryDuration;
	}

	public Double getV1080SummaryDuration() {
		return this.v1080SummaryDuration;
	}

	public void setV1080SummaryDuration(Double v1080SummaryDuration) {
		this.v1080SummaryDuration = v1080SummaryDuration;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String timestamp;

		private Double totalDuration;

		private Double audioDuration;

		private Double v480Duration;

		private Double v720Duration;

		private Double v1080Duration;

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public Double getTotalDuration() {
			return this.totalDuration;
		}

		public void setTotalDuration(Double totalDuration) {
			this.totalDuration = totalDuration;
		}

		public Double getAudioDuration() {
			return this.audioDuration;
		}

		public void setAudioDuration(Double audioDuration) {
			this.audioDuration = audioDuration;
		}

		public Double getV480Duration() {
			return this.v480Duration;
		}

		public void setV480Duration(Double v480Duration) {
			this.v480Duration = v480Duration;
		}

		public Double getV720Duration() {
			return this.v720Duration;
		}

		public void setV720Duration(Double v720Duration) {
			this.v720Duration = v720Duration;
		}

		public Double getV1080Duration() {
			return this.v1080Duration;
		}

		public void setV1080Duration(Double v1080Duration) {
			this.v1080Duration = v1080Duration;
		}
	}

	@Override
	public DescribeLiveRtcRecordUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveRtcRecordUsageDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
