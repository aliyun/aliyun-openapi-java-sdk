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
import com.aliyuncs.live.transform.v20161101.StartCasterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartCasterResponse extends AcsResponse {

	private String requestId;

	private List<SceneInfo> pgmSceneInfos;

	private List<SceneInfo1> pvwSceneInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SceneInfo> getPgmSceneInfos() {
		return this.pgmSceneInfos;
	}

	public void setPgmSceneInfos(List<SceneInfo> pgmSceneInfos) {
		this.pgmSceneInfos = pgmSceneInfos;
	}

	public List<SceneInfo1> getPvwSceneInfos() {
		return this.pvwSceneInfos;
	}

	public void setPvwSceneInfos(List<SceneInfo1> pvwSceneInfos) {
		this.pvwSceneInfos = pvwSceneInfos;
	}

	public static class SceneInfo {

		private String rtsUrl;

		private String sceneId;

		private String streamUrl;

		private List<StreamInfo> streamInfos;

		public String getRtsUrl() {
			return this.rtsUrl;
		}

		public void setRtsUrl(String rtsUrl) {
			this.rtsUrl = rtsUrl;
		}

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

		public List<StreamInfo> getStreamInfos() {
			return this.streamInfos;
		}

		public void setStreamInfos(List<StreamInfo> streamInfos) {
			this.streamInfos = streamInfos;
		}

		public static class StreamInfo {

			private String outputStreamUrl;

			private String transcodeConfig;

			private String videoFormat;

			public String getOutputStreamUrl() {
				return this.outputStreamUrl;
			}

			public void setOutputStreamUrl(String outputStreamUrl) {
				this.outputStreamUrl = outputStreamUrl;
			}

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
		}
	}

	public static class SceneInfo1 {

		private String rtsUrl;

		private String sceneId;

		private String streamUrl;

		public String getRtsUrl() {
			return this.rtsUrl;
		}

		public void setRtsUrl(String rtsUrl) {
			this.rtsUrl = rtsUrl;
		}

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
	}

	@Override
	public StartCasterResponse getInstance(UnmarshallerContext context) {
		return	StartCasterResponseUnmarshaller.unmarshall(this, context);
	}
}
