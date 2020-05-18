/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveAudioAuditConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveAudioAuditConfigResponse extends AcsResponse {

	private String requestId;

	private List<LiveAudioAuditConfig> liveAudioAuditConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveAudioAuditConfig> getLiveAudioAuditConfigList() {
		return this.liveAudioAuditConfigList;
	}

	public void setLiveAudioAuditConfigList(List<LiveAudioAuditConfig> liveAudioAuditConfigList) {
		this.liveAudioAuditConfigList = liveAudioAuditConfigList;
	}

	public static class LiveAudioAuditConfig {

		private String domainName;

		private String appName;

		private String streamName;

		private String bizType;

		private List<String> scenes;

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

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public List<String> getScenes() {
			return this.scenes;
		}

		public void setScenes(List<String> scenes) {
			this.scenes = scenes;
		}
	}

	@Override
	public DescribeLiveAudioAuditConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveAudioAuditConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
