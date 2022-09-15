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
import com.aliyuncs.live.transform.v20161101.DescribeMeterLiveRtcDurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMeterLiveRtcDurationResponse extends AcsResponse {

	private String requestId;

	private Long totalSummaryDuration;

	private Long audioSummaryDuration;

	private Long v480SummaryDuration;

	private Long v720SummaryDuration;

	private Long v1080SummaryDuration;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalSummaryDuration() {
		return this.totalSummaryDuration;
	}

	public void setTotalSummaryDuration(Long totalSummaryDuration) {
		this.totalSummaryDuration = totalSummaryDuration;
	}

	public Long getAudioSummaryDuration() {
		return this.audioSummaryDuration;
	}

	public void setAudioSummaryDuration(Long audioSummaryDuration) {
		this.audioSummaryDuration = audioSummaryDuration;
	}

	public Long getV480SummaryDuration() {
		return this.v480SummaryDuration;
	}

	public void setV480SummaryDuration(Long v480SummaryDuration) {
		this.v480SummaryDuration = v480SummaryDuration;
	}

	public Long getV720SummaryDuration() {
		return this.v720SummaryDuration;
	}

	public void setV720SummaryDuration(Long v720SummaryDuration) {
		this.v720SummaryDuration = v720SummaryDuration;
	}

	public Long getV1080SummaryDuration() {
		return this.v1080SummaryDuration;
	}

	public void setV1080SummaryDuration(Long v1080SummaryDuration) {
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

		private Long totalDuration;

		private Long audioDuration;

		private Long v480Duration;

		private Long v720Duration;

		private Long v1080Duration;

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public Long getTotalDuration() {
			return this.totalDuration;
		}

		public void setTotalDuration(Long totalDuration) {
			this.totalDuration = totalDuration;
		}

		public Long getAudioDuration() {
			return this.audioDuration;
		}

		public void setAudioDuration(Long audioDuration) {
			this.audioDuration = audioDuration;
		}

		public Long getV480Duration() {
			return this.v480Duration;
		}

		public void setV480Duration(Long v480Duration) {
			this.v480Duration = v480Duration;
		}

		public Long getV720Duration() {
			return this.v720Duration;
		}

		public void setV720Duration(Long v720Duration) {
			this.v720Duration = v720Duration;
		}

		public Long getV1080Duration() {
			return this.v1080Duration;
		}

		public void setV1080Duration(Long v1080Duration) {
			this.v1080Duration = v1080Duration;
		}
	}

	@Override
	public DescribeMeterLiveRtcDurationResponse getInstance(UnmarshallerContext context) {
		return	DescribeMeterLiveRtcDurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
