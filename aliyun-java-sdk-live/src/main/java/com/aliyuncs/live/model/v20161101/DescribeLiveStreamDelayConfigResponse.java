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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamDelayConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamDelayConfigResponse extends AcsResponse {

	private String requestId;

	private LiveStreamHlsDelayConfig liveStreamHlsDelayConfig;

	private LiveStreamFlvDelayConfig liveStreamFlvDelayConfig;

	private LiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LiveStreamHlsDelayConfig getLiveStreamHlsDelayConfig() {
		return this.liveStreamHlsDelayConfig;
	}

	public void setLiveStreamHlsDelayConfig(LiveStreamHlsDelayConfig liveStreamHlsDelayConfig) {
		this.liveStreamHlsDelayConfig = liveStreamHlsDelayConfig;
	}

	public LiveStreamFlvDelayConfig getLiveStreamFlvDelayConfig() {
		return this.liveStreamFlvDelayConfig;
	}

	public void setLiveStreamFlvDelayConfig(LiveStreamFlvDelayConfig liveStreamFlvDelayConfig) {
		this.liveStreamFlvDelayConfig = liveStreamFlvDelayConfig;
	}

	public LiveStreamRtmpDelayConfig getLiveStreamRtmpDelayConfig() {
		return this.liveStreamRtmpDelayConfig;
	}

	public void setLiveStreamRtmpDelayConfig(LiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig) {
		this.liveStreamRtmpDelayConfig = liveStreamRtmpDelayConfig;
	}

	public static class LiveStreamHlsDelayConfig {

		private String level;

		private Integer delay;

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Integer getDelay() {
			return this.delay;
		}

		public void setDelay(Integer delay) {
			this.delay = delay;
		}
	}

	public static class LiveStreamFlvDelayConfig {

		private String level;

		private Integer delay;

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Integer getDelay() {
			return this.delay;
		}

		public void setDelay(Integer delay) {
			this.delay = delay;
		}
	}

	public static class LiveStreamRtmpDelayConfig {

		private String level;

		private Integer delay;

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Integer getDelay() {
			return this.delay;
		}

		public void setDelay(Integer delay) {
			this.delay = delay;
		}
	}

	@Override
	public DescribeLiveStreamDelayConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamDelayConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
