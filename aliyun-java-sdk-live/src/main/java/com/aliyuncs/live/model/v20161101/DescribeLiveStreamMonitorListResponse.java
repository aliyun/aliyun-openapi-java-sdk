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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamMonitorListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamMonitorListResponse extends AcsResponse {

	private Integer total;

	private String requestId;

	private List<LiveStreamMonitorInfo> liveStreamMonitorList;

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveStreamMonitorInfo> getLiveStreamMonitorList() {
		return this.liveStreamMonitorList;
	}

	public void setLiveStreamMonitorList(List<LiveStreamMonitorInfo> liveStreamMonitorList) {
		this.liveStreamMonitorList = liveStreamMonitorList;
	}

	public static class LiveStreamMonitorInfo {

		private Integer status;

		private String startTime;

		private String monitorId;

		private String domain;

		private String outputTemplate;

		private String region;

		private Integer audioFrom;

		private String monitorName;

		private String stopTime;

		private List<InputConfig> inputList;

		private OutputUrls outputUrls;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getMonitorId() {
			return this.monitorId;
		}

		public void setMonitorId(String monitorId) {
			this.monitorId = monitorId;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getOutputTemplate() {
			return this.outputTemplate;
		}

		public void setOutputTemplate(String outputTemplate) {
			this.outputTemplate = outputTemplate;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Integer getAudioFrom() {
			return this.audioFrom;
		}

		public void setAudioFrom(Integer audioFrom) {
			this.audioFrom = audioFrom;
		}

		public String getMonitorName() {
			return this.monitorName;
		}

		public void setMonitorName(String monitorName) {
			this.monitorName = monitorName;
		}

		public String getStopTime() {
			return this.stopTime;
		}

		public void setStopTime(String stopTime) {
			this.stopTime = stopTime;
		}

		public List<InputConfig> getInputList() {
			return this.inputList;
		}

		public void setInputList(List<InputConfig> inputList) {
			this.inputList = inputList;
		}

		public OutputUrls getOutputUrls() {
			return this.outputUrls;
		}

		public void setOutputUrls(OutputUrls outputUrls) {
			this.outputUrls = outputUrls;
		}

		public static class InputConfig {

			private Integer index;

			private String inputUrl;

			private Integer layoutId;

			private String streamName;

			private LayoutConfig layoutConfig;

			private PlayConfig playConfig;

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getInputUrl() {
				return this.inputUrl;
			}

			public void setInputUrl(String inputUrl) {
				this.inputUrl = inputUrl;
			}

			public Integer getLayoutId() {
				return this.layoutId;
			}

			public void setLayoutId(Integer layoutId) {
				this.layoutId = layoutId;
			}

			public String getStreamName() {
				return this.streamName;
			}

			public void setStreamName(String streamName) {
				this.streamName = streamName;
			}

			public LayoutConfig getLayoutConfig() {
				return this.layoutConfig;
			}

			public void setLayoutConfig(LayoutConfig layoutConfig) {
				this.layoutConfig = layoutConfig;
			}

			public PlayConfig getPlayConfig() {
				return this.playConfig;
			}

			public void setPlayConfig(PlayConfig playConfig) {
				this.playConfig = playConfig;
			}

			public static class LayoutConfig {

				private String fillMode;

				private String positionRefer;

				private List<Float> positionNormalized;

				private List<Float> sizeNormalized;

				public String getFillMode() {
					return this.fillMode;
				}

				public void setFillMode(String fillMode) {
					this.fillMode = fillMode;
				}

				public String getPositionRefer() {
					return this.positionRefer;
				}

				public void setPositionRefer(String positionRefer) {
					this.positionRefer = positionRefer;
				}

				public List<Float> getPositionNormalized() {
					return this.positionNormalized;
				}

				public void setPositionNormalized(List<Float> positionNormalized) {
					this.positionNormalized = positionNormalized;
				}

				public List<Float> getSizeNormalized() {
					return this.sizeNormalized;
				}

				public void setSizeNormalized(List<Float> sizeNormalized) {
					this.sizeNormalized = sizeNormalized;
				}
			}

			public static class PlayConfig {

				private Float volumeRate;

				public Float getVolumeRate() {
					return this.volumeRate;
				}

				public void setVolumeRate(Float volumeRate) {
					this.volumeRate = volumeRate;
				}
			}
		}

		public static class OutputUrls {

			private String flvUrl;

			private String rtmpUrl;

			public String getFlvUrl() {
				return this.flvUrl;
			}

			public void setFlvUrl(String flvUrl) {
				this.flvUrl = flvUrl;
			}

			public String getRtmpUrl() {
				return this.rtmpUrl;
			}

			public void setRtmpUrl(String rtmpUrl) {
				this.rtmpUrl = rtmpUrl;
			}
		}
	}

	@Override
	public DescribeLiveStreamMonitorListResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamMonitorListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
