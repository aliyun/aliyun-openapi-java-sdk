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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetMezzanineInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMezzanineInfoResponse extends AcsResponse {

	private String requestId;

	private Mezzanine mezzanine;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Mezzanine getMezzanine() {
		return this.mezzanine;
	}

	public void setMezzanine(Mezzanine mezzanine) {
		this.mezzanine = mezzanine;
	}

	public static class Mezzanine {

		private String videoId;

		private String bitrate;

		private String creationTime;

		private String duration;

		private String fps;

		private Long height;

		private Long width;

		private Long size;

		private String status;

		private String fileURL;

		private String fileName;

		private String cRC64;

		private String preprocessStatus;

		private List<AudioStream> audioStreamList;

		private List<VideoStream> videoStreamList;

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
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

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getFps() {
			return this.fps;
		}

		public void setFps(String fps) {
			this.fps = fps;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFileURL() {
			return this.fileURL;
		}

		public void setFileURL(String fileURL) {
			this.fileURL = fileURL;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getCRC64() {
			return this.cRC64;
		}

		public void setCRC64(String cRC64) {
			this.cRC64 = cRC64;
		}

		public String getPreprocessStatus() {
			return this.preprocessStatus;
		}

		public void setPreprocessStatus(String preprocessStatus) {
			this.preprocessStatus = preprocessStatus;
		}

		public List<AudioStream> getAudioStreamList() {
			return this.audioStreamList;
		}

		public void setAudioStreamList(List<AudioStream> audioStreamList) {
			this.audioStreamList = audioStreamList;
		}

		public List<VideoStream> getVideoStreamList() {
			return this.videoStreamList;
		}

		public void setVideoStreamList(List<VideoStream> videoStreamList) {
			this.videoStreamList = videoStreamList;
		}

		public static class AudioStream {

			private String index;

			private String codecName;

			private String codecLongName;

			private String codecTimeBase;

			private String codecTagString;

			private String codecTag;

			private String sampleFmt;

			private String sampleRate;

			private String channels;

			private String channelLayout;

			private String timebase;

			private String startTime;

			private String duration;

			private String bitrate;

			private String numFrames;

			private String lang;

			public String getIndex() {
				return this.index;
			}

			public void setIndex(String index) {
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

			public String getSampleFmt() {
				return this.sampleFmt;
			}

			public void setSampleFmt(String sampleFmt) {
				this.sampleFmt = sampleFmt;
			}

			public String getSampleRate() {
				return this.sampleRate;
			}

			public void setSampleRate(String sampleRate) {
				this.sampleRate = sampleRate;
			}

			public String getChannels() {
				return this.channels;
			}

			public void setChannels(String channels) {
				this.channels = channels;
			}

			public String getChannelLayout() {
				return this.channelLayout;
			}

			public void setChannelLayout(String channelLayout) {
				this.channelLayout = channelLayout;
			}

			public String getTimebase() {
				return this.timebase;
			}

			public void setTimebase(String timebase) {
				this.timebase = timebase;
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

			public String getNumFrames() {
				return this.numFrames;
			}

			public void setNumFrames(String numFrames) {
				this.numFrames = numFrames;
			}

			public String getLang() {
				return this.lang;
			}

			public void setLang(String lang) {
				this.lang = lang;
			}
		}

		public static class VideoStream {

			private String index;

			private String codecName;

			private String codecLongName;

			private String profile;

			private String codecTimeBase;

			private String codecTagString;

			private String codecTag;

			private String width;

			private String height;

			private String hasBFrames;

			private String sar;

			private String dar;

			private String pixFmt;

			private String level;

			private String fps;

			private String avgFPS;

			private String timebase;

			private String startTime;

			private String duration;

			private String numFrames;

			private String lang;

			public String getIndex() {
				return this.index;
			}

			public void setIndex(String index) {
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

			public String getWidth() {
				return this.width;
			}

			public void setWidth(String width) {
				this.width = width;
			}

			public String getHeight() {
				return this.height;
			}

			public void setHeight(String height) {
				this.height = height;
			}

			public String getHasBFrames() {
				return this.hasBFrames;
			}

			public void setHasBFrames(String hasBFrames) {
				this.hasBFrames = hasBFrames;
			}

			public String getSar() {
				return this.sar;
			}

			public void setSar(String sar) {
				this.sar = sar;
			}

			public String getDar() {
				return this.dar;
			}

			public void setDar(String dar) {
				this.dar = dar;
			}

			public String getPixFmt() {
				return this.pixFmt;
			}

			public void setPixFmt(String pixFmt) {
				this.pixFmt = pixFmt;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getFps() {
				return this.fps;
			}

			public void setFps(String fps) {
				this.fps = fps;
			}

			public String getAvgFPS() {
				return this.avgFPS;
			}

			public void setAvgFPS(String avgFPS) {
				this.avgFPS = avgFPS;
			}

			public String getTimebase() {
				return this.timebase;
			}

			public void setTimebase(String timebase) {
				this.timebase = timebase;
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

			public String getNumFrames() {
				return this.numFrames;
			}

			public void setNumFrames(String numFrames) {
				this.numFrames = numFrames;
			}

			public String getLang() {
				return this.lang;
			}

			public void setLang(String lang) {
				this.lang = lang;
			}
		}
	}

	@Override
	public GetMezzanineInfoResponse getInstance(UnmarshallerContext context) {
		return	GetMezzanineInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
