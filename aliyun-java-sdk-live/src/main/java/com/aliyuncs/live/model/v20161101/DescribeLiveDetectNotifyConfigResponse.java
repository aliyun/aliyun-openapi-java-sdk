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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDetectNotifyConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDetectNotifyConfigResponse extends AcsResponse {

	private String requestId;

	private LiveDetectNotifyConfig liveDetectNotifyConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LiveDetectNotifyConfig getLiveDetectNotifyConfig() {
		return this.liveDetectNotifyConfig;
	}

	public void setLiveDetectNotifyConfig(LiveDetectNotifyConfig liveDetectNotifyConfig) {
		this.liveDetectNotifyConfig = liveDetectNotifyConfig;
	}

	public static class LiveDetectNotifyConfig {

		private String domainName;

		private String notifyUrl;

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
	}

	@Override
	public DescribeLiveDetectNotifyConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDetectNotifyConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
