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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListRtcMPUTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRtcMPUTaskDetailResponse extends AcsResponse {

	private String requestId;

	private List<MpuTask> mPUTasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MpuTask> getMPUTasks() {
		return this.mPUTasks;
	}

	public void setMPUTasks(List<MpuTask> mPUTasks) {
		this.mPUTasks = mPUTasks;
	}

	public static class MpuTask {

		private String appId;

		private String channelId;

		private String taskId;

		private String mixMode;

		private String streamURL;

		private String region;

		private String maxIdleTime;

		private List<MultiStreamURLItem> multiStreamURL;

		private SingleSubParams singleSubParams;

		private TranscodeParams transcodeParams;

		private SeiParams seiParams;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getMixMode() {
			return this.mixMode;
		}

		public void setMixMode(String mixMode) {
			this.mixMode = mixMode;
		}

		public String getStreamURL() {
			return this.streamURL;
		}

		public void setStreamURL(String streamURL) {
			this.streamURL = streamURL;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getMaxIdleTime() {
			return this.maxIdleTime;
		}

		public void setMaxIdleTime(String maxIdleTime) {
			this.maxIdleTime = maxIdleTime;
		}

		public List<MultiStreamURLItem> getMultiStreamURL() {
			return this.multiStreamURL;
		}

		public void setMultiStreamURL(List<MultiStreamURLItem> multiStreamURL) {
			this.multiStreamURL = multiStreamURL;
		}

		public SingleSubParams getSingleSubParams() {
			return this.singleSubParams;
		}

		public void setSingleSubParams(SingleSubParams singleSubParams) {
			this.singleSubParams = singleSubParams;
		}

		public TranscodeParams getTranscodeParams() {
			return this.transcodeParams;
		}

		public void setTranscodeParams(TranscodeParams transcodeParams) {
			this.transcodeParams = transcodeParams;
		}

		public SeiParams getSeiParams() {
			return this.seiParams;
		}

		public void setSeiParams(SeiParams seiParams) {
			this.seiParams = seiParams;
		}

		public static class MultiStreamURLItem {

			private String uRL;

			private Boolean isAliCdn;

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}

			public Boolean getIsAliCdn() {
				return this.isAliCdn;
			}

			public void setIsAliCdn(Boolean isAliCdn) {
				this.isAliCdn = isAliCdn;
			}
		}

		public static class SingleSubParams {

			private String sourceType;

			private String streamType;

			private String userId;

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getStreamType() {
				return this.streamType;
			}

			public void setStreamType(String streamType) {
				this.streamType = streamType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}

		public static class TranscodeParams {

			private List<UserInfo> userInfos;

			private Background background;

			private EncodeParams encodeParams;

			private Layout layout;

			public List<UserInfo> getUserInfos() {
				return this.userInfos;
			}

			public void setUserInfos(List<UserInfo> userInfos) {
				this.userInfos = userInfos;
			}

			public Background getBackground() {
				return this.background;
			}

			public void setBackground(Background background) {
				this.background = background;
			}

			public EncodeParams getEncodeParams() {
				return this.encodeParams;
			}

			public void setEncodeParams(EncodeParams encodeParams) {
				this.encodeParams = encodeParams;
			}

			public Layout getLayout() {
				return this.layout;
			}

			public void setLayout(Layout layout) {
				this.layout = layout;
			}

			public static class UserInfo {

				private String channelId;

				private String userId;

				private String sourceType;

				private String streamType;

				public String getChannelId() {
					return this.channelId;
				}

				public void setChannelId(String channelId) {
					this.channelId = channelId;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getSourceType() {
					return this.sourceType;
				}

				public void setSourceType(String sourceType) {
					this.sourceType = sourceType;
				}

				public String getStreamType() {
					return this.streamType;
				}

				public void setStreamType(String streamType) {
					this.streamType = streamType;
				}
			}

			public static class Background {

				private String renderMode;

				private String uRL;

				public String getRenderMode() {
					return this.renderMode;
				}

				public void setRenderMode(String renderMode) {
					this.renderMode = renderMode;
				}

				public String getURL() {
					return this.uRL;
				}

				public void setURL(String uRL) {
					this.uRL = uRL;
				}
			}

			public static class EncodeParams {

				private String audioOnly;

				private String audioBitrate;

				private String audioChannels;

				private String audioSampleRate;

				private String videoCodec;

				private String videoBitrate;

				private String videoFramerate;

				private String videoGop;

				private String videoHeight;

				private String videoWidth;

				private String enhancedParam;

				public String getAudioOnly() {
					return this.audioOnly;
				}

				public void setAudioOnly(String audioOnly) {
					this.audioOnly = audioOnly;
				}

				public String getAudioBitrate() {
					return this.audioBitrate;
				}

				public void setAudioBitrate(String audioBitrate) {
					this.audioBitrate = audioBitrate;
				}

				public String getAudioChannels() {
					return this.audioChannels;
				}

				public void setAudioChannels(String audioChannels) {
					this.audioChannels = audioChannels;
				}

				public String getAudioSampleRate() {
					return this.audioSampleRate;
				}

				public void setAudioSampleRate(String audioSampleRate) {
					this.audioSampleRate = audioSampleRate;
				}

				public String getVideoCodec() {
					return this.videoCodec;
				}

				public void setVideoCodec(String videoCodec) {
					this.videoCodec = videoCodec;
				}

				public String getVideoBitrate() {
					return this.videoBitrate;
				}

				public void setVideoBitrate(String videoBitrate) {
					this.videoBitrate = videoBitrate;
				}

				public String getVideoFramerate() {
					return this.videoFramerate;
				}

				public void setVideoFramerate(String videoFramerate) {
					this.videoFramerate = videoFramerate;
				}

				public String getVideoGop() {
					return this.videoGop;
				}

				public void setVideoGop(String videoGop) {
					this.videoGop = videoGop;
				}

				public String getVideoHeight() {
					return this.videoHeight;
				}

				public void setVideoHeight(String videoHeight) {
					this.videoHeight = videoHeight;
				}

				public String getVideoWidth() {
					return this.videoWidth;
				}

				public void setVideoWidth(String videoWidth) {
					this.videoWidth = videoWidth;
				}

				public String getEnhancedParam() {
					return this.enhancedParam;
				}

				public void setEnhancedParam(String enhancedParam) {
					this.enhancedParam = enhancedParam;
				}
			}

			public static class Layout {

				private String layoutMode;

				private List<UserPane> userPanes;

				private MaxVideoUser maxVideoUser;

				public String getLayoutMode() {
					return this.layoutMode;
				}

				public void setLayoutMode(String layoutMode) {
					this.layoutMode = layoutMode;
				}

				public List<UserPane> getUserPanes() {
					return this.userPanes;
				}

				public void setUserPanes(List<UserPane> userPanes) {
					this.userPanes = userPanes;
				}

				public MaxVideoUser getMaxVideoUser() {
					return this.maxVideoUser;
				}

				public void setMaxVideoUser(MaxVideoUser maxVideoUser) {
					this.maxVideoUser = maxVideoUser;
				}

				public static class UserPane {

					private String height;

					private String width;

					private String x;

					private String y;

					private String zOrder;

					private String backgroundImageUrl;

					private String renderMode;

					private UserInfo1 userInfo1;

					public String getHeight() {
						return this.height;
					}

					public void setHeight(String height) {
						this.height = height;
					}

					public String getWidth() {
						return this.width;
					}

					public void setWidth(String width) {
						this.width = width;
					}

					public String getX() {
						return this.x;
					}

					public void setX(String x) {
						this.x = x;
					}

					public String getY() {
						return this.y;
					}

					public void setY(String y) {
						this.y = y;
					}

					public String getZOrder() {
						return this.zOrder;
					}

					public void setZOrder(String zOrder) {
						this.zOrder = zOrder;
					}

					public String getBackgroundImageUrl() {
						return this.backgroundImageUrl;
					}

					public void setBackgroundImageUrl(String backgroundImageUrl) {
						this.backgroundImageUrl = backgroundImageUrl;
					}

					public String getRenderMode() {
						return this.renderMode;
					}

					public void setRenderMode(String renderMode) {
						this.renderMode = renderMode;
					}

					public UserInfo1 getUserInfo1() {
						return this.userInfo1;
					}

					public void setUserInfo1(UserInfo1 userInfo1) {
						this.userInfo1 = userInfo1;
					}

					public static class UserInfo1 {

						private String sourceType;

						private String channelId;

						private String userId;

						public String getSourceType() {
							return this.sourceType;
						}

						public void setSourceType(String sourceType) {
							this.sourceType = sourceType;
						}

						public String getChannelId() {
							return this.channelId;
						}

						public void setChannelId(String channelId) {
							this.channelId = channelId;
						}

						public String getUserId() {
							return this.userId;
						}

						public void setUserId(String userId) {
							this.userId = userId;
						}
					}
				}

				public static class MaxVideoUser {

					private String sourceType;

					private String streamType;

					private String channelId;

					private String userId;

					public String getSourceType() {
						return this.sourceType;
					}

					public void setSourceType(String sourceType) {
						this.sourceType = sourceType;
					}

					public String getStreamType() {
						return this.streamType;
					}

					public void setStreamType(String streamType) {
						this.streamType = streamType;
					}

					public String getChannelId() {
						return this.channelId;
					}

					public void setChannelId(String channelId) {
						this.channelId = channelId;
					}

					public String getUserId() {
						return this.userId;
					}

					public void setUserId(String userId) {
						this.userId = userId;
					}
				}
			}
		}

		public static class SeiParams {

			private String payloadType;

			private LayoutVolume layoutVolume;

			private PassThrough passThrough;

			public String getPayloadType() {
				return this.payloadType;
			}

			public void setPayloadType(String payloadType) {
				this.payloadType = payloadType;
			}

			public LayoutVolume getLayoutVolume() {
				return this.layoutVolume;
			}

			public void setLayoutVolume(LayoutVolume layoutVolume) {
				this.layoutVolume = layoutVolume;
			}

			public PassThrough getPassThrough() {
				return this.passThrough;
			}

			public void setPassThrough(PassThrough passThrough) {
				this.passThrough = passThrough;
			}

			public static class LayoutVolume {

				private String followIdr;

				private String interval;

				public String getFollowIdr() {
					return this.followIdr;
				}

				public void setFollowIdr(String followIdr) {
					this.followIdr = followIdr;
				}

				public String getInterval() {
					return this.interval;
				}

				public void setInterval(String interval) {
					this.interval = interval;
				}
			}

			public static class PassThrough {

				private String followIdr;

				private String interval;

				private String payloadContent;

				private String payloadContentKey;

				public String getFollowIdr() {
					return this.followIdr;
				}

				public void setFollowIdr(String followIdr) {
					this.followIdr = followIdr;
				}

				public String getInterval() {
					return this.interval;
				}

				public void setInterval(String interval) {
					this.interval = interval;
				}

				public String getPayloadContent() {
					return this.payloadContent;
				}

				public void setPayloadContent(String payloadContent) {
					this.payloadContent = payloadContent;
				}

				public String getPayloadContentKey() {
					return this.payloadContentKey;
				}

				public void setPayloadContentKey(String payloadContentKey) {
					this.payloadContentKey = payloadContentKey;
				}
			}
		}
	}

	@Override
	public ListRtcMPUTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	ListRtcMPUTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
