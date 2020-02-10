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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.GetMediaMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaMetaResponse extends AcsResponse {

	private String requestId;

	private String mediaUri;

	private MediaMeta mediaMeta;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMediaUri() {
		return this.mediaUri;
	}

	public void setMediaUri(String mediaUri) {
		this.mediaUri = mediaUri;
	}

	public MediaMeta getMediaMeta() {
		return this.mediaMeta;
	}

	public void setMediaMeta(MediaMeta mediaMeta) {
		this.mediaMeta = mediaMeta;
	}

	public static class MediaMeta {

		private MediaFormat mediaFormat;

		private MediaStreams mediaStreams;

		public MediaFormat getMediaFormat() {
			return this.mediaFormat;
		}

		public void setMediaFormat(MediaFormat mediaFormat) {
			this.mediaFormat = mediaFormat;
		}

		public MediaStreams getMediaStreams() {
			return this.mediaStreams;
		}

		public void setMediaStreams(MediaStreams mediaStreams) {
			this.mediaStreams = mediaStreams;
		}

		public static class MediaFormat {

			private Integer numberStreams;

			private Integer numberPrograms;

			private String formatName;

			private String formatLongName;

			private String size;

			private String duration;

			private String startTime;

			private String bitrate;

			private String creationTime;

			private String location;

			private Address address;

			public Integer getNumberStreams() {
				return this.numberStreams;
			}

			public void setNumberStreams(Integer numberStreams) {
				this.numberStreams = numberStreams;
			}

			public Integer getNumberPrograms() {
				return this.numberPrograms;
			}

			public void setNumberPrograms(Integer numberPrograms) {
				this.numberPrograms = numberPrograms;
			}

			public String getFormatName() {
				return this.formatName;
			}

			public void setFormatName(String formatName) {
				this.formatName = formatName;
			}

			public String getFormatLongName() {
				return this.formatLongName;
			}

			public void setFormatLongName(String formatLongName) {
				this.formatLongName = formatLongName;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(String bitrate) {
				this.bitrate = bitrate;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public Address getAddress() {
				return this.address;
			}

			public void setAddress(Address address) {
				this.address = address;
			}

			public static class Address {

				private String addressLine;

				private String country;

				private String province;

				private String city;

				private String district;

				private String township;

				public String getAddressLine() {
					return this.addressLine;
				}

				public void setAddressLine(String addressLine) {
					this.addressLine = addressLine;
				}

				public String getCountry() {
					return this.country;
				}

				public void setCountry(String country) {
					this.country = country;
				}

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}

				public String getCity() {
					return this.city;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public String getDistrict() {
					return this.district;
				}

				public void setDistrict(String district) {
					this.district = district;
				}

				public String getTownship() {
					return this.township;
				}

				public void setTownship(String township) {
					this.township = township;
				}
			}
		}

		public static class MediaStreams {

			private List<VideoStream> videoStreams;

			private List<AudioStream> audioStreams;

			private List<SubtitleStream> subtitleStreams;

			public List<VideoStream> getVideoStreams() {
				return this.videoStreams;
			}

			public void setVideoStreams(List<VideoStream> videoStreams) {
				this.videoStreams = videoStreams;
			}

			public List<AudioStream> getAudioStreams() {
				return this.audioStreams;
			}

			public void setAudioStreams(List<AudioStream> audioStreams) {
				this.audioStreams = audioStreams;
			}

			public List<SubtitleStream> getSubtitleStreams() {
				return this.subtitleStreams;
			}

			public void setSubtitleStreams(List<SubtitleStream> subtitleStreams) {
				this.subtitleStreams = subtitleStreams;
			}

			public static class VideoStream {

				private Integer index;

				private String language;

				private String codecName;

				private String codecLongName;

				private String profile;

				private String codecTimeBase;

				private String codecTagString;

				private String codecTag;

				private Integer width;

				private Integer height;

				private Integer hasBFrames;

				private String sampleAspectRatio;

				private String displayAspectRatio;

				private String pixelFormat;

				private Integer level;

				private String frameRrate;

				private String averageFrameRate;

				private String timeBase;

				private String startTime;

				private String duration;

				private String bitrate;

				private String frames;

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}

				public Integer getHasBFrames() {
					return this.hasBFrames;
				}

				public void setHasBFrames(Integer hasBFrames) {
					this.hasBFrames = hasBFrames;
				}

				public String getSampleAspectRatio() {
					return this.sampleAspectRatio;
				}

				public void setSampleAspectRatio(String sampleAspectRatio) {
					this.sampleAspectRatio = sampleAspectRatio;
				}

				public String getDisplayAspectRatio() {
					return this.displayAspectRatio;
				}

				public void setDisplayAspectRatio(String displayAspectRatio) {
					this.displayAspectRatio = displayAspectRatio;
				}

				public String getPixelFormat() {
					return this.pixelFormat;
				}

				public void setPixelFormat(String pixelFormat) {
					this.pixelFormat = pixelFormat;
				}

				public Integer getLevel() {
					return this.level;
				}

				public void setLevel(Integer level) {
					this.level = level;
				}

				public String getFrameRrate() {
					return this.frameRrate;
				}

				public void setFrameRrate(String frameRrate) {
					this.frameRrate = frameRrate;
				}

				public String getAverageFrameRate() {
					return this.averageFrameRate;
				}

				public void setAverageFrameRate(String averageFrameRate) {
					this.averageFrameRate = averageFrameRate;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getFrames() {
					return this.frames;
				}

				public void setFrames(String frames) {
					this.frames = frames;
				}
			}

			public static class AudioStream {

				private Integer index;

				private String codecName;

				private String codecLongName;

				private String codecTimeBase;

				private String codecTagString;

				private String codecTag;

				private String sampleFormat;

				private String sampleRate;

				private Integer channels;

				private String channelLayout;

				private String timeBase;

				private String startTime;

				private String duration;

				private String bitrate;

				private String frames;

				private String language;

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getSampleFormat() {
					return this.sampleFormat;
				}

				public void setSampleFormat(String sampleFormat) {
					this.sampleFormat = sampleFormat;
				}

				public String getSampleRate() {
					return this.sampleRate;
				}

				public void setSampleRate(String sampleRate) {
					this.sampleRate = sampleRate;
				}

				public Integer getChannels() {
					return this.channels;
				}

				public void setChannels(Integer channels) {
					this.channels = channels;
				}

				public String getChannelLayout() {
					return this.channelLayout;
				}

				public void setChannelLayout(String channelLayout) {
					this.channelLayout = channelLayout;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getFrames() {
					return this.frames;
				}

				public void setFrames(String frames) {
					this.frames = frames;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}
			}

			public static class SubtitleStream {

				private Integer index;

				private String language;

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}
			}
		}
	}

	@Override
	public GetMediaMetaResponse getInstance(UnmarshallerContext context) {
		return	GetMediaMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
