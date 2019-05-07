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
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcPeakChannelCntDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcPeakChannelCntDataResponse extends AcsResponse {

	private String requestId;

	private List<PeakChannelCntModule> peakChannelCntDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PeakChannelCntModule> getPeakChannelCntDataPerInterval() {
		return this.peakChannelCntDataPerInterval;
	}

	public void setPeakChannelCntDataPerInterval(List<PeakChannelCntModule> peakChannelCntDataPerInterval) {
		this.peakChannelCntDataPerInterval = peakChannelCntDataPerInterval;
	}

	public static class PeakChannelCntModule {

		private String timeStamp;

		private Long activeChannelPeak;

		private String activeChannelPeakTime;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Long getActiveChannelPeak() {
			return this.activeChannelPeak;
		}

		public void setActiveChannelPeak(Long activeChannelPeak) {
			this.activeChannelPeak = activeChannelPeak;
		}

		public String getActiveChannelPeakTime() {
			return this.activeChannelPeakTime;
		}

		public void setActiveChannelPeakTime(String activeChannelPeakTime) {
			this.activeChannelPeakTime = activeChannelPeakTime;
		}
	}

	@Override
	public DescribeRtcPeakChannelCntDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcPeakChannelCntDataResponseUnmarshaller.unmarshall(this, context);
	}
}
