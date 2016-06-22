/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.UpdateTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateTemplateResponse extends AcsResponse {

	private String requestId;

	private Template template;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Template getTemplate() {
		return this.template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public static class Template {

		private String id;

		private String name;

		private String state;

		private Container container;

		private Video video;

		private Audio audio;

		private TransConfig transConfig;

		private MuxConfig muxConfig;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Container getContainer() {
			return this.container;
		}

		public void setContainer(Container container) {
			this.container = container;
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

		public static class Container {

			private String format;

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
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

			private String remove;

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

			public String getRemove() {
				return this.remove;
			}

			public void setRemove(String remove) {
				this.remove = remove;
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

		public static class Audio {

			private String codec;

			private String profile;

			private String samplerate;

			private String bitrate;

			private String channels;

			private String qscale;

			private String remove;

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

			public String getRemove() {
				return this.remove;
			}

			public void setRemove(String remove) {
				this.remove = remove;
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
			}
		}
	}

	@Override
	public UpdateTemplateResponse getInstance(UnmarshallerContext context) {
		return	UpdateTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
