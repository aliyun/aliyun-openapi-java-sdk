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
package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetVideoPlayAuthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVideoPlayAuthResponse extends AcsResponse {

	private String requestId;

	private String playAuth;

	private VideoMeta videoMeta;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPlayAuth() {
		return this.playAuth;
	}

	public void setPlayAuth(String playAuth) {
		this.playAuth = playAuth;
	}

	public VideoMeta getVideoMeta() {
		return this.videoMeta;
	}

	public void setVideoMeta(VideoMeta videoMeta) {
		this.videoMeta = videoMeta;
	}

	public static class VideoMeta {

		private String coverURL;

		private Float duration;

		private String status;

		private String title;

		private String videoId;

		public String getCoverURL() {
			return this.coverURL;
		}

		public void setCoverURL(String coverURL) {
			this.coverURL = coverURL;
		}

		public Float getDuration() {
			return this.duration;
		}

		public void setDuration(Float duration) {
			this.duration = duration;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}
	}

	@Override
	public GetVideoPlayAuthResponse getInstance(UnmarshallerContext context) {
		return	GetVideoPlayAuthResponseUnmarshaller.unmarshall(this, context);
	}
}
