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
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcPeakUserCntDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcPeakUserCntDataResponse extends AcsResponse {

	private String requestId;

	private List<PeakUserCntModule> peakUserCntDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PeakUserCntModule> getPeakUserCntDataPerInterval() {
		return this.peakUserCntDataPerInterval;
	}

	public void setPeakUserCntDataPerInterval(List<PeakUserCntModule> peakUserCntDataPerInterval) {
		this.peakUserCntDataPerInterval = peakUserCntDataPerInterval;
	}

	public static class PeakUserCntModule {

		private String timeStamp;

		private Long activeUserPeak;

		private String activeUserPeakTime;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Long getActiveUserPeak() {
			return this.activeUserPeak;
		}

		public void setActiveUserPeak(Long activeUserPeak) {
			this.activeUserPeak = activeUserPeak;
		}

		public String getActiveUserPeakTime() {
			return this.activeUserPeakTime;
		}

		public void setActiveUserPeakTime(String activeUserPeakTime) {
			this.activeUserPeakTime = activeUserPeakTime;
		}
	}

	@Override
	public DescribeRtcPeakUserCntDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcPeakUserCntDataResponseUnmarshaller.unmarshall(this, context);
	}
}
