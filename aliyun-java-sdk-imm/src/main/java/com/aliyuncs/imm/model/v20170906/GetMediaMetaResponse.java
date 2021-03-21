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

	private String mediaUri;

	private String requestId;

	private MediaMeta mediaMeta;

	public String getMediaUri() {
		return this.mediaUri;
	}

	public void setMediaUri(String mediaUri) {
		this.mediaUri = mediaUri;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

			private String size;

			private Integer numberStreams;

			private String formatLongName;

			private String startTime;

			private String creationTime;

			private String formatName;

			private String duration;

			private String bitrate;

			private String location;

			private Integer numberPrograms;

			private Address address;

			private Tag tag;

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public Integer getNumberStreams() {
				return this.numberStreams;
			}

			public void setNumberStreams(Integer numberStreams) {
				this.numberStreams = numberStreams;
			}

			public String getFormatLongName() {
				return this.formatLongName;
			}

			public void setFormatLongName(String formatLongName) {
				this.formatLongName = formatLongName;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getFormatName() {
				return this.formatName;
			}

			public void setFormatName(String formatName) {
				this.formatName = formatName;
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

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public Integer getNumberPrograms() {
				return this.numberPrograms;
			}

			public void setNumberPrograms(Integer numberPrograms) {
				this.numberPrograms = numberPrograms;
			}

			public Address getAddress() {
				return this.address;
			}

			public void setAddress(Address address) {
				this.address = address;
			}

			public Tag getTag() {
				return this.tag;
			}

			public void setTag(Tag tag) {
				this.tag = tag;
			}

			public static class Address {

				private String township;

				private String addressLine;

				private String country;

				private String city;

				private String district;

				private String province;

				public String getTownship() {
					return this.township;
				}

				public void setTownship(String township) {
					this.township = township;
				}

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

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
				}
			}

			public static class Tag {

				private String artist;

				private String composer;

				private String performer;

				private String language;

				private String creationTime;

				private String title;

				private String album;

				private String albumArtist;

				public String getArtist() {
					return this.artist;
				}

				public void setArtist(String artist) {
					this.artist = artist;
				}

				public String getComposer() {
					return this.composer;
				}

				public void setComposer(String composer) {
					this.composer = composer;
				}

				public String getPerformer() {
					return this.performer;
				}

				public void setPerformer(String performer) {
					this.performer = performer;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCreationTime() {
					return this.creationTime;
				}

				public void setCreationTime(String creationTime) {
					this.creationTime = creationTime;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getAlbum() {
					return this.album;
				}

				public void setAlbum(String album) {
					this.album = album;
				}

				public String getAlbumArtist() {
					return this.albumArtist;
				}

				public void setAlbumArtist(String albumArtist) {
					this.albumArtist = albumArtist;
				}
			}
		}

		public static class MediaStreams {

			private List<VideoStream> videoStreams;

			private List<SubtitleStream> subtitleStreams;

			private List<AudioStream> audioStreams;

			public List<VideoStream> getVideoStreams() {
				return this.videoStreams;
			}

			public void setVideoStreams(List<VideoStream> videoStreams) {
				this.videoStreams = videoStreams;
			}

			public List<SubtitleStream> getSubtitleStreams() {
				return this.subtitleStreams;
			}

			public void setSubtitleStreams(List<SubtitleStream> subtitleStreams) {
				this.subtitleStreams = subtitleStreams;
			}

			public List<AudioStream> getAudioStreams() {
				return this.audioStreams;
			}

			public void setAudioStreams(List<AudioStream> audioStreams) {
				this.audioStreams = audioStreams;
			}

			public static class VideoStream {

				private String codecTag;

				private String frames;

				private String codecTimeBase;

				private String rotate;

				private String sampleAspectRatio;

				private String startTime;

				private String duration;

				private Integer index;

				private String codecName;

				private String bitrate;

				private String profile;

				private String displayAspectRatio;

				private Integer hasBFrames;

				private String codecTagString;

				private String averageFrameRate;

				private String language;

				private String codecLongName;

				private String pixelFormat;

				private Integer level;

				private Integer height;

				private String frameRrate;

				private Integer width;

				private String timeBase;

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getFrames() {
					return this.frames;
				}

				public void setFrames(String frames) {
					this.frames = frames;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getRotate() {
					return this.rotate;
				}

				public void setRotate(String rotate) {
					this.rotate = rotate;
				}

				public String getSampleAspectRatio() {
					return this.sampleAspectRatio;
				}

				public void setSampleAspectRatio(String sampleAspectRatio) {
					this.sampleAspectRatio = sampleAspectRatio;
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

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getDisplayAspectRatio() {
					return this.displayAspectRatio;
				}

				public void setDisplayAspectRatio(String displayAspectRatio) {
					this.displayAspectRatio = displayAspectRatio;
				}

				public Integer getHasBFrames() {
					return this.hasBFrames;
				}

				public void setHasBFrames(Integer hasBFrames) {
					this.hasBFrames = hasBFrames;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getAverageFrameRate() {
					return this.averageFrameRate;
				}

				public void setAverageFrameRate(String averageFrameRate) {
					this.averageFrameRate = averageFrameRate;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
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

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}

				public String getFrameRrate() {
					return this.frameRrate;
				}

				public void setFrameRrate(String frameRrate) {
					this.frameRrate = frameRrate;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
				}
			}

			public static class SubtitleStream {

				private String language;

				private Integer index;

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}
			}

			public static class AudioStream {

				private String codecTag;

				private String frames;

				private String codecTimeBase;

				private String channelLayout;

				private String startTime;

				private String duration;

				private Integer index;

				private String codecName;

				private String bitrate;

				private String sampleFormat;

				private Integer channels;

				private String codecTagString;

				private String sampleRate;

				private String language;

				private String codecLongName;

				private String timeBase;

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getFrames() {
					return this.frames;
				}

				public void setFrames(String frames) {
					this.frames = frames;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getChannelLayout() {
					return this.channelLayout;
				}

				public void setChannelLayout(String channelLayout) {
					this.channelLayout = channelLayout;
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

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getSampleFormat() {
					return this.sampleFormat;
				}

				public void setSampleFormat(String sampleFormat) {
					this.sampleFormat = sampleFormat;
				}

				public Integer getChannels() {
					return this.channels;
				}

				public void setChannels(Integer channels) {
					this.channels = channels;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getSampleRate() {
					return this.sampleRate;
				}

				public void setSampleRate(String sampleRate) {
					this.sampleRate = sampleRate;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
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
