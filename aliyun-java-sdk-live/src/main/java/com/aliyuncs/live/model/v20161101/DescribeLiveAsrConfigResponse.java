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
import com.aliyuncs.live.transform.v20161101.DescribeLiveAsrConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveAsrConfigResponse extends AcsResponse {

	private String requestId;

	private List<LiveAsrConfigList> liveAsrConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveAsrConfigList> getLiveAsrConfig() {
		return this.liveAsrConfig;
	}

	public void setLiveAsrConfig(List<LiveAsrConfigList> liveAsrConfig) {
		this.liveAsrConfig = liveAsrConfig;
	}

	public static class LiveAsrConfigList {

		private Integer domainName;

		private String appName;

		private String streamName;

		private Integer period;

		private String mnsTopic;

		private String mnsRegion;

		private String httpCallbackURL;

		public Integer getDomainName() {
			return this.domainName;
		}

		public void setDomainName(Integer domainName) {
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

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getMnsTopic() {
			return this.mnsTopic;
		}

		public void setMnsTopic(String mnsTopic) {
			this.mnsTopic = mnsTopic;
		}

		public String getMnsRegion() {
			return this.mnsRegion;
		}

		public void setMnsRegion(String mnsRegion) {
			this.mnsRegion = mnsRegion;
		}

		public String getHttpCallbackURL() {
			return this.httpCallbackURL;
		}

		public void setHttpCallbackURL(String httpCallbackURL) {
			this.httpCallbackURL = httpCallbackURL;
		}
	}

	@Override
	public DescribeLiveAsrConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveAsrConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
