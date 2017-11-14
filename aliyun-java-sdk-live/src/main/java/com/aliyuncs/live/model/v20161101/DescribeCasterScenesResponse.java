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
package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeCasterScenesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasterScenesResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<Scene> sceneList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Scene> getSceneList() {
		return this.sceneList;
	}

	public void setSceneList(List<Scene> sceneList) {
		this.sceneList = sceneList;
	}

	public static class Scene {

		private String sceneId;

		private String sceneName;

		private String outputType;

		private String layoutId;

		private String streamUrl;

		private Integer status;

		private List<StreamInfo> streamInfos;

		private List<String> componentIds;

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getOutputType() {
			return this.outputType;
		}

		public void setOutputType(String outputType) {
			this.outputType = outputType;
		}

		public String getLayoutId() {
			return this.layoutId;
		}

		public void setLayoutId(String layoutId) {
			this.layoutId = layoutId;
		}

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<StreamInfo> getStreamInfos() {
			return this.streamInfos;
		}

		public void setStreamInfos(List<StreamInfo> streamInfos) {
			this.streamInfos = streamInfos;
		}

		public List<String> getComponentIds() {
			return this.componentIds;
		}

		public void setComponentIds(List<String> componentIds) {
			this.componentIds = componentIds;
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
	public DescribeCasterScenesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasterScenesResponseUnmarshaller.unmarshall(this, context);
	}
}
