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
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamPushDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamPushDataResponse extends AcsResponse {

	private String requestId;

	private List<PushStreamModel> pushStreamModelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PushStreamModel> getPushStreamModelList() {
		return this.pushStreamModelList;
	}

	public void setPushStreamModelList(List<PushStreamModel> pushStreamModelList) {
		this.pushStreamModelList = pushStreamModelList;
	}

	public static class PushStreamModel {

		private String time;

		private String stream;

		private Float frameRate;

		private Float bitRate;

		private Float frameLossRate;

		private String serverAddr;

		private String clientAddr;

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

		public Float getFrameRate() {
			return this.frameRate;
		}

		public void setFrameRate(Float frameRate) {
			this.frameRate = frameRate;
		}

		public Float getBitRate() {
			return this.bitRate;
		}

		public void setBitRate(Float bitRate) {
			this.bitRate = bitRate;
		}

		public Float getFrameLossRate() {
			return this.frameLossRate;
		}

		public void setFrameLossRate(Float frameLossRate) {
			this.frameLossRate = frameLossRate;
		}

		public String getServerAddr() {
			return this.serverAddr;
		}

		public void setServerAddr(String serverAddr) {
			this.serverAddr = serverAddr;
		}

		public String getClientAddr() {
			return this.clientAddr;
		}

		public void setClientAddr(String clientAddr) {
			this.clientAddr = clientAddr;
		}
	}

	@Override
	public DescribeLiveStreamPushDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamPushDataResponseUnmarshaller.unmarshall(this, context);
	}
}
