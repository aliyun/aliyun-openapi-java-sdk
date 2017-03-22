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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamsFrameRateAndBitRateDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamsFrameRateAndBitRateDataResponse extends AcsResponse {

	private String requestId;

	private List<FrameRateAndBitRateInfo> frameRateAndBitRateInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FrameRateAndBitRateInfo> getFrameRateAndBitRateInfos() {
		return this.frameRateAndBitRateInfos;
	}

	public void setFrameRateAndBitRateInfos(List<FrameRateAndBitRateInfo> frameRateAndBitRateInfos) {
		this.frameRateAndBitRateInfos = frameRateAndBitRateInfos;
	}

	public static class FrameRateAndBitRateInfo {

		private String streamUrl;

		private Float videoFrameRate;

		private Float audioFrameRate;

		private Float bitRate;

		private String time;

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public Float getVideoFrameRate() {
			return this.videoFrameRate;
		}

		public void setVideoFrameRate(Float videoFrameRate) {
			this.videoFrameRate = videoFrameRate;
		}

		public Float getAudioFrameRate() {
			return this.audioFrameRate;
		}

		public void setAudioFrameRate(Float audioFrameRate) {
			this.audioFrameRate = audioFrameRate;
		}

		public Float getBitRate() {
			return this.bitRate;
		}

		public void setBitRate(Float bitRate) {
			this.bitRate = bitRate;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public DescribeLiveStreamsFrameRateAndBitRateDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamsFrameRateAndBitRateDataResponseUnmarshaller.unmarshall(this, context);
	}
}
