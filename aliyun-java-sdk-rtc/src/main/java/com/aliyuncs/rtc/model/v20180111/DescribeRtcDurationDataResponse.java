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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcDurationDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcDurationDataResponse extends AcsResponse {

	private String requestId;

	private List<DurationModule> durationDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DurationModule> getDurationDataPerInterval() {
		return this.durationDataPerInterval;
	}

	public void setDurationDataPerInterval(List<DurationModule> durationDataPerInterval) {
		this.durationDataPerInterval = durationDataPerInterval;
	}

	public static class DurationModule {

		private String timeStamp;

		private Long totalDuration;

		private Long audioDuration;

		private Long v360Duration;

		private Long v720Duration;

		private Long v1080Duration;

		private Long contentDuration;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
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

		public Long getV360Duration() {
			return this.v360Duration;
		}

		public void setV360Duration(Long v360Duration) {
			this.v360Duration = v360Duration;
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

		public Long getContentDuration() {
			return this.contentDuration;
		}

		public void setContentDuration(Long contentDuration) {
			this.contentDuration = contentDuration;
		}
	}

	@Override
	public DescribeRtcDurationDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcDurationDataResponseUnmarshaller.unmarshall(this, context);
	}
}
