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
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamRelayPushBitRateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamRelayPushBitRateResponse extends AcsResponse {

	private String requestId;

	private List<RelayPushBitRateModel> relayPushBitRateModelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RelayPushBitRateModel> getRelayPushBitRateModelList() {
		return this.relayPushBitRateModelList;
	}

	public void setRelayPushBitRateModelList(List<RelayPushBitRateModel> relayPushBitRateModelList) {
		this.relayPushBitRateModelList = relayPushBitRateModelList;
	}

	public static class RelayPushBitRateModel {

		private String time;

		private String vedioFrame;

		private String vedioTimstamp;

		private String audioFrame;

		private String audioTimstamp;

		private String relayDomain;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getVedioFrame() {
			return this.vedioFrame;
		}

		public void setVedioFrame(String vedioFrame) {
			this.vedioFrame = vedioFrame;
		}

		public String getVedioTimstamp() {
			return this.vedioTimstamp;
		}

		public void setVedioTimstamp(String vedioTimstamp) {
			this.vedioTimstamp = vedioTimstamp;
		}

		public String getAudioFrame() {
			return this.audioFrame;
		}

		public void setAudioFrame(String audioFrame) {
			this.audioFrame = audioFrame;
		}

		public String getAudioTimstamp() {
			return this.audioTimstamp;
		}

		public void setAudioTimstamp(String audioTimstamp) {
			this.audioTimstamp = audioTimstamp;
		}

		public String getRelayDomain() {
			return this.relayDomain;
		}

		public void setRelayDomain(String relayDomain) {
			this.relayDomain = relayDomain;
		}
	}

	@Override
	public DescribeLiveStreamRelayPushBitRateResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamRelayPushBitRateResponseUnmarshaller.unmarshall(this, context);
	}
}
