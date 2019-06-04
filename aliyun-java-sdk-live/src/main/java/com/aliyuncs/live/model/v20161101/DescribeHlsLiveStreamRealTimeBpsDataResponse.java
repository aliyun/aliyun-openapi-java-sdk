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
import com.aliyuncs.live.transform.v20161101.DescribeHlsLiveStreamRealTimeBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHlsLiveStreamRealTimeBpsDataResponse extends AcsResponse {

	private String time;

	private String requestId;

	private List<UsageDataPerDomain> usageData;

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UsageDataPerDomain> getUsageData() {
		return this.usageData;
	}

	public void setUsageData(List<UsageDataPerDomain> usageData) {
		this.usageData = usageData;
	}

	public static class UsageDataPerDomain {

		private String domainName;

		private List<StreamInfo> streamInfos;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public List<StreamInfo> getStreamInfos() {
			return this.streamInfos;
		}

		public void setStreamInfos(List<StreamInfo> streamInfos) {
			this.streamInfos = streamInfos;
		}

		public static class StreamInfo {

			private String streamName;

			private List<Info> infos;

			public String getStreamName() {
				return this.streamName;
			}

			public void setStreamName(String streamName) {
				this.streamName = streamName;
			}

			public List<Info> getInfos() {
				return this.infos;
			}

			public void setInfos(List<Info> infos) {
				this.infos = infos;
			}

			public static class Info {

				private Float downFlow;

				private String rate;

				private Float online;

				public Float getDownFlow() {
					return this.downFlow;
				}

				public void setDownFlow(Float downFlow) {
					this.downFlow = downFlow;
				}

				public String getRate() {
					return this.rate;
				}

				public void setRate(String rate) {
					this.rate = rate;
				}

				public Float getOnline() {
					return this.online;
				}

				public void setOnline(Float online) {
					this.online = online;
				}
			}
		}
	}

	@Override
	public DescribeHlsLiveStreamRealTimeBpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeHlsLiveStreamRealTimeBpsDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
