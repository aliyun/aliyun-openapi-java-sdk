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
import com.aliyuncs.rtc.transform.v20180111.DescribeStatisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStatisResponse extends AcsResponse {

	private String requestId;

	private List<StatisInfo> statisInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatisInfo> getStatisInfos() {
		return this.statisInfos;
	}

	public void setStatisInfos(List<StatisInfo> statisInfos) {
		this.statisInfos = statisInfos;
	}

	public static class StatisInfo {

		private String time;

		private List<DurationItem> duration;

		private List<UserStatisItem> userStatis;

		private List<ChannelStatisItem> channelStatis;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public List<DurationItem> getDuration() {
			return this.duration;
		}

		public void setDuration(List<DurationItem> duration) {
			this.duration = duration;
		}

		public List<UserStatisItem> getUserStatis() {
			return this.userStatis;
		}

		public void setUserStatis(List<UserStatisItem> userStatis) {
			this.userStatis = userStatis;
		}

		public List<ChannelStatisItem> getChannelStatis() {
			return this.channelStatis;
		}

		public void setChannelStatis(List<ChannelStatisItem> channelStatis) {
			this.channelStatis = channelStatis;
		}

		public static class DurationItem {

			private Float totalDuration;

			private Float audioDuration;

			private Float sdDuration;

			private Float hdDuration;

			private Float fhdDuration;

			public Float getTotalDuration() {
				return this.totalDuration;
			}

			public void setTotalDuration(Float totalDuration) {
				this.totalDuration = totalDuration;
			}

			public Float getAudioDuration() {
				return this.audioDuration;
			}

			public void setAudioDuration(Float audioDuration) {
				this.audioDuration = audioDuration;
			}

			public Float getSdDuration() {
				return this.sdDuration;
			}

			public void setSdDuration(Float sdDuration) {
				this.sdDuration = sdDuration;
			}

			public Float getHdDuration() {
				return this.hdDuration;
			}

			public void setHdDuration(Float hdDuration) {
				this.hdDuration = hdDuration;
			}

			public Float getFhdDuration() {
				return this.fhdDuration;
			}

			public void setFhdDuration(Float fhdDuration) {
				this.fhdDuration = fhdDuration;
			}
		}

		public static class UserStatisItem {

			private Long activeUserCnt;

			private Long conSessionPeak;

			private String conSessionPeakTime;

			public Long getActiveUserCnt() {
				return this.activeUserCnt;
			}

			public void setActiveUserCnt(Long activeUserCnt) {
				this.activeUserCnt = activeUserCnt;
			}

			public Long getConSessionPeak() {
				return this.conSessionPeak;
			}

			public void setConSessionPeak(Long conSessionPeak) {
				this.conSessionPeak = conSessionPeak;
			}

			public String getConSessionPeakTime() {
				return this.conSessionPeakTime;
			}

			public void setConSessionPeakTime(String conSessionPeakTime) {
				this.conSessionPeakTime = conSessionPeakTime;
			}
		}

		public static class ChannelStatisItem {

			private Long accChannelCnt;

			private Long conChannelPeak;

			private String conChannelPeakTime;

			public Long getAccChannelCnt() {
				return this.accChannelCnt;
			}

			public void setAccChannelCnt(Long accChannelCnt) {
				this.accChannelCnt = accChannelCnt;
			}

			public Long getConChannelPeak() {
				return this.conChannelPeak;
			}

			public void setConChannelPeak(Long conChannelPeak) {
				this.conChannelPeak = conChannelPeak;
			}

			public String getConChannelPeakTime() {
				return this.conChannelPeakTime;
			}

			public void setConChannelPeakTime(String conChannelPeakTime) {
				this.conChannelPeakTime = conChannelPeakTime;
			}
		}
	}

	@Override
	public DescribeStatisResponse getInstance(UnmarshallerContext context) {
		return	DescribeStatisResponseUnmarshaller.unmarshall(this, context);
	}
}
