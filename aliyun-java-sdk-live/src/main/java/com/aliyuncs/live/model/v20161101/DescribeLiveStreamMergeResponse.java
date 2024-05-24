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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamMergeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamMergeResponse extends AcsResponse {

	private String requestId;

	private List<LiveStreamMerge> liveStreamMergeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveStreamMerge> getLiveStreamMergeList() {
		return this.liveStreamMergeList;
	}

	public void setLiveStreamMergeList(List<LiveStreamMerge> liveStreamMergeList) {
		this.liveStreamMergeList = liveStreamMergeList;
	}

	public static class LiveStreamMerge {

		private String appName;

		private String appUsing;

		private String domainName;

		private String endTime;

		private String extraInAppStreams;

		private String inAppName1;

		private String inAppName2;

		private String inStreamName1;

		private String inStreamName2;

		private String protocol;

		private String startTime;

		private String streamName;

		private String streamUsing;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppUsing() {
			return this.appUsing;
		}

		public void setAppUsing(String appUsing) {
			this.appUsing = appUsing;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getExtraInAppStreams() {
			return this.extraInAppStreams;
		}

		public void setExtraInAppStreams(String extraInAppStreams) {
			this.extraInAppStreams = extraInAppStreams;
		}

		public String getInAppName1() {
			return this.inAppName1;
		}

		public void setInAppName1(String inAppName1) {
			this.inAppName1 = inAppName1;
		}

		public String getInAppName2() {
			return this.inAppName2;
		}

		public void setInAppName2(String inAppName2) {
			this.inAppName2 = inAppName2;
		}

		public String getInStreamName1() {
			return this.inStreamName1;
		}

		public void setInStreamName1(String inStreamName1) {
			this.inStreamName1 = inStreamName1;
		}

		public String getInStreamName2() {
			return this.inStreamName2;
		}

		public void setInStreamName2(String inStreamName2) {
			this.inStreamName2 = inStreamName2;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
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

		public String getStreamUsing() {
			return this.streamUsing;
		}

		public void setStreamUsing(String streamUsing) {
			this.streamUsing = streamUsing;
		}
	}

	@Override
	public DescribeLiveStreamMergeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamMergeResponseUnmarshaller.unmarshall(this, context);
	}
}
