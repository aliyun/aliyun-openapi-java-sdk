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
import com.aliyuncs.live.transform.v20161101.DescribeLiveUpVideoAudioInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveUpVideoAudioInfoResponse extends AcsResponse {

	private String requestId;

	private List<PublishItem> upItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PublishItem> getUpItems() {
		return this.upItems;
	}

	public void setUpItems(List<PublishItem> upItems) {
		this.upItems = upItems;
	}

	public static class PublishItem {

		private String publishTime;

		private String appName;

		private String codecInfo;

		private String publishIp;

		private String streamName;

		private String publishStatus;

		private String uniqueId;

		private String publishInterval;

		private String stopTime;

		private String domainName;

		private List<VideoFramesItem> videoFrames;

		private List<AudioFramesItem> audioFrames;

		private List<VideoStampsItem> videoStamps;

		private List<AudioStampsItem> audioStamps;

		private List<V_AStamp> videoAndAudioStamp;

		private List<AvcHeadersItem> avcHeaders;

		private List<AacHeadersItem> aacHeaders;

		private List<VideoBitRateItem> videoBitRate;

		private List<AudioBitRateItem> audioBitRate;

		private List<VideoIntervalItem> videoInterval;

		private List<AudioIntervalItem> audioInterval;

		private List<ErrorFlagsItem> errorFlags;

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getCodecInfo() {
			return this.codecInfo;
		}

		public void setCodecInfo(String codecInfo) {
			this.codecInfo = codecInfo;
		}

		public String getPublishIp() {
			return this.publishIp;
		}

		public void setPublishIp(String publishIp) {
			this.publishIp = publishIp;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getPublishStatus() {
			return this.publishStatus;
		}

		public void setPublishStatus(String publishStatus) {
			this.publishStatus = publishStatus;
		}

		public String getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
		}

		public String getPublishInterval() {
			return this.publishInterval;
		}

		public void setPublishInterval(String publishInterval) {
			this.publishInterval = publishInterval;
		}

		public String getStopTime() {
			return this.stopTime;
		}

		public void setStopTime(String stopTime) {
			this.stopTime = stopTime;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public List<VideoFramesItem> getVideoFrames() {
			return this.videoFrames;
		}

		public void setVideoFrames(List<VideoFramesItem> videoFrames) {
			this.videoFrames = videoFrames;
		}

		public List<AudioFramesItem> getAudioFrames() {
			return this.audioFrames;
		}

		public void setAudioFrames(List<AudioFramesItem> audioFrames) {
			this.audioFrames = audioFrames;
		}

		public List<VideoStampsItem> getVideoStamps() {
			return this.videoStamps;
		}

		public void setVideoStamps(List<VideoStampsItem> videoStamps) {
			this.videoStamps = videoStamps;
		}

		public List<AudioStampsItem> getAudioStamps() {
			return this.audioStamps;
		}

		public void setAudioStamps(List<AudioStampsItem> audioStamps) {
			this.audioStamps = audioStamps;
		}

		public List<V_AStamp> getVideoAndAudioStamp() {
			return this.videoAndAudioStamp;
		}

		public void setVideoAndAudioStamp(List<V_AStamp> videoAndAudioStamp) {
			this.videoAndAudioStamp = videoAndAudioStamp;
		}

		public List<AvcHeadersItem> getAvcHeaders() {
			return this.avcHeaders;
		}

		public void setAvcHeaders(List<AvcHeadersItem> avcHeaders) {
			this.avcHeaders = avcHeaders;
		}

		public List<AacHeadersItem> getAacHeaders() {
			return this.aacHeaders;
		}

		public void setAacHeaders(List<AacHeadersItem> aacHeaders) {
			this.aacHeaders = aacHeaders;
		}

		public List<VideoBitRateItem> getVideoBitRate() {
			return this.videoBitRate;
		}

		public void setVideoBitRate(List<VideoBitRateItem> videoBitRate) {
			this.videoBitRate = videoBitRate;
		}

		public List<AudioBitRateItem> getAudioBitRate() {
			return this.audioBitRate;
		}

		public void setAudioBitRate(List<AudioBitRateItem> audioBitRate) {
			this.audioBitRate = audioBitRate;
		}

		public List<VideoIntervalItem> getVideoInterval() {
			return this.videoInterval;
		}

		public void setVideoInterval(List<VideoIntervalItem> videoInterval) {
			this.videoInterval = videoInterval;
		}

		public List<AudioIntervalItem> getAudioInterval() {
			return this.audioInterval;
		}

		public void setAudioInterval(List<AudioIntervalItem> audioInterval) {
			this.audioInterval = audioInterval;
		}

		public List<ErrorFlagsItem> getErrorFlags() {
			return this.errorFlags;
		}

		public void setErrorFlags(List<ErrorFlagsItem> errorFlags) {
			this.errorFlags = errorFlags;
		}

		public static class VideoFramesItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class AudioFramesItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class VideoStampsItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class AudioStampsItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class V_AStamp {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class AvcHeadersItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class AacHeadersItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class VideoBitRateItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class AudioBitRateItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class VideoIntervalItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class AudioIntervalItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}

		public static class ErrorFlagsItem {

			private Integer value;

			private Long time;

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}
		}
	}

	@Override
	public DescribeLiveUpVideoAudioInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveUpVideoAudioInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
