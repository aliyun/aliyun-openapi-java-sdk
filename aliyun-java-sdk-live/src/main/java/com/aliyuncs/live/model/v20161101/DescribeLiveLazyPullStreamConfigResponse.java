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
import com.aliyuncs.live.transform.v20161101.DescribeLiveLazyPullStreamConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveLazyPullStreamConfigResponse extends AcsResponse {

	private String requestId;

	private List<LiveLazyPullConfig> liveLazyPullConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveLazyPullConfig> getLiveLazyPullConfigList() {
		return this.liveLazyPullConfigList;
	}

	public void setLiveLazyPullConfigList(List<LiveLazyPullConfig> liveLazyPullConfigList) {
		this.liveLazyPullConfigList = liveLazyPullConfigList;
	}

	public static class LiveLazyPullConfig {

		private String appName;

		private String pullArgs;

		private String pullAppName;

		private String pullProtocol;

		private String pullAuthKey;

		private String pullDomainName;

		private String domainName;

		private String pullAuthType;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getPullArgs() {
			return this.pullArgs;
		}

		public void setPullArgs(String pullArgs) {
			this.pullArgs = pullArgs;
		}

		public String getPullAppName() {
			return this.pullAppName;
		}

		public void setPullAppName(String pullAppName) {
			this.pullAppName = pullAppName;
		}

		public String getPullProtocol() {
			return this.pullProtocol;
		}

		public void setPullProtocol(String pullProtocol) {
			this.pullProtocol = pullProtocol;
		}

		public String getPullAuthKey() {
			return this.pullAuthKey;
		}

		public void setPullAuthKey(String pullAuthKey) {
			this.pullAuthKey = pullAuthKey;
		}

		public String getPullDomainName() {
			return this.pullDomainName;
		}

		public void setPullDomainName(String pullDomainName) {
			this.pullDomainName = pullDomainName;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getPullAuthType() {
			return this.pullAuthType;
		}

		public void setPullAuthType(String pullAuthType) {
			this.pullAuthType = pullAuthType;
		}
	}

	@Override
	public DescribeLiveLazyPullStreamConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveLazyPullStreamConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
