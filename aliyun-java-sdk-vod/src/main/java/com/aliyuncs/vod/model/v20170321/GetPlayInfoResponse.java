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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetPlayInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPlayInfoResponse extends AcsResponse {

	private String requestId;

	private List<PlayInfo> playInfoList;

	private VideoBase videoBase;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PlayInfo> getPlayInfoList() {
		return this.playInfoList;
	}

	public void setPlayInfoList(List<PlayInfo> playInfoList) {
		this.playInfoList = playInfoList;
	}

	public VideoBase getVideoBase() {
		return this.videoBase;
	}

	public void setVideoBase(VideoBase videoBase) {
		this.videoBase = videoBase;
	}

	public static class PlayInfo {

		private Long width;

		private Long height;

		private Long size;

		private String playURL;

		private String bitrate;

		private String definition;

		private String duration;

		private String format;

		private String fps;

		private Long encrypt;

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getPlayURL() {
			return this.playURL;
		}

		public void setPlayURL(String playURL) {
			this.playURL = playURL;
		}

		public String getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(String bitrate) {
			this.bitrate = bitrate;
		}

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getFps() {
			return this.fps;
		}

		public void setFps(String fps) {
			this.fps = fps;
		}

		public Long getEncrypt() {
			return this.encrypt;
		}

		public void setEncrypt(Long encrypt) {
			this.encrypt = encrypt;
		}
	}

	public static class VideoBase {

		private String coverURL;

		private String duration;

		private String status;

		private String title;

		private String videoId;

		private String mediaType;

		private String creationTime;

		public String getCoverURL() {
			return this.coverURL;
		}

		public void setCoverURL(String coverURL) {
			this.coverURL = coverURL;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
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

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public GetPlayInfoResponse getInstance(UnmarshallerContext context) {
		return	GetPlayInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
