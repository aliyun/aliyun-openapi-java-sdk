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
public class CreateMediaConvertTaskRequest extends RpcAcsRequest<CreateMediaConvertTaskResponse> {
	   

	@SerializedName("sources")
	private List<Sources> sources;

	@SerializedName("targets")
	private List<Targets> targets;

	private String userData;

	@SerializedName("notification")
	private Notification notification;

	private String projectName;

	@SerializedName("credentialConfig")
	private CredentialConfig credentialConfig;

	@SerializedName("tags")
	private Map<String,String> tags;
	public CreateMediaConvertTaskRequest() {
		super("imm", "2020-09-30", "CreateMediaConvertTask", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Sources> getSources() {
		return this.sources;
	}

	public void setSources(List<Sources> sources) {
		this.sources = sources;	
		if (sources != null) {
			putQueryParameter("Sources" , new Gson().toJson(sources));
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

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;	
		if (notification != null) {
			putQueryParameter("Notification" , new Gson().toJson(notification));
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

	public static class Sources {

		@SerializedName("Duration")
		private Double duration;

		@SerializedName("Subtitles")
		private List<SubtitlesItem> subtitles;

		@SerializedName("StartTime")
		private Double startTime;

		@SerializedName("URI")
		private String uRI;

		public Double getDuration() {
			return this.duration;
		}

		public void setDuration(Double duration) {
			this.duration = duration;
		}

		public List<SubtitlesItem> getSubtitles() {
			return this.subtitles;
		}

		public void setSubtitles(List<SubtitlesItem> subtitles) {
			this.subtitles = subtitles;
		}

		public Double getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Double startTime) {
			this.startTime = startTime;
		}

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}

		public static class SubtitlesItem {

			@SerializedName("TimeOffset")
			private Double timeOffset;

			@SerializedName("Language")
			private String language;

			@SerializedName("URI")
			private String uRI;

			public Double getTimeOffset() {
				return this.timeOffset;
			}

			public void setTimeOffset(Double timeOffset) {
				this.timeOffset = timeOffset;
			}

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
	}

	public static class Targets {

		@SerializedName("Container")
		private String container;

		@SerializedName("Image")
		private Image image;

		@SerializedName("Encryption")
		private Encryption encryption;

		@SerializedName("Segment")
		private Segment segment;

		@SerializedName("Subtitle")
		private Subtitle subtitle;

		@SerializedName("StripMetadata")
		private Boolean stripMetadata;

		@SerializedName("Preset")
		private Preset preset;

		@SerializedName("Video")
		private Video video;

		@SerializedName("Audio")
		private Audio audio;

		@SerializedName("URI")
		private String uRI;

		@SerializedName("Speed")
		private Float speed;

		@SerializedName("PTSOffset")
		private Double pTSOffset;

		public String getContainer() {
			return this.container;
		}

		public void setContainer(String container) {
			this.container = container;
		}

		public Image getImage() {
			return this.image;
		}

		public void setImage(Image image) {
			this.image = image;
		}

		public Encryption getEncryption() {
			return this.encryption;
		}

		public void setEncryption(Encryption encryption) {
			this.encryption = encryption;
		}

		public Segment getSegment() {
			return this.segment;
		}

		public void setSegment(Segment segment) {
			this.segment = segment;
		}

		public Subtitle getSubtitle() {
			return this.subtitle;
		}

		public void setSubtitle(Subtitle subtitle) {
			this.subtitle = subtitle;
		}

		public Boolean getStripMetadata() {
			return this.stripMetadata;
		}

		public void setStripMetadata(Boolean stripMetadata) {
			this.stripMetadata = stripMetadata;
		}

		public Preset getPreset() {
			return this.preset;
		}

		public void setPreset(Preset preset) {
			this.preset = preset;
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

		public Double getPTSOffset() {
			return this.pTSOffset;
		}

		public void setPTSOffset(Double pTSOffset) {
			this.pTSOffset = pTSOffset;
		}

		public static class Image {

			@SerializedName("Snapshots")
			private List<SnapshotsItem> snapshots;

			@SerializedName("Animations")
			private List<AnimationsItem> animations;

			@SerializedName("Sprites")
			private List<SpritesItem> sprites;

			public List<SnapshotsItem> getSnapshots() {
				return this.snapshots;
			}

			public void setSnapshots(List<SnapshotsItem> snapshots) {
				this.snapshots = snapshots;
			}

			public List<AnimationsItem> getAnimations() {
				return this.animations;
			}

			public void setAnimations(List<AnimationsItem> animations) {
				this.animations = animations;
			}

			public List<SpritesItem> getSprites() {
				return this.sprites;
			}

			public void setSprites(List<SpritesItem> sprites) {
				this.sprites = sprites;
			}

			public static class SnapshotsItem {

				@SerializedName("Number")
				private Integer number;

				@SerializedName("Format")
				private String format;

				@SerializedName("Width")
				private Integer width;

				@SerializedName("Interval")
				private Double interval;

				@SerializedName("StartTime")
				private Double startTime;

				@SerializedName("ScaleType")
				private String scaleType;

				@SerializedName("URI")
				private String uRI;

				@SerializedName("Height")
				private Integer height;

				public Integer getNumber() {
					return this.number;
				}

				public void setNumber(Integer number) {
					this.number = number;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public Double getInterval() {
					return this.interval;
				}

				public void setInterval(Double interval) {
					this.interval = interval;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public String getScaleType() {
					return this.scaleType;
				}

				public void setScaleType(String scaleType) {
					this.scaleType = scaleType;
				}

				public String getURI() {
					return this.uRI;
				}

				public void setURI(String uRI) {
					this.uRI = uRI;
				}

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}
			}

			public static class AnimationsItem {

				@SerializedName("Number")
				private Integer number;

				@SerializedName("FrameRate")
				private Double frameRate;

				@SerializedName("Format")
				private String format;

				@SerializedName("Width")
				private Integer width;

				@SerializedName("Interval")
				private Double interval;

				@SerializedName("StartTime")
				private Double startTime;

				@SerializedName("ScaleType")
				private String scaleType;

				@SerializedName("URI")
				private String uRI;

				@SerializedName("Height")
				private Integer height;

				public Integer getNumber() {
					return this.number;
				}

				public void setNumber(Integer number) {
					this.number = number;
				}

				public Double getFrameRate() {
					return this.frameRate;
				}

				public void setFrameRate(Double frameRate) {
					this.frameRate = frameRate;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public Double getInterval() {
					return this.interval;
				}

				public void setInterval(Double interval) {
					this.interval = interval;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public String getScaleType() {
					return this.scaleType;
				}

				public void setScaleType(String scaleType) {
					this.scaleType = scaleType;
				}

				public String getURI() {
					return this.uRI;
				}

				public void setURI(String uRI) {
					this.uRI = uRI;
				}

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}
			}

			public static class SpritesItem {

				@SerializedName("TileHeight")
				private Integer tileHeight;

				@SerializedName("Number")
				private Integer number;

				@SerializedName("Pad")
				private Integer pad;

				@SerializedName("Margin")
				private Integer margin;

				@SerializedName("ScaleWidth")
				private Float scaleWidth;

				@SerializedName("Format")
				private String format;

				@SerializedName("Interval")
				private Double interval;

				@SerializedName("StartTime")
				private Double startTime;

				@SerializedName("ScaleType")
				private String scaleType;

				@SerializedName("ScaleHeight")
				private Float scaleHeight;

				@SerializedName("URI")
				private String uRI;

				@SerializedName("TileWidth")
				private Integer tileWidth;

				public Integer getTileHeight() {
					return this.tileHeight;
				}

				public void setTileHeight(Integer tileHeight) {
					this.tileHeight = tileHeight;
				}

				public Integer getNumber() {
					return this.number;
				}

				public void setNumber(Integer number) {
					this.number = number;
				}

				public Integer getPad() {
					return this.pad;
				}

				public void setPad(Integer pad) {
					this.pad = pad;
				}

				public Integer getMargin() {
					return this.margin;
				}

				public void setMargin(Integer margin) {
					this.margin = margin;
				}

				public Float getScaleWidth() {
					return this.scaleWidth;
				}

				public void setScaleWidth(Float scaleWidth) {
					this.scaleWidth = scaleWidth;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public Double getInterval() {
					return this.interval;
				}

				public void setInterval(Double interval) {
					this.interval = interval;
				}

				public Double getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Double startTime) {
					this.startTime = startTime;
				}

				public String getScaleType() {
					return this.scaleType;
				}

				public void setScaleType(String scaleType) {
					this.scaleType = scaleType;
				}

				public Float getScaleHeight() {
					return this.scaleHeight;
				}

				public void setScaleHeight(Float scaleHeight) {
					this.scaleHeight = scaleHeight;
				}

				public String getURI() {
					return this.uRI;
				}

				public void setURI(String uRI) {
					this.uRI = uRI;
				}

				public Integer getTileWidth() {
					return this.tileWidth;
				}

				public void setTileWidth(Integer tileWidth) {
					this.tileWidth = tileWidth;
				}
			}
		}

		public static class Encryption {

			@SerializedName("ProtectionSystem")
			private String protectionSystem;

			public String getProtectionSystem() {
				return this.protectionSystem;
			}

			public void setProtectionSystem(String protectionSystem) {
				this.protectionSystem = protectionSystem;
			}
		}

		public static class Segment {

			@SerializedName("Duration")
			private Double duration;

			@SerializedName("Format")
			private String format;

			@SerializedName("StartNumber")
			private Integer startNumber;

			public Double getDuration() {
				return this.duration;
			}

			public void setDuration(Double duration) {
				this.duration = duration;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public Integer getStartNumber() {
				return this.startNumber;
			}

			public void setStartNumber(Integer startNumber) {
				this.startNumber = startNumber;
			}
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

		public static class Preset {

			@SerializedName("Name")
			private String name;

			@SerializedName("Type")
			private String type;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
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

	public static class Notification {

		@SerializedName("MNS")
		private MNS mNS;

		@SerializedName("RocketMQ")
		private RocketMQ rocketMQ;

		public MNS getMNS() {
			return this.mNS;
		}

		public void setMNS(MNS mNS) {
			this.mNS = mNS;
		}

		public RocketMQ getRocketMQ() {
			return this.rocketMQ;
		}

		public void setRocketMQ(RocketMQ rocketMQ) {
			this.rocketMQ = rocketMQ;
		}

		public static class MNS {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}

		public static class RocketMQ {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
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

	@Override
	public Class<CreateMediaConvertTaskResponse> getResponseClass() {
		return CreateMediaConvertTaskResponse.class;
	}

}
