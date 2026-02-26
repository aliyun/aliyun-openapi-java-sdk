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
import com.aliyuncs.live.transform.v20161101.DescribeLiveCenterTransferResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveCenterTransferResponse extends AcsResponse {

	private String requestId;

	private List<LiveCenterTransferInfo> liveCenterTransferInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveCenterTransferInfo> getLiveCenterTransferInfoList() {
		return this.liveCenterTransferInfoList;
	}

	public void setLiveCenterTransferInfoList(List<LiveCenterTransferInfo> liveCenterTransferInfoList) {
		this.liveCenterTransferInfoList = liveCenterTransferInfoList;
	}

	public static class LiveCenterTransferInfo {

		private String appName;

		private String domainName;

		private String dstUrl;

		private String endTime;

		private String startTime;

		private String streamName;

		private String transferArgs;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getDstUrl() {
			return this.dstUrl;
		}

		public void setDstUrl(String dstUrl) {
			this.dstUrl = dstUrl;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getTransferArgs() {
			return this.transferArgs;
		}

		public void setTransferArgs(String transferArgs) {
			this.transferArgs = transferArgs;
		}
	}

	@Override
	public DescribeLiveCenterTransferResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveCenterTransferResponseUnmarshaller.unmarshall(this, context);
	}
}
