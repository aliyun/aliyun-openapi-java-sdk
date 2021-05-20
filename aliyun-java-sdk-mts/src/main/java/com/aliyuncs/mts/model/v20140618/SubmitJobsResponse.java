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
import com.aliyuncs.mts.transform.v20140618.SubmitJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitJobsResponse extends AcsResponse {

	private String requestId;

	private List<JobResult> jobResultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<JobResult> getJobResultList() {
		return this.jobResultList;
	}

	public void setJobResultList(List<JobResult> jobResultList) {
		this.jobResultList = jobResultList;
	}

	public static class JobResult {

		private Boolean success;

		private String code;

		private String message;

		private Job job;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
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

		public Job getJob() {
			return this.job;
		}

		public void setJob(Job job) {
			this.job = job;
		}

		public static class Job {

			private String creationTime;

			private Long percent;

			private String finishTime;

			private String state;

			private String jobId;

			private String code;

			private String message;

			private String pipelineId;

			private Output output;

			private Input input;

			private MNSMessageResult mNSMessageResult;

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

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

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

			public String getPipelineId() {
				return this.pipelineId;
			}

			public void setPipelineId(String pipelineId) {
				this.pipelineId = pipelineId;
			}

			public Output getOutput() {
				return this.output;
			}

			public void setOutput(Output output) {
				this.output = output;
			}

			public Input getInput() {
				return this.input;
			}

			public void setInput(Input input) {
				this.input = input;
			}

			public MNSMessageResult getMNSMessageResult() {
				return this.mNSMessageResult;
			}

			public void setMNSMessageResult(MNSMessageResult mNSMessageResult) {
				this.mNSMessageResult = mNSMessageResult;
			}

			public static class Output {

				private String waterMarkConfigUrl;

				private String deWatermark;

				private String priority;

				private String audioStreamMap;

				private String userData;

				private String videoStreamMap;

				private String rotate;

				private String mergeConfigUrl;

				private String templateId;

				private List<WaterMark> waterMarkList;

				private List<Merge> mergeList;

				private List<OutSubtitle> outSubtitleList;

				private List<Amix> amixList;

				private List<Opening> openingList;

				private List<TailSlate> tailSlateList;

				private Video video;

				private TransConfig transConfig;

				private Encryption encryption;

				private M3U8NonStandardSupport m3U8NonStandardSupport;

				private Audio audio;

				private SuperReso superReso;

				private DigiWaterMark digiWaterMark;

				private OutputFile outputFile;

				private Container container;

				private Clip clip;

				private MuxConfig muxConfig;

				private SubtitleConfig subtitleConfig;

				private Properties properties;

				public String getWaterMarkConfigUrl() {
					return this.waterMarkConfigUrl;
				}

				public void setWaterMarkConfigUrl(String waterMarkConfigUrl) {
					this.waterMarkConfigUrl = waterMarkConfigUrl;
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

				public String getAudioStreamMap() {
					return this.audioStreamMap;
				}

				public void setAudioStreamMap(String audioStreamMap) {
					this.audioStreamMap = audioStreamMap;
				}

				public String getUserData() {
					return this.userData;
				}

				public void setUserData(String userData) {
					this.userData = userData;
				}

				public String getVideoStreamMap() {
					return this.videoStreamMap;
				}

				public void setVideoStreamMap(String videoStreamMap) {
					this.videoStreamMap = videoStreamMap;
				}

				public String getRotate() {
					return this.rotate;
				}

				public void setRotate(String rotate) {
					this.rotate = rotate;
				}

				public String getMergeConfigUrl() {
					return this.mergeConfigUrl;
				}

				public void setMergeConfigUrl(String mergeConfigUrl) {
					this.mergeConfigUrl = mergeConfigUrl;
				}

				public String getTemplateId() {
					return this.templateId;
				}

				public void setTemplateId(String templateId) {
					this.templateId = templateId;
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

				public List<OutSubtitle> getOutSubtitleList() {
					return this.outSubtitleList;
				}

				public void setOutSubtitleList(List<OutSubtitle> outSubtitleList) {
					this.outSubtitleList = outSubtitleList;
				}

				public List<Amix> getAmixList() {
					return this.amixList;
				}

				public void setAmixList(List<Amix> amixList) {
					this.amixList = amixList;
				}

				public List<Opening> getOpeningList() {
					return this.openingList;
				}

				public void setOpeningList(List<Opening> openingList) {
					this.openingList = openingList;
				}

				public List<TailSlate> getTailSlateList() {
					return this.tailSlateList;
				}

				public void setTailSlateList(List<TailSlate> tailSlateList) {
					this.tailSlateList = tailSlateList;
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

				public Encryption getEncryption() {
					return this.encryption;
				}

				public void setEncryption(Encryption encryption) {
					this.encryption = encryption;
				}

				public M3U8NonStandardSupport getM3U8NonStandardSupport() {
					return this.m3U8NonStandardSupport;
				}

				public void setM3U8NonStandardSupport(M3U8NonStandardSupport m3U8NonStandardSupport) {
					this.m3U8NonStandardSupport = m3U8NonStandardSupport;
				}

				public Audio getAudio() {
					return this.audio;
				}

				public void setAudio(Audio audio) {
					this.audio = audio;
				}

				public SuperReso getSuperReso() {
					return this.superReso;
				}

				public void setSuperReso(SuperReso superReso) {
					this.superReso = superReso;
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

				public Container getContainer() {
					return this.container;
				}

				public void setContainer(Container container) {
					this.container = container;
				}

				public Clip getClip() {
					return this.clip;
				}

				public void setClip(Clip clip) {
					this.clip = clip;
				}

				public MuxConfig getMuxConfig() {
					return this.muxConfig;
				}

				public void setMuxConfig(MuxConfig muxConfig) {
					this.muxConfig = muxConfig;
				}

				public SubtitleConfig getSubtitleConfig() {
					return this.subtitleConfig;
				}

				public void setSubtitleConfig(SubtitleConfig subtitleConfig) {
					this.subtitleConfig = subtitleConfig;
				}

				public Properties getProperties() {
					return this.properties;
				}

				public void setProperties(Properties properties) {
					this.properties = properties;
				}

				public static class WaterMark {

					private String type;

					private String referPos;

					private String dx;

					private String width;

					private String height;

					private String waterMarkTemplateId;

					private String dy;

					private InputFile inputFile;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getReferPos() {
						return this.referPos;
					}

					public void setReferPos(String referPos) {
						this.referPos = referPos;
					}

					public String getDx() {
						return this.dx;
					}

					public void setDx(String dx) {
						this.dx = dx;
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

					public String getWaterMarkTemplateId() {
						return this.waterMarkTemplateId;
					}

					public void setWaterMarkTemplateId(String waterMarkTemplateId) {
						this.waterMarkTemplateId = waterMarkTemplateId;
					}

					public String getDy() {
						return this.dy;
					}

					public void setDy(String dy) {
						this.dy = dy;
					}

					public InputFile getInputFile() {
						return this.inputFile;
					}

					public void setInputFile(InputFile inputFile) {
						this.inputFile = inputFile;
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

				public static class Merge {

					private String start;

					private String roleArn;

					private String mergeURL;

					private String duration;

					public String getStart() {
						return this.start;
					}

					public void setStart(String start) {
						this.start = start;
					}

					public String getRoleArn() {
						return this.roleArn;
					}

					public void setRoleArn(String roleArn) {
						this.roleArn = roleArn;
					}

					public String getMergeURL() {
						return this.mergeURL;
					}

					public void setMergeURL(String mergeURL) {
						this.mergeURL = mergeURL;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}
				}

				public static class OutSubtitle {

					private String map;

					private Boolean success;

					private String message;

					private OutSubtitleFile outSubtitleFile;

					public String getMap() {
						return this.map;
					}

					public void setMap(String map) {
						this.map = map;
					}

					public Boolean getSuccess() {
						return this.success;
					}

					public void setSuccess(Boolean success) {
						this.success = success;
					}

					public String getMessage() {
						return this.message;
					}

					public void setMessage(String message) {
						this.message = message;
					}

					public OutSubtitleFile getOutSubtitleFile() {
						return this.outSubtitleFile;
					}

					public void setOutSubtitleFile(OutSubtitleFile outSubtitleFile) {
						this.outSubtitleFile = outSubtitleFile;
					}

					public static class OutSubtitleFile {

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

				public static class Amix {

					private String map;

					private String start;

					private String amixURL;

					private String duration;

					private String mixDurMode;

					public String getMap() {
						return this.map;
					}

					public void setMap(String map) {
						this.map = map;
					}

					public String getStart() {
						return this.start;
					}

					public void setStart(String start) {
						this.start = start;
					}

					public String getAmixURL() {
						return this.amixURL;
					}

					public void setAmixURL(String amixURL) {
						this.amixURL = amixURL;
					}

					public String getDuration() {
						return this.duration;
					}

					public void setDuration(String duration) {
						this.duration = duration;
					}

					public String getMixDurMode() {
						return this.mixDurMode;
					}

					public void setMixDurMode(String mixDurMode) {
						this.mixDurMode = mixDurMode;
					}
				}

				public static class Opening {

					private String openUrl;

					private String start;

					private String width;

					private String height;

					public String getOpenUrl() {
						return this.openUrl;
					}

					public void setOpenUrl(String openUrl) {
						this.openUrl = openUrl;
					}

					public String getStart() {
						return this.start;
					}

					public void setStart(String start) {
						this.start = start;
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
				}

				public static class TailSlate {

					private String start;

					private String bgColor;

					private Boolean isMergeAudio;

					private String width;

					private String height;

					private String blendDuration;

					private String tailUrl;

					public String getStart() {
						return this.start;
					}

					public void setStart(String start) {
						this.start = start;
					}

					public String getBgColor() {
						return this.bgColor;
					}

					public void setBgColor(String bgColor) {
						this.bgColor = bgColor;
					}

					public Boolean getIsMergeAudio() {
						return this.isMergeAudio;
					}

					public void setIsMergeAudio(Boolean isMergeAudio) {
						this.isMergeAudio = isMergeAudio;
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

					public String getBlendDuration() {
						return this.blendDuration;
					}

					public void setBlendDuration(String blendDuration) {
						this.blendDuration = blendDuration;
					}

					public String getTailUrl() {
						return this.tailUrl;
					}

					public void setTailUrl(String tailUrl) {
						this.tailUrl = tailUrl;
					}
				}

				public static class Video {

					private String bufsize;

					private String degrain;

					private String pixFmt;

					private String pad;

					private String codec;

					private String height;

					private String qscale;

					private String crop;

					private String bitrate;

					private String maxrate;

					private String maxFps;

					private String profile;

					private String crf;

					private String gop;

					private String width;

					private String fps;

					private String preset;

					private String scanMode;

					private String resoPriority;

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

					public String getPad() {
						return this.pad;
					}

					public void setPad(String pad) {
						this.pad = pad;
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

					public String getCrop() {
						return this.crop;
					}

					public void setCrop(String crop) {
						this.crop = crop;
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

					public String getMaxFps() {
						return this.maxFps;
					}

					public void setMaxFps(String maxFps) {
						this.maxFps = maxFps;
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

					public String getResoPriority() {
						return this.resoPriority;
					}

					public void setResoPriority(String resoPriority) {
						this.resoPriority = resoPriority;
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

					private String isCheckAudioBitrate;

					private String transMode;

					private String isCheckReso;

					private String isCheckVideoBitrateFail;

					private String adjDarMethod;

					private String isCheckVideoBitrate;

					private String isCheckResoFail;

					private String isCheckAudioBitrateFail;

					public String getIsCheckAudioBitrate() {
						return this.isCheckAudioBitrate;
					}

					public void setIsCheckAudioBitrate(String isCheckAudioBitrate) {
						this.isCheckAudioBitrate = isCheckAudioBitrate;
					}

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

					public String getIsCheckVideoBitrateFail() {
						return this.isCheckVideoBitrateFail;
					}

					public void setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
						this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
					}

					public String getAdjDarMethod() {
						return this.adjDarMethod;
					}

					public void setAdjDarMethod(String adjDarMethod) {
						this.adjDarMethod = adjDarMethod;
					}

					public String getIsCheckVideoBitrate() {
						return this.isCheckVideoBitrate;
					}

					public void setIsCheckVideoBitrate(String isCheckVideoBitrate) {
						this.isCheckVideoBitrate = isCheckVideoBitrate;
					}

					public String getIsCheckResoFail() {
						return this.isCheckResoFail;
					}

					public void setIsCheckResoFail(String isCheckResoFail) {
						this.isCheckResoFail = isCheckResoFail;
					}

					public String getIsCheckAudioBitrateFail() {
						return this.isCheckAudioBitrateFail;
					}

					public void setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
						this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
					}
				}

				public static class Encryption {

					private String type;

					private String key;

					private String keyType;

					private String id;

					private String keyUri;

					private String skipCnt;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getKeyType() {
						return this.keyType;
					}

					public void setKeyType(String keyType) {
						this.keyType = keyType;
					}

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getKeyUri() {
						return this.keyUri;
					}

					public void setKeyUri(String keyUri) {
						this.keyUri = keyUri;
					}

					public String getSkipCnt() {
						return this.skipCnt;
					}

					public void setSkipCnt(String skipCnt) {
						this.skipCnt = skipCnt;
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

						private Boolean sizeSupport;

						private Boolean md5Support;

						public Boolean getSizeSupport() {
							return this.sizeSupport;
						}

						public void setSizeSupport(Boolean sizeSupport) {
							this.sizeSupport = sizeSupport;
						}

						public Boolean getMd5Support() {
							return this.md5Support;
						}

						public void setMd5Support(Boolean md5Support) {
							this.md5Support = md5Support;
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

					private Volume volume;

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

					public Volume getVolume() {
						return this.volume;
					}

					public void setVolume(Volume volume) {
						this.volume = volume;
					}

					public static class Volume {

						private String method;

						private String level;

						public String getBizMethod() {
							return this.method;
						}

						public void setBizMethod(String method) {
							this.method = method;
						}

						public String getLevel() {
							return this.level;
						}

						public void setLevel(String level) {
							this.level = level;
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

				public static class DigiWaterMark {

					private String type;

					private String alpha;

					private InputFile1 inputFile1;

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

					public InputFile1 getInputFile1() {
						return this.inputFile1;
					}

					public void setInputFile1(InputFile1 inputFile1) {
						this.inputFile1 = inputFile1;
					}

					public static class InputFile1 {

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

				public static class OutputFile {

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

				public static class Container {

					private String format;

					public String getFormat() {
						return this.format;
					}

					public void setFormat(String format) {
						this.format = format;
					}
				}

				public static class Clip {

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

				public static class MuxConfig {

					private Webp webp;

					private Gif gif;

					private Segment segment;

					public Webp getWebp() {
						return this.webp;
					}

					public void setWebp(Webp webp) {
						this.webp = webp;
					}

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

					public static class Webp {

						private String loop;

						public String getLoop() {
							return this.loop;
						}

						public void setLoop(String loop) {
							this.loop = loop;
						}
					}

					public static class Gif {

						private String finalDelay;

						private String ditherMode;

						private String loop;

						private String isCustomPalette;

						public String getFinalDelay() {
							return this.finalDelay;
						}

						public void setFinalDelay(String finalDelay) {
							this.finalDelay = finalDelay;
						}

						public String getDitherMode() {
							return this.ditherMode;
						}

						public void setDitherMode(String ditherMode) {
							this.ditherMode = ditherMode;
						}

						public String getLoop() {
							return this.loop;
						}

						public void setLoop(String loop) {
							this.loop = loop;
						}

						public String getIsCustomPalette() {
							return this.isCustomPalette;
						}

						public void setIsCustomPalette(String isCustomPalette) {
							this.isCustomPalette = isCustomPalette;
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

				public static class SubtitleConfig {

					private List<ExtSubtitle> extSubtitleList;

					private List<Subtitle> subtitleList;

					public List<ExtSubtitle> getExtSubtitleList() {
						return this.extSubtitleList;
					}

					public void setExtSubtitleList(List<ExtSubtitle> extSubtitleList) {
						this.extSubtitleList = extSubtitleList;
					}

					public List<Subtitle> getSubtitleList() {
						return this.subtitleList;
					}

					public void setSubtitleList(List<Subtitle> subtitleList) {
						this.subtitleList = subtitleList;
					}

					public static class ExtSubtitle {

						private String charEnc;

						private String fontName;

						private Input2 input2;

						public String getCharEnc() {
							return this.charEnc;
						}

						public void setCharEnc(String charEnc) {
							this.charEnc = charEnc;
						}

						public String getFontName() {
							return this.fontName;
						}

						public void setFontName(String fontName) {
							this.fontName = fontName;
						}

						public Input2 getInput2() {
							return this.input2;
						}

						public void setInput2(Input2 input2) {
							this.input2 = input2;
						}

						public static class Input2 {

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

					public static class Subtitle {

						private String map;

						public String getMap() {
							return this.map;
						}

						public void setMap(String map) {
							this.map = map;
						}
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

							private String index;

							private String timebase;

							private String avgFPS;

							private String pixFmt;

							private String sar;

							private String lang;

							private String codecLongName;

							private String height;

							private String numFrames;

							private String bitrate;

							private String codecTagString;

							private String hasBFrames;

							private String profile;

							private String startTime;

							private String dar;

							private String codecName;

							private String width;

							private String duration;

							private String fps;

							private String codecTag;

							private String codecTimeBase;

							private String level;

							private NetworkCost networkCost;

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

							public String getSar() {
								return this.sar;
							}

							public void setSar(String sar) {
								this.sar = sar;
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

							public String getHeight() {
								return this.height;
							}

							public void setHeight(String height) {
								this.height = height;
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

							public String getWidth() {
								return this.width;
							}

							public void setWidth(String width) {
								this.width = width;
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

			public static class Input {

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
	}

	@Override
	public SubmitJobsResponse getInstance(UnmarshallerContext context) {
		return	SubmitJobsResponseUnmarshaller.unmarshall(this, context);
	}
}
