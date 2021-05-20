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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryMediaListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMediaListResponse extends AcsResponse {

	private String requestId;

	private List<Media> mediaList;

	private List<String> nonExistMediaIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Media> getMediaList() {
		return this.mediaList;
	}

	public void setMediaList(List<Media> mediaList) {
		this.mediaList = mediaList;
	}

	public List<String> getNonExistMediaIds() {
		return this.nonExistMediaIds;
	}

	public void setNonExistMediaIds(List<String> nonExistMediaIds) {
		this.nonExistMediaIds = nonExistMediaIds;
	}

	public static class Media {

		private String creationTime;

		private Long cateId;

		private String height;

		private String censorState;

		private String bitrate;

		private String mediaId;

		private String publishState;

		private String description;

		private String size;

		private String width;

		private String coverURL;

		private String duration;

		private String fps;

		private String title;

		private String format;

		private List<Play> playList;

		private List<Summary> summaryList;

		private List<Snapshot> snapshotList;

		private List<String> tags;

		private List<String> runIdList;

		private File file;

		private MediaInfo mediaInfo;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Long getCateId() {
			return this.cateId;
		}

		public void setCateId(Long cateId) {
			this.cateId = cateId;
		}

		public String getHeight() {
			return this.height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getCensorState() {
			return this.censorState;
		}

		public void setCensorState(String censorState) {
			this.censorState = censorState;
		}

		public String getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(String bitrate) {
			this.bitrate = bitrate;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getPublishState() {
			return this.publishState;
		}

		public void setPublishState(String publishState) {
			this.publishState = publishState;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getWidth() {
			return this.width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public String getCoverURL() {
			return this.coverURL;
		}

		public void setCoverURL(String coverURL) {
			this.coverURL = coverURL;
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

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public List<Play> getPlayList() {
			return this.playList;
		}

		public void setPlayList(List<Play> playList) {
			this.playList = playList;
		}

		public List<Summary> getSummaryList() {
			return this.summaryList;
		}

		public void setSummaryList(List<Summary> summaryList) {
			this.summaryList = summaryList;
		}

		public List<Snapshot> getSnapshotList() {
			return this.snapshotList;
		}

		public void setSnapshotList(List<Snapshot> snapshotList) {
			this.snapshotList = snapshotList;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}

		public List<String> getRunIdList() {
			return this.runIdList;
		}

		public void setRunIdList(List<String> runIdList) {
			this.runIdList = runIdList;
		}

		public File getFile() {
			return this.file;
		}

		public void setFile(File file) {
			this.file = file;
		}

		public MediaInfo getMediaInfo() {
			return this.mediaInfo;
		}

		public void setMediaInfo(MediaInfo mediaInfo) {
			this.mediaInfo = mediaInfo;
		}

		public static class Play {

			private String encryption;

			private String height;

			private String bitrate;

			private String mediaWorkflowId;

			private String width;

			private String size;

			private String fps;

			private String duration;

			private String activityName;

			private String format;

			private String mediaWorkflowName;

			private File1 file1;

			public String getEncryption() {
				return this.encryption;
			}

			public void setEncryption(String encryption) {
				this.encryption = encryption;
			}

			public String getHeight() {
				return this.height;
			}

			public void setHeight(String height) {
				this.height = height;
			}

			public String getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(String bitrate) {
				this.bitrate = bitrate;
			}

			public String getMediaWorkflowId() {
				return this.mediaWorkflowId;
			}

			public void setMediaWorkflowId(String mediaWorkflowId) {
				this.mediaWorkflowId = mediaWorkflowId;
			}

			public String getWidth() {
				return this.width;
			}

			public void setWidth(String width) {
				this.width = width;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public String getFps() {
				return this.fps;
			}

			public void setFps(String fps) {
				this.fps = fps;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getActivityName() {
				return this.activityName;
			}

			public void setActivityName(String activityName) {
				this.activityName = activityName;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getMediaWorkflowName() {
				return this.mediaWorkflowName;
			}

			public void setMediaWorkflowName(String mediaWorkflowName) {
				this.mediaWorkflowName = mediaWorkflowName;
			}

			public File1 getFile1() {
				return this.file1;
			}

			public void setFile1(File1 file1) {
				this.file1 = file1;
			}

			public static class File1 {

				private String state;

				private String uRL;

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getURL() {
					return this.uRL;
				}

				public void setURL(String uRL) {
					this.uRL = uRL;
				}
			}
		}

		public static class Summary {

			private String type;

			private String mediaWorkflowId;

			private String activityName;

			private String mediaWorkflowName;

			private File2 file2;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getMediaWorkflowId() {
				return this.mediaWorkflowId;
			}

			public void setMediaWorkflowId(String mediaWorkflowId) {
				this.mediaWorkflowId = mediaWorkflowId;
			}

			public String getActivityName() {
				return this.activityName;
			}

			public void setActivityName(String activityName) {
				this.activityName = activityName;
			}

			public String getMediaWorkflowName() {
				return this.mediaWorkflowName;
			}

			public void setMediaWorkflowName(String mediaWorkflowName) {
				this.mediaWorkflowName = mediaWorkflowName;
			}

			public File2 getFile2() {
				return this.file2;
			}

			public void setFile2(File2 file2) {
				this.file2 = file2;
			}

			public static class File2 {

				private String state;

				private String uRL;

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getURL() {
					return this.uRL;
				}

				public void setURL(String uRL) {
					this.uRL = uRL;
				}
			}
		}

		public static class Snapshot {

			private String type;

			private String mediaWorkflowId;

			private String activityName;

			private String count;

			private String mediaWorkflowName;

			private File3 file3;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getMediaWorkflowId() {
				return this.mediaWorkflowId;
			}

			public void setMediaWorkflowId(String mediaWorkflowId) {
				this.mediaWorkflowId = mediaWorkflowId;
			}

			public String getActivityName() {
				return this.activityName;
			}

			public void setActivityName(String activityName) {
				this.activityName = activityName;
			}

			public String getCount() {
				return this.count;
			}

			public void setCount(String count) {
				this.count = count;
			}

			public String getMediaWorkflowName() {
				return this.mediaWorkflowName;
			}

			public void setMediaWorkflowName(String mediaWorkflowName) {
				this.mediaWorkflowName = mediaWorkflowName;
			}

			public File3 getFile3() {
				return this.file3;
			}

			public void setFile3(File3 file3) {
				this.file3 = file3;
			}

			public static class File3 {

				private String state;

				private String uRL;

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getURL() {
					return this.uRL;
				}

				public void setURL(String uRL) {
					this.uRL = uRL;
				}
			}
		}

		public static class File {

			private String state;

			private String uRL;

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}
		}

		public static class MediaInfo {

			private Streams streams;

			private Format format;

			public Streams getStreams() {
				return this.streams;
			}

			public void setStreams(Streams streams) {
				this.streams = streams;
			}

			public Format getFormat() {
				return this.format;
			}

			public void setFormat(Format format) {
				this.format = format;
			}

			public static class Streams {

				private List<VideoStream> videoStreamList;

				private List<AudioStream> audioStreamList;

				private List<SubtitleStream> subtitleStreamList;

				public List<VideoStream> getVideoStreamList() {
					return this.videoStreamList;
				}

				public void setVideoStreamList(List<VideoStream> videoStreamList) {
					this.videoStreamList = videoStreamList;
				}

				public List<AudioStream> getAudioStreamList() {
					return this.audioStreamList;
				}

				public void setAudioStreamList(List<AudioStream> audioStreamList) {
					this.audioStreamList = audioStreamList;
				}

				public List<SubtitleStream> getSubtitleStreamList() {
					return this.subtitleStreamList;
				}

				public void setSubtitleStreamList(List<SubtitleStream> subtitleStreamList) {
					this.subtitleStreamList = subtitleStreamList;
				}

				public static class VideoStream {

					private String sar;

					private String height;

					private String codecTagString;

					private String width;

					private String index;

					private String timebase;

					private String avgFPS;

					private String pixFmt;

					private String lang;

					private String codecLongName;

					private String numFrames;

					private String rotate;

					private String bitrate;

					private String hasBFrames;

					private String profile;

					private String startTime;

					private String dar;

					private String codecName;

					private String duration;

					private String fps;

					private String codecTag;

					private String codecTimeBase;

					private String level;

					private NetworkCost networkCost;

					public String getSar() {
						return this.sar;
					}

					public void setSar(String sar) {
						this.sar = sar;
					}

					public String getHeight() {
						return this.height;
					}

					public void setHeight(String height) {
						this.height = height;
					}

					public String getCodecTagString() {
						return this.codecTagString;
					}

					public void setCodecTagString(String codecTagString) {
						this.codecTagString = codecTagString;
					}

					public String getWidth() {
						return this.width;
					}

					public void setWidth(String width) {
						this.width = width;
					}

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getTimebase() {
						return this.timebase;
					}

					public void setTimebase(String timebase) {
						this.timebase = timebase;
					}

					public String getAvgFPS() {
						return this.avgFPS;
					}

					public void setAvgFPS(String avgFPS) {
						this.avgFPS = avgFPS;
					}

					public String getPixFmt() {
						return this.pixFmt;
					}

					public void setPixFmt(String pixFmt) {
						this.pixFmt = pixFmt;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}

					public String getCodecLongName() {
						return this.codecLongName;
					}

					public void setCodecLongName(String codecLongName) {
						this.codecLongName = codecLongName;
					}

					public String getNumFrames() {
						return this.numFrames;
					}

					public void setNumFrames(String numFrames) {
						this.numFrames = numFrames;
					}

					public String getRotate() {
						return this.rotate;
					}

					public void setRotate(String rotate) {
						this.rotate = rotate;
					}

					public String getBitrate() {
						return this.bitrate;
					}

					public void setBitrate(String bitrate) {
						this.bitrate = bitrate;
					}

					public String getHasBFrames() {
						return this.hasBFrames;
					}

					public void setHasBFrames(String hasBFrames) {
						this.hasBFrames = hasBFrames;
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

					public String getDar() {
						return this.dar;
					}

					public void setDar(String dar) {
						this.dar = dar;
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

					public String getFps() {
						return this.fps;
					}

					public void setFps(String fps) {
						this.fps = fps;
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

					public String getLevel() {
						return this.level;
					}

					public void setLevel(String level) {
						this.level = level;
					}

					public NetworkCost getNetworkCost() {
						return this.networkCost;
					}

					public void setNetworkCost(NetworkCost networkCost) {
						this.networkCost = networkCost;
					}

					public static class NetworkCost {

						private String preloadTime;

						private String avgBitrate;

						private String costBandwidth;

						public String getPreloadTime() {
							return this.preloadTime;
						}

						public void setPreloadTime(String preloadTime) {
							this.preloadTime = preloadTime;
						}

						public String getAvgBitrate() {
							return this.avgBitrate;
						}

						public void setAvgBitrate(String avgBitrate) {
							this.avgBitrate = avgBitrate;
						}

						public String getCostBandwidth() {
							return this.costBandwidth;
						}

						public void setCostBandwidth(String costBandwidth) {
							this.costBandwidth = costBandwidth;
						}
					}
				}

				public static class AudioStream {

					private String timebase;

					private String index;

					private String sampleFmt;

					private String channelLayout;

					private String lang;

					private String samplerate;

					private String codecLongName;

					private String channels;

					private String numFrames;

					private String bitrate;

					private String codecTagString;

					private String startTime;

					private String codecName;

					private String duration;

					private String codecTag;

					private String codecTimeBase;

					public String getTimebase() {
						return this.timebase;
					}

					public void setTimebase(String timebase) {
						this.timebase = timebase;
					}

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getSampleFmt() {
						return this.sampleFmt;
					}

					public void setSampleFmt(String sampleFmt) {
						this.sampleFmt = sampleFmt;
					}

					public String getChannelLayout() {
						return this.channelLayout;
					}

					public void setChannelLayout(String channelLayout) {
						this.channelLayout = channelLayout;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}

					public String getSamplerate() {
						return this.samplerate;
					}

					public void setSamplerate(String samplerate) {
						this.samplerate = samplerate;
					}

					public String getCodecLongName() {
						return this.codecLongName;
					}

					public void setCodecLongName(String codecLongName) {
						this.codecLongName = codecLongName;
					}

					public String getChannels() {
						return this.channels;
					}

					public void setChannels(String channels) {
						this.channels = channels;
					}

					public String getNumFrames() {
						return this.numFrames;
					}

					public void setNumFrames(String numFrames) {
						this.numFrames = numFrames;
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

					public String getStartTime() {
						return this.startTime;
					}

					public void setStartTime(String startTime) {
						this.startTime = startTime;
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
				}

				public static class SubtitleStream {

					private String index;

					private String lang;

					public String getIndex() {
						return this.index;
					}

					public void setIndex(String index) {
						this.index = index;
					}

					public String getLang() {
						return this.lang;
					}

					public void setLang(String lang) {
						this.lang = lang;
					}
				}
			}

			public static class Format {

				private String startTime;

				private String numPrograms;

				private String size;

				private String numStreams;

				private String formatLongName;

				private String duration;

				private String bitrate;

				private String formatName;

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getNumPrograms() {
					return this.numPrograms;
				}

				public void setNumPrograms(String numPrograms) {
					this.numPrograms = numPrograms;
				}

				public String getSize() {
					return this.size;
				}

				public void setSize(String size) {
					this.size = size;
				}

				public String getNumStreams() {
					return this.numStreams;
				}

				public void setNumStreams(String numStreams) {
					this.numStreams = numStreams;
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

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getFormatName() {
					return this.formatName;
				}

				public void setFormatName(String formatName) {
					this.formatName = formatName;
				}
			}
		}
	}

	@Override
	public QueryMediaListResponse getInstance(UnmarshallerContext context) {
		return	QueryMediaListResponseUnmarshaller.unmarshall(this, context);
	}
}
