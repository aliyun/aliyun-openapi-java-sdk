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
import com.aliyuncs.mts.transform.v20140618.SearchTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchTemplateResponse extends AcsResponse {

	private Long totalCount;

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private List<Template> templateList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Template> getTemplateList() {
		return this.templateList;
	}

	public void setTemplateList(List<Template> templateList) {
		this.templateList = templateList;
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

			private String longShortMode;

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

			private String remove;

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

			public String getLongShortMode() {
				return this.longShortMode;
			}

			public void setLongShortMode(String longShortMode) {
				this.longShortMode = longShortMode;
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

			public String getRemove() {
				return this.remove;
			}

			public void setRemove(String remove) {
				this.remove = remove;
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

		public static class Audio {

			private String profile;

			private String remove;

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

			public String getRemove() {
				return this.remove;
			}

			public void setRemove(String remove) {
				this.remove = remove;
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

	@Override
	public SearchTemplateResponse getInstance(UnmarshallerContext context) {
		return	SearchTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
