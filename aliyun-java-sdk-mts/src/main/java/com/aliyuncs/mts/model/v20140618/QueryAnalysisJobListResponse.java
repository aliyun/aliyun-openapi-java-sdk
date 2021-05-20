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
import com.aliyuncs.mts.transform.v20140618.QueryAnalysisJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAnalysisJobListResponse extends AcsResponse {

	private String requestId;

	private List<AnalysisJob> analysisJobList;

	private List<String> nonExistAnalysisJobIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AnalysisJob> getAnalysisJobList() {
		return this.analysisJobList;
	}

	public void setAnalysisJobList(List<AnalysisJob> analysisJobList) {
		this.analysisJobList = analysisJobList;
	}

	public List<String> getNonExistAnalysisJobIds() {
		return this.nonExistAnalysisJobIds;
	}

	public void setNonExistAnalysisJobIds(List<String> nonExistAnalysisJobIds) {
		this.nonExistAnalysisJobIds = nonExistAnalysisJobIds;
	}

	public static class AnalysisJob {

		private String creationTime;

		private Long percent;

		private String state;

		private String message;

		private String priority;

		private String userData;

		private String code;

		private String pipelineId;

		private String id;

		private List<Template> templateList;

		private AnalysisConfig analysisConfig;

		private MNSMessageResult mNSMessageResult;

		private InputFile inputFile;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Long getPercent() {
			return this.percent;
		}

		public void setPercent(Long percent) {
			this.percent = percent;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Template> getTemplateList() {
			return this.templateList;
		}

		public void setTemplateList(List<Template> templateList) {
			this.templateList = templateList;
		}

		public AnalysisConfig getAnalysisConfig() {
			return this.analysisConfig;
		}

		public void setAnalysisConfig(AnalysisConfig analysisConfig) {
			this.analysisConfig = analysisConfig;
		}

		public MNSMessageResult getMNSMessageResult() {
			return this.mNSMessageResult;
		}

		public void setMNSMessageResult(MNSMessageResult mNSMessageResult) {
			this.mNSMessageResult = mNSMessageResult;
		}

		public InputFile getInputFile() {
			return this.inputFile;
		}

		public void setInputFile(InputFile inputFile) {
			this.inputFile = inputFile;
		}

		public static class Template {

			private String state;

			private String name;

			private String id;

			private Video video;

			private TransConfig transConfig;

			private MuxConfig muxConfig;

			private Audio audio;

			private Container container;

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Video getVideo() {
				return this.video;
			}

			public void setVideo(Video video) {
				this.video = video;
			}

			public TransConfig getTransConfig() {
				return this.transConfig;
			}

			public void setTransConfig(TransConfig transConfig) {
				this.transConfig = transConfig;
			}

			public MuxConfig getMuxConfig() {
				return this.muxConfig;
			}

			public void setMuxConfig(MuxConfig muxConfig) {
				this.muxConfig = muxConfig;
			}

			public Audio getAudio() {
				return this.audio;
			}

			public void setAudio(Audio audio) {
				this.audio = audio;
			}

			public Container getContainer() {
				return this.container;
			}

			public void setContainer(Container container) {
				this.container = container;
			}

			public static class Video {

				private String bufsize;

				private String degrain;

				private String pixFmt;

				private String codec;

				private String height;

				private String qscale;

				private String bitrate;

				private String maxrate;

				private String profile;

				private String crf;

				private String gop;

				private String width;

				private String fps;

				private String preset;

				private String scanMode;

				private BitrateBnd bitrateBnd;

				public String getBufsize() {
					return this.bufsize;
				}

				public void setBufsize(String bufsize) {
					this.bufsize = bufsize;
				}

				public String getDegrain() {
					return this.degrain;
				}

				public void setDegrain(String degrain) {
					this.degrain = degrain;
				}

				public String getPixFmt() {
					return this.pixFmt;
				}

				public void setPixFmt(String pixFmt) {
					this.pixFmt = pixFmt;
				}

				public String getCodec() {
					return this.codec;
				}

				public void setCodec(String codec) {
					this.codec = codec;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public String getQscale() {
					return this.qscale;
				}

				public void setQscale(String qscale) {
					this.qscale = qscale;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getMaxrate() {
					return this.maxrate;
				}

				public void setMaxrate(String maxrate) {
					this.maxrate = maxrate;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getCrf() {
					return this.crf;
				}

				public void setCrf(String crf) {
					this.crf = crf;
				}

				public String getGop() {
					return this.gop;
				}

				public void setGop(String gop) {
					this.gop = gop;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public String getPreset() {
					return this.preset;
				}

				public void setPreset(String preset) {
					this.preset = preset;
				}

				public String getScanMode() {
					return this.scanMode;
				}

				public void setScanMode(String scanMode) {
					this.scanMode = scanMode;
				}

				public BitrateBnd getBitrateBnd() {
					return this.bitrateBnd;
				}

				public void setBitrateBnd(BitrateBnd bitrateBnd) {
					this.bitrateBnd = bitrateBnd;
				}

				public static class BitrateBnd {

					private String max;

					private String min;

					public String getMax() {
						return this.max;
					}

					public void setMax(String max) {
						this.max = max;
					}

					public String getMin() {
						return this.min;
					}

					public void setMin(String min) {
						this.min = min;
					}
				}
			}

			public static class TransConfig {

				private String transMode;

				public String getTransMode() {
					return this.transMode;
				}

				public void setTransMode(String transMode) {
					this.transMode = transMode;
				}
			}

			public static class MuxConfig {

				private Gif gif;

				private Segment segment;

				public Gif getGif() {
					return this.gif;
				}

				public void setGif(Gif gif) {
					this.gif = gif;
				}

				public Segment getSegment() {
					return this.segment;
				}

				public void setSegment(Segment segment) {
					this.segment = segment;
				}

				public static class Gif {

					private String finalDelay;

					private String loop;

					public String getFinalDelay() {
						return this.finalDelay;
					}

					public void setFinalDelay(String finalDelay) {
						this.finalDelay = finalDelay;
					}

					public String getLoop() {
						return this.loop;
					}

					public void setLoop(String loop) {
						this.loop = loop;
					}
				}

				public static class Segment {

					private String duration;

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}
				}
			}

			public static class Audio {

				private String profile;

				private String codec;

				private String samplerate;

				private String qscale;

				private String channels;

				private String bitrate;

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getCodec() {
					return this.codec;
				}

				public void setCodec(String codec) {
					this.codec = codec;
				}

				public String getSamplerate() {
					return this.samplerate;
				}

				public void setSamplerate(String samplerate) {
					this.samplerate = samplerate;
				}

				public String getQscale() {
					return this.qscale;
				}

				public void setQscale(String qscale) {
					this.qscale = qscale;
				}

				public String getChannels() {
					return this.channels;
				}

				public void setChannels(String channels) {
					this.channels = channels;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}
			}

			public static class Container {

				private String format;

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}
			}
		}

		public static class AnalysisConfig {

			private QualityControl qualityControl;

			private PropertiesControl propertiesControl;

			public QualityControl getQualityControl() {
				return this.qualityControl;
			}

			public void setQualityControl(QualityControl qualityControl) {
				this.qualityControl = qualityControl;
			}

			public PropertiesControl getPropertiesControl() {
				return this.propertiesControl;
			}

			public void setPropertiesControl(PropertiesControl propertiesControl) {
				this.propertiesControl = propertiesControl;
			}

			public static class QualityControl {

				private String methodStreaming;

				private String rateQuality;

				public String getMethodStreaming() {
					return this.methodStreaming;
				}

				public void setMethodStreaming(String methodStreaming) {
					this.methodStreaming = methodStreaming;
				}

				public String getRateQuality() {
					return this.rateQuality;
				}

				public void setRateQuality(String rateQuality) {
					this.rateQuality = rateQuality;
				}
			}

			public static class PropertiesControl {

				private String deinterlace;

				private Crop crop;

				public String getDeinterlace() {
					return this.deinterlace;
				}

				public void setDeinterlace(String deinterlace) {
					this.deinterlace = deinterlace;
				}

				public Crop getCrop() {
					return this.crop;
				}

				public void setCrop(Crop crop) {
					this.crop = crop;
				}

				public static class Crop {

					private String top;

					private String width;

					private String height;

					private String left;

					private String mode;

					public String getTop() {
						return this.top;
					}

					public void setTop(String top) {
						this.top = top;
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

					public String getLeft() {
						return this.left;
					}

					public void setLeft(String left) {
						this.left = left;
					}

					public String getMode() {
						return this.mode;
					}

					public void setMode(String mode) {
						this.mode = mode;
					}
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

		public static class InputFile {

			private String object;

			private String location;

			private String bucket;

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

	@Override
	public QueryAnalysisJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryAnalysisJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
