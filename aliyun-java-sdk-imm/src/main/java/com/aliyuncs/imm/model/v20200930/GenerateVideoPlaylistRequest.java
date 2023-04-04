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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateVideoPlaylistRequest extends RpcAcsRequest<GenerateVideoPlaylistResponse> {
	   

	private Float sourceDuration;

	@SerializedName("targets")
	private List<Targets> targets;

	private String masterURI;

	private String projectName;

	@SerializedName("credentialConfig")
	private CredentialConfig credentialConfig;

	@SerializedName("tags")
	private Map<String,String> tags;

	private Float sourceStartTime;

	private String sourceURI;

	@SerializedName("sourceSubtitles")
	private List<SourceSubtitles> sourceSubtitles;
	public GenerateVideoPlaylistRequest() {
		super("imm", "2020-09-30", "GenerateVideoPlaylist", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getSourceDuration() {
		return this.sourceDuration;
	}

	public void setSourceDuration(Float sourceDuration) {
		this.sourceDuration = sourceDuration;
		if(sourceDuration != null){
			putQueryParameter("SourceDuration", sourceDuration.toString());
		}
	}

	public List<Targets> getTargets() {
		return this.targets;
	}

	public void setTargets(List<Targets> targets) {
		this.targets = targets;	
		if (targets != null) {
			putQueryParameter("Targets" , new Gson().toJson(targets));
		}	
	}

	public String getMasterURI() {
		return this.masterURI;
	}

	public void setMasterURI(String masterURI) {
		this.masterURI = masterURI;
		if(masterURI != null){
			putQueryParameter("MasterURI", masterURI);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public CredentialConfig getCredentialConfig() {
		return this.credentialConfig;
	}

	public void setCredentialConfig(CredentialConfig credentialConfig) {
		this.credentialConfig = credentialConfig;	
		if (credentialConfig != null) {
			putQueryParameter("CredentialConfig" , new Gson().toJson(credentialConfig));
		}	
	}

	public Map<String,String> getTags() {
		return this.tags;
	}

	public void setTags(Map<String,String> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public Float getSourceStartTime() {
		return this.sourceStartTime;
	}

	public void setSourceStartTime(Float sourceStartTime) {
		this.sourceStartTime = sourceStartTime;
		if(sourceStartTime != null){
			putQueryParameter("SourceStartTime", sourceStartTime.toString());
		}
	}

	public String getSourceURI() {
		return this.sourceURI;
	}

	public void setSourceURI(String sourceURI) {
		this.sourceURI = sourceURI;
		if(sourceURI != null){
			putQueryParameter("SourceURI", sourceURI);
		}
	}

	public List<SourceSubtitles> getSourceSubtitles() {
		return this.sourceSubtitles;
	}

	public void setSourceSubtitles(List<SourceSubtitles> sourceSubtitles) {
		this.sourceSubtitles = sourceSubtitles;	
		if (sourceSubtitles != null) {
			putQueryParameter("SourceSubtitles" , new Gson().toJson(sourceSubtitles));
		}	
	}

	public static class Targets {

		@SerializedName("Duration")
		private Float duration;

		@SerializedName("InitialSegments")
		private List<Float> initialSegments;

		@SerializedName("Subtitle")
		private Subtitle subtitle;

		@SerializedName("TranscodeAhead")
		private Integer transcodeAhead;

		@SerializedName("Video")
		private Video video;

		@SerializedName("Audio")
		private Audio audio;

		@SerializedName("URI")
		private String uRI;

		@SerializedName("Speed")
		private Float speed;

		@SerializedName("InitialTranscode")
		private Float initialTranscode;

		public Float getDuration() {
			return this.duration;
		}

		public void setDuration(Float duration) {
			this.duration = duration;
		}

		public List<Float> getInitialSegments() {
			return this.initialSegments;
		}

		public void setInitialSegments(List<Float> initialSegments) {
			this.initialSegments = initialSegments;
		}

		public Subtitle getSubtitle() {
			return this.subtitle;
		}

		public void setSubtitle(Subtitle subtitle) {
			this.subtitle = subtitle;
		}

		public Integer getTranscodeAhead() {
			return this.transcodeAhead;
		}

		public void setTranscodeAhead(Integer transcodeAhead) {
			this.transcodeAhead = transcodeAhead;
		}

		public Video getVideo() {
			return this.video;
		}

		public void setVideo(Video video) {
			this.video = video;
		}

		public Audio getAudio() {
			return this.audio;
		}

		public void setAudio(Audio audio) {
			this.audio = audio;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}

		public Float getSpeed() {
			return this.speed;
		}

		public void setSpeed(Float speed) {
			this.speed = speed;
		}

		public Float getInitialTranscode() {
			return this.initialTranscode;
		}

		public void setInitialTranscode(Float initialTranscode) {
			this.initialTranscode = initialTranscode;
		}

		public static class Subtitle {

			@SerializedName("DisableSubtitle")
			private Boolean disableSubtitle;

			@SerializedName("Stream")
			private List<Integer> stream;

			@SerializedName("ExtractSubtitle")
			private ExtractSubtitle extractSubtitle;

			public Boolean getDisableSubtitle() {
				return this.disableSubtitle;
			}

			public void setDisableSubtitle(Boolean disableSubtitle) {
				this.disableSubtitle = disableSubtitle;
			}

			public List<Integer> getStream() {
				return this.stream;
			}

			public void setStream(List<Integer> stream) {
				this.stream = stream;
			}

			public ExtractSubtitle getExtractSubtitle() {
				return this.extractSubtitle;
			}

			public void setExtractSubtitle(ExtractSubtitle extractSubtitle) {
				this.extractSubtitle = extractSubtitle;
			}

			public static class ExtractSubtitle {

				@SerializedName("Format")
				private String format;

				@SerializedName("URI")
				private String uRI;

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public String getURI() {
					return this.uRI;
				}

				public void setURI(String uRI) {
					this.uRI = uRI;
				}
			}
		}

		public static class Video {

			@SerializedName("FilterVideo")
			private FilterVideo filterVideo;

			@SerializedName("Stream")
			private List<Integer> stream;

			@SerializedName("DisableVideo")
			private Boolean disableVideo;

			@SerializedName("TranscodeVideo")
			private TranscodeVideo transcodeVideo;

			public FilterVideo getFilterVideo() {
				return this.filterVideo;
			}

			public void setFilterVideo(FilterVideo filterVideo) {
				this.filterVideo = filterVideo;
			}

			public List<Integer> getStream() {
				return this.stream;
			}

			public void setStream(List<Integer> stream) {
				this.stream = stream;
			}

			public Boolean getDisableVideo() {
				return this.disableVideo;
			}

			public void setDisableVideo(Boolean disableVideo) {
				this.disableVideo = disableVideo;
			}

			public TranscodeVideo getTranscodeVideo() {
				return this.transcodeVideo;
			}

			public void setTranscodeVideo(TranscodeVideo transcodeVideo) {
				this.transcodeVideo = transcodeVideo;
			}

			public static class FilterVideo {

				@SerializedName("Delogos")
				private List<DelogosItem> delogos;

				@SerializedName("Watermarks")
				private List<WatermarksItem> watermarks;

				public List<DelogosItem> getDelogos() {
					return this.delogos;
				}

				public void setDelogos(List<DelogosItem> delogos) {
					this.delogos = delogos;
				}

				public List<WatermarksItem> getWatermarks() {
					return this.watermarks;
				}

				public void setWatermarks(List<WatermarksItem> watermarks) {
					this.watermarks = watermarks;
				}

				public static class DelogosItem {

					@SerializedName("Duration")
					private Double duration;

					@SerializedName("Dx")
					private Float dx;

					@SerializedName("Dy")
					private Float dy;

					@SerializedName("Width")
					private Float width;

					@SerializedName("ReferPos")
					private String referPos;

					@SerializedName("StartTime")
					private Double startTime;

					@SerializedName("Height")
					private Float height;

					public Double getDuration() {
						return this.duration;
					}

					public void setDuration(Double duration) {
						this.duration = duration;
					}

					public Float getDx() {
						return this.dx;
					}

					public void setDx(Float dx) {
						this.dx = dx;
					}

					public Float getDy() {
						return this.dy;
					}

					public void setDy(Float dy) {
						this.dy = dy;
					}

					public Float getWidth() {
						return this.width;
					}

					public void setWidth(Float width) {
						this.width = width;
					}

					public String getReferPos() {
						return this.referPos;
					}

					public void setReferPos(String referPos) {
						this.referPos = referPos;
					}

					public Double getStartTime() {
						return this.startTime;
					}

					public void setStartTime(Double startTime) {
						this.startTime = startTime;
					}

					public Float getHeight() {
						return this.height;
					}

					public void setHeight(Float height) {
						this.height = height;
					}
				}

				public static class WatermarksItem {

					@SerializedName("FontApha")
					private Float fontApha;

					@SerializedName("FontSize")
					private Integer fontSize;

					@SerializedName("StartTime")
					private Double startTime;

					@SerializedName("Type")
					private String type;

					@SerializedName("FontName")
					private String fontName;

					@SerializedName("URI")
					private String uRI;

					@SerializedName("Content")
					private String content;

					@SerializedName("BorderColor")
					private String borderColor;

					@SerializedName("Duration")
					private Double duration;

					@SerializedName("Dx")
					private Float dx;

					@SerializedName("Dy")
					private Float dy;

					@SerializedName("BorderWidth")
					private Integer borderWidth;

					@SerializedName("Width")
					private Float width;

					@SerializedName("FontColor")
					private String fontColor;

					@SerializedName("ReferPos")
					private String referPos;

					@SerializedName("Height")
					private Float height;

					public Float getFontApha() {
						return this.fontApha;
					}

					public void setFontApha(Float fontApha) {
						this.fontApha = fontApha;
					}

					public Integer getFontSize() {
						return this.fontSize;
					}

					public void setFontSize(Integer fontSize) {
						this.fontSize = fontSize;
					}

					public Double getStartTime() {
						return this.startTime;
					}

					public void setStartTime(Double startTime) {
						this.startTime = startTime;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getFontName() {
						return this.fontName;
					}

					public void setFontName(String fontName) {
						this.fontName = fontName;
					}

					public String getURI() {
						return this.uRI;
					}

					public void setURI(String uRI) {
						this.uRI = uRI;
					}

					public String getContent() {
						return this.content;
					}

					public void setContent(String content) {
						this.content = content;
					}

					public String getBorderColor() {
						return this.borderColor;
					}

					public void setBorderColor(String borderColor) {
						this.borderColor = borderColor;
					}

					public Double getDuration() {
						return this.duration;
					}

					public void setDuration(Double duration) {
						this.duration = duration;
					}

					public Float getDx() {
						return this.dx;
					}

					public void setDx(Float dx) {
						this.dx = dx;
					}

					public Float getDy() {
						return this.dy;
					}

					public void setDy(Float dy) {
						this.dy = dy;
					}

					public Integer getBorderWidth() {
						return this.borderWidth;
					}

					public void setBorderWidth(Integer borderWidth) {
						this.borderWidth = borderWidth;
					}

					public Float getWidth() {
						return this.width;
					}

					public void setWidth(Float width) {
						this.width = width;
					}

					public String getFontColor() {
						return this.fontColor;
					}

					public void setFontColor(String fontColor) {
						this.fontColor = fontColor;
					}

					public String getReferPos() {
						return this.referPos;
					}

					public void setReferPos(String referPos) {
						this.referPos = referPos;
					}

					public Float getHeight() {
						return this.height;
					}

					public void setHeight(Float height) {
						this.height = height;
					}
				}
			}

			public static class TranscodeVideo {

				@SerializedName("ResolutionOption")
				private String resolutionOption;

				@SerializedName("GOPSize")
				private Integer gOPSize;

				@SerializedName("PixelFormat")
				private String pixelFormat;

				@SerializedName("FrameRate")
				private Float frameRate;

				@SerializedName("Rotation")
				private Integer rotation;

				@SerializedName("Bitrate")
				private Integer bitrate;

				@SerializedName("BufferSize")
				private Integer bufferSize;

				@SerializedName("Resolution")
				private String resolution;

				@SerializedName("BFrames")
				private Integer bFrames;

				@SerializedName("MaxBitrate")
				private Integer maxBitrate;

				@SerializedName("Codec")
				private String codec;

				@SerializedName("BitrateOption")
				private String bitrateOption;

				@SerializedName("Refs")
				private Integer refs;

				@SerializedName("CRF")
				private Float cRF;

				@SerializedName("ScaleType")
				private String scaleType;

				@SerializedName("FrameRateOption")
				private String frameRateOption;

				@SerializedName("AdaptiveResolutionDirection")
				private Boolean adaptiveResolutionDirection;

				public String getResolutionOption() {
					return this.resolutionOption;
				}

				public void setResolutionOption(String resolutionOption) {
					this.resolutionOption = resolutionOption;
				}

				public Integer getGOPSize() {
					return this.gOPSize;
				}

				public void setGOPSize(Integer gOPSize) {
					this.gOPSize = gOPSize;
				}

				public String getPixelFormat() {
					return this.pixelFormat;
				}

				public void setPixelFormat(String pixelFormat) {
					this.pixelFormat = pixelFormat;
				}

				public Float getFrameRate() {
					return this.frameRate;
				}

				public void setFrameRate(Float frameRate) {
					this.frameRate = frameRate;
				}

				public Integer getRotation() {
					return this.rotation;
				}

				public void setRotation(Integer rotation) {
					this.rotation = rotation;
				}

				public Integer getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(Integer bitrate) {
					this.bitrate = bitrate;
				}

				public Integer getBufferSize() {
					return this.bufferSize;
				}

				public void setBufferSize(Integer bufferSize) {
					this.bufferSize = bufferSize;
				}

				public String getResolution() {
					return this.resolution;
				}

				public void setResolution(String resolution) {
					this.resolution = resolution;
				}

				public Integer getBFrames() {
					return this.bFrames;
				}

				public void setBFrames(Integer bFrames) {
					this.bFrames = bFrames;
				}

				public Integer getMaxBitrate() {
					return this.maxBitrate;
				}

				public void setMaxBitrate(Integer maxBitrate) {
					this.maxBitrate = maxBitrate;
				}

				public String getCodec() {
					return this.codec;
				}

				public void setCodec(String codec) {
					this.codec = codec;
				}

				public String getBitrateOption() {
					return this.bitrateOption;
				}

				public void setBitrateOption(String bitrateOption) {
					this.bitrateOption = bitrateOption;
				}

				public Integer getRefs() {
					return this.refs;
				}

				public void setRefs(Integer refs) {
					this.refs = refs;
				}

				public Float getCRF() {
					return this.cRF;
				}

				public void setCRF(Float cRF) {
					this.cRF = cRF;
				}

				public String getScaleType() {
					return this.scaleType;
				}

				public void setScaleType(String scaleType) {
					this.scaleType = scaleType;
				}

				public String getFrameRateOption() {
					return this.frameRateOption;
				}

				public void setFrameRateOption(String frameRateOption) {
					this.frameRateOption = frameRateOption;
				}

				public Boolean getAdaptiveResolutionDirection() {
					return this.adaptiveResolutionDirection;
				}

				public void setAdaptiveResolutionDirection(Boolean adaptiveResolutionDirection) {
					this.adaptiveResolutionDirection = adaptiveResolutionDirection;
				}
			}
		}

		public static class Audio {

			@SerializedName("Stream")
			private List<Long> stream;

			@SerializedName("DisableAudio")
			private Boolean disableAudio;

			@SerializedName("TranscodeAudio")
			private TranscodeAudio transcodeAudio;

			@SerializedName("FilterAudio")
			private FilterAudio filterAudio;

			public List<Long> getStream() {
				return this.stream;
			}

			public void setStream(List<Long> stream) {
				this.stream = stream;
			}

			public Boolean getDisableAudio() {
				return this.disableAudio;
			}

			public void setDisableAudio(Boolean disableAudio) {
				this.disableAudio = disableAudio;
			}

			public TranscodeAudio getTranscodeAudio() {
				return this.transcodeAudio;
			}

			public void setTranscodeAudio(TranscodeAudio transcodeAudio) {
				this.transcodeAudio = transcodeAudio;
			}

			public FilterAudio getFilterAudio() {
				return this.filterAudio;
			}

			public void setFilterAudio(FilterAudio filterAudio) {
				this.filterAudio = filterAudio;
			}

			public static class TranscodeAudio {

				@SerializedName("Codec")
				private String codec;

				@SerializedName("BitrateOption")
				private String bitrateOption;

				@SerializedName("Channel")
				private Integer channel;

				@SerializedName("Bitrate")
				private Integer bitrate;

				@SerializedName("SampleRateOption")
				private String sampleRateOption;

				@SerializedName("Quality")
				private Integer quality;

				@SerializedName("SampleRate")
				private Integer sampleRate;

				public String getCodec() {
					return this.codec;
				}

				public void setCodec(String codec) {
					this.codec = codec;
				}

				public String getBitrateOption() {
					return this.bitrateOption;
				}

				public void setBitrateOption(String bitrateOption) {
					this.bitrateOption = bitrateOption;
				}

				public Integer getChannel() {
					return this.channel;
				}

				public void setChannel(Integer channel) {
					this.channel = channel;
				}

				public Integer getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(Integer bitrate) {
					this.bitrate = bitrate;
				}

				public String getSampleRateOption() {
					return this.sampleRateOption;
				}

				public void setSampleRateOption(String sampleRateOption) {
					this.sampleRateOption = sampleRateOption;
				}

				public Integer getQuality() {
					return this.quality;
				}

				public void setQuality(Integer quality) {
					this.quality = quality;
				}

				public Integer getSampleRate() {
					return this.sampleRate;
				}

				public void setSampleRate(Integer sampleRate) {
					this.sampleRate = sampleRate;
				}
			}

			public static class FilterAudio {

				@SerializedName("Mixing")
				private Boolean mixing;

				public Boolean getMixing() {
					return this.mixing;
				}

				public void setMixing(Boolean mixing) {
					this.mixing = mixing;
				}
			}
		}
	}

	public static class CredentialConfig {

		@SerializedName("Chain")
		private List<ChainItem> chain;

		@SerializedName("ServiceRole")
		private String serviceRole;

		@SerializedName("Policy")
		private String policy;

		public List<ChainItem> getChain() {
			return this.chain;
		}

		public void setChain(List<ChainItem> chain) {
			this.chain = chain;
		}

		public String getServiceRole() {
			return this.serviceRole;
		}

		public void setServiceRole(String serviceRole) {
			this.serviceRole = serviceRole;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public static class ChainItem {

			@SerializedName("Role")
			private String role;

			@SerializedName("RoleType")
			private String roleType;

			@SerializedName("AssumeRoleFor")
			private String assumeRoleFor;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getRoleType() {
				return this.roleType;
			}

			public void setRoleType(String roleType) {
				this.roleType = roleType;
			}

			public String getAssumeRoleFor() {
				return this.assumeRoleFor;
			}

			public void setAssumeRoleFor(String assumeRoleFor) {
				this.assumeRoleFor = assumeRoleFor;
			}
		}
	}

	public static class SourceSubtitles {

		@SerializedName("Language")
		private String language;

		@SerializedName("URI")
		private String uRI;

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}
	}

	@Override
	public Class<GenerateVideoPlaylistResponse> getResponseClass() {
		return GenerateVideoPlaylistResponse.class;
	}

}
