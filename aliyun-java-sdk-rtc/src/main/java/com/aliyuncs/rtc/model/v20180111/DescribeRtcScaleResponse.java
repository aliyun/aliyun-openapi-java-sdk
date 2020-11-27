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
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcScaleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcScaleResponse extends AcsResponse {

	private String requestId;

	private List<ScaleItem> scale;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScaleItem> getScale() {
		return this.scale;
	}

	public void setScale(List<ScaleItem> scale) {
		this.scale = scale;
	}

	public static class ScaleItem {

		private String time;

		private Long channelCount;

		private Long userCount;

		private Long sessionCount;

		private Long audioDuration;

		private Long videoDuration;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Long getChannelCount() {
			return this.channelCount;
		}

		public void setChannelCount(Long channelCount) {
			this.channelCount = channelCount;
		}

		public Long getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Long userCount) {
			this.userCount = userCount;
		}

		public Long getSessionCount() {
			return this.sessionCount;
		}

		public void setSessionCount(Long sessionCount) {
			this.sessionCount = sessionCount;
		}

		public Long getAudioDuration() {
			return this.audioDuration;
		}

		public void setAudioDuration(Long audioDuration) {
			this.audioDuration = audioDuration;
		}

		public Long getVideoDuration() {
			return this.videoDuration;
		}

		public void setVideoDuration(Long videoDuration) {
			this.videoDuration = videoDuration;
		}
	}

	@Override
	public DescribeRtcScaleResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcScaleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
