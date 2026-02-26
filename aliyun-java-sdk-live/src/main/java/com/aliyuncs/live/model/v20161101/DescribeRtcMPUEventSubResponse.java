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
import com.aliyuncs.live.transform.v20161101.DescribeRtcMPUEventSubResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcMPUEventSubResponse extends AcsResponse {

	private String requestId;

	private SubInfo subInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SubInfo getSubInfo() {
		return this.subInfo;
	}

	public void setSubInfo(SubInfo subInfo) {
		this.subInfo = subInfo;
	}

	public static class SubInfo {

		private String subId;

		private String appId;

		private String channelIds;

		private String createTime;

		private String callbackUrl;

		public String getSubId() {
			return this.subId;
		}

		public void setSubId(String subId) {
			this.subId = subId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getChannelIds() {
			return this.channelIds;
		}

		public void setChannelIds(String channelIds) {
			this.channelIds = channelIds;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCallbackUrl() {
			return this.callbackUrl;
		}

		public void setCallbackUrl(String callbackUrl) {
			this.callbackUrl = callbackUrl;
		}
	}

	@Override
	public DescribeRtcMPUEventSubResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcMPUEventSubResponseUnmarshaller.unmarshall(this, context);
	}
}
