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
import com.aliyuncs.mts.transform.v20140618.QueryComplexJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryComplexJobListResponse extends AcsResponse {

	private String requestId;

	private List<Job> jobList;

	private List<String> nonExistJobIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Job> getJobList() {
		return this.jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}

	public List<String> getNonExistJobIds() {
		return this.nonExistJobIds;
	}

	public void setNonExistJobIds(List<String> nonExistJobIds) {
		this.nonExistJobIds = nonExistJobIds;
	}

	public static class Job {

		private String jobId;

		private String state;

		private String code;

		private String message;

		private Long percent;

		private String pipelineId;

		private String creationTime;

		private String finishTime;

		private List<InputsItem> inputs;

		private List<ComplexEditingConfigsItem> complexEditingConfigs;

		private TranscodeOutput transcodeOutput;

		private MNSMessageResult mNSMessageResult;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Long getPercent() {
			return this.percent;
		}

		public void setPercent(Long percent) {
			this.percent = percent;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public List<InputsItem> getInputs() {
			return this.inputs;
		}

		public void setInputs(List<InputsItem> inputs) {
			this.inputs = inputs;
		}

		public List<ComplexEditingConfigsItem> getComplexEditingConfigs() {
			return this.complexEditingConfigs;
		}

		public void setComplexEditingConfigs(List<ComplexEditingConfigsItem> complexEditingConfigs) {
			this.complexEditingConfigs = complexEditingConfigs;
		}

		public TranscodeOutput getTranscodeOutput() {
			return this.transcodeOutput;
		}

		public void setTranscodeOutput(TranscodeOutput transcodeOutput) {
			this.transcodeOutput = transcodeOutput;
		}

		public MNSMessageResult getMNSMessageResult() {
			return this.mNSMessageResult;
		}

		public void setMNSMessageResult(MNSMessageResult mNSMessageResult) {
			this.mNSMessageResult = mNSMessageResult;
		}

		public static class InputsItem {

			private List<EditingInput> editingInputs;

			public List<EditingInput> getEditingInputs() {
				return this.editingInputs;
			}

			public void setEditingInputs(List<EditingInput> editingInputs) {
				this.editingInputs = editingInputs;
			}

			public static class EditingInput {

				private String id;

				private InputFile inputFile;

				private InputConfig inputConfig;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public InputFile getInputFile() {
					return this.inputFile;
				}

				public void setInputFile(InputFile inputFile) {
					this.inputFile = inputFile;
				}

				public InputConfig getInputConfig() {
					return this.inputConfig;
				}

				public void setInputConfig(InputConfig inputConfig) {
					this.inputConfig = inputConfig;
				}

				public static class InputFile {

					private String bucket;

					private String location;

					private String object;

					public String getBucket() {
						return this.bucket;
					}

					public void setBucket(String bucket) {
						this.bucket = bucket;
					}

					public String getLocation() {
						return this.location;
					}

					public void setLocation(String location) {
						this.location = location;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}

				public static class InputConfig {

					private String deinterlaceMethod;

					private String isNormalSar;

					public String getDeinterlaceMethod() {
						return this.deinterlaceMethod;
					}

					public void setDeinterlaceMethod(String deinterlaceMethod) {
						this.deinterlaceMethod = deinterlaceMethod;
					}

					public String getIsNormalSar() {
						return this.isNormalSar;
					}

					public void setIsNormalSar(String isNormalSar) {
						this.isNormalSar = isNormalSar;
					}
				}
			}
		}

		public static class ComplexEditingConfigsItem {

			private Editing editing;

			public Editing getEditing() {
				return this.editing;
			}

			public void setEditing(Editing editing) {
				this.editing = editing;
			}

			public static class Editing {

				private List<Clip> clipList;

				private Timeline timeline;

				public List<Clip> getClipList() {
					return this.clipList;
				}

				public void setClipList(List<Clip> clipList) {
					this.clipList = clipList;
				}

				public Timeline getTimeline() {
					return this.timeline;
				}

				public void setTimeline(Timeline timeline) {
					this.timeline = timeline;
				}

				public static class Clip {

					private String id;

					private String type;

					private String sourceType;

					private String sourceID;

					private String sourceStrmMap;

					private String in;

					private String out;

					private List<Effect> effects;

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getSourceType() {
						return this.sourceType;
					}

					public void setSourceType(String sourceType) {
						this.sourceType = sourceType;
					}

					public String getSourceID() {
						return this.sourceID;
					}

					public void setSourceID(String sourceID) {
						this.sourceID = sourceID;
					}

					public String getSourceStrmMap() {
						return this.sourceStrmMap;
					}

					public void setSourceStrmMap(String sourceStrmMap) {
						this.sourceStrmMap = sourceStrmMap;
					}

					public String getIn() {
						return this.in;
					}

					public void setIn(String in) {
						this.in = in;
					}

					public String getOut() {
						return this.out;
					}

					public void setOut(String out) {
						this.out = out;
					}

					public List<Effect> getEffects() {
						return this.effects;
					}

					public void setEffects(List<Effect> effects) {
						this.effects = effects;
					}

					public static class Effect {

						private String effect;

						private String effectConfig;

						public String getEffect() {
							return this.effect;
						}

						public void setEffect(String effect) {
							this.effect = effect;
						}

						public String getEffectConfig() {
							return this.effectConfig;
						}

						public void setEffectConfig(String effectConfig) {
							this.effectConfig = effectConfig;
						}
					}
				}

				public static class Timeline {

					private List<Track> trackList;

					private TimelineConfig timelineConfig;

					public List<Track> getTrackList() {
						return this.trackList;
					}

					public void setTrackList(List<Track> trackList) {
						this.trackList = trackList;
					}

					public TimelineConfig getTimelineConfig() {
						return this.timelineConfig;
					}

					public void setTimelineConfig(TimelineConfig timelineConfig) {
						this.timelineConfig = timelineConfig;
					}

					public static class Track {

						private String id;

						private String type;

						private String order;

						private List<Clip1> clips;

						public String getId() {
							return this.id;
						}

						public void setId(String id) {
							this.id = id;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public String getOrder() {
							return this.order;
						}

						public void setOrder(String order) {
							this.order = order;
						}

						public List<Clip1> getClips() {
							return this.clips;
						}

						public void setClips(List<Clip1> clips) {
							this.clips = clips;
						}

						public static class Clip1 {

							private String clipID;

							private String in;

							private String out;

							private ClipsConfig clipsConfig;

							public String getClipID() {
								return this.clipID;
							}

							public void setClipID(String clipID) {
								this.clipID = clipID;
							}

							public String getIn() {
								return this.in;
							}

							public void setIn(String in) {
								this.in = in;
							}

							public String getOut() {
								return this.out;
							}

							public void setOut(String out) {
								this.out = out;
							}

							public ClipsConfig getClipsConfig() {
								return this.clipsConfig;
							}

							public void setClipsConfig(ClipsConfig clipsConfig) {
								this.clipsConfig = clipsConfig;
							}

							public static class ClipsConfig {

								private ClipsConfigVideo clipsConfigVideo;

								public ClipsConfigVideo getClipsConfigVideo() {
									return this.clipsConfigVideo;
								}

								public void setClipsConfigVideo(ClipsConfigVideo clipsConfigVideo) {
									this.clipsConfigVideo = clipsConfigVideo;
								}

								public static class ClipsConfigVideo {

									private String l;

									private String t;

									public String getL() {
										return this.l;
									}

									public void setL(String l) {
										this.l = l;
									}

									public String getT() {
										return this.t;
									}

									public void setT(String t) {
										this.t = t;
									}
								}
							}
						}
					}

					public static class TimelineConfig {

						private TimelineConfigVideo timelineConfigVideo;

						private TimelineConfigAudio timelineConfigAudio;

						public TimelineConfigVideo getTimelineConfigVideo() {
							return this.timelineConfigVideo;
						}

						public void setTimelineConfigVideo(TimelineConfigVideo timelineConfigVideo) {
							this.timelineConfigVideo = timelineConfigVideo;
						}

						public TimelineConfigAudio getTimelineConfigAudio() {
							return this.timelineConfigAudio;
						}

						public void setTimelineConfigAudio(TimelineConfigAudio timelineConfigAudio) {
							this.timelineConfigAudio = timelineConfigAudio;
						}

						public static class TimelineConfigVideo {

							private String width;

							private String height;

							private String bgColor;

							private String fps;

							private String renderRatio;

							private String reclosePrec;

							private String isGpuData;

							private String isOneTrackData;

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

							public String getBgColor() {
								return this.bgColor;
							}

							public void setBgColor(String bgColor) {
								this.bgColor = bgColor;
							}

							public String getFps() {
								return this.fps;
							}

							public void setFps(String fps) {
								this.fps = fps;
							}

							public String getRenderRatio() {
								return this.renderRatio;
							}

							public void setRenderRatio(String renderRatio) {
								this.renderRatio = renderRatio;
							}

							public String getReclosePrec() {
								return this.reclosePrec;
							}

							public void setReclosePrec(String reclosePrec) {
								this.reclosePrec = reclosePrec;
							}

							public String getIsGpuData() {
								return this.isGpuData;
							}

							public void setIsGpuData(String isGpuData) {
								this.isGpuData = isGpuData;
							}

							public String getIsOneTrackData() {
								return this.isOneTrackData;
							}

							public void setIsOneTrackData(String isOneTrackData) {
								this.isOneTrackData = isOneTrackData;
							}
						}

						public static class TimelineConfigAudio {

							private String samplerate;

							private String channelLayout;

							private String channels;

							public String getSamplerate() {
								return this.samplerate;
							}

							public void setSamplerate(String samplerate) {
								this.samplerate = samplerate;
							}

							public String getChannelLayout() {
								return this.channelLayout;
							}

							public void setChannelLayout(String channelLayout) {
								this.channelLayout = channelLayout;
							}

							public String getChannels() {
								return this.channels;
							}

							public void setChannels(String channels) {
								this.channels = channels;
							}
						}
					}
				}
			}
		}

		public static class TranscodeOutput {

			private String templateId;

			private String userData;

			private String rotate;

			private String videoStreamMap;

			private String audioStreamMap;

			private String deWatermark;

			private String priority;

			private String waterMarkConfigUrl;

			private String mergeConfigUrl;

			private List<WaterMark> waterMarkList;

			private List<Merge> mergeList;

			private DigiWaterMark digiWaterMark;

			private OutputFile outputFile;

			private M3U8NonStandardSupport m3U8NonStandardSupport;

			private Properties properties;

			private Clip4 clip4;

			private SuperReso superReso;

			private SubtitleConfig subtitleConfig;

			private TransConfig transConfig;

			private MuxConfig muxConfig;

			private Audio audio;

			private Video video;

			private Container container;

			private Encryption encryption;

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getUserData() {
				return this.userData;
			}

			public void setUserData(String userData) {
				this.userData = userData;
			}

			public String getRotate() {
				return this.rotate;
			}

			public void setRotate(String rotate) {
				this.rotate = rotate;
			}

			public String getVideoStreamMap() {
				return this.videoStreamMap;
			}

			public void setVideoStreamMap(String videoStreamMap) {
				this.videoStreamMap = videoStreamMap;
			}

			public String getAudioStreamMap() {
				return this.audioStreamMap;
			}

			public void setAudioStreamMap(String audioStreamMap) {
				this.audioStreamMap = audioStreamMap;
			}

			public String getDeWatermark() {
				return this.deWatermark;
			}

			public void setDeWatermark(String deWatermark) {
				this.deWatermark = deWatermark;
			}

			public String getPriority() {
				return this.priority;
			}

			public void setPriority(String priority) {
				this.priority = priority;
			}

			public String getWaterMarkConfigUrl() {
				return this.waterMarkConfigUrl;
			}

			public void setWaterMarkConfigUrl(String waterMarkConfigUrl) {
				this.waterMarkConfigUrl = waterMarkConfigUrl;
			}

			public String getMergeConfigUrl() {
				return this.mergeConfigUrl;
			}

			public void setMergeConfigUrl(String mergeConfigUrl) {
				this.mergeConfigUrl = mergeConfigUrl;
			}

			public List<WaterMark> getWaterMarkList() {
				return this.waterMarkList;
			}

			public void setWaterMarkList(List<WaterMark> waterMarkList) {
				this.waterMarkList = waterMarkList;
			}

			public List<Merge> getMergeList() {
				return this.mergeList;
			}

			public void setMergeList(List<Merge> mergeList) {
				this.mergeList = mergeList;
			}

			public DigiWaterMark getDigiWaterMark() {
				return this.digiWaterMark;
			}

			public void setDigiWaterMark(DigiWaterMark digiWaterMark) {
				this.digiWaterMark = digiWaterMark;
			}

			public OutputFile getOutputFile() {
				return this.outputFile;
			}

			public void setOutputFile(OutputFile outputFile) {
				this.outputFile = outputFile;
			}

			public M3U8NonStandardSupport getM3U8NonStandardSupport() {
				return this.m3U8NonStandardSupport;
			}

			public void setM3U8NonStandardSupport(M3U8NonStandardSupport m3U8NonStandardSupport) {
				this.m3U8NonStandardSupport = m3U8NonStandardSupport;
			}

			public Properties getProperties() {
				return this.properties;
			}

			public void setProperties(Properties properties) {
				this.properties = properties;
			}

			public Clip4 getClip4() {
				return this.clip4;
			}

			public void setClip4(Clip4 clip4) {
				this.clip4 = clip4;
			}

			public SuperReso getSuperReso() {
				return this.superReso;
			}

			public void setSuperReso(SuperReso superReso) {
				this.superReso = superReso;
			}

			public SubtitleConfig getSubtitleConfig() {
				return this.subtitleConfig;
			}

			public void setSubtitleConfig(SubtitleConfig subtitleConfig) {
				this.subtitleConfig = subtitleConfig;
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

			public Video getVideo() {
				return this.video;
			}

			public void setVideo(Video video) {
				this.video = video;
			}

			public Container getContainer() {
				return this.container;
			}

			public void setContainer(Container container) {
				this.container = container;
			}

			public Encryption getEncryption() {
				return this.encryption;
			}

			public void setEncryption(Encryption encryption) {
				this.encryption = encryption;
			}

			public static class WaterMark {

				private String waterMarkTemplateId;

				private String width;

				private String height;

				private String dx;

				private String dy;

				private String referPos;

				private String type;

				private InputFile2 inputFile2;

				public String getWaterMarkTemplateId() {
					return this.waterMarkTemplateId;
				}

				public void setWaterMarkTemplateId(String waterMarkTemplateId) {
					this.waterMarkTemplateId = waterMarkTemplateId;
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

				public String getDx() {
					return this.dx;
				}

				public void setDx(String dx) {
					this.dx = dx;
				}

				public String getDy() {
					return this.dy;
				}

				public void setDy(String dy) {
					this.dy = dy;
				}

				public String getReferPos() {
					return this.referPos;
				}

				public void setReferPos(String referPos) {
					this.referPos = referPos;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public InputFile2 getInputFile2() {
					return this.inputFile2;
				}

				public void setInputFile2(InputFile2 inputFile2) {
					this.inputFile2 = inputFile2;
				}

				public static class InputFile2 {

					private String bucket;

					private String location;

					private String object;

					public String getBucket() {
						return this.bucket;
					}

					public void setBucket(String bucket) {
						this.bucket = bucket;
					}

					public String getLocation() {
						return this.location;
					}

					public void setLocation(String location) {
						this.location = location;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}
			}

			public static class Merge {

				private String mergeURL;

				private String start;

				private String duration;

				private String roleArn;

				public String getMergeURL() {
					return this.mergeURL;
				}

				public void setMergeURL(String mergeURL) {
					this.mergeURL = mergeURL;
				}

				public String getStart() {
					return this.start;
				}

				public void setStart(String start) {
					this.start = start;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getRoleArn() {
					return this.roleArn;
				}

				public void setRoleArn(String roleArn) {
					this.roleArn = roleArn;
				}
			}

			public static class DigiWaterMark {

				private String type;

				private String alpha;

				private InputFile3 inputFile3;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getAlpha() {
					return this.alpha;
				}

				public void setAlpha(String alpha) {
					this.alpha = alpha;
				}

				public InputFile3 getInputFile3() {
					return this.inputFile3;
				}

				public void setInputFile3(InputFile3 inputFile3) {
					this.inputFile3 = inputFile3;
				}

				public static class InputFile3 {

					private String bucket;

					private String location;

					private String object;

					public String getBucket() {
						return this.bucket;
					}

					public void setBucket(String bucket) {
						this.bucket = bucket;
					}

					public String getLocation() {
						return this.location;
					}

					public void setLocation(String location) {
						this.location = location;
					}

					public String getObject() {
						return this.object;
					}

					public void setObject(String object) {
						this.object = object;
					}
				}
			}

			public static class OutputFile {

				private String bucket;

				private String location;

				private String object;

				private String roleArn;

				public String getBucket() {
					return this.bucket;
				}

				public void setBucket(String bucket) {
					this.bucket = bucket;
				}

				public String getLocation() {
					return this.location;
				}

				public void setLocation(String location) {
					this.location = location;
				}

				public String getObject() {
					return this.object;
				}

				public void setObject(String object) {
					this.object = object;
				}

				public String getRoleArn() {
					return this.roleArn;
				}

				public void setRoleArn(String roleArn) {
					this.roleArn = roleArn;
				}
			}

			public static class M3U8NonStandardSupport {

				private TS tS;

				public TS getTS() {
					return this.tS;
				}

				public void setTS(TS tS) {
					this.tS = tS;
				}

				public static class TS {

					private Boolean md5Support;

					private Boolean sizeSupport;

					public Boolean getMd5Support() {
						return this.md5Support;
					}

					public void setMd5Support(Boolean md5Support) {
						this.md5Support = md5Support;
					}

					public Boolean getSizeSupport() {
						return this.sizeSupport;
					}

					public void setSizeSupport(Boolean sizeSupport) {
						this.sizeSupport = sizeSupport;
					}
				}
			}

			public static class Properties {

				private String width;

				private String height;

				private String bitrate;

				private String duration;

				private String fps;

				private String fileSize;

				private String fileFormat;

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

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
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

				public String getFileSize() {
					return this.fileSize;
				}

				public void setFileSize(String fileSize) {
					this.fileSize = fileSize;
				}

				public String getFileFormat() {
					return this.fileFormat;
				}

				public void setFileFormat(String fileFormat) {
					this.fileFormat = fileFormat;
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

						private String bitrate;

						private String numFrames;

						private String lang;

						private NetworkCost networkCost;

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

						public NetworkCost getNetworkCost() {
							return this.networkCost;
						}

						public void setNetworkCost(NetworkCost networkCost) {
							this.networkCost = networkCost;
						}

						public static class NetworkCost {

							private String preloadTime;

							private String costBandwidth;

							private String avgBitrate;

							public String getPreloadTime() {
								return this.preloadTime;
							}

							public void setPreloadTime(String preloadTime) {
								this.preloadTime = preloadTime;
							}

							public String getCostBandwidth() {
								return this.costBandwidth;
							}

							public void setCostBandwidth(String costBandwidth) {
								this.costBandwidth = costBandwidth;
							}

							public String getAvgBitrate() {
								return this.avgBitrate;
							}

							public void setAvgBitrate(String avgBitrate) {
								this.avgBitrate = avgBitrate;
							}
						}
					}

					public static class AudioStream {

						private String index;

						private String codecName;

						private String codecTimeBase;

						private String codecLongName;

						private String codecTagString;

						private String codecTag;

						private String sampleFmt;

						private String samplerate;

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

						public String getCodecTimeBase() {
							return this.codecTimeBase;
						}

						public void setCodecTimeBase(String codecTimeBase) {
							this.codecTimeBase = codecTimeBase;
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

						public String getSampleFmt() {
							return this.sampleFmt;
						}

						public void setSampleFmt(String sampleFmt) {
							this.sampleFmt = sampleFmt;
						}

						public String getSamplerate() {
							return this.samplerate;
						}

						public void setSamplerate(String samplerate) {
							this.samplerate = samplerate;
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

					private String numStreams;

					private String numPrograms;

					private String formatName;

					private String formatLongName;

					private String startTime;

					private String duration;

					private String size;

					private String bitrate;

					public String getNumStreams() {
						return this.numStreams;
					}

					public void setNumStreams(String numStreams) {
						this.numStreams = numStreams;
					}

					public String getNumPrograms() {
						return this.numPrograms;
					}

					public void setNumPrograms(String numPrograms) {
						this.numPrograms = numPrograms;
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

					public String getSize() {
						return this.size;
					}

					public void setSize(String size) {
						this.size = size;
					}

					public String getBitrate() {
						return this.bitrate;
					}

					public void setBitrate(String bitrate) {
						this.bitrate = bitrate;
					}
				}
			}

			public static class Clip4 {

				private TimeSpan timeSpan;

				public TimeSpan getTimeSpan() {
					return this.timeSpan;
				}

				public void setTimeSpan(TimeSpan timeSpan) {
					this.timeSpan = timeSpan;
				}

				public static class TimeSpan {

					private String seek;

					private String duration;

					public String getSeek() {
						return this.seek;
					}

					public void setSeek(String seek) {
						this.seek = seek;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}
				}
			}

			public static class SuperReso {

				private String isHalfSample;

				public String getIsHalfSample() {
					return this.isHalfSample;
				}

				public void setIsHalfSample(String isHalfSample) {
					this.isHalfSample = isHalfSample;
				}
			}

			public static class SubtitleConfig {

				private List<Subtitle> subtitleList;

				private List<ExtSubtitle> extSubtitleList;

				public List<Subtitle> getSubtitleList() {
					return this.subtitleList;
				}

				public void setSubtitleList(List<Subtitle> subtitleList) {
					this.subtitleList = subtitleList;
				}

				public List<ExtSubtitle> getExtSubtitleList() {
					return this.extSubtitleList;
				}

				public void setExtSubtitleList(List<ExtSubtitle> extSubtitleList) {
					this.extSubtitleList = extSubtitleList;
				}

				public static class Subtitle {

					private String map;

					public String getMap() {
						return this.map;
					}

					public void setMap(String map) {
						this.map = map;
					}
				}

				public static class ExtSubtitle {

					private String fontName;

					private String charEnc;

					private Input input;

					public String getFontName() {
						return this.fontName;
					}

					public void setFontName(String fontName) {
						this.fontName = fontName;
					}

					public String getCharEnc() {
						return this.charEnc;
					}

					public void setCharEnc(String charEnc) {
						this.charEnc = charEnc;
					}

					public Input getInput() {
						return this.input;
					}

					public void setInput(Input input) {
						this.input = input;
					}

					public static class Input {

						private String bucket;

						private String location;

						private String object;

						public String getBucket() {
							return this.bucket;
						}

						public void setBucket(String bucket) {
							this.bucket = bucket;
						}

						public String getLocation() {
							return this.location;
						}

						public void setLocation(String location) {
							this.location = location;
						}

						public String getObject() {
							return this.object;
						}

						public void setObject(String object) {
							this.object = object;
						}
					}
				}
			}

			public static class TransConfig {

				private String transMode;

				private String isCheckReso;

				private String isCheckResoFail;

				private String isCheckVideoBitrate;

				private String isCheckAudioBitrate;

				private String adjDarMethod;

				private String isCheckVideoBitrateFail;

				private String isCheckAudioBitrateFail;

				private String duration;

				public String getTransMode() {
					return this.transMode;
				}

				public void setTransMode(String transMode) {
					this.transMode = transMode;
				}

				public String getIsCheckReso() {
					return this.isCheckReso;
				}

				public void setIsCheckReso(String isCheckReso) {
					this.isCheckReso = isCheckReso;
				}

				public String getIsCheckResoFail() {
					return this.isCheckResoFail;
				}

				public void setIsCheckResoFail(String isCheckResoFail) {
					this.isCheckResoFail = isCheckResoFail;
				}

				public String getIsCheckVideoBitrate() {
					return this.isCheckVideoBitrate;
				}

				public void setIsCheckVideoBitrate(String isCheckVideoBitrate) {
					this.isCheckVideoBitrate = isCheckVideoBitrate;
				}

				public String getIsCheckAudioBitrate() {
					return this.isCheckAudioBitrate;
				}

				public void setIsCheckAudioBitrate(String isCheckAudioBitrate) {
					this.isCheckAudioBitrate = isCheckAudioBitrate;
				}

				public String getAdjDarMethod() {
					return this.adjDarMethod;
				}

				public void setAdjDarMethod(String adjDarMethod) {
					this.adjDarMethod = adjDarMethod;
				}

				public String getIsCheckVideoBitrateFail() {
					return this.isCheckVideoBitrateFail;
				}

				public void setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
					this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
				}

				public String getIsCheckAudioBitrateFail() {
					return this.isCheckAudioBitrateFail;
				}

				public void setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
					this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}
			}

			public static class MuxConfig {

				private Segment segment;

				private Gif gif;

				public Segment getSegment() {
					return this.segment;
				}

				public void setSegment(Segment segment) {
					this.segment = segment;
				}

				public Gif getGif() {
					return this.gif;
				}

				public void setGif(Gif gif) {
					this.gif = gif;
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

				public static class Gif {

					private String loop;

					private String finalDelay;

					private String isCustomPalette;

					private String ditherMode;

					public String getLoop() {
						return this.loop;
					}

					public void setLoop(String loop) {
						this.loop = loop;
					}

					public String getFinalDelay() {
						return this.finalDelay;
					}

					public void setFinalDelay(String finalDelay) {
						this.finalDelay = finalDelay;
					}

					public String getIsCustomPalette() {
						return this.isCustomPalette;
					}

					public void setIsCustomPalette(String isCustomPalette) {
						this.isCustomPalette = isCustomPalette;
					}

					public String getDitherMode() {
						return this.ditherMode;
					}

					public void setDitherMode(String ditherMode) {
						this.ditherMode = ditherMode;
					}
				}
			}

			public static class Audio {

				private String codec;

				private String profile;

				private String samplerate;

				private String bitrate;

				private String channels;

				private String qscale;

				private Volume volume;

				public String getCodec() {
					return this.codec;
				}

				public void setCodec(String codec) {
					this.codec = codec;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getSamplerate() {
					return this.samplerate;
				}

				public void setSamplerate(String samplerate) {
					this.samplerate = samplerate;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getChannels() {
					return this.channels;
				}

				public void setChannels(String channels) {
					this.channels = channels;
				}

				public String getQscale() {
					return this.qscale;
				}

				public void setQscale(String qscale) {
					this.qscale = qscale;
				}

				public Volume getVolume() {
					return this.volume;
				}

				public void setVolume(Volume volume) {
					this.volume = volume;
				}

				public static class Volume {

					private String level;

					private String method;

					public String getLevel() {
						return this.level;
					}

					public void setLevel(String level) {
						this.level = level;
					}

					public String getMethod() {
						return this.method;
					}

					public void setMethod(String method) {
						this.method = method;
					}
				}
			}

			public static class Video {

				private String codec;

				private String profile;

				private String bitrate;

				private String crf;

				private String width;

				private String height;

				private String fps;

				private String gop;

				private String preset;

				private String scanMode;

				private String bufsize;

				private String maxrate;

				private String pixFmt;

				private String degrain;

				private String qscale;

				private String crop;

				private String pad;

				private String maxFps;

				private BitrateBnd bitrateBnd;

				public String getCodec() {
					return this.codec;
				}

				public void setCodec(String codec) {
					this.codec = codec;
				}

				public String getProfile() {
					return this.profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getCrf() {
					return this.crf;
				}

				public void setCrf(String crf) {
					this.crf = crf;
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

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public String getGop() {
					return this.gop;
				}

				public void setGop(String gop) {
					this.gop = gop;
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

				public String getBufsize() {
					return this.bufsize;
				}

				public void setBufsize(String bufsize) {
					this.bufsize = bufsize;
				}

				public String getMaxrate() {
					return this.maxrate;
				}

				public void setMaxrate(String maxrate) {
					this.maxrate = maxrate;
				}

				public String getPixFmt() {
					return this.pixFmt;
				}

				public void setPixFmt(String pixFmt) {
					this.pixFmt = pixFmt;
				}

				public String getDegrain() {
					return this.degrain;
				}

				public void setDegrain(String degrain) {
					this.degrain = degrain;
				}

				public String getQscale() {
					return this.qscale;
				}

				public void setQscale(String qscale) {
					this.qscale = qscale;
				}

				public String getCrop() {
					return this.crop;
				}

				public void setCrop(String crop) {
					this.crop = crop;
				}

				public String getPad() {
					return this.pad;
				}

				public void setPad(String pad) {
					this.pad = pad;
				}

				public String getMaxFps() {
					return this.maxFps;
				}

				public void setMaxFps(String maxFps) {
					this.maxFps = maxFps;
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

			public static class Container {

				private String format;

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}
			}

			public static class Encryption {

				private String type;

				private String id;

				private String key;

				private String keyUri;

				private String keyType;

				private String skipCnt;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getKeyUri() {
					return this.keyUri;
				}

				public void setKeyUri(String keyUri) {
					this.keyUri = keyUri;
				}

				public String getKeyType() {
					return this.keyType;
				}

				public void setKeyType(String keyType) {
					this.keyType = keyType;
				}

				public String getSkipCnt() {
					return this.skipCnt;
				}

				public void setSkipCnt(String skipCnt) {
					this.skipCnt = skipCnt;
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
	}

	@Override
	public QueryComplexJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryComplexJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
