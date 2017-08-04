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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamFrameInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamFrameInfoResponse extends AcsResponse {

	private String requestId;

	private List<FrameDataModel> frameDataInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FrameDataModel> getFrameDataInfos() {
		return this.frameDataInfos;
	}

	public void setFrameDataInfos(List<FrameDataModel> frameDataInfos) {
		this.frameDataInfos = frameDataInfos;
	}

	public static class FrameDataModel {

		private String time;

		private String stream;

		private String clientAddr;

		private String server;

		private Float audioRate;

		private Float audioByte;

		private Float frameRate;

		private Float frameByte;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getStream() {
			return this.stream;
		}

		public void setStream(String stream) {
			this.stream = stream;
		}

		public String getClientAddr() {
			return this.clientAddr;
		}

		public void setClientAddr(String clientAddr) {
			this.clientAddr = clientAddr;
		}

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public Float getAudioRate() {
			return this.audioRate;
		}

		public void setAudioRate(Float audioRate) {
			this.audioRate = audioRate;
		}

		public Float getAudioByte() {
			return this.audioByte;
		}

		public void setAudioByte(Float audioByte) {
			this.audioByte = audioByte;
		}

		public Float getFrameRate() {
			return this.frameRate;
		}

		public void setFrameRate(Float frameRate) {
			this.frameRate = frameRate;
		}

		public Float getFrameByte() {
			return this.frameByte;
		}

		public void setFrameByte(Float frameByte) {
			this.frameByte = frameByte;
		}
	}

	@Override
	public DescribeLiveStreamFrameInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamFrameInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
