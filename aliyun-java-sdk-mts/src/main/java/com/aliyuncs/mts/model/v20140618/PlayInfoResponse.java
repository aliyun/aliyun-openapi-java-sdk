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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.PlayInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PlayInfoResponse extends AcsResponse {

	private String requestId;

	private List<PlayInfo> playInfoList;

	private List<String> notFoundCDNDomain;

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

	public List<String> getNotFoundCDNDomain() {
		return this.notFoundCDNDomain;
	}

	public void setNotFoundCDNDomain(List<String> notFoundCDNDomain) {
		this.notFoundCDNDomain = notFoundCDNDomain;
	}

	public static class PlayInfo {

		private String url;

		private String duration;

		private String size;

		private String width;

		private String height;

		private String bitrate;

		private String fps;

		private String format;

		private String definition;

		private String encryption;

		private String rand;

		private String plaintext;

		private String complexity;

		private String activityName;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
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

		public String getBitrate() {
			return this.bitrate;
		}

		public void setBitrate(String bitrate) {
			this.bitrate = bitrate;
		}

		public String getFps() {
			return this.fps;
		}

		public void setFps(String fps) {
			this.fps = fps;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
		}

		public String getEncryption() {
			return this.encryption;
		}

		public void setEncryption(String encryption) {
			this.encryption = encryption;
		}

		public String getRand() {
			return this.rand;
		}

		public void setRand(String rand) {
			this.rand = rand;
		}

		public String getPlaintext() {
			return this.plaintext;
		}

		public void setPlaintext(String plaintext) {
			this.plaintext = plaintext;
		}

		public String getComplexity() {
			return this.complexity;
		}

		public void setComplexity(String complexity) {
			this.complexity = complexity;
		}

		public String getActivityName() {
			return this.activityName;
		}

		public void setActivityName(String activityName) {
			this.activityName = activityName;
		}
	}

	@Override
	public PlayInfoResponse getInstance(UnmarshallerContext context) {
		return	PlayInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
