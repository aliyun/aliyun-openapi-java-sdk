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

			private String creationTime;

			private Integer numberPrograms;

			private Integer numberStreams;

			private String bitrate;

			private String startTime;

			private String size;

			private String formatLongName;

			private String duration;

			private String formatName;

			private String location;

			private Tag tag;

			private Address address;

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public Integer getNumberPrograms() {
				return this.numberPrograms;
			}

			public void setNumberPrograms(Integer numberPrograms) {
				this.numberPrograms = numberPrograms;
			}

			public Integer getNumberStreams() {
				return this.numberStreams;
			}

			public void setNumberStreams(Integer numberStreams) {
				this.numberStreams = numberStreams;
			}

			public String getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(String bitrate) {
				this.bitrate = bitrate;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public String getFormatLongName() {
				return this.formatLongName;
			}

			public void setFormatLongName(String formatLongName) {
				this.formatLongName = formatLongName;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getFormatName() {
				return this.formatName;
			}

			public void setFormatName(String formatName) {
				this.formatName = formatName;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public Tag getTag() {
				return this.tag;
			}

			public void setTag(Tag tag) {
				this.tag = tag;
			}

			public Address getAddress() {
				return this.address;
			}

			public void setAddress(Address address) {
				this.address = address;
			}

			public static class Tag {

				private String creationTime;

				private String album;

				private String albumArtist;

				private String performer;

				private String composer;

				private String artist;

				private String title;

				private String language;

				public String getCreationTime() {
					return this.creationTime;
				}

				public void setCreationTime(String creationTime) {
					this.creationTime = creationTime;
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

				public String getPerformer() {
					return this.performer;
				}

				public void setPerformer(String performer) {
					this.performer = performer;
				}

				public String getComposer() {
					return this.composer;
				}

				public void setComposer(String composer) {
					this.composer = composer;
				}

				public String getArtist() {
					return this.artist;
				}

				public void setArtist(String artist) {
					this.artist = artist;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}
			}

			public static class Address {

				private String township;

				private String district;

				private String addressLine;

				private String country;

				private String city;

				private String province;

				public String getTownship() {
					return this.township;
				}

				public void setTownship(String township) {
					this.township = township;
				}

				public String getDistrict() {
					return this.district;
				}

				public void setDistrict(String district) {
					this.district = district;
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

				public String getProvince() {
					return this.province;
				}

				public void setProvince(String province) {
					this.province = province;
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

				private String codecLongName;

				private Integer height;

				private String sampleAspectRatio;

				private String averageFrameRate;

				private String bitrate;

				private String rotate;

				private String codecTagString;

				private String language;

				private Integer hasBFrames;

				private String frameRrate;

				private String profile;

				private String startTime;

				private String frames;

				private String codecName;

				private Integer width;

				private String duration;

				private String displayAspectRatio;

				private String codecTag;

				private String codecTimeBase;

				private String timeBase;

				private Integer level;

				private String pixelFormat;

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}

				public String getSampleAspectRatio() {
					return this.sampleAspectRatio;
				}

				public void setSampleAspectRatio(String sampleAspectRatio) {
					this.sampleAspectRatio = sampleAspectRatio;
				}

				public String getAverageFrameRate() {
					return this.averageFrameRate;
				}

				public void setAverageFrameRate(String averageFrameRate) {
					this.averageFrameRate = averageFrameRate;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getRotate() {
					return this.rotate;
				}

				public void setRotate(String rotate) {
					this.rotate = rotate;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public Integer getHasBFrames() {
					return this.hasBFrames;
				}

				public void setHasBFrames(Integer hasBFrames) {
					this.hasBFrames = hasBFrames;
				}

				public String getFrameRrate() {
					return this.frameRrate;
				}

				public void setFrameRrate(String frameRrate) {
					this.frameRrate = frameRrate;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getFrames() {
					return this.frames;
				}

				public void setFrames(String frames) {
					this.frames = frames;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getDisplayAspectRatio() {
					return this.displayAspectRatio;
				}

				public void setDisplayAspectRatio(String displayAspectRatio) {
					this.displayAspectRatio = displayAspectRatio;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
				}

				public Integer getLevel() {
					return this.level;
				}

				public void setLevel(Integer level) {
					this.level = level;
				}

				public String getPixelFormat() {
					return this.pixelFormat;
				}

				public void setPixelFormat(String pixelFormat) {
					this.pixelFormat = pixelFormat;
				}
			}

			public static class AudioStream {

				private Integer index;

				private String sampleRate;

				private String channelLayout;

				private String codecLongName;

				private Integer channels;

				private String bitrate;

				private String codecTagString;

				private String language;

				private String startTime;

				private String sampleFormat;

				private String frames;

				private String codecName;

				private String duration;

				private String codecTag;

				private String codecTimeBase;

				private String timeBase;

				public Integer getIndex() {
					return this.index;
				}

				public void setIndex(Integer index) {
					this.index = index;
				}

				public String getSampleRate() {
					return this.sampleRate;
				}

				public void setSampleRate(String sampleRate) {
					this.sampleRate = sampleRate;
				}

				public String getChannelLayout() {
					return this.channelLayout;
				}

				public void setChannelLayout(String channelLayout) {
					this.channelLayout = channelLayout;
				}

				public String getCodecLongName() {
					return this.codecLongName;
				}

				public void setCodecLongName(String codecLongName) {
					this.codecLongName = codecLongName;
				}

				public Integer getChannels() {
					return this.channels;
				}

				public void setChannels(Integer channels) {
					this.channels = channels;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getCodecTagString() {
					return this.codecTagString;
				}

				public void setCodecTagString(String codecTagString) {
					this.codecTagString = codecTagString;
				}

				public String getLanguage() {
					return this.language;
				}

				public void setLanguage(String language) {
					this.language = language;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getSampleFormat() {
					return this.sampleFormat;
				}

				public void setSampleFormat(String sampleFormat) {
					this.sampleFormat = sampleFormat;
				}

				public String getFrames() {
					return this.frames;
				}

				public void setFrames(String frames) {
					this.frames = frames;
				}

				public String getCodecName() {
					return this.codecName;
				}

				public void setCodecName(String codecName) {
					this.codecName = codecName;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getCodecTag() {
					return this.codecTag;
				}

				public void setCodecTag(String codecTag) {
					this.codecTag = codecTag;
				}

				public String getCodecTimeBase() {
					return this.codecTimeBase;
				}

				public void setCodecTimeBase(String codecTimeBase) {
					this.codecTimeBase = codecTimeBase;
				}

				public String getTimeBase() {
					return this.timeBase;
				}

				public void setTimeBase(String timeBase) {
					this.timeBase = timeBase;
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
