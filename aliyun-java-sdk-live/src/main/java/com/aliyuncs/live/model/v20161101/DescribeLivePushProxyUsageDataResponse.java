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
import com.aliyuncs.live.transform.v20161101.DescribeLivePushProxyUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLivePushProxyUsageDataResponse extends AcsResponse {

	private String endTime;

	private String requestId;

	private String startTime;

	private List<PushProxyDataItem> pushProxyData;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<PushProxyDataItem> getPushProxyData() {
		return this.pushProxyData;
	}

	public void setPushProxyData(List<PushProxyDataItem> pushProxyData) {
		this.pushProxyData = pushProxyData;
	}

	public static class PushProxyDataItem {

		private String domainName;

		private String region;

		private Long streamCount;

		private String timeStamp;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Long getStreamCount() {
			return this.streamCount;
		}

		public void setStreamCount(Long streamCount) {
			this.streamCount = streamCount;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeLivePushProxyUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLivePushProxyUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
