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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamTranscodeInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamTranscodeInfoResponse extends AcsResponse {

	private String requestId;

	private List<DomainTranscodeInfo> domainTranscodeList;

	public String getrequestId() {
		return this.requestId;
	}

	public void setrequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainTranscodeInfo> getDomainTranscodeList() {
		return this.domainTranscodeList;
	}

	public void setDomainTranscodeList(List<DomainTranscodeInfo> domainTranscodeList) {
		this.domainTranscodeList = domainTranscodeList;
	}

	public static class DomainTranscodeInfo {

		private String transcodeApp;

		private String transcodeName;

		private String transcodeTemplate;

		public String getTranscodeApp() {
			return this.transcodeApp;
		}

		public void setTranscodeApp(String transcodeApp) {
			this.transcodeApp = transcodeApp;
		}

		public String getTranscodeName() {
			return this.transcodeName;
		}

		public void setTranscodeName(String transcodeName) {
			this.transcodeName = transcodeName;
		}

		public String getTranscodeTemplate() {
			return this.transcodeTemplate;
		}

		public void setTranscodeTemplate(String transcodeTemplate) {
			this.transcodeTemplate = transcodeTemplate;
		}
	}

	@Override
	public DescribeLiveStreamTranscodeInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamTranscodeInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
