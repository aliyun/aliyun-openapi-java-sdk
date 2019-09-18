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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcChannelMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcChannelMetricResponse extends AcsResponse {

	private String requestId;

	private ChannelMetricInfo channelMetricInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ChannelMetricInfo getChannelMetricInfo() {
		return this.channelMetricInfo;
	}

	public void setChannelMetricInfo(ChannelMetricInfo channelMetricInfo) {
		this.channelMetricInfo = channelMetricInfo;
	}

	public static class ChannelMetricInfo {

		private ChannelMetric channelMetric;

		private Duration duration;

		public ChannelMetric getChannelMetric() {
			return this.channelMetric;
		}

		public void setChannelMetric(ChannelMetric channelMetric) {
			this.channelMetric = channelMetric;
		}

		public Duration getDuration() {
			return this.duration;
		}

		public void setDuration(Duration duration) {
			this.duration = duration;
		}

		public static class ChannelMetric {

			private String channelId;

			private Integer userCount;

			private Integer pubUserCount;

			private Integer subUserCount;

			private String startTime;

			private String endTime;

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public Integer getUserCount() {
				return this.userCount;
			}

			public void setUserCount(Integer userCount) {
				this.userCount = userCount;
			}

			public Integer getPubUserCount() {
				return this.pubUserCount;
			}

			public void setPubUserCount(Integer pubUserCount) {
				this.pubUserCount = pubUserCount;
			}

			public Integer getSubUserCount() {
				return this.subUserCount;
			}

			public void setSubUserCount(Integer subUserCount) {
				this.subUserCount = subUserCount;
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
		}

		public static class Duration {

			private PubDuration pubDuration;

			private SubDuration subDuration;

			public PubDuration getPubDuration() {
				return this.pubDuration;
			}

			public void setPubDuration(PubDuration pubDuration) {
				this.pubDuration = pubDuration;
			}

			public SubDuration getSubDuration() {
				return this.subDuration;
			}

			public void setSubDuration(SubDuration subDuration) {
				this.subDuration = subDuration;
			}

			public static class PubDuration {

				private Integer audio;

				private Integer video360;

				private Integer video720;

				private Integer video1080;

				private Integer content;

				public Integer getAudio() {
					return this.audio;
				}

				public void setAudio(Integer audio) {
					this.audio = audio;
				}

				public Integer getVideo360() {
					return this.video360;
				}

				public void setVideo360(Integer video360) {
					this.video360 = video360;
				}

				public Integer getVideo720() {
					return this.video720;
				}

				public void setVideo720(Integer video720) {
					this.video720 = video720;
				}

				public Integer getVideo1080() {
					return this.video1080;
				}

				public void setVideo1080(Integer video1080) {
					this.video1080 = video1080;
				}

				public Integer getContent() {
					return this.content;
				}

				public void setContent(Integer content) {
					this.content = content;
				}
			}

			public static class SubDuration {

				private Integer audio;

				private Integer video360;

				private Integer video720;

				private Integer video1080;

				private Integer content;

				public Integer getAudio() {
					return this.audio;
				}

				public void setAudio(Integer audio) {
					this.audio = audio;
				}

				public Integer getVideo360() {
					return this.video360;
				}

				public void setVideo360(Integer video360) {
					this.video360 = video360;
				}

				public Integer getVideo720() {
					return this.video720;
				}

				public void setVideo720(Integer video720) {
					this.video720 = video720;
				}

				public Integer getVideo1080() {
					return this.video1080;
				}

				public void setVideo1080(Integer video1080) {
					this.video1080 = video1080;
				}

				public Integer getContent() {
					return this.content;
				}

				public void setContent(Integer content) {
					this.content = content;
				}
			}
		}
	}

	@Override
	public DescribeRtcChannelMetricResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcChannelMetricResponseUnmarshaller.unmarshall(this, context);
	}
}
