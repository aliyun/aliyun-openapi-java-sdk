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
import com.aliyuncs.live.transform.v20161101.DescribeLiveAudioAuditNotifyConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveAudioAuditNotifyConfigResponse extends AcsResponse {

	private String requestId;

	private List<LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveAudioAuditNotifyConfig> getLiveAudioAuditNotifyConfigList() {
		return this.liveAudioAuditNotifyConfigList;
	}

	public void setLiveAudioAuditNotifyConfigList(List<LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfigList) {
		this.liveAudioAuditNotifyConfigList = liveAudioAuditNotifyConfigList;
	}

	public static class LiveAudioAuditNotifyConfig {

		private String domainName;

		private String callback;

		private String callbackTemplate;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getCallback() {
			return this.callback;
		}

		public void setCallback(String callback) {
			this.callback = callback;
		}

		public String getCallbackTemplate() {
			return this.callbackTemplate;
		}

		public void setCallbackTemplate(String callbackTemplate) {
			this.callbackTemplate = callbackTemplate;
		}
	}

	@Override
	public DescribeLiveAudioAuditNotifyConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveAudioAuditNotifyConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
