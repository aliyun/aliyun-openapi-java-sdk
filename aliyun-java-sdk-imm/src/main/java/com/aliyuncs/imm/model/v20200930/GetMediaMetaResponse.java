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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.GetMediaMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaMetaResponse extends AcsResponse {

	private String requestId;

	private String language;

	private String title;

	private Long streamCount;

	private Long programCount;

	private String formatName;

	private String formatLongName;

	private Long size;

	private Double startTime;

	private Long bitrate;

	private String artist;

	private String albumArtist;

	private String composer;

	private String performer;

	private String album;

	private Double duration;

	private String produceTime;

	private String latLong;

	private Long videoWidth;

	private Long videoHeight;

	private List<VideoStreamsItem> videoStreams;

	private List<AudioStreamsItem> audioStreams;

	private List<SubtitlesItem> subtitles;

	private List<AddressesItem> addresses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getStreamCount() {
		return this.streamCount;
	}

	public void setStreamCount(Long streamCount) {
		this.streamCount = streamCount;
	}

	public Long getProgramCount() {
		return this.programCount;
	}

	public void setProgramCount(Long programCount) {
		this.programCount = programCount;
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

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Double getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Double startTime) {
		this.startTime = startTime;
	}

	public Long getBitrate() {
		return this.bitrate;
	}

	public void setBitrate(Long bitrate) {
		this.bitrate = bitrate;
	}

	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbumArtist() {
		return this.albumArtist;
	}

	public void setAlbumArtist(String albumArtist) {
		this.albumArtist = albumArtist;
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

	public String getAlbum() {
		return this.album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Double getDuration() {
		return this.duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getProduceTime() {
		return this.produceTime;
	}

	public void setProduceTime(String produceTime) {
		this.produceTime = produceTime;
	}

	public String getLatLong() {
		return this.latLong;
	}

	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}

	public Long getVideoWidth() {
		return this.videoWidth;
	}

	public void setVideoWidth(Long videoWidth) {
		this.videoWidth = videoWidth;
	}

	public Long getVideoHeight() {
		return this.videoHeight;
	}

	public void setVideoHeight(Long videoHeight) {
		this.videoHeight = videoHeight;
	}

	public List<VideoStreamsItem> getVideoStreams() {
		return this.videoStreams;
	}

	public void setVideoStreams(List<VideoStreamsItem> videoStreams) {
		this.videoStreams = videoStreams;
	}

	public List<AudioStreamsItem> getAudioStreams() {
		return this.audioStreams;
	}

	public void setAudioStreams(List<AudioStreamsItem> audioStreams) {
		this.audioStreams = audioStreams;
	}

	public List<SubtitlesItem> getSubtitles() {
		return this.subtitles;
	}

	public void setSubtitles(List<SubtitlesItem> subtitles) {
		this.subtitles = subtitles;
	}

	public List<AddressesItem> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<AddressesItem> addresses) {
		this.addresses = addresses;
	}

	public static class VideoStreamsItem {

		private Long index;

		private String language;

		private String codecName;

		private String codecLongName;

		private String profile;

		private String codecTimeBase;

		private String codecTagString;

		private String codecTag;

		private Long width;

		private Long height;

		private Long hasBFrames;

		private String sampleAspectRatio;

		private String displayAspectRatio;

		private String pixelFormat;

		private Long level;

		private String frameRate;

		private String averageFrameRate;

		private String timeBase;

		private Double startTime;

		private Double duration;

		private Long bitrate;

		private Long frameCount;

		private String rotate;

		private Long bitDepth;

		private String colorSpace;

		private String colorRange;

		private String colorTransfer;

		private String colorPrimaries;

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
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

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getHasBFrames() {
			return this.hasBFrames;
		}

		public void setHasBFrames(Long hasBFrames) {
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

		public Long getLevel() {
			return this.level;
		}

		public void setLevel(Long level) {
			this.level = level;
		}

		public String getFrameRate() {
			return this.frameRate;
		}

		public void setFrameRate(String frameRate) {
			this.frameRate = frameRate;
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

		public Double getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Double startTime) {
			this.startTime = startTime;
		}

		public Double getDuration() {
			return this.duration;
		}

		public void setDuration(Double duration) {
			this.duration = duration;
		}

		public Long getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(Long bitrate) {
			this.bitrate = bitrate;
		}

		public Long getFrameCount() {
			return this.frameCount;
		}

		public void setFrameCount(Long frameCount) {
			this.frameCount = frameCount;
		}

		public String getRotate() {
			return this.rotate;
		}

		public void setRotate(String rotate) {
			this.rotate = rotate;
		}

		public Long getBitDepth() {
			return this.bitDepth;
		}

		public void setBitDepth(Long bitDepth) {
			this.bitDepth = bitDepth;
		}

		public String getColorSpace() {
			return this.colorSpace;
		}

		public void setColorSpace(String colorSpace) {
			this.colorSpace = colorSpace;
		}

		public String getColorRange() {
			return this.colorRange;
		}

		public void setColorRange(String colorRange) {
			this.colorRange = colorRange;
		}

		public String getColorTransfer() {
			return this.colorTransfer;
		}

		public void setColorTransfer(String colorTransfer) {
			this.colorTransfer = colorTransfer;
		}

		public String getColorPrimaries() {
			return this.colorPrimaries;
		}

		public void setColorPrimaries(String colorPrimaries) {
			this.colorPrimaries = colorPrimaries;
		}
	}

	public static class AudioStreamsItem {

		private Long index;

		private String language;

		private String codecName;

		private String codecLongName;

		private String codecTimeBase;

		private String codecTagString;

		private String codecTag;

		private String timeBase;

		private Double startTime;

		private Double duration;

		private Long bitrate;

		private Long frameCount;

		private String lyric;

		private String sampleFormat;

		private Long sampleRate;

		private Long channels;

		private String channelLayout;

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
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

		public String getTimeBase() {
			return this.timeBase;
		}

		public void setTimeBase(String timeBase) {
			this.timeBase = timeBase;
		}

		public Double getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Double startTime) {
			this.startTime = startTime;
		}

		public Double getDuration() {
			return this.duration;
		}

		public void setDuration(Double duration) {
			this.duration = duration;
		}

		public Long getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(Long bitrate) {
			this.bitrate = bitrate;
		}

		public Long getFrameCount() {
			return this.frameCount;
		}

		public void setFrameCount(Long frameCount) {
			this.frameCount = frameCount;
		}

		public String getLyric() {
			return this.lyric;
		}

		public void setLyric(String lyric) {
			this.lyric = lyric;
		}

		public String getSampleFormat() {
			return this.sampleFormat;
		}

		public void setSampleFormat(String sampleFormat) {
			this.sampleFormat = sampleFormat;
		}

		public Long getSampleRate() {
			return this.sampleRate;
		}

		public void setSampleRate(Long sampleRate) {
			this.sampleRate = sampleRate;
		}

		public Long getChannels() {
			return this.channels;
		}

		public void setChannels(Long channels) {
			this.channels = channels;
		}

		public String getChannelLayout() {
			return this.channelLayout;
		}

		public void setChannelLayout(String channelLayout) {
			this.channelLayout = channelLayout;
		}
	}

	public static class SubtitlesItem {

		private Long index;

		private String language;

		private String codecName;

		private String codecLongName;

		private String codecTagString;

		private String codecTag;

		private Double startTime;

		private Double duration;

		private Long bitrate;

		private String content;

		private Long width;

		private Long height;

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
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

		public Double getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Double startTime) {
			this.startTime = startTime;
		}

		public Double getDuration() {
			return this.duration;
		}

		public void setDuration(Double duration) {
			this.duration = duration;
		}

		public Long getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(Long bitrate) {
			this.bitrate = bitrate;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}
	}

	public static class AddressesItem {

		private String language;

		private String addressLine;

		private String country;

		private String province;

		private String city;

		private String district;

		private String township;

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
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

	@Override
	public GetMediaMetaResponse getInstance(UnmarshallerContext context) {
		return	GetMediaMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
