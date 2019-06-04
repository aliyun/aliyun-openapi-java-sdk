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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveRecordNotifyConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveRecordNotifyConfigResponse extends AcsResponse {

	private String requestId;

	private LiveRecordNotifyConfig liveRecordNotifyConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LiveRecordNotifyConfig getLiveRecordNotifyConfig() {
		return this.liveRecordNotifyConfig;
	}

	public void setLiveRecordNotifyConfig(LiveRecordNotifyConfig liveRecordNotifyConfig) {
		this.liveRecordNotifyConfig = liveRecordNotifyConfig;
	}

	public static class LiveRecordNotifyConfig {

		private String domainName;

		private String notifyUrl;

		private String onDemandUrl;

		private Boolean needStatusNotify;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getNotifyUrl() {
			return this.notifyUrl;
		}

		public void setNotifyUrl(String notifyUrl) {
			this.notifyUrl = notifyUrl;
		}

		public String getOnDemandUrl() {
			return this.onDemandUrl;
		}

		public void setOnDemandUrl(String onDemandUrl) {
			this.onDemandUrl = onDemandUrl;
		}

		public Boolean getNeedStatusNotify() {
			return this.needStatusNotify;
		}

		public void setNeedStatusNotify(Boolean needStatusNotify) {
			this.needStatusNotify = needStatusNotify;
		}
	}

	@Override
	public DescribeLiveRecordNotifyConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveRecordNotifyConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
