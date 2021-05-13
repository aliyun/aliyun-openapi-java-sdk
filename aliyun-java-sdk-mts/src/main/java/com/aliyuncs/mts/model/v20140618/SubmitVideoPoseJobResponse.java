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
import com.aliyuncs.mts.transform.v20140618.SubmitVideoPoseJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitVideoPoseJobResponse extends AcsResponse {

	private String requestId;

	private VideoPoseJob videoPoseJob;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VideoPoseJob getVideoPoseJob() {
		return this.videoPoseJob;
	}

	public void setVideoPoseJob(VideoPoseJob videoPoseJob) {
		this.videoPoseJob = videoPoseJob;
	}

	public static class VideoPoseJob {

		private String state;

		private String jobId;

		private String userData;

		private String pipelineId;

		private OutputConfig outputConfig;

		private MNSMessageResult mNSMessageResult;

		private Input input;

		private Properties properties;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public OutputConfig getOutputConfig() {
			return this.outputConfig;
		}

		public void setOutputConfig(OutputConfig outputConfig) {
			this.outputConfig = outputConfig;
		}

		public MNSMessageResult getMNSMessageResult() {
			return this.mNSMessageResult;
		}

		public void setMNSMessageResult(MNSMessageResult mNSMessageResult) {
			this.mNSMessageResult = mNSMessageResult;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public Properties getProperties() {
			return this.properties;
		}

		public void setProperties(Properties properties) {
			this.properties = properties;
		}

		public static class OutputConfig {

			private DataFile dataFile;

			private VideoFile videoFile;

			public DataFile getDataFile() {
				return this.dataFile;
			}

			public void setDataFile(DataFile dataFile) {
				this.dataFile = dataFile;
			}

			public VideoFile getVideoFile() {
				return this.videoFile;
			}

			public void setVideoFile(VideoFile videoFile) {
				this.videoFile = videoFile;
			}

			public static class DataFile {

				private String roleArn;

				private String object;

				private String location;

				private String bucket;

				public String getRoleArn() {
					return this.roleArn;
				}

				public void setRoleArn(String roleArn) {
					this.roleArn = roleArn;
				}

				public String getObject() {
					return this.object;
				}

				public void setObject(String object) {
					this.object = object;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getBucket() {
					return this.bucket;
				}

				public void setBucket(String bucket) {
					this.bucket = bucket;
				}
			}

			public static class VideoFile {

				private String roleArn;

				private String object;

				private String location;

				private String bucket;

				public String getRoleArn() {
					return this.roleArn;
				}

				public void setRoleArn(String roleArn) {
					this.roleArn = roleArn;
				}

				public String getObject() {
					return this.object;
				}

				public void setObject(String object) {
					this.object = object;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getBucket() {
					return this.bucket;
				}

				public void setBucket(String bucket) {
					this.bucket = bucket;
				}
			}
		}

		public static class MNSMessageResult {

			private String messageId;

			private String errorMessage;

			private String errorCode;

			public String getMessageId() {
				return this.messageId;
			}

			public void setMessageId(String messageId) {
				this.messageId = messageId;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}
		}

		public static class Input {

			private String roleArn;

			private String object;

			private String location;

			private String bucket;

			public String getRoleArn() {
				return this.roleArn;
			}

			public void setRoleArn(String roleArn) {
				this.roleArn = roleArn;
			}

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}
		}

		public static class Properties {

			private String width;

			private String height;

			private String duration;

			private String fps;

			private String bitrate;

			private String fileFormat;

			private String fileSize;

			private Streams streams;

			private Format format;

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

			public String getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(String bitrate) {
				this.bitrate = bitrate;
			}

			public String getFileFormat() {
				return this.fileFormat;
			}

			public void setFileFormat(String fileFormat) {
				this.fileFormat = fileFormat;
			}

			public String getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(String fileSize) {
				this.fileSize = fileSize;
			}

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

					private String timebase;

					private String index;

					private String startTime;

					private String codecName;

					private String lang;

					private String codecLongName;

					private String duration;

					private String codecTag;

					private String codecTimeBase;

					private String codecTagString;

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

					public String getCodecTagString() {
						return this.codecTagString;
					}

					public void setCodecTagString(String codecTagString) {
						this.codecTagString = codecTagString;
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
	public SubmitVideoPoseJobResponse getInstance(UnmarshallerContext context) {
		return	SubmitVideoPoseJobResponseUnmarshaller.unmarshall(this, context);
	}
}
