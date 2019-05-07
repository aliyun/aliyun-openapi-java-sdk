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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcChannelCntDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcChannelCntDataResponse extends AcsResponse {

	private String requestId;

	private List<ChannelCntModule> channelCntDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ChannelCntModule> getChannelCntDataPerInterval() {
		return this.channelCntDataPerInterval;
	}

	public void setChannelCntDataPerInterval(List<ChannelCntModule> channelCntDataPerInterval) {
		this.channelCntDataPerInterval = channelCntDataPerInterval;
	}

	public static class ChannelCntModule {

		private String timeStamp;

		private Long activeChannelCnt;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Long getActiveChannelCnt() {
			return this.activeChannelCnt;
		}

		public void setActiveChannelCnt(Long activeChannelCnt) {
			this.activeChannelCnt = activeChannelCnt;
		}
	}

	@Override
	public DescribeRtcChannelCntDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcChannelCntDataResponseUnmarshaller.unmarshall(this, context);
	}
}
