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
import com.aliyuncs.live.transform.v20161101.StartMixStreamsServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartMixStreamsServiceResponse extends AcsResponse {

	private String requestId;

	private List<MixStreamsInfo> mixStreamsInfoList;

	public String getrequestId() {
		return this.requestId;
	}

	public void setrequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MixStreamsInfo> getMixStreamsInfoList() {
		return this.mixStreamsInfoList;
	}

	public void setMixStreamsInfoList(List<MixStreamsInfo> mixStreamsInfoList) {
		this.mixStreamsInfoList = mixStreamsInfoList;
	}

	public static class MixStreamsInfo {

		private String domainName;

		private String appName;

		private String streamName;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}
	}

	@Override
	public StartMixStreamsServiceResponse getInstance(UnmarshallerContext context) {
		return	StartMixStreamsServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
