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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamOptimizedFeatureConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamOptimizedFeatureConfigResponse extends AcsResponse {

	private String requestId;

	private List<LiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveStreamOptimizedFeatureConfig> getLiveStreamOptimizedFeatureConfigList() {
		return this.liveStreamOptimizedFeatureConfigList;
	}

	public void setLiveStreamOptimizedFeatureConfigList(List<LiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfigList) {
		this.liveStreamOptimizedFeatureConfigList = liveStreamOptimizedFeatureConfigList;
	}

	public static class LiveStreamOptimizedFeatureConfig {

		private String domainName;

		private String configName;

		private String configStatus;

		private String configValue;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getConfigName() {
			return this.configName;
		}

		public void setConfigName(String configName) {
			this.configName = configName;
		}

		public String getConfigStatus() {
			return this.configStatus;
		}

		public void setConfigStatus(String configStatus) {
			this.configStatus = configStatus;
		}

		public String getConfigValue() {
			return this.configValue;
		}

		public void setConfigValue(String configValue) {
			this.configValue = configValue;
		}
	}

	@Override
	public DescribeLiveStreamOptimizedFeatureConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamOptimizedFeatureConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
