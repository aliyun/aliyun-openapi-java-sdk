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
import com.aliyuncs.vod.transform.v20170321.GetMezzanineInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMezzanineInfoResponse extends AcsResponse {

	private String requestId;

	private Mezzanine mezzanine;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Mezzanine getMezzanine() {
		return this.mezzanine;
	}

	public void setMezzanine(Mezzanine mezzanine) {
		this.mezzanine = mezzanine;
	}

	public static class Mezzanine {

		private String videoId;

		private String bitrate;

		private String creationTime;

		private String duration;

		private String fps;

		private Long height;

		private Long width;

		private Long size;

		private String status;

		private String fileURL;

		private String fileName;

		private String cRC64;

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(String bitrate) {
			this.bitrate = bitrate;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getFps() {
			return this.fps;
		}

		public void setFps(String fps) {
			this.fps = fps;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFileURL() {
			return this.fileURL;
		}

		public void setFileURL(String fileURL) {
			this.fileURL = fileURL;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getCRC64() {
			return this.cRC64;
		}

		public void setCRC64(String cRC64) {
			this.cRC64 = cRC64;
		}
	}

	@Override
	public GetMezzanineInfoResponse getInstance(UnmarshallerContext context) {
		return	GetMezzanineInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
