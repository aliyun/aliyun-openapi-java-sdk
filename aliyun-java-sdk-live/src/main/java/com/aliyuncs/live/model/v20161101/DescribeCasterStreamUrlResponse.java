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
import com.aliyuncs.live.transform.v20161101.DescribeCasterStreamUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterStreamUrlResponse extends AcsResponse {

	private String requestId;

	private String casterId;

	private Integer total;

	private List<CasterStream> casterStreams;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<CasterStream> getCasterStreams() {
		return this.casterStreams;
	}

	public void setCasterStreams(List<CasterStream> casterStreams) {
		this.casterStreams = casterStreams;
	}

	public static class CasterStream {

		private String sceneId;

		private String streamUrl;

		private String rtmpUrl;

		private Integer outputType;

		private List<StreamInfo> streamInfos;

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public String getRtmpUrl() {
			return this.rtmpUrl;
		}

		public void setRtmpUrl(String rtmpUrl) {
			this.rtmpUrl = rtmpUrl;
		}

		public Integer getOutputType() {
			return this.outputType;
		}

		public void setOutputType(Integer outputType) {
			this.outputType = outputType;
		}

		public List<StreamInfo> getStreamInfos() {
			return this.streamInfos;
		}

		public void setStreamInfos(List<StreamInfo> streamInfos) {
			this.streamInfos = streamInfos;
		}

		public static class StreamInfo {

			private String transcodeConfig;

			private String videoFormat;

			private String outputStreamUrl;

			public String getTranscodeConfig() {
				return this.transcodeConfig;
			}

			public void setTranscodeConfig(String transcodeConfig) {
				this.transcodeConfig = transcodeConfig;
			}

			public String getVideoFormat() {
				return this.videoFormat;
			}

			public void setVideoFormat(String videoFormat) {
				this.videoFormat = videoFormat;
			}

			public String getOutputStreamUrl() {
				return this.outputStreamUrl;
			}

			public void setOutputStreamUrl(String outputStreamUrl) {
				this.outputStreamUrl = outputStreamUrl;
			}
		}
	}

	@Override
	public DescribeCasterStreamUrlResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterStreamUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
